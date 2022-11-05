package pe.gob.oefa.sirte.facade.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.gob.oefa.core.authentication.session.UserSession;
import pe.gob.oefa.core.security.util.SecurityUtil;
import pe.gob.oefa.dto.core.ParametroDTO;
import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.core.ResponseBase;
import pe.gob.oefa.model.json.ProgramacionDetalleRequest;
import pe.gob.oefa.model.json.ProgramacionDetalleResponse;
import pe.gob.oefa.model.json.ProgramacionRequest;
import pe.gob.oefa.model.json.ProgramacionResponse;
import pe.gob.oefa.sirte.dto.ProgramacionDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDetalleDTO;
import pe.gob.oefa.sirte.facade.ProgramacionFacade;
import pe.gob.oefa.sirte.service.ParametroService;
import pe.gob.oefa.sirte.service.ProgramacionDetalleService;
import pe.gob.oefa.sirte.service.ProgramacionService;
import pe.gob.oefa.util.GenericUtil;

@Component("programacionFacade")
public class ProgramacionFacadeImpl implements ProgramacionFacade {

	@Autowired
	private ProgramacionService programacionService;

	@Autowired
	private ProgramacionDetalleService programacionDetalleService;

	@Autowired
	private ParametroService parametroService;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CollectionResponse<ProgramacionResponse> find(ProgramacionRequest request) {
//		UserSession userSession = SecurityUtil.getUserSession();
//		request.setDocumentoresponsable(userSession.getDni());

		List<ProgramacionDTO> list = programacionService
				.findByParameter(modelMapper.map(request, ProgramacionDTO.class));
		List<ProgramacionResponse> listResponse = new ArrayList<>();
		for (ProgramacionDTO actaDTO : list) {
			listResponse.add(modelMapper.map(actaDTO, ProgramacionResponse.class));
		}
		return new CollectionResponse<>(listResponse);
	}

	@Override
	public ProgramacionResponse get(BigDecimal id) {
		UserSession userSession = SecurityUtil.getUserSession();

		ProgramacionDTO dependienteDTO = new ProgramacionDTO();
		dependienteDTO.setDocumentoresponsable(userSession.getDni());
		dependienteDTO.setSecuencia(id);

		return modelMapper.map(programacionService.get(dependienteDTO), ProgramacionResponse.class);
	}

	@Override
	public ResponseBase saveOrUpdate(ProgramacionRequest request) {
		//UserSession userSession = SecurityUtil.getUserSession();
		ResponseBase retorno = new ResponseBase();
		// validar si existe el registro
		ProgramacionDTO programacionDTOVal = new ProgramacionDTO();
		programacionDTOVal.setDocumentoresponsable(request.getDocumentoresponsable());
		programacionDTOVal.setDocumento(request.getDocumento());
		programacionDTOVal.setCodigovacuna(request.getCodigovacuna());
		List<ProgramacionDTO> lsProgramacion = programacionService.findByParameter(programacionDTOVal);
		if (lsProgramacion != null) {
			if (lsProgramacion.size() > 0) {
				retorno.setCodigo("error");
				retorno.setMensaje("Los datos seleccionados ya se encuentran registrados");
				return retorno;
			}
		}

		ProgramacionDTO programacionDTO = modelMapper.map(request, ProgramacionDTO.class);
	//	programacionDTO.setDocumentoresponsable(userSession.getDni());
	//	programacionDTO.setUltimousuario(userSession.getUserId().toString());
		programacionDTO.setEstado("1");
		if (GenericUtil.isNotNull(request.getSecuencia())) {
			programacionService.update(programacionDTO);
		} else {
			programacionService.save(programacionDTO);
		}
		retorno.setCodigo("ok");
		return retorno;
	}

	@Override
	public ResponseBase saveOrUpdateAdmin(ProgramacionRequest request) {
		//UserSession userSession = SecurityUtil.getUserSession();
		ResponseBase retorno = new ResponseBase();
		// validar si existe el registro
		ProgramacionDTO programacionDTOVal = new ProgramacionDTO();
		programacionDTOVal.setDocumento(request.getDocumento());
		programacionDTOVal.setDocumentoresponsable(
				request.getDocumentoresponsable() == null ? request.getDocumento() : request.getDocumentoresponsable());
		programacionDTOVal.setCodigovacuna(request.getCodigovacuna());
		List<ProgramacionDTO> lsProgramacion = programacionService.findByParameter(programacionDTOVal);
		if (lsProgramacion != null) {
			if (lsProgramacion.size() > 0) {
				retorno.setCodigo("error");
				retorno.setMensaje("Los datos seleccionados ya se encuentran registrados");
				return retorno;
			}
		}

		ProgramacionDTO programacionDTO = modelMapper.map(request, ProgramacionDTO.class);
		//programacionDTO.setUltimousuario(userSession.getUserId().toString());
		programacionDTO.setEstado("1");
		if (GenericUtil.isNotNull(request.getSecuencia())) {
			programacionService.update(programacionDTO);
		} else {
			programacionService.save(programacionDTO);
		}
		retorno.setCodigo("ok");
		return retorno;
	}

