package pe.gob.oefa.ws;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.springframework.stereotype.Component;

 
@Component
public final class WsCmsCliente {

	public static final String WS_ALFRESCO;
	public static final String KEY_ALFRESCO;
	public static final String SPACE_INNER_SISUD_ALFRESCO;

	static {
		try {
			WS_ALFRESCO = "http://10.1.1.117:8280/WS_CMS/ws_cms?wsdl";
			KEY_ALFRESCO = "SRSALAS20180418GT4vdeceMMAoGA1UEBxMDTi9BMRswGQYRLZRKE058020182018salOr";
			SPACE_INNER_SISUD_ALFRESCO = "SRSALAS";
		} catch (Exception e) {
			throw new RuntimeException("Error: " + e);
		}
	}

	public static pe.gob.oefa.ws.ContenidoECMBean leerDocumento(String uuid) throws RemoteException, ServiceException{
		//log.info("leerDocumento");
		Ws_cmsProxy proxy2 = new Ws_cmsProxy();
		proxy2.setEndpoint(WS_ALFRESCO);
		return proxy2.leerDocumento(KEY_ALFRESCO,uuid);
	}

	public static pe.gob.oefa.ws.RptaWsBean registrarDocumento(String nomFile, String ruta, byte[] file) throws RemoteException{
		/*log.info("registrarDocumento");
		log.info("key "+key);
		log.info("nomFile "+nomFile);
		log.info("ruta "+ruta);*/
		try {
			//log.info("accediendo registrarDocumento");
			Ws_cmsProxy proxy2 = new Ws_cmsProxy();
			proxy2.setEndpoint(WS_ALFRESCO);
			if(SPACE_INNER_SISUD_ALFRESCO!=null && !SPACE_INNER_SISUD_ALFRESCO.equalsIgnoreCase("")){
				if(ruta!=null && !ruta.equalsIgnoreCase(""))
					ruta=SPACE_INNER_SISUD_ALFRESCO+"/"+ruta;
				else
					ruta=SPACE_INNER_SISUD_ALFRESCO;
			}
			return proxy2.registrarDocumento(KEY_ALFRESCO, nomFile, ruta, file);
		} catch (Exception e) {
			//log.info("NO accede registrarDocumento");
			e.printStackTrace();
		}
		return null;
	}

	public static pe.gob.oefa.ws.RptaWsBean eliminarDocumento(String uuid) throws RemoteException{
		//log.info("eliminarDocumento");
		Ws_cmsProxy proxy2 = new Ws_cmsProxy();
		proxy2.setEndpoint(WS_ALFRESCO);
		return proxy2.eliminarDocumento(KEY_ALFRESCO, uuid);
	}
	
	public static pe.gob.oefa.ws.RptaBcBean busquedaContenido(java.lang.String rutaSubCarpeta, java.lang.String parametro1, java.lang.String parametro2, java.lang.String parametro3, java.lang.String parametro4) throws java.rmi.RemoteException{
		Ws_cmsProxy proxy2 = new Ws_cmsProxy();
		proxy2.setEndpoint(WS_ALFRESCO);
		return proxy2.busquedaContenido(KEY_ALFRESCO, rutaSubCarpeta, parametro1, parametro2, parametro3, parametro4);
	}

}