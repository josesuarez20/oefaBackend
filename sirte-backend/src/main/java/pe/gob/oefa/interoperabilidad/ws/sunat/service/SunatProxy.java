package pe.gob.oefa.interoperabilidad.ws.sunat.service;

public class SunatProxy implements pe.gob.oefa.interoperabilidad.ws.sunat.service.Sunat {
  private String _endpoint = null;
  private pe.gob.oefa.interoperabilidad.ws.sunat.service.Sunat sunat = null;
  
  public SunatProxy() {
    _initSunatProxy();
  }
  
  public SunatProxy(String endpoint) {
    _endpoint = endpoint;
    _initSunatProxy();
  }
  
  private void _initSunatProxy() {
    try {
      sunat = (new pe.gob.oefa.interoperabilidad.ws.sunat.service.SunatImplServiceLocator()).getSunatImplPort();
      if (sunat != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sunat)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sunat)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sunat != null)
      ((javax.xml.rpc.Stub)sunat)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunat.service.Sunat getSunat() {
    if (sunat == null)
      _initSunatProxy();
    return sunat;
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanRso[] getRepLegales(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    return sunat.getRepLegales(numruc, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanDds getDatosSecundarios(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    return sunat.getDatosSecundarios(numruc, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanT362[] getDatosT362(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    return sunat.getDatosT362(numruc, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanDdp[] buscaRazonSocial(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    return sunat.buscaRazonSocial(numruc, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanT1144 getDatosT1144(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    return sunat.getDatosT1144(numruc, usuarioOEFA, ip, mcAddress);
  }
  
  public java.lang.String getDomicilioLegal(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    return sunat.getDomicilioLegal(numruc, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanT1150[] getEstAnexosT1150(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    return sunat.getEstAnexosT1150(numruc, usuarioOEFA, ip, mcAddress);
  }
  
  public void setServicioConsultaRucService(java.lang.Object servicioConsultaRucService) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    sunat.setServicioConsultaRucService(servicioConsultaRucService);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanSpr[] getEstablecimientosAnexos(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    return sunat.getEstablecimientosAnexos(numruc, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunat.service.BeanDdp getDatosPrincipales(java.lang.String numruc, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunat == null)
      _initSunatProxy();
    return sunat.getDatosPrincipales(numruc, usuarioOEFA, ip, mcAddress);
  }
  
  
}