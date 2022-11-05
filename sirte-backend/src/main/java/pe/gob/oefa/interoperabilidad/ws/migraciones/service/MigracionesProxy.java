package pe.gob.oefa.interoperabilidad.ws.migraciones.service;

public class MigracionesProxy implements pe.gob.oefa.interoperabilidad.ws.migraciones.service.Migraciones {
  private String _endpoint = null;
  private pe.gob.oefa.interoperabilidad.ws.migraciones.service.Migraciones migraciones = null;
  
  public MigracionesProxy() {
    _initMigracionesProxy();
  }
  
  public MigracionesProxy(String endpoint) {
    _endpoint = endpoint;
    _initMigracionesProxy();
  }
  
  private void _initMigracionesProxy() {
    try {
      migraciones = (new pe.gob.oefa.interoperabilidad.ws.migraciones.service.MigracionesImplServiceLocator()).getMigracionesImplPort();
      if (migraciones != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)migraciones)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)migraciones)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (migraciones != null)
      ((javax.xml.rpc.Stub)migraciones)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.gob.oefa.interoperabilidad.ws.migraciones.service.Migraciones getMigraciones() {
    if (migraciones == null)
      _initMigracionesProxy();
    return migraciones;
  }
  
  public pe.gob.oefa.interoperabilidad.ws.migraciones.service.RespuestaBean consultarDocumento(pe.gob.oefa.interoperabilidad.ws.migraciones.service.SolicitudBean solicitud, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (migraciones == null)
      _initMigracionesProxy();
    return migraciones.consultarDocumento(solicitud, usuarioOEFA, ip, mcAddress);
  }
  
  
}