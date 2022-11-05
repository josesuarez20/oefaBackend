package pe.gob.oefa.sirte.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.interoperabilidad.ws.reniec.service.Reniec;
import pe.gob.oefa.interoperabilidad.ws.reniec.service.ReniecImplServiceLocator;
import pe.gob.oefa.interoperabilidad.ws.reniec.service.ResultadoConsulta;
import pe.gob.oefa.siga.dto.SigaTerceroLocadorDTO;
import pe.gob.oefa.siga.service.SigaTerceroLocadorService;
import pe.gob.oefa.sirte.dto.DependienteDTO;
import pe.gob.oefa.sirte.dto.PersonaDTO;
import pe.gob.oefa.sirte.dto.PersonaNaturalSSODTO;
import pe.gob.oefa.sirte.dto.ProgramacionDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDetalleDTO;
import pe.gob.oefa.sirte.dto.PruebaDescarteDTO;
import pe.gob.oefa.sirte.repository.DependienteRepository;
import pe.gob.oefa.sirte.repository.PersonaRepository;
import pe.gob.oefa.sirte.repository.ProgramacionDetalleRepository;
import pe.gob.oefa.sirte.repository.ProgramacionRepository;
import pe.gob.oefa.sirte.repository.PruebaDescarteRepository;
import pe.gob.oefa.sirte.service.DependienteCorreoService;
import pe.gob.oefa.sirte.service.DependienteService;
import pe.gob.oefa.sirte.service.SsoService;

@Service("dependienteService")
@Transactional
public class DependienteServiceImpl extends ServiceBase implements DependienteService {

	private CoreLogger logger = LoggerFactory.getLogger(DependienteServiceImpl.class);

	@Value("${Token_REST:#{null}}")
	private String tokenSession;

	@Autowired
	private DependienteRepository dependienteRepository;

	@Autowired
	private ProgramacionRepository programacionRepository;

	@Autowired
	private PruebaDescarteRepository pruebaDescarteRepository;

	@Autowired
	private ProgramacionDetalleRepository programacionDetalleRepository;

	@Autowired
	private SsoService ssoService;

	@Autowired
	private DependienteCorreoService dependienteCorreoService;

	@Autowired
	private PersonaRepository personaRepository;

	@Autowired
	private SigaTerceroLocadorService sigaTerceroLocadorService;

	@Override
	public List<DependienteDTO> findByParameter(DependienteDTO filter) {
		return dependienteRepository.getByParameter(filter);
	}

	@Override
	public List<DependienteDTO> findByParameterConResponsable(DependienteDTO filter) {
		return dependienteRepository.getByParameterConResponsable(filter);
	}

	@Override
	public List<DependienteDTO> findByParameterAdicional(DependienteDTO filter) {
		return dependienteRepository.getByParameterAdicional(filter);
	}

	@Override
	public DependienteDTO get(DependienteDTO dependienteDTO) {
		return dependienteRepository.get(dependienteDTO);
	}

	@Override
	public void save(DependienteDTO object) {
		dependienteRepository.save(object);
	}

	@Override
	public void update(DependienteDTO object) {
		dependienteRepository.update(object);
	}

	@Override
	public void delete(DependienteDTO object) {
		dependienteRepository.delete(object);
	}

