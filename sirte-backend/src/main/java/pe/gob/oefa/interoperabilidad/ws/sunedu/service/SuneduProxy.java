package pe.gob.oefa.interoperabilidad.ws.sunedu.service;

public class SuneduProxy implements pe.gob.oefa.interoperabilidad.ws.sunedu.service.Sunedu {
  private String _endpoint = null;
  private pe.gob.oefa.interoperabilidad.ws.sunedu.service.Sunedu sunedu = null;
  
  public SuneduProxy() {
    _initSuneduProxy();
  }
  
  public SuneduProxy(String endpoint) {
    _endpoint = endpoint;
    _initSuneduProxy();
  }
  
  private void _initSuneduProxy() {
    try {
      sunedu = (new pe.gob.oefa.interoperabilidad.ws.sunedu.service.SuneduImplServiceLocator()).getSuneduImplPort();
      if (sunedu != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sunedu)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sunedu)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sunedu != null)
      ((javax.xml.rpc.Stub)sunedu)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunedu.service.Sunedu getSunedu() {
    if (sunedu == null)
      _initSuneduProxy();
    return sunedu;
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunedu.service.RespuestaWSOefa getGradoAcademico(java.lang.String dni, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunedu == null)
      _initSuneduProxy();
    return sunedu.getGradoAcademico(dni, usuarioOEFA, ip, mcAddress);
  }
  
  
}