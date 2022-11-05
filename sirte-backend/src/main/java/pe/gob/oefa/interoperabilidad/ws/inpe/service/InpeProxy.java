package pe.gob.oefa.interoperabilidad.ws.inpe.service;

public class InpeProxy implements pe.gob.oefa.interoperabilidad.ws.inpe.service.Inpe {
  private String _endpoint = null;
  private pe.gob.oefa.interoperabilidad.ws.inpe.service.Inpe inpe = null;
  
  public InpeProxy() {
    _initInpeProxy();
  }
  
  public InpeProxy(String endpoint) {
    _endpoint = endpoint;
    _initInpeProxy();
  }
  
  private void _initInpeProxy() {
    try {
      inpe = (new pe.gob.oefa.interoperabilidad.ws.inpe.service.InpeImplServiceLocator()).getInpeImplPort();
      if (inpe != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)inpe)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)inpe)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (inpe != null)
      ((javax.xml.rpc.Stub)inpe)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.gob.oefa.interoperabilidad.ws.inpe.service.Inpe getInpe() {
    if (inpe == null)
      _initInpeProxy();
    return inpe;
  }
  
  public java.lang.String getAntecedenteJudicial(java.lang.String apepat, java.lang.String apemat, java.lang.String nombres, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (inpe == null)
      _initInpeProxy();
    return inpe.getAntecedenteJudicial(apepat, apemat, nombres, usuarioOEFA, ip, mcAddress);
  }
  
  
}