	@Override
	public DependienteDTO nuevoByDni(String dniresponsable, String dni) {
		// TODO Auto-generated method stub
		DependienteDTO dependienteDTO = new DependienteDTO();

		try {

			dependienteDTO.setDocumentoresponsable(dniresponsable);
			dependienteDTO.setDocumento(dni);
			// validamos que no exista registrado como dependiente
			List data = dependienteRepository.getByParameter(dependienteDTO);
			if (data != null) {
				if (data.size() > 0) {
					dependienteDTO.setCodigo(BigDecimal.ONE);
					dependienteDTO.setDocumento(dni);
					dependienteDTO.setEstado("-1");
					return dependienteDTO;
				}
			}

			PersonaNaturalSSODTO personaNaturalSSODTO = ssoService.findSSOByDni(dni);

			if (personaNaturalSSODTO != null) {
				dependienteDTO.setCodigo(personaNaturalSSODTO.getCodigo());
				dependienteDTO.setDocumento(dni);
				dependienteDTO.setEstado("A");
				dependienteDTO.setNombres(personaNaturalSSODTO.getNombres());
				dependienteDTO.setApellidopaterno(personaNaturalSSODTO.getApellidoPaterno());
				dependienteDTO.setApellidomaterno(personaNaturalSSODTO.getApellidoMaterno());
			} else {
				ReniecImplServiceLocator serviceLocator = null;
				Reniec port = null;
				ResultadoConsulta resultadoConsulta = null;
				pe.gob.oefa.interoperabilidad.ws.reniec.service.PeticionConsulta peticionConsulta = null;

				serviceLocator = new ReniecImplServiceLocator();
				port = serviceLocator.getReniecImplPort();
				peticionConsulta = new pe.gob.oefa.interoperabilidad.ws.reniec.service.PeticionConsulta(dni, "", null,
						null);
				resultadoConsulta = port.consultar(peticionConsulta, null, null, null);

				if (resultadoConsulta != null) {
					if (resultadoConsulta.getCoResultado() != null) {
						if ("1003".equals(resultadoConsulta.getCoResultado())) {
							dependienteDTO.setDocumento(dni);
							dependienteDTO.setEstado("A");
							dependienteDTO.setCodigo(new BigDecimal(-100));
						}
						if ("1002".equals(resultadoConsulta.getCoResultado())) {
							dependienteDTO.setDocumento(dni);
							dependienteDTO.setEstado("A");
							dependienteDTO.setCodigo(new BigDecimal(-100));
						}
						if ("0000".equals(resultadoConsulta.getCoResultado())) {
							dependienteDTO.setCodigo(BigDecimal.TEN);
							dependienteDTO.setDocumento(dni);
							dependienteDTO.setEstado("A");
							dependienteDTO.setNombres(resultadoConsulta.getDatosPersona().getPrenombres());
							dependienteDTO.setApellidopaterno(resultadoConsulta.getDatosPersona().getApPrimer());
							dependienteDTO.setApellidomaterno(resultadoConsulta.getDatosPersona().getApSegundo());
						}
					}

				}

				dependienteDTO.setCodigo(BigDecimal.ZERO);
				dependienteDTO.setDocumento(dni);
				dependienteDTO.setEstado("A");
			}

		} catch (Exception e) {
			dependienteDTO.setDocumento(dni);
			dependienteDTO.setEstado("A");
			dependienteDTO.setCodigo(new BigDecimal(-100));
		}
		return dependienteDTO;
	}

	@Override
	public List<DependienteDTO> findprogramacion(ProgramacionDTO filter) {
		// TODO Auto-generated method stub

		List<DependienteDTO> retorno = new ArrayList<>();

		DependienteDTO dependienteDTO = new DependienteDTO();
		dependienteDTO.setDocumentoresponsable(filter.getDocumentoresponsable());
		dependienteDTO.setDocumento(filter.getDocumento());
		dependienteDTO.setNombres(filter.getNombres());
		List<DependienteDTO> lstDependientes = dependienteRepository.getByParameterConResponsable(dependienteDTO);

		if (lstDependientes != null) {
			for (DependienteDTO obj : lstDependientes) {
				boolean tienedetalle = false;
				filter.setDocumento(obj.getDocumento());
				obj.setLstProgramacion(programacionRepository.getByParameter(filter));

				if (obj.getLstProgramacion() != null) {
					if (obj.getLstProgramacion().size() > 0) {
						for (ProgramacionDTO obj2 : obj.getLstProgramacion()) {
							ProgramacionDetalleDTO programacionDetalleDTO = new ProgramacionDetalleDTO();
							programacionDetalleDTO.setDocumentoresponsable(filter.getDocumentoresponsable());
							programacionDetalleDTO.setDocumento(obj2.getDocumento());
							programacionDetalleDTO.setCodigovacuna(obj2.getCodigovacuna());
							List<ProgramacionDetalleDTO> lstDetalle = programacionDetalleRepository
									.getByParameter(programacionDetalleDTO);
							tienedetalle = false;
							if (lstDetalle != null) {
								if (lstDetalle.size() > 0) {
									tienedetalle = true;
								}
								obj2.setLstProgramacionDetalle(lstDetalle);
							}

						}
						retorno.add(obj);
					}
				}

			}
		}

		return retorno;
	}

