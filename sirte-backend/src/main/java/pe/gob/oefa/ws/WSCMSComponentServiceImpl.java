package pe.gob.oefa.ws;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WSCMSComponentServiceImpl implements WSCMSComponentService {

	@Value("${alfresco.ws}")
	private String wsAlfresco;

	@Value("${alfreco.key}")
	private String keyAlfresco;

	@Value("${alfreco.inner.sirte}")
	private String innerAlfrescoSirte;

	@Value("${alfreco.key.siga}")
	private String keySiga;

	@Value("${alfresco.ws.siga}")
	private String wsAlfrescoSiga;

	@Value("${alfreco.key.siged}")
	private String keySiged;

	@Value("${alfresco.ws.siged}")
	private String wsAlfrescoSiged;

	
	@Override
	public ContenidoECMBean leerDocumento(String uuid) throws RemoteException, ServiceException {
		Ws_cmsProxy proxy2 = new Ws_cmsProxy();
		proxy2.setEndpoint(wsAlfresco);
		return proxy2.leerDocumento(keyAlfresco, uuid);
	}

	@Override
	public ContenidoECMBean leerDocumentoSiga(String uuid) throws RemoteException, ServiceException {
		Ws_cmsProxy proxy2 = new Ws_cmsProxy();
		proxy2.setEndpoint(wsAlfrescoSiga);
		return proxy2.leerDocumento(keySiga, uuid);
	}
	
	@Override
	public ContenidoECMBean leerDocumentoSiged(String uuid) throws RemoteException, ServiceException {
		Ws_cmsProxy proxy2 = new Ws_cmsProxy();
		proxy2.setEndpoint(wsAlfrescoSiged);
		return proxy2.leerDocumento(keySiged, uuid);
	}

	@Override
	public RptaWsBean registrarDocumento(String nomFile, String ruta, byte[] file) throws RemoteException {
		try {
			// log.info("accediendo registrarDocumento");
			Ws_cmsProxy proxy2 = new Ws_cmsProxy();
			proxy2.setEndpoint(wsAlfresco);
			if (innerAlfrescoSirte != null && !innerAlfrescoSirte.equalsIgnoreCase("")) {
				if (ruta != null && !ruta.equalsIgnoreCase(""))
					ruta = innerAlfrescoSirte + "/" + ruta;
				else
					ruta = innerAlfrescoSirte;
			}
			return proxy2.registrarDocumento(keyAlfresco, nomFile, ruta, file);
		} catch (Exception e) {
			// log.info("NO accede registrarDocumento");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public RptaWsBean registrarDocumentoSiga(String nomFile, String ruta, byte[] file) throws RemoteException {
		try {
			// log.info("accediendo registrarDocumento");
			Ws_cmsProxy proxy2 = new Ws_cmsProxy();
			proxy2.setEndpoint(wsAlfrescoSiga);
			return proxy2.registrarDocumento(keySiga, nomFile, ruta, file);
		} catch (Exception e) {
			// log.info("NO accede registrarDocumento");
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public RptaWsBean registrarDocumentoSiged(String nomFile, String ruta, byte[] file) throws RemoteException {
		try {
			// log.info("accediendo registrarDocumento");
			Ws_cmsProxy proxy2 = new Ws_cmsProxy();
			proxy2.setEndpoint(wsAlfrescoSiged);
			return proxy2.registrarDocumento(keySiged, nomFile, ruta, file);
		} catch (Exception e) {
			// log.info("NO accede registrarDocumento");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public RptaWsBean eliminarDocumento(String uuid) throws RemoteException {
		Ws_cmsProxy proxy2 = new Ws_cmsProxy();
		proxy2.setEndpoint(wsAlfresco);
		return proxy2.eliminarDocumento(keyAlfresco, uuid);
	}

	@Override
	public pe.gob.oefa.ws.RptaBcBean busquedaContenido(java.lang.String rutaSubCarpeta, java.lang.String parametro1,
			java.lang.String parametro2, java.lang.String parametro3, java.lang.String parametro4)
			throws java.rmi.RemoteException {
		Ws_cmsProxy proxy2 = new Ws_cmsProxy();
		proxy2.setEndpoint(wsAlfresco);
		return proxy2.busquedaContenido(keyAlfresco, rutaSubCarpeta, parametro1, parametro2, parametro3, parametro4);
	}

}
