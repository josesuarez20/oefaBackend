package pe.gob.oefa.ws.seguridad.service;

public class ServicioUsuarioProxy implements pe.gob.oefa.ws.seguridad.service.IServicioUsuario {
  private String _endpoint = null;
  private pe.gob.oefa.ws.seguridad.service.IServicioUsuario iServicioUsuario = null;
  
  public ServicioUsuarioProxy() {
    _initIServicioUsuarioProxy();
  }
  
  public ServicioUsuarioProxy(String endpoint) {
    _endpoint = endpoint;
    _initIServicioUsuarioProxy();
  }
  
  private void _initIServicioUsuarioProxy() {
    try {
      iServicioUsuario = (new pe.gob.oefa.ws.seguridad.service.ServicioUsuarioLocator()).getHTTP_ServicioUsuario();
      if (iServicioUsuario != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iServicioUsuario)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iServicioUsuario)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iServicioUsuario != null)
      ((javax.xml.rpc.Stub)iServicioUsuario)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.gob.oefa.ws.seguridad.service.IServicioUsuario getIServicioUsuario() {
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario;
  }
  
  public pe.gob.oefa.ws.seguridad.bean.UsuarioPaginacion listarUsuarioPaginacion(pe.gob.oefa.ws.seguridad.bean.Usuario usuario, java.lang.Integer idEmpresa, java.lang.Integer idAplicacion, java.lang.Integer idRol, pe.gob.oefa.ws.seguridad.bean.Paginacion paginacion) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarUsuarioPaginacion(usuario, idEmpresa, idAplicacion, idRol, paginacion);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuario() throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarUsuario();
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Aplicacion[] listarAplicacionUsuario(java.lang.String usuario) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarAplicacionUsuario(usuario);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuariosxAplicacion(java.lang.Short idAplicacion) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarUsuariosxAplicacion(idAplicacion);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioPorRol(java.lang.Integer idRol) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarUsuarioPorRol(idRol);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioAsignadosPorRol(java.lang.Integer idRol) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarUsuarioAsignadosPorRol(idRol);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioNoAsignadosPorRol(java.lang.Integer idRol) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarUsuarioNoAsignadosPorRol(idRol);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.UsuarioTipo[] listarUsuarioTipo() throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarUsuarioTipo();
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario autenticarUsuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.autenticarUsuario(usuario);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Aplicacion[] aplicacionPorEmpresa(pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.aplicacionPorEmpresa(aplicacion);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Rol[] rolesPorAplicacion(pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.rolesPorAplicacion(aplicacion);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioPorRolServicios(java.lang.Integer opc, java.lang.Integer rol) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarUsuarioPorRolServicios(opc, rol);
  }
  
  public java.lang.Integer insertar_Usuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario, java.lang.Integer modo, java.lang.String contrasena) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.insertar_Usuario(usuario, modo, contrasena);
  }
  
  public java.lang.Integer actualizarEstado_Usuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.actualizarEstado_Usuario(usuario);
  }
  
  public java.lang.Integer actualizar_Usuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.actualizar_Usuario(usuario);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario buscar_Usuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.buscar_Usuario(usuario);
  }
  
  public java.lang.Integer insertarLogAcceso(java.lang.String strHostName, java.lang.String IP, java.lang.Integer idUsu) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.insertarLogAcceso(strHostName, IP, idUsu);
  }
  
  public java.lang.Integer insertarLog(java.lang.Integer idAccion, java.lang.Integer idUsuario, java.lang.String descripcion) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.insertarLog(idAccion, idUsuario, descripcion);
  }
  
  public java.lang.Integer guardarPolitica(java.lang.Integer _long, java.lang.Integer vigencia, java.lang.Integer diferencia, java.lang.Integer nroMaximo, java.lang.Integer diasBloq, java.lang.Integer compleji, java.lang.Integer cantContrHis) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.guardarPolitica(_long, vigencia, diferencia, nroMaximo, diasBloq, compleji, cantContrHis);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Politica[] listar_Politica() throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listar_Politica();
  }
  
  public java.lang.Integer modoUsuario(java.lang.String username) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.modoUsuario(username);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario autenticarUsuario_Modo(pe.gob.oefa.ws.seguridad.bean.Usuario usuario, java.lang.String contrasena) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.autenticarUsuario_Modo(usuario, contrasena);
  }
  
  public java.lang.Integer validarContrasena(java.lang.Integer idUsuario, java.lang.String contrasena) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.validarContrasena(idUsuario, contrasena);
  }
  
  public java.lang.Integer updatContrasena(java.lang.Integer idUsuario, java.lang.String contrasena) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.updatContrasena(idUsuario, contrasena);
  }
  
  public java.lang.Integer bloquearUsuario(java.lang.String username) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.bloquearUsuario(username);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario authenticateUser(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.authenticateUser(usuario);
  }
  
  public java.lang.Boolean existUserActiveDirectory(java.lang.String username) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.existUserActiveDirectory(username);
  }
  
  public java.lang.Integer reiniciarUsuario(java.lang.String usuario, java.lang.String contrasena) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.reiniciarUsuario(usuario, contrasena);
  }
  
  public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioPorSiglaRolAreaCargo(java.lang.Integer idAplicacion, java.lang.String siglaRol, java.lang.String siglaArea, java.lang.String siglaCargo) throws java.rmi.RemoteException{
    if (iServicioUsuario == null)
      _initIServicioUsuarioProxy();
    return iServicioUsuario.listarUsuarioPorSiglaRolAreaCargo(idAplicacion, siglaRol, siglaArea, siglaCargo);
  }
  
  
}