	@Override
	public List<DependienteDTO> findpruebadescarte(PruebaDescarteDTO filter) {
		// TODO Auto-generated method stub

		List<DependienteDTO> retorno = new ArrayList<>();

		DependienteDTO dependienteDTO = new DependienteDTO();
		dependienteDTO.setDocumentoresponsable(filter.getDocumentoresponsable());
		dependienteDTO.setDocumento(filter.getDocumento());
		dependienteDTO.setNombres(filter.getNombres());
		List<DependienteDTO> lstDependientes = dependienteRepository.getByParameterConResponsable(dependienteDTO);

		if (lstDependientes != null) {
			for (DependienteDTO obj : lstDependientes) {
				filter.setDocumento(obj.getDocumento());
				obj.setLstPruebaDescarte(pruebaDescarteRepository.getByParameter(filter));
				retorno.add(obj);
			}
		}

		return retorno;
	}

	@Override
	public List<DependienteDTO> findprogramacionAdmin(ProgramacionDTO filter) throws Exception {
		// TODO Auto-generated method stub

		List<DependienteDTO> retorno = new ArrayList<>();

		DependienteDTO dependienteDTO = new DependienteDTO();
		dependienteDTO.setDocumentoresponsable(filter.getDocumentoresponsable());
		dependienteDTO.setDocumento(filter.getDocumento());
		dependienteDTO.setNombres(filter.getNombres());
		List<DependienteDTO> lstDependientes = this.getByParameterConResponsableAll(dependienteDTO);

		if (lstDependientes != null) {
			for (DependienteDTO obj : lstDependientes) {
				boolean tienedetalle = false;
				filter.setDocumento(obj.getDocumento());
				obj.setLstProgramacion(programacionRepository.getByParameterAdmin(filter));

				if (obj.getLstProgramacion() != null) {
					if (obj.getLstProgramacion().size() > 0) {
						for (ProgramacionDTO obj2 : obj.getLstProgramacion()) {
							ProgramacionDetalleDTO programacionDetalleDTO = new ProgramacionDetalleDTO();
							programacionDetalleDTO.setDocumentoresponsable(obj2.getDocumentoresponsable());
							programacionDetalleDTO.setDocumento(obj2.getDocumento());
							programacionDetalleDTO.setCodigovacuna(obj2.getCodigovacuna());
							List<ProgramacionDetalleDTO> lstDetalle = programacionDetalleRepository
									.getByParameterAdmin(programacionDetalleDTO);
							tienedetalle = false;
							if (lstDetalle != null) {
								if (lstDetalle.size() > 0) {
									tienedetalle = true;
								}
								obj2.setLstProgramacionDetalle(lstDetalle);
							}

						}
						retorno.add(obj);
					}
				}

			}
		}

		return retorno;
	}

	@Override
	public List<DependienteDTO> findpruebadescarteAdmin(PruebaDescarteDTO filter) throws Exception {
		// TODO Auto-generated method stub

		List<DependienteDTO> retorno = new ArrayList<>();

		DependienteDTO dependienteDTO = new DependienteDTO();
		dependienteDTO.setDocumentoresponsable(filter.getDocumentoresponsable());
		dependienteDTO.setDocumento(filter.getDocumento());
		dependienteDTO.setNombres(filter.getNombres());
		List<DependienteDTO> lstDependientes = this.getByParameterConResponsableAll(dependienteDTO);

		if (lstDependientes != null) {
			for (DependienteDTO obj : lstDependientes) {
				filter.setDocumento(obj.getDocumento());
				obj.setLstPruebaDescarte(pruebaDescarteRepository.getByParameterAdmin(filter));
				retorno.add(obj);
			}
		}

		return retorno;
	}

	@Override
	public void updateAdicional(DependienteDTO object) {
		dependienteRepository.update(object);
	}

	@Override
	public void saveAdicional(DependienteDTO object) {
		dependienteRepository.saveAdicional(object);
	}

