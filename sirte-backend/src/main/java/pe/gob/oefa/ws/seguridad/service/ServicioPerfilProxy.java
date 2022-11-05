package pe.gob.oefa.ws.seguridad.service;

public class ServicioPerfilProxy implements pe.gob.oefa.ws.seguridad.service.IServicioPerfil {
  private String _endpoint = null;
  private pe.gob.oefa.ws.seguridad.service.IServicioPerfil iServicioPerfil = null;
  
  public ServicioPerfilProxy() {
    _initIServicioPerfilProxy();
  }
  
  public ServicioPerfilProxy(String endpoint) {
    _endpoint = endpoint;
    _initIServicioPerfilProxy();
  }
  
  private void _initIServicioPerfilProxy() {
    try {
      iServicioPerfil = (new pe.gob.oefa.ws.seguridad.service.ServicioPerfilLocator()).getHTTP_ServicioPerfil();
      if (iServicioPerfil != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iServicioPerfil)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iServicioPerfil)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iServicioPerfil != null)
      ((javax.xml.rpc.Stub)iServicioPerfil)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.gob.oefa.ws.seguridad.service.IServicioPerfil getIServicioPerfil() {
    if (iServicioPerfil == null)
      _initIServicioPerfilProxy();
    return iServicioPerfil;
  }
  
  public java.lang.Integer crearPerfil(pe.gob.oefa.ws.seguridad.bean.UsuarioRol[] oListaUsuarioRol) throws java.rmi.RemoteException{
    if (iServicioPerfil == null)
      _initIServicioPerfilProxy();
    return iServicioPerfil.crearPerfil(oListaUsuarioRol);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.TreeviewHierarchyObject[] listarTreeview(java.lang.Integer idRol, java.lang.Integer idEmpresa) throws java.rmi.RemoteException{
    if (iServicioPerfil == null)
      _initIServicioPerfilProxy();
    return iServicioPerfil.listarTreeview(idRol, idEmpresa);
  }
  
  public java.lang.Integer asignarPerfil(pe.gob.oefa.ws.seguridad.bean.PermisoPerfil[] oListaPermisoPerfil) throws java.rmi.RemoteException{
    if (iServicioPerfil == null)
      _initIServicioPerfilProxy();
    return iServicioPerfil.asignarPerfil(oListaPermisoPerfil);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Pagina[] obtenerSitemapPorUsuario(java.lang.String nombreUsuario, java.lang.Integer idAplicacion) throws java.rmi.RemoteException{
    if (iServicioPerfil == null)
      _initIServicioPerfilProxy();
    return iServicioPerfil.obtenerSitemapPorUsuario(nombreUsuario, idAplicacion);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.PaginaAccion[] obtenerPermisoPerfilPorGrupo(java.lang.Integer idUsuario, java.lang.String idsGrupo) throws java.rmi.RemoteException{
    if (iServicioPerfil == null)
      _initIServicioPerfilProxy();
    return iServicioPerfil.obtenerPermisoPerfilPorGrupo(idUsuario, idsGrupo);
  }
  
  
}