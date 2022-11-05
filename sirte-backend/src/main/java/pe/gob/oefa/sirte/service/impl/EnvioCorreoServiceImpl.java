package pe.gob.oefa.sirte.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.app.VelocityEngine;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ui.velocity.VelocityEngineUtils;

import pe.gob.oefa.apps.base.util.UtilFecha;
import pe.gob.oefa.apps.base.util.UtilStringParam;
import pe.gob.oefa.core.email.EnvioEmailComponentStrategy;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.dto.core.EmailMetaDataDTO;
import pe.gob.oefa.sirte.dto.CorreoEnvioDTO;
import pe.gob.oefa.sirte.dto.InsertarUsuarioDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDTO;
import pe.gob.oefa.sirte.service.EnvioCorreoService;
import pe.gob.oefa.util.Constantes;
import pe.gob.oefa.util.DateUtil;

@Component("envioCorreoService")
public class EnvioCorreoServiceImpl extends ServiceBase implements EnvioCorreoService {

																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													private static final String ENCODE_UTF8 = "UTF-8";

	@Value("${template.email.alerta.dosis}")
	private String templateAlertaDosis;

	@Value("${urlAplicativo}")
	private String urlAplicativo;

	@Autowired
	@Qualifier("envioEmailComponentStrategy")
	private EnvioEmailComponentStrategy envioEmailComponentStrategy;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private VelocityEngine velocityEngine;
	
	@Value("${template.email.creacion.usuario}")
	private String templateCreacionUsuario;

	@Override
	public CorreoEnvioDTO sendCorreoPreventivo(ProgramacionDTO programacionDTO) throws Exception {
		// TODO Auto-generated method stub
		CorreoEnvioDTO correoEnvioDTO = new CorreoEnvioDTO();

		Map<String, Object> parametros = new HashMap<>();
		EmailMetaDataDTO emailMetaData = new EmailMetaDataDTO();

		parametros.put("responsable", programacionDTO.getResponsable());
		parametros.put("diavacuna", UtilFecha.convertirFechaCadena(programacionDTO.getFechadosis(), "dd/MM/yyyy"));
		parametros.put("vacuna", programacionDTO.getDescripcionvacuna());
		parametros.put("dependiente", programacionDTO.getDependiente());
		parametros.put("numero", UtilStringParam.obtenerNumeroLetra(programacionDTO.getNumerodosis().intValue()));

		parametros.put("urlAplicativo", urlAplicativo);
		emailMetaData.setSubject("SISTEMA CONTROL DE VACUNAS - OEFA (ALERTA DE VACUNACIÓN)");
		emailMetaData.setListTo(Arrays.asList(programacionDTO.getCorreo()));
		if (programacionDTO.getCorreosvacunas() != null) {
			emailMetaData.setListCc(Arrays.asList(programacionDTO.getCorreosvacunas().split(";")));
		}
		emailMetaData.setTemplate(templateAlertaDosis);
		emailMetaData.setParametros(parametros);

		String contenido = "";
		String mensajeError = "";
		String mensajeExcepcion = "";

		try {
			envioEmailComponentStrategy.send(emailMetaData);
			contenido = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, emailMetaData.getTemplate(),
					ENCODE_UTF8, emailMetaData.getParametros());
		} catch (Exception e) {
			// TODO: handle exception
			mensajeError = "Ocurrió un error en el correo de control posterior";
			mensajeExcepcion = e.getMessage();

		} finally {
		}

		return correoEnvioDTO;
	}
	
	@Override
	public CorreoEnvioDTO sendCorreoCreacionUsuario(InsertarUsuarioDTO insertausuarioDTO) {
		// TODO Auto-generated method stub
		CorreoEnvioDTO correoEnvioDTO = new CorreoEnvioDTO();
		InsertarUsuarioDTO userSession = insertausuarioDTO;

		Map<String, Object> parametros = new HashMap<>();
		EmailMetaDataDTO emailMetaData = new EmailMetaDataDTO();

		parametros.put("solicitante", userSession.getNombreusuario());
		parametros.put("cuentausuario", userSession.getCodusuario());
		parametros.put("tipoCorreo", Constantes.TipoCorreo.CU);
		parametros.put("clave",insertausuarioDTO.getClave());

		parametros.put("urlAplicativo", urlAplicativo);
		emailMetaData.setSubject("SISTEMA CONTROL DE VACUNAS - OEFA (CREACION DE USUARIO)");
		emailMetaData.setListTo(Arrays.asList(userSession.getCorreoelectronico()));
		emailMetaData.setTemplate(templateCreacionUsuario);
		emailMetaData.setParametros(parametros);

		String contenido = "";
		String mensajeError = "";
		String mensajeExcepcion = "";

		try {
			envioEmailComponentStrategy.send(emailMetaData);
			contenido = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, emailMetaData.getTemplate(),
					ENCODE_UTF8, emailMetaData.getParametros());
		} catch (Exception e) {
			// TODO: handle exception
			mensajeError = "Ocurrió un error en el correo de creación de usuario";
			mensajeExcepcion = e.getMessage();

		} finally {
		}

		return correoEnvioDTO;
	}


}
