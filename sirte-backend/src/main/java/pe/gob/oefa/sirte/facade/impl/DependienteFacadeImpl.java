package pe.gob.oefa.sirte.facade.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.gob.oefa.core.authentication.session.UserSession;
import pe.gob.oefa.core.security.util.SecurityUtil;
import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.DependienteRequest;
import pe.gob.oefa.model.json.DependienteResponse;
import pe.gob.oefa.model.json.ProgramacionRequest;
import pe.gob.oefa.model.json.PruebaDescarteRequest;
import pe.gob.oefa.sirte.dto.DependienteDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDTO;
import pe.gob.oefa.sirte.dto.PruebaDescarteDTO;
import pe.gob.oefa.sirte.facade.DependienteFacade;
import pe.gob.oefa.sirte.service.DependienteService;
import pe.gob.oefa.util.Constantes;
import pe.gob.oefa.util.DateUtil;
import pe.gob.oefa.util.GenericUtil;

@Component("dependienteFacade")
public class DependienteFacadeImpl implements DependienteFacade {

	@Autowired
	private DependienteService dependienteService;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CollectionResponse<DependienteResponse> find(DependienteRequest request) {
		// UserSession userSession = SecurityUtil.getUserSession();
		// request.setDocumentoresponsable(userSession.getDni());

		List<DependienteDTO> list = dependienteService.findByParameter(modelMapper.map(request, DependienteDTO.class));
		List<DependienteResponse> listResponse = new ArrayList<>();
		for (DependienteDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, DependienteResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public CollectionResponse<DependienteResponse> listaConResponsable(DependienteRequest request) {
		// UserSession userSession = SecurityUtil.getUserSession();
		// request.setDocumentoresponsable(userSession.getDni());
		// request.setNombres(userSession.getNombres());

		List<DependienteDTO> list = dependienteService
				.findByParameterConResponsable(modelMapper.map(request, DependienteDTO.class));
		List<DependienteResponse> listResponse = new ArrayList<>();
		for (DependienteDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, DependienteResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public CollectionResponse<DependienteResponse> findAdicional(DependienteRequest request) {
		// UserSession userSession = SecurityUtil.getUserSession();
		// request.setDocumentoresponsable(userSession.getDni());

		List<DependienteDTO> list = dependienteService
				.findByParameterAdicional(modelMapper.map(request, DependienteDTO.class));
		List<DependienteResponse> listResponse = new ArrayList<>();
		for (DependienteDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, DependienteResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public DependienteResponse get(DependienteRequest request) {
		// UserSession userSession = SecurityUtil.getUserSession();
		DependienteDTO dependienteDTO = modelMapper.map(request, DependienteDTO.class);

		return modelMapper.map(dependienteService.get(dependienteDTO), DependienteResponse.class);
	}

	@Override
	public DependienteResponse saveOrUpdate(DependienteRequest request) {
		// UserSession userSession = SecurityUtil.getUserSession();
		DependienteDTO dependienteDTO = modelMapper.map(request, DependienteDTO.class);
		// dependienteDTO.setDocumentoresponsable(userSession.getDni());
		// dependienteDTO.setUltimousuario(userSession.getUserId().toString());

		if (GenericUtil.isNotNull(request.getSecuencia())) {
			dependienteService.update(dependienteDTO);
		} else {
			dependienteDTO.setCreado(DateUtil.getCurrentDate());
			dependienteDTO.setHabilitado(Constantes.HABILITADO);
			dependienteService.save(dependienteDTO);
		}
		return modelMapper.map(dependienteDTO, DependienteResponse.class);
	}

	@Override
	public DependienteResponse guardarAdicional(DependienteRequest request) {
		// UserSession userSession = SecurityUtil.getUserSession();
		DependienteDTO dependienteDTO = modelMapper.map(request, DependienteDTO.class);
		// dependienteDTO.setDocumentoresponsable(userSession.getDni());
		// dependienteDTO.setUltimousuario(userSession.getUserId().toString());
		if (GenericUtil.isNotNull(request.getSecuencia())) {
			dependienteService.updateAdicional(dependienteDTO);
		} else {
			dependienteDTO.setCreado(DateUtil.getCurrentDate());
			dependienteDTO.setHabilitado(Constantes.HABILITADO);
			dependienteService.saveAdicional(dependienteDTO);
		}
		return modelMapper.map(dependienteDTO, DependienteResponse.class);
	}

	@Override
	public DependienteResponse delete(DependienteRequest request) {
		DependienteDTO materiaDTO = modelMapper.map(request, DependienteDTO.class);
		dependienteService.delete(materiaDTO);
		return modelMapper.map(materiaDTO, DependienteResponse.class);
	}

	@Override
	public DependienteResponse nuevoByDni(String dni) {
		// TODO Auto-generated method stub
		UserSession userSession = SecurityUtil.getUserSession();
		return modelMapper.map(dependienteService.nuevoByDni(userSession.getDni(), dni), DependienteResponse.class);
	}

	@Override
	public CollectionResponse<DependienteResponse> findprogramacion(ProgramacionRequest request) {
		// TODO Auto-generated method stub
		// UserSession userSession = SecurityUtil.getUserSession();
		// request.setDocumentoresponsable(userSession.getDni());
		// request.setNombres(userSession.getNombres());

		List<DependienteDTO> list = dependienteService
				.findprogramacion(modelMapper.map(request, ProgramacionDTO.class));
		List<DependienteResponse> listResponse = new ArrayList<>();
		for (DependienteDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, DependienteResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public CollectionResponse<DependienteResponse> findprogramacionAdmin(ProgramacionRequest request) throws Exception {
		// TODO Auto-generated method stub
		// UserSession userSession = SecurityUtil.getUserSession();
		// request.setDocumentoresponsable(userSession.getDni());
		// request.setNombres(userSession.getNombres());

		List<DependienteDTO> list = dependienteService
				.findprogramacionAdmin(modelMapper.map(request, ProgramacionDTO.class));
		List<DependienteResponse> listResponse = new ArrayList<>();
		for (DependienteDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, DependienteResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public CollectionResponse<DependienteResponse> findpruebadescarte(PruebaDescarteRequest request) {
		// TODO Auto-generated method stub
		// UserSession userSession = SecurityUtil.getUserSession();
		// request.setDocumentoresponsable(userSession.getDni());
		// request.setNombres(userSession.getNombres());

		List<DependienteDTO> list = dependienteService
				.findpruebadescarte(modelMapper.map(request, PruebaDescarteDTO.class));
		List<DependienteResponse> listResponse = new ArrayList<>();
		for (DependienteDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, DependienteResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public CollectionResponse<DependienteResponse> findpruebadescarteAdmin(PruebaDescarteRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		// UserSession userSession = SecurityUtil.getUserSession();
		// request.setDocumentoresponsable(userSession.getDni());
		// request.setNombres(userSession.getNombres());

		List<DependienteDTO> list = dependienteService
				.findpruebadescarteAdmin(modelMapper.map(request, PruebaDescarteDTO.class));
		List<DependienteResponse> listResponse = new ArrayList<>();
		for (DependienteDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, DependienteResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public CollectionResponse<DependienteResponse> listaConResponsableAll(DependienteRequest request) throws Exception {
		// TODO Auto-generated method stub
		// UserSession userSession = SecurityUtil.getUserSession();
		// request.setDocumentoresponsable(userSession.getDni());

		List<DependienteDTO> list = dependienteService
				.getByParameterConResponsableAll(modelMapper.map(request, DependienteDTO.class));
		List<DependienteResponse> listResponse = new ArrayList<>();
		for (DependienteDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, DependienteResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

}