	@Override
	public ProgramacionResponse delete(ProgramacionRequest request) {
		ProgramacionDTO materiaDTO = modelMapper.map(request, ProgramacionDTO.class);
		programacionService.delete(materiaDTO);
		return modelMapper.map(materiaDTO, ProgramacionResponse.class);
	}

	@Override
	public ProgramacionDetalleResponse saveDetalle(ProgramacionDetalleRequest request) {
		// TODO Auto-generated method stub
		//UserSession userSession = SecurityUtil.getUserSession();

		ProgramacionDetalleDTO programacionDetalleDTO = modelMapper.map(request, ProgramacionDetalleDTO.class);
		//programacionDetalleDTO.setDocumentoresponsable(request.getDni());
		programacionDetalleDTO.setEstado("1");
		if (programacionDetalleDTO.getSecuencia() == null) {
			ParametroDTO parametroDTO = new ParametroDTO();
			parametroDTO.setAplicacioncodigo("HR");
			parametroDTO.setCompaniacodigo("999999");
			parametroDTO.setParametroclave("DIASALEVAC");
			parametroDTO = parametroService.obtener(parametroDTO);
			programacionDetalleDTO.setDiaspreviosnotifica(parametroDTO.getNumero());
			programacionDetalleDTO.setObligatorio("0");
			programacionDetalleService.save(programacionDetalleDTO);
		} else {
			programacionDetalleService.update(programacionDetalleDTO);
		}

		return modelMapper.map(programacionDetalleDTO, ProgramacionDetalleResponse.class);
	}

	@Override
	public ProgramacionDetalleResponse saveDetalleAdmin(ProgramacionDetalleRequest request) {
		// TODO Auto-generated method stub
		//UserSession userSession = SecurityUtil.getUserSession();

		ProgramacionDetalleDTO programacionDetalleDTO = modelMapper.map(request, ProgramacionDetalleDTO.class);
		programacionDetalleDTO.setDocumentoresponsable(
				request.getDocumentoresponsable() == null ? request.getDocumento() : request.getDocumentoresponsable());
		programacionDetalleDTO.setEstado("1");
		if (programacionDetalleDTO.getSecuencia() == null) {
			ParametroDTO parametroDTO = new ParametroDTO();
			parametroDTO.setAplicacioncodigo("HR");
			parametroDTO.setCompaniacodigo("999999");
			parametroDTO.setParametroclave("DIASALEVAC");
			parametroDTO = parametroService.obtener(parametroDTO);
			programacionDetalleDTO.setDiaspreviosnotifica(parametroDTO.getNumero());
			programacionDetalleDTO.setObligatorio("0");
			programacionDetalleService.save(programacionDetalleDTO);
		} else {
			programacionDetalleService.update(programacionDetalleDTO);
		}

		return modelMapper.map(programacionDetalleDTO, ProgramacionDetalleResponse.class);
	}

	@Override
	public ProgramacionDetalleResponse deleteDetalle(ProgramacionDetalleRequest request) {
		ProgramacionDetalleDTO materiaDTO = modelMapper.map(request, ProgramacionDetalleDTO.class);
		programacionDetalleService.delete(materiaDTO);
		// si es el unico registro que quedaba, eliminamos el padre
		List<ProgramacionDetalleDTO> list = programacionDetalleService.findByParameter(materiaDTO);
		if (list == null) {
			ProgramacionDTO programacionDTO = new ProgramacionDTO();
			programacionDTO.setCodigovacuna(request.getCodigovacuna());
			programacionDTO.setDocumento(request.getDocumento());
			programacionDTO.setDocumentoresponsable(request.getDocumentoresponsable());
			programacionService.delete(programacionDTO);
		}
		if (list.size() == 0) {
			ProgramacionDTO programacionDTO = new ProgramacionDTO();
			programacionDTO.setCodigovacuna(request.getCodigovacuna());
			programacionDTO.setDocumento(request.getDocumento());
			programacionDTO.setDocumentoresponsable(request.getDocumentoresponsable());
			programacionDTO.setSecuencia(request.getSecuencia());
			programacionService.delete(programacionDTO);
		}

		return modelMapper.map(materiaDTO, ProgramacionDetalleResponse.class);
	}

}
