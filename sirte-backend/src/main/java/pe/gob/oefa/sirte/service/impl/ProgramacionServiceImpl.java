package pe.gob.oefa.sirte.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.dto.core.ComboDTO;
import pe.gob.oefa.dto.core.ParametroDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDetalleDTO;
import pe.gob.oefa.sirte.repository.ComboRepository;
import pe.gob.oefa.sirte.repository.ProgramacionDetalleRepository;
import pe.gob.oefa.sirte.repository.ProgramacionRepository;
import pe.gob.oefa.sirte.service.ParametroService;
import pe.gob.oefa.sirte.service.ProgramacionService;

@Service("programacionService")
@Transactional
public class ProgramacionServiceImpl extends ServiceBase implements ProgramacionService {

	private CoreLogger logger = LoggerFactory.getLogger(ProgramacionServiceImpl.class);

	@Autowired
	private ProgramacionRepository programacionRepository;

	@Autowired
	private ProgramacionDetalleRepository programacionDetalleRepository;

	@Autowired
	private ComboRepository comboRepository;

	@Autowired
	ParametroService parametroService;

	@Override
	public List<ProgramacionDTO> findByParameter(ProgramacionDTO filter) {

		return programacionRepository.getByParameter(filter);
	}
	
	@Override
	public List<ProgramacionDTO> findByParameterAdmin(ProgramacionDTO filter) {

		return programacionRepository.getByParameterAdmin(filter);
	}

	@Override
	public ProgramacionDTO get(ProgramacionDTO dependienteDTO) {
		return programacionRepository.get(dependienteDTO);
	}

	@Override
	public void save(ProgramacionDTO object) {
		programacionRepository.save(object);

		// generamos el detalle en base a las dosis
		ComboDTO comboDTO = new ComboDTO();
		comboDTO.setCodigo(object.getCodigovacuna());
		List<ComboDTO> lstVacunas = comboRepository.listarVacuna(comboDTO);

		int items = 0;
		if (lstVacunas != null) {
			ComboDTO objCombo = lstVacunas.get(0);
			if (objCombo != null) {
				//items = Integer.parseInt(objCombo.getValorcodigo1());
				items = object.getDosis().intValue();
				ParametroDTO parametroDTO = new ParametroDTO();
				parametroDTO.setAplicacioncodigo("HR");
				parametroDTO.setCompaniacodigo("999999");
				parametroDTO.setParametroclave("DIASALEVAC");
				parametroDTO = parametroService.obtener(parametroDTO);
				for (int i = 0; i < items; i++) {
					ProgramacionDetalleDTO programacionDetalleDTO = new ProgramacionDetalleDTO();
					programacionDetalleDTO.setDocumentoresponsable(object.getDocumentoresponsable());
					programacionDetalleDTO.setDocumento(object.getDocumento());
					programacionDetalleDTO.setCodigovacuna(object.getCodigovacuna());
					programacionDetalleDTO.setEstado("1");
					programacionDetalleDTO.setRealizado("0");
					programacionDetalleDTO.setObligatorio("0");
//					if(i==0) {
//						programacionDetalleDTO.setObligatorio("1");
//					}
					programacionDetalleDTO.setNumerodosis(BigDecimal.valueOf(i+1));
					programacionDetalleDTO.setDiaspreviosnotifica(parametroDTO.getNumero());
					programacionDetalleRepository.save(programacionDetalleDTO);

				}
			}
		}

	}

	@Override
	public void update(ProgramacionDTO object) {
		programacionRepository.update(object);
	}

	@Override
	@Transactional
	public void delete(ProgramacionDTO object) {
		//eliminamos detalle
		programacionRepository.deleteDetalle(object);
		
		programacionRepository.delete(object);
	}

}