	@Override
	public List<DependienteDTO> getByParameterConResponsableAll(DependienteDTO filter) throws Exception {
		// TODO Auto-generated method stub
		// dependientes
		List<DependienteDTO> dependientes = dependienteRepository.getByParameterConResponsableAll(filter);

		// CAS
		PersonaDTO personaDTO = personaRepository.getByCodigoUsuario(filter.getDocumentoresponsable());

		if (personaDTO == null) {
			personaDTO = new PersonaDTO();
		}

		personaDTO.setFlgAdmin("S");
		personaDTO.setUsuarioRed(filter.getDocumentoresponsable());
		personaDTO.setDocumentobusqueda(filter.getDocumento());
		personaDTO.setNombres(filter.getNombres());
		List<PersonaDTO> personas = personaRepository.getByParameter(personaDTO);

		if (personas != null) {
			for (PersonaDTO obj : personas) {
				DependienteDTO dependienteDTO = new DependienteDTO();
				dependienteDTO.setSecuencia(BigDecimal.ZERO);
				dependienteDTO.setDocumento(obj.getDocumento());
				dependienteDTO.setDocumentoresponsable(obj.getDocumento());
				dependienteDTO.setNombres(obj.getNombrecompleto());
				dependienteDTO.setOrigen("VAC");
				dependienteDTO.setEstado("A");
				dependientes.add(dependienteDTO);
			}
		}

		SigaTerceroLocadorDTO sigaTerceroLocadorDTO = new SigaTerceroLocadorDTO();
		sigaTerceroLocadorDTO.setDni(filter.getDocumento());
		sigaTerceroLocadorDTO.setNombrecompleto(filter.getNombres());
		List<SigaTerceroLocadorDTO> terceroDatos = sigaTerceroLocadorService.getByParameter(sigaTerceroLocadorDTO);

		if (terceroDatos != null) {
			for (SigaTerceroLocadorDTO objterloc : terceroDatos) {
				if ("S".equals(objterloc.getFlgVigente())) {
					DependienteDTO dependienteDTO = new DependienteDTO();
					dependienteDTO.setSecuencia(BigDecimal.ZERO);
					dependienteDTO.setDocumento(objterloc.getDni());
					dependienteDTO.setDocumentoresponsable(objterloc.getDni());
					dependienteDTO.setNombres(objterloc.getNombrecompleto());
					dependienteDTO.setOrigen("VAC");
					dependienteDTO.setEstado("A");
					dependientes.add(dependienteDTO);
				}
			}
		}

		// List<SSOUsuarioxPerfilDTO> responsables =
		// ssoService.ListarUsuariosPorPerfilResponsable(tokenSession);

		// if (dependientes != null) {
		// for (DependienteDTO dep : dependientes) {
		// for (SSOUsuarioxPerfilDTO resp : responsables) {
		//
		// if (dep.getDocumentoresponsable().equalsIgnoreCase(resp.getCodUsuario())) {
		// dep.setNombreresponsable(resp.getNombreUsuario());
		// break;
		// }
		// }
		// }
		// }

		// if (responsables != null) {
		// boolean blAgregar = false;
		// for (SSOUsuarioxPerfilDTO obj : responsables) {
		// if (filter.getDocumento() != null) {
		// if (!filter.getDocumento().equals("")) {
		// if (obj.getCodUsuario().equalsIgnoreCase(filter.getDocumento())) {
		// blAgregar = true;
		// } else {
		// blAgregar = false;
		// }
		// } else {
		// blAgregar = true;
		// }
		// } else {
		// blAgregar = true;
		// }
		//
		// if (filter.getNombres() != null) {
		// if (!filter.getNombres().equals("")) {
		// if (obj.getNombreUsuario().equalsIgnoreCase(filter.getNombres())) {
		// blAgregar = blAgregar ? true : false;
		// } else {
		// blAgregar = false;
		// }
		// } else {
		// blAgregar = blAgregar ? true : false;
		// }
		// } else {
		// blAgregar = blAgregar ? true : false;
		// }
		//
		// if (blAgregar) {
		// DependienteDTO dependienteDTO = new DependienteDTO();
		// dependienteDTO.setSecuencia(BigDecimal.ZERO);
		// dependienteDTO.setDocumento(obj.getCodUsuario());
		// dependienteDTO.setDocumentoresponsable(obj.getCodUsuario());
		// dependienteDTO.setNombres(obj.getNombreUsuario());
		// dependienteDTO.setOrigen("VAC");
		// dependienteDTO.setEstado("A");
		//
		// DependienteCorreoDTO dependienteCorreoDTO = new DependienteCorreoDTO();
		// dependienteCorreoDTO.setDocumento(obj.getCodUsuario());
		// dependienteCorreoDTO.setDocumentoresponsable(obj.getCodUsuario());
		// dependienteCorreoDTO = dependienteCorreoService.get(dependienteCorreoDTO);
		//
		// if (dependienteCorreoDTO != null) {
		// dependienteDTO.setCorreosvacunas(dependienteCorreoDTO.getCorreosvacunas());
		// dependienteDTO.setSecuenciacorreo(dependienteCorreoDTO.getSecuencia());
		// }
		//
		// dependientes.add(dependienteDTO);
		// }
		//
		// blAgregar = false;
		//
		// }
		// }

		return dependientes;

	}
}
