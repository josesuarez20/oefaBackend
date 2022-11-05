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
import pe.gob.oefa.model.core.ResponseBase;
import pe.gob.oefa.model.json.PruebaDescarteRequest;
import pe.gob.oefa.model.json.PruebaDescarteResponse;
import pe.gob.oefa.sirte.dto.PruebaDescarteDTO;
import pe.gob.oefa.sirte.facade.PruebaDescarteFacade;
import pe.gob.oefa.sirte.service.PruebadescarteService;
import pe.gob.oefa.util.GenericUtil;

@Component("pruebadescarteFacade")
public class PruebaDescarteFacadeImpl implements PruebaDescarteFacade {

	@Autowired
	private PruebadescarteService pruebadescarteService;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CollectionResponse<PruebaDescarteResponse> find(PruebaDescarteRequest request) {
		UserSession userSession = SecurityUtil.getUserSession();
		request.setDocumentoresponsable(userSession.getDni());

		List<PruebaDescarteDTO> list = pruebadescarteService
				.findByParameter(modelMapper.map(request, PruebaDescarteDTO.class));
		List<PruebaDescarteResponse> listResponse = new ArrayList<>();
		for (PruebaDescarteDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, PruebaDescarteResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public PruebaDescarteResponse get(BigDecimal id) {
		UserSession userSession = SecurityUtil.getUserSession();

		PruebaDescarteDTO dependienteDTO = new PruebaDescarteDTO();
		dependienteDTO.setDocumentoresponsable(userSession.getDni());
		dependienteDTO.setSecuencia(id);

		return modelMapper.map(pruebadescarteService.get(dependienteDTO), PruebaDescarteResponse.class);
	}

	@Override
	public ResponseBase saveOrUpdate(PruebaDescarteRequest request) {
		UserSession userSession = SecurityUtil.getUserSession();
		ResponseBase retorno = new ResponseBase();
		// validar si existe el registro

		PruebaDescarteDTO programacionDTO = modelMapper.map(request, PruebaDescarteDTO.class);
		programacionDTO.setDocumentoresponsable(userSession.getDni());
		programacionDTO.setUltimousuario(userSession.getUserId().toString());
		programacionDTO.setEstado("1");
		if (GenericUtil.isNotNull(request.getSecuencia())) {
			pruebadescarteService.update(programacionDTO);
		} else {
			pruebadescarteService.save(programacionDTO);
		}
		retorno.setCodigo("ok");
		return retorno;
	}

	@Override
	public ResponseBase saveOrUpdateAdmin(PruebaDescarteRequest request) {
		UserSession userSession = SecurityUtil.getUserSession();
		ResponseBase retorno = new ResponseBase();

		PruebaDescarteDTO programacionDTO = modelMapper.map(request, PruebaDescarteDTO.class);
		programacionDTO.setUltimousuario(userSession.getUserId().toString());
		programacionDTO.setEstado("1");
		if (GenericUtil.isNotNull(request.getSecuencia())) {
			pruebadescarteService.update(programacionDTO);
		} else {
			pruebadescarteService.save(programacionDTO);
		}
		retorno.setCodigo("ok");
		return retorno;
	}

	@Override
	public PruebaDescarteResponse delete(PruebaDescarteRequest request) {
		PruebaDescarteDTO materiaDTO = modelMapper.map(request, PruebaDescarteDTO.class);
		pruebadescarteService.delete(materiaDTO);
		return modelMapper.map(materiaDTO, PruebaDescarteResponse.class);
	}

}
