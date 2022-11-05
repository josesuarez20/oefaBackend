package pe.gob.oefa.sirte.scheduler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.apps.base.util.UtilFecha;
import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.sirte.dto.DependienteCorreoDTO;
import pe.gob.oefa.sirte.dto.DependienteDTO;
import pe.gob.oefa.sirte.dto.PersonaDTO;
import pe.gob.oefa.sirte.dto.PersonaNaturalSSODTO;
import pe.gob.oefa.sirte.dto.ProgramacionDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDetalleDTO;
import pe.gob.oefa.sirte.service.DependienteCorreoService;
import pe.gob.oefa.sirte.service.DependienteService;
import pe.gob.oefa.sirte.service.EnvioCorreoService;
import pe.gob.oefa.sirte.service.PersonaService;
import pe.gob.oefa.sirte.service.ProgramacionDetalleService;
import pe.gob.oefa.sirte.service.SsoService;

@Component
@Transactional
public class SchedulerTasks {
	private CoreLogger logger = LoggerFactory.getLogger(SchedulerTasks.class);

	@Autowired
	private ProgramacionDetalleService programacionDetalleService;

	@Autowired
	private DependienteCorreoService dependienteCorreoService;

	@Autowired
	private PersonaService personaService;

	@Autowired
	private DependienteService dependienteService;

	@Autowired
	private EnvioCorreoService envioCorreoService;

	@Autowired
	private SsoService wsrestSso;

	// metodo de Daniel Valenzuela a implementar
	@Scheduled(cron = "${frecuencia_muestreo}")
	public void generarAlerta() throws Exception {

		if (1 == 2) {
			ProgramacionDetalleDTO programacionDetalleDTO = new ProgramacionDetalleDTO();

			List<ProgramacionDetalleDTO> lista = programacionDetalleService.findForAlerta(programacionDetalleDTO);

			if (lista != null) {

				for (ProgramacionDetalleDTO obj : lista) {
					if (obj.getFechadosis() != null && obj.getDiaspreviosnotifica() != null) {
						if (UtilFecha.obtenerDiferenciaDias(new Date(), obj.getFechadosis()) + 1 <= obj
								.getDiaspreviosnotifica().intValue()) {
							// obtenemos el correo del responsable del SIA
							PersonaDTO personaDTO = personaService.getByDocumento(obj.getDocumentoresponsable());
							DependienteDTO dependienteDTO = new DependienteDTO();
							dependienteDTO.setDocumento(obj.getDocumento());
							dependienteDTO.setDocumentoresponsable(obj.getDocumentoresponsable());
							List<DependienteDTO> lstDependientes = dependienteService.findByParameter(dependienteDTO);
							if (lstDependientes != null) {
								if (lstDependientes.size() > 0) {
									dependienteDTO = lstDependientes.get(0);
								}
							}

							if (personaDTO != null) {
								ProgramacionDTO programacionDTO = new ProgramacionDTO();
								programacionDTO.setResponsable(personaDTO.getNombres() + " "
										+ personaDTO.getApellidoPaterno() + " " + personaDTO.getApellidoMaterno());
								programacionDTO.setDependiente(
										dependienteDTO.getNombres() + " " + dependienteDTO.getApellidopaterno() + " "
												+ dependienteDTO.getApellidomaterno());
								programacionDTO.setCorreo(personaDTO.getCorreoelectronico());
								programacionDTO.setDescripcionvacuna(obj.getDescripcionvacuna());
								programacionDTO.setNumerodosis(obj.getNumerodosis());
								programacionDTO.setFechadosis(obj.getFechadosis());

								// copias
								DependienteCorreoDTO dependienteCorreoDTO = new DependienteCorreoDTO();
								dependienteCorreoDTO.setDocumentoresponsable(obj.getDocumentoresponsable());
								dependienteCorreoDTO.setDocumento(obj.getDocumento());
								dependienteCorreoDTO.setTipo("PR");
								List<DependienteCorreoDTO> data = dependienteCorreoService
										.findByParameter(dependienteCorreoDTO);

								if (data != null) {
									if (data.size() > 0) {
										dependienteCorreoDTO = data.get(0);
										if (dependienteCorreoDTO.getCorreosvacunas() != null) {
											programacionDTO.setCorreosvacunas(dependienteCorreoDTO.getCorreosvacunas());
										}
									}
								}

								envioCorreoService.sendCorreoPreventivo(programacionDTO);
							}
							// obtenemos el correo del SSO
							if (personaDTO == null) {
								PersonaNaturalSSODTO perNatu = wsrestSso.findSSOByDni(obj.getDocumentoresponsable());
								if (perNatu != null) {
									ProgramacionDTO programacionDTO = new ProgramacionDTO();
									programacionDTO.setResponsable(perNatu.getNombres() + " "
											+ perNatu.getApellidoPaterno() + " " + perNatu.getApellidoMaterno());
									programacionDTO.setCorreo(perNatu.getCorreo());
									programacionDTO.setDescripcionvacuna(obj.getDescripcionvacuna());
									programacionDTO.setFechadosis(obj.getFechadosis());

									// copias
									DependienteCorreoDTO dependienteCorreoDTO = new DependienteCorreoDTO();
									dependienteCorreoDTO.setDocumentoresponsable(obj.getDocumentoresponsable());
									dependienteCorreoDTO.setDocumento(obj.getDocumento());
									dependienteCorreoDTO.setTipo("PR");
									List<DependienteCorreoDTO> data = dependienteCorreoService
											.findByParameter(dependienteCorreoDTO);

									if (data != null) {
										if (data.size() > 0) {
											dependienteCorreoDTO = data.get(0);
											if (dependienteCorreoDTO.getCorreosvacunas() != null) {
												programacionDTO
														.setCorreosvacunas(dependienteCorreoDTO.getCorreosvacunas());
											}
										}
									}

									envioCorreoService.sendCorreoPreventivo(programacionDTO);
								}

							}
						}
					}
				}

			}
		}

	}

}
