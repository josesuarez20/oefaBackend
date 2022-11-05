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
import pe.gob.oefa.model.json.DependienteCorreoRequest;
import pe.gob.oefa.model.json.DependienteCorreoResponse;
import pe.gob.oefa.model.json.ProgramacionRequest;
import pe.gob.oefa.sirte.dto.DependienteCorreoDTO;
import pe.gob.oefa.sirte.facade.DependienteCorreoFacade;
import pe.gob.oefa.sirte.service.DependienteCorreoService;
import pe.gob.oefa.util.GenericUtil;

@Component("dependienteCorreoFacade")
public class DependienteCorreoFacadeImpl implements DependienteCorreoFacade {

	@Autowired
	private DependienteCorreoService dependienteCorreoService;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CollectionResponse<DependienteCorreoResponse> find(DependienteCorreoRequest request) {
		UserSession userSession = SecurityUtil.getUserSession();
		request.setDocumentoresponsable(userSession.getDni());

		List<DependienteCorreoDTO> list = dependienteCorreoService
				.findByParameter(modelMapper.map(request, DependienteCorreoDTO.class));
		List<DependienteCorreoResponse> listResponse = new ArrayList<>();
		for (DependienteCorreoDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, DependienteCorreoResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public DependienteCorreoResponse get(BigDecimal id) {
		UserSession userSession = SecurityUtil.getUserSession();

		DependienteCorreoDTO dependienteDTO = new DependienteCorreoDTO();
		dependienteDTO.setDocumentoresponsable(userSession.getDni());
		dependienteDTO.setSecuencia(id);

		return modelMapper.map(dependienteCorreoService.get(dependienteDTO), DependienteCorreoResponse.class);
	}

	@Override
	public DependienteCorreoResponse saveOrUpdate(DependienteCorreoRequest request) {
	//	UserSession userSession = SecurityUtil.getUserSession();
		DependienteCorreoDTO DependienteCorreoDTO = modelMapper.map(request, DependienteCorreoDTO.class);
		DependienteCorreoDTO.setDocumentoresponsable(request.getDocumentoresponsable());
		DependienteCorreoDTO.setUltimousuario(request.getUltimousuario());
		DependienteCorreoDTO.setEstado("1");
		if (GenericUtil.isNotNull(request.getSecuencia())) {
			dependienteCorreoService.update(DependienteCorreoDTO);
		} else {
			dependienteCorreoService.save(DependienteCorreoDTO);
		}
		return modelMapper.map(DependienteCorreoDTO, DependienteCorreoResponse.class);
	}

	@Override
	public DependienteCorreoResponse delete(DependienteCorreoRequest request) {
		DependienteCorreoDTO materiaDTO = modelMapper.map(request, DependienteCorreoDTO.class);
		dependienteCorreoService.delete(materiaDTO);
		return modelMapper.map(materiaDTO, DependienteCorreoResponse.class);
	}

}
