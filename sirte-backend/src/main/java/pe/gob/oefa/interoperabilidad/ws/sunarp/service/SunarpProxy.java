package pe.gob.oefa.interoperabilidad.ws.sunarp.service;

public class SunarpProxy implements pe.gob.oefa.interoperabilidad.ws.sunarp.service.Sunarp {
  private String _endpoint = null;
  private pe.gob.oefa.interoperabilidad.ws.sunarp.service.Sunarp sunarp = null;
  
  public SunarpProxy() {
    _initSunarpProxy();
  }
  
  public SunarpProxy(String endpoint) {
    _endpoint = endpoint;
    _initSunarpProxy();
  }
  
  private void _initSunarpProxy() {
    try {
      sunarp = (new pe.gob.oefa.interoperabilidad.ws.sunarp.service.SunarpImplServiceLocator()).getSunarpImplPort();
      if (sunarp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sunarp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sunarp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sunarp != null)
      ((javax.xml.rpc.Stub)sunarp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunarp.service.Sunarp getSunarp() {
    if (sunarp == null)
      _initSunarpProxy();
    return sunarp;
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunarp.service.RespuestaPartidaBean listarAsientos(java.lang.String zona, java.lang.String oficina, java.lang.String partida, java.lang.String registro, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunarp == null)
      _initSunarpProxy();
    return sunarp.listarAsientos(zona, oficina, partida, registro, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunarp.service.DatosPJBean[] buscarPJRazonSocial(java.lang.String razonSocial, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunarp == null)
      _initSunarpProxy();
    return sunarp.buscarPJRazonSocial(razonSocial, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunarp.service.RespuestaVehiculoBean verDetalleRPV(java.lang.String zona, java.lang.String oficina, java.lang.String placa, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunarp == null)
      _initSunarpProxy();
    return sunarp.verDetalleRPV(zona, oficina, placa, usuarioOEFA, ip, mcAddress);
  }
  
  public byte[] verAsiento(long transaccion, long idImg, java.lang.String tipo, java.lang.String nroTotalPag, java.lang.String nroPagRef, java.lang.String pagina, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunarp == null)
      _initSunarpProxy();
    return sunarp.verAsiento(transaccion, idImg, tipo, nroTotalPag, nroPagRef, pagina, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunarp.service.ResultadoTitularidad[] buscarTitularidad(java.lang.String tipoParticipante, java.lang.String apellidoPaterno, java.lang.String apellidoMaterno, java.lang.String nombres, java.lang.String razonSocial, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunarp == null)
      _initSunarpProxy();
    return sunarp.buscarTitularidad(tipoParticipante, apellidoPaterno, apellidoMaterno, nombres, razonSocial, usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunarp.service.OficinaRegistralBean[] getOficinas(java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunarp == null)
      _initSunarpProxy();
    return sunarp.getOficinas(usuarioOEFA, ip, mcAddress);
  }
  
  public pe.gob.oefa.interoperabilidad.ws.sunarp.service.RespuestaNaveAeronaveBean[] buscarNaveAeronave(java.lang.String numeroMatricula, java.lang.String usuarioOEFA, java.lang.String ip, java.lang.String mcAddress) throws java.rmi.RemoteException{
    if (sunarp == null)
      _initSunarpProxy();
    return sunarp.buscarNaveAeronave(numeroMatricula, usuarioOEFA, ip, mcAddress);
  }
  
  
}