/**
 * IServicioPerfil.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gob.oefa.ws.seguridad.service;

public interface IServicioPerfil extends java.rmi.Remote {
    public java.lang.Integer crearPerfil(pe.gob.oefa.ws.seguridad.bean.UsuarioRol[] oListaUsuarioRol) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.TreeviewHierarchyObject[] listarTreeview(java.lang.Integer idRol, java.lang.Integer idEmpresa) throws java.rmi.RemoteException;
    public java.lang.Integer asignarPerfil(pe.gob.oefa.ws.seguridad.bean.PermisoPerfil[] oListaPermisoPerfil) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.Pagina[] obtenerSitemapPorUsuario(java.lang.String nombreUsuario, java.lang.Integer idAplicacion) throws java.rmi.RemoteException;
    public pe.gob.oefa.ws.seguridad.bean.PaginaAccion[] obtenerPermisoPerfilPorGrupo(java.lang.Integer idUsuario, java.lang.String idsGrupo) throws java.rmi.RemoteException;
}