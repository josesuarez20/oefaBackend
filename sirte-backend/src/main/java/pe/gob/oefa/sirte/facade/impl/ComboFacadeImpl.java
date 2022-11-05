package pe.gob.oefa.sirte.facade.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.dto.core.ComboDTO;
import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.model.json.ComboResponse;
import pe.gob.oefa.model.json.InsertarAseguraUsuarioRequest;
import pe.gob.oefa.model.json.SSOObtenerUsuarioResponse;
import pe.gob.oefa.model.json.SSOPersonaNaturalResponse;
import pe.gob.oefa.model.json.SolicitudCombosResponse;
import pe.gob.oefa.sirte.dto.ObtenerUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.PersonaNaturalSSODTO;
import pe.gob.oefa.sirte.facade.ComboFacade;
import pe.gob.oefa.sirte.service.ComboService;
import pe.gob.oefa.sirte.service.SsoService;

@Component("comboFacade")
@Transactional
public class ComboFacadeImpl extends FacadeBase implements ComboFacade {

	private CoreLogger logger = LoggerFactory.getLogger(ComboFacadeImpl.class);

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ComboService comboService;
	
	@Autowired
	private SsoService ssoService;

	@Override
	public SolicitudCombosResponse listarTipoVinculo(ComboDTO t) {
		SolicitudCombosResponse response = new SolicitudCombosResponse();
		List<ComboResponse> lstCombo = new ArrayList<>();
		CollectionResponse<ComboResponse> collection = null;
		try {
			List<ComboDTO> listCombo = comboService.listarTipoVinculo(t);
			for (ComboDTO comboDTO : listCombo) {
				lstCombo.add(new ComboResponse(null, comboDTO.getCodigo(), comboDTO.getNombre()));
			}
			collection = new CollectionResponse<ComboResponse>(lstCombo);
		} catch (Exception e) {
			launchException(logger, e);
		}
		response.setComboTipoVinculo(collection);
		return response;
	}

	@Override
	public CollectionResponse<ComboResponse> listarVacuna(ComboDTO t) {
		// TODO Auto-generated method stub
		List<ComboResponse> lstCombo = new ArrayList<>();
		CollectionResponse<ComboResponse> collection = null;
		try {
			List<ComboDTO> listCombo = comboService.listarVacuna(t);
			for (ComboDTO comboDTO : listCombo) {
				lstCombo.add(new ComboResponse(null, comboDTO.getCodigo(), comboDTO.getNombre(),
						comboDTO.getValorcodigo1(),comboDTO.getValorcodigo2()));
			}
			collection = new CollectionResponse<ComboResponse>(lstCombo);
		} catch (Exception e) {
			launchException(logger, e);
		}
		return collection;
	}
	
	@Override
	public SSOObtenerUsuarioResponse SSOaseguraUsuario(InsertarAseguraUsuarioRequest request) {
		SSOObtenerUsuarioResponse ssoobtenerusuarioResponse = null;

		try {

			// PersonaNaturalSSODTO personaNaturalSSO = ssoService.findSSOByDni(dni);

			ObtenerUsuarioSSODTO obtenerUsuarioDTO = ssoService.findSSOaseguraUsuario(request.getIdusuario(),
					request.getTipodocumento(), request.getDocumento(), request.getClave(), request.getCorreo());

			// ObtenerUsuarioSSODTO obtenerUsuarioDTO =
			// ssoService.findSSOaseguraUsuario(idusuario,tipodocumento,documento,clave,correo);

			ssoobtenerusuarioResponse = modelMapper.map(obtenerUsuarioDTO, SSOObtenerUsuarioResponse.class);
			// personanaturalResponse = modelMapper.map(personaNaturalSSO,
			// SSOPersonaNaturalResponse.class);

		} catch (Exception e) {
			/*
			 * PersonaNaturalSSODTO personaNaturalSSOaux = new PersonaNaturalSSODTO();
			 * personaNaturalSSOaux.setCodigo(new BigDecimal(-100)); personanaturalResponse
			 * = modelMapper.map(personaNaturalSSOaux, SSOPersonaNaturalResponse.class);
			 */

		}

		return ssoobtenerusuarioResponse;// new CollectionResponse<SSOPersonaNaturalResponse>(collection);
	}


	@Override
	public SSOPersonaNaturalResponse SSOfindByDni(String dni) {
		SSOPersonaNaturalResponse personanaturalResponse = null;
		// List<SSOPersonaNaturalResponse> collection = new ArrayList<>();
		try {
			PersonaNaturalSSODTO personaNaturalSSO = ssoService.findSSOByDni(dni);

			// collection.add(PersonaNaturalSSODTO);

			personanaturalResponse = modelMapper.map(personaNaturalSSO, SSOPersonaNaturalResponse.class);
			// collection.add(modelMapper.map(listSede, SSOPersonaNaturalResponse.class));
			/*
			 * for (PersonaNaturalSSODTO ssopersonanaturalDTO : listSede) {
			 * collection.add(modelMapper.map(ssopersonanaturalDTO,
			 * SSOPersonaNaturalResponse.class)); }
			 */
		} catch (Exception e) {

			PersonaNaturalSSODTO personaNaturalSSOaux = new PersonaNaturalSSODTO();
			personaNaturalSSOaux.setCodigo(new BigDecimal(-100));
			personanaturalResponse = modelMapper.map(personaNaturalSSOaux, SSOPersonaNaturalResponse.class);

			// launchException(logger, e);

		}

		return personanaturalResponse;// new CollectionResponse<SSOPersonaNaturalResponse>(collection);
	}

	@Override
	public SSOObtenerUsuarioResponse SSOobtenerusuarioByTipoDocumentoDocumento(String tipodocumento, String documento) {
		SSOObtenerUsuarioResponse ssoobtenerusuarioResponse = null;

		try {

			// PersonaNaturalSSODTO personaNaturalSSO = ssoService.findSSOByDni(dni);

			ObtenerUsuarioSSODTO obtenerUsuarioDTO = ssoService.findSSOByTipoDocumentoDocumento(tipodocumento,
					documento);

			ssoobtenerusuarioResponse = modelMapper.map(obtenerUsuarioDTO, SSOObtenerUsuarioResponse.class);
			// personanaturalResponse = modelMapper.map(personaNaturalSSO,
			// SSOPersonaNaturalResponse.class);

		} catch (Exception e) {
			/*
			 * PersonaNaturalSSODTO personaNaturalSSOaux = new PersonaNaturalSSODTO();
			 * personaNaturalSSOaux.setCodigo(new BigDecimal(-100)); personanaturalResponse
			 * = modelMapper.map(personaNaturalSSOaux, SSOPersonaNaturalResponse.class);
			 */

		}

		return ssoobtenerusuarioResponse;// new CollectionResponse<SSOPersonaNaturalResponse>(collection);
	}

}
