package pe.gob.oefa.ws.seguridad.service;

import pe.gob.oefa.ws.seguridad.bean.Paginacion;
import pe.gob.oefa.ws.seguridad.bean.Usuario;
import pe.gob.oefa.ws.seguridad.bean.UsuarioPaginacion;

public interface SisegSeguridadService {

	Integer modoUsuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws Exception;
	pe.gob.oefa.ws.seguridad.bean.Usuario autenticarUsuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario)			throws Exception;

	pe.gob.oefa.ws.seguridad.bean.Usuario autenticarUsuario_Modo(pe.gob.oefa.ws.seguridad.bean.Usuario usuario,			String contrasena) throws Exception;

	pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioPorSiglaRolAreaCargo(Integer idAplicacion, String siglaRol,			String siglaArea, String siglaCargo) throws Exception;

	Usuario buscar_Usuario(Usuario usuario) throws Exception;

	pe.gob.oefa.ws.seguridad.bean.Pagina[] obtenerSitemapPorUsuario(String nombreUsuario, Integer idAplicacion)			throws Exception;

	pe.gob.oefa.ws.seguridad.bean.PaginaAccion[] obtenerPermisoPerfilPorGrupo(Integer idUsuario, String idsGrupo)			throws Exception;
	Usuario[] listarUsuario() throws Exception;
	UsuarioPaginacion searchUsuario(Usuario usuario, Integer idEmpresa, Integer idAplicacion,Integer idRol,Paginacion paginacion)	throws Exception;

}