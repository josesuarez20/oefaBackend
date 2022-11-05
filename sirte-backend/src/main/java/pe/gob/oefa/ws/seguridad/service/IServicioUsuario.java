/**
 * IServicioUsuario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.service;

public interface IServicioUsuario extends java.rmi.Remote {
    public pe.gob.oefa.ws.seguridad.bean.UsuarioPaginacion listarUsuarioPaginacion(pe.gob.oefa.ws.seguridad.bean.Usuario usuario, java.lang.Integer idEmpresa, java.lang.Integer idAplicacion, java.lang.Integer idRol, pe.gob.oefa.ws.seguridad.bean.Paginacion paginacion) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuario() throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Aplicacion[] listarAplicacionUsuario(java.lang.String usuario) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuariosxAplicacion(java.lang.Short idAplicacion) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioPorRol(java.lang.Integer idRol) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioAsignadosPorRol(java.lang.Integer idRol) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioNoAsignadosPorRol(java.lang.Integer idRol) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.UsuarioTipo[] listarUsuarioTipo() throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario autenticarUsuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Aplicacion[] aplicacionPorEmpresa(pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Rol[] rolesPorAplicacion(pe.gob.oefa.ws.seguridad.bean.Aplicacion aplicacion) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioPorRolServicios(java.lang.Integer opc, java.lang.Integer rol) throws java.rmi.RemoteException;
    public java.lang.Integer insertar_Usuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario, java.lang.Integer modo, java.lang.String contrasena) throws java.rmi.RemoteException;
    public java.lang.Integer actualizarEstado_Usuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException;
    public java.lang.Integer actualizar_Usuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario buscar_Usuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException;
    public java.lang.Integer insertarLogAcceso(java.lang.String strHostName, java.lang.String IP, java.lang.Integer idUsu) throws java.rmi.RemoteException;
    public java.lang.Integer insertarLog(java.lang.Integer idAccion, java.lang.Integer idUsuario, java.lang.String descripcion) throws java.rmi.RemoteException;
    public java.lang.Integer guardarPolitica(java.lang.Integer _long, java.lang.Integer vigencia, java.lang.Integer diferencia, java.lang.Integer nroMaximo, java.lang.Integer diasBloq, java.lang.Integer compleji, java.lang.Integer cantContrHis) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Politica[] listar_Politica() throws java.rmi.RemoteException;
    public java.lang.Integer modoUsuario(java.lang.String username) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario autenticarUsuario_Modo(pe.gob.oefa.ws.seguridad.bean.Usuario usuario, java.lang.String contrasena) throws java.rmi.RemoteException;
    public java.lang.Integer validarContrasena(java.lang.Integer idUsuario, java.lang.String contrasena) throws java.rmi.RemoteException;
    public java.lang.Integer updatContrasena(java.lang.Integer idUsuario, java.lang.String contrasena) throws java.rmi.RemoteException;
    public java.lang.Integer bloquearUsuario(java.lang.String username) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario authenticateUser(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws java.rmi.RemoteException;
    public java.lang.Boolean existUserActiveDirectory(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.Integer reiniciarUsuario(java.lang.String usuario, java.lang.String contrasena) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioPorSiglaRolAreaCargo(java.lang.Integer idAplicacion, java.lang.String siglaRol, java.lang.String siglaArea, java.lang.String siglaCargo) throws java.rmi.RemoteException;
}
