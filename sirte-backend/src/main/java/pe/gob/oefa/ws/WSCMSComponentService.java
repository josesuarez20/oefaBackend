package pe.gob.oefa.ws;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public interface WSCMSComponentService {

	pe.gob.oefa.ws.ContenidoECMBean leerDocumento(String uuid) throws RemoteException, ServiceException;

	pe.gob.oefa.ws.ContenidoECMBean leerDocumentoSiga(String uuid) throws RemoteException, ServiceException;

	pe.gob.oefa.ws.ContenidoECMBean leerDocumentoSiged(String uuid) throws RemoteException, ServiceException;

	pe.gob.oefa.ws.RptaWsBean registrarDocumento(String nomFile, String ruta, byte[] file) throws RemoteException;

	pe.gob.oefa.ws.RptaWsBean registrarDocumentoSiga(String nomFile, String ruta, byte[] file) throws RemoteException;

	pe.gob.oefa.ws.RptaWsBean registrarDocumentoSiged(String nomFile, String ruta, byte[] file) throws RemoteException;

	pe.gob.oefa.ws.RptaWsBean eliminarDocumento(String uuid) throws RemoteException;

	pe.gob.oefa.ws.RptaBcBean busquedaContenido(java.lang.String rutaSubCarpeta, java.lang.String parametro1,
			java.lang.String parametro2, java.lang.String parametro3, java.lang.String parametro4)
			throws java.rmi.RemoteException;

}
