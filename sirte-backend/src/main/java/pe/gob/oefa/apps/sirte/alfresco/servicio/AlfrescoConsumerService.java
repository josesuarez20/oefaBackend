package pe.gob.oefa.apps.sirte.alfresco.servicio;

import java.io.File;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import pe.com.alfresco.rest.bean.RptaDownloadBean;
import pe.com.alfresco.rest.bean.RptaUploadBean;
import pe.com.alfresco.rest.caller.CallServiceRest;
import pe.com.alfresco.rest.util.Util;
import pe.gob.oefa.apps.base.util.ValidateException;
import pe.gob.oefa.apps.sirte.alfresco.maestro.RptaAlfresco;

@Component("alfrescoconsumerService")
public class AlfrescoConsumerService {
	private static final Logger logger = LoggerFactory.getLogger(AlfrescoConsumerService.class);

	private static String tipodocumental;
	private static HashMap<String, String> metadatos = new HashMap<String, String>();

	@Value("${archivo.separador}")
	private String pathSeparador;

	public RptaAlfresco grabarDocumento(String key, String nomFile, String ruta, byte[] file, String base)
			throws Exception {
		logger.debug("INICIO - grabarDocumento");
		RptaUploadBean value = null;
		RptaAlfresco retorno = null;
		try {
			ruta = ruta.replace("{separador}", pathSeparador);
			base = new ClassPathResource(base).getFile().getAbsolutePath();

			if (file != null) {
				Util.setFileConfig(base + File.separator);

				value = CallServiceRest.ServiceUpload(key, file, nomFile, tipodocumental, metadatos, ruta);
				logger.debug(value.getMessage());
				logger.debug("" + value.getStatus().getCode());
				logger.debug(value.getUuid());
				retorno = new RptaAlfresco();
				retorno.setUuid(value.getUuid());
				retorno.setCode(value.getCode());
				retorno.setMessage(value.getMessage());
			}
		} catch (Exception ex) {
			throw ex;
		} finally {
			logger.debug("FIN - grabarDocumento");
		}
		return retorno;
	}

	public byte[] leerDocumentoAlfresco(String key, String uuid, String base) throws Exception {
		if (!StringUtils.isEmpty(uuid)) {
			// Resource resourcePJ = new ClassPathResource("base.txt");
			// //String base = resourcePJ.getFile().getAbsolutePath();
			// base = base.replace("base.txt", "");

			Util.setFileConfig(base + File.separator);
			RptaDownloadBean value = CallServiceRest.ServiceDownload(uuid, key);
			logger.debug(value.getMessage());
			logger.debug("" + value.getStatus().getCode());
			String respuesta = value.getCode();
			if (respuesta != null && "OK".equals(respuesta)) {
				logger.debug("peso : " + value.getSize());
				logger.debug("nombre: " + value.getFileName());
				return value.getContent();
			} else {
				throw new ValidateException(
						value.getCode() + ":" + value.getCode() + ":" + value.getStatus().getCode());
			}
		} else {
			throw new ValidateException("uuid es requerido.");
		}
	}

}