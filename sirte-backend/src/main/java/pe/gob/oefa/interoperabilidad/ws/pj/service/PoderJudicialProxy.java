package pe.gob.oefa.interoperabilidad.ws.pj.service;

public class PoderJudicialProxy implements pe.gob.oefa.interoperabilidad.ws.pj.service.PoderJudicial {
  private String _endpoint = null;
  private pe.gob.oefa.interoperabilidad.ws.pj.service.PoderJudicial poderJudicial = null;
  
  public PoderJudicialProxy() {
    _initPoderJudicialProxy();
  }
  
  public PoderJudicialProxy(String endpoint) {
    _endpoint = endpoint;
    _initPoderJudicialProxy();
  }
  
  private void _initPoderJudicialProxy() {
    try {
      poderJudicial = (new pe.gob.oefa.interoperabilidad.ws.pj.service.PoderJudicialImplServiceLocator()).getPoderJudicialImplPort();
      if (poderJudicial != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)poderJudicial)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)poderJudicial)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (poderJudicial != null)
      ((javax.xml.rpc.Stub)poderJudicial)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.gob.oefa.interoperabilidad.ws.pj.service.PoderJudicial getPoderJudicial() {
    if (poderJudicial == null)
      _initPoderJudicialProxy();
    return poderJudicial;
  }
  
  public pe.gob.oefa.interoperabilidad.ws.pj.service.RpatBeanPJ verificarAntecedentesPenales(java.lang.String vDNIconsulta, java.lang.String apePaterno, java.lang.String apeMaterno, java.lang.String nombre1, java.lang.String nombre2, java.lang.String nombre3, java.lang.String vDNIconsultante, java.lang.String motivoConsulta, java.lang.String procesoOEFA, java.lang.String usuarioOEFA) throws java.rmi.RemoteException{
    if (poderJudicial == null)
      _initPoderJudicialProxy();
    return poderJudicial.verificarAntecedentesPenales(vDNIconsulta, apePaterno, apeMaterno, nombre1, nombre2, nombre3, vDNIconsultante, motivoConsulta, procesoOEFA, usuarioOEFA);
  }
  
  
}