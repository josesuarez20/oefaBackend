package pe.gob.oefa.sirte.service.impl;

import java.rmi.RemoteException;
import java.util.Random;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.model.json.ReporteResponse;
import pe.gob.oefa.sirte.dto.DocumentoDTO;
import pe.gob.oefa.sirte.service.DocumentoService;
import pe.gob.oefa.util.Constantes;
import pe.gob.oefa.util.GenericUtil;
import pe.gob.oefa.ws.ContenidoECMBean;
import pe.gob.oefa.ws.RptaWsBean;
import pe.gob.oefa.ws.WSCMSComponentService;

@Service("documentoService")
@Transactional
public class DocumentoServiceImpl extends ServiceBase implements DocumentoService {

	private CoreLogger logger = LoggerFactory.getLogger(DocumentoServiceImpl.class);

	@Autowired
	private WSCMSComponentService wsCmsCliente;

	@Override
	public ReporteResponse save(DocumentoDTO documentoDTO) {
		RptaWsBean rptaWsBean;
		ReporteResponse reporteResponse = null;
		try {
			System.out.println("::save::documentoDTO.getFileContent()::" + documentoDTO.getFileContent());
			if (GenericUtil.isNotNull(documentoDTO.getFileContent())) {
				System.out.println("Paso 1.1" + documentoDTO.getDocumentoId());
				System.out.println("Paso 4.0" + documentoDTO.getUbicacionDocumento());

				int numeroGenerado = new Random().nextInt(999999999);
				String nombresubir = numeroGenerado + "_" + documentoDTO.getNombre();

				rptaWsBean = wsCmsCliente.registrarDocumento(nombresubir, documentoDTO.getUbicacionDocumento(),
						documentoDTO.getFileContent());

				System.out.println("Paso getCadMsg()::::" + rptaWsBean.getCadMsg());
				System.out.println("Paso getCodMsg():::" + rptaWsBean.getCodMsg());
				System.out.println("Paso getUuid()::::" + rptaWsBean.getUuid());

				System.out.println("Paso 5.0");
				if (GenericUtil.isNotNull(rptaWsBean)/* && GenericUtil.isNotEmpty(rptaWsBean.getUuid()) */) {
					System.out.println("Paso 6.0");
					reporteResponse = new ReporteResponse();
					reporteResponse.setMensaje(rptaWsBean.getCadMsg());
					reporteResponse.setCodmensaje(rptaWsBean.getCodMsg());
					reporteResponse.setNombre(rptaWsBean.getUuid());
				}
			}
		} catch (RemoteException e) {
			launchException(logger, e);
		}
		return reporteResponse;
	}

	@Override
	public ReporteResponse get(String uuid) {
		ReporteResponse reporteResponse = null;
		try {
			ContenidoECMBean contenidoECMBean = wsCmsCliente.leerDocumento(uuid);
			if (GenericUtil.isNotNull(contenidoECMBean)
					&& !Constantes.CODIGO_ALFRESCO_NO_OK.equals(contenidoECMBean.getCodMsg())) {
				reporteResponse = new ReporteResponse();
				reporteResponse.setFileContent(contenidoECMBean.getContenidoFile());
				reporteResponse.setContentType(contenidoECMBean.getTipoContenido());
				reporteResponse.setNombre(contenidoECMBean.getNombreArchivo());
			}
		} catch (RemoteException | ServiceException e) {
			e.printStackTrace();
			launchException(logger, e);
		}
		return reporteResponse;
	}


}
