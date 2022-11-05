package pe.gob.oefa.ws.seguridad.service;

import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import pe.gob.oefa.ws.seguridad.bean.Paginacion;
import pe.gob.oefa.ws.seguridad.bean.Usuario;
import pe.gob.oefa.ws.seguridad.bean.UsuarioPaginacion;

@Service("sisegSeguridadService")
public class WsSisegCliente implements SisegSeguridadService {

	//@Value("${security.ws.usuario}")
	private String wsUsuario;

	//@Value("${security.ws.perfil}")
	private String wsPefil;
	


	@Override
	public Integer modoUsuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario) throws Exception {
		Integer resultado = null;
		ServicioUsuario servicio = new ServicioUsuarioLocator();
		HTTP_ServicioUsuarioStub stub = new HTTP_ServicioUsuarioStub(new URL(wsUsuario), servicio);
		resultado = stub.modoUsuario(usuario.getUserName());

		return resultado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pe.gob.oefa.ws.seguridad.service.SisegSeguridadService#autenticarUsuario(pe.
	 * gob.oefa.ws.seguridad.bean.Usuario)
	 */
	@Override
	public pe.gob.oefa.ws.seguridad.bean.Usuario autenticarUsuario(pe.gob.oefa.ws.seguridad.bean.Usuario usuario)
			throws Exception {
		ServicioUsuario servicio = new ServicioUsuarioLocator();
		HTTP_ServicioUsuarioStub stub = new HTTP_ServicioUsuarioStub(new URL(wsUsuario), servicio);
		usuario = stub.autenticarUsuario(usuario);

		return usuario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pe.gob.oefa.ws.seguridad.service.SisegSeguridadService#autenticarUsuario_Modo
	 * (pe.gob.oefa.ws.seguridad.bean.Usuario, java.lang.String)
	 */
	@Override
	public pe.gob.oefa.ws.seguridad.bean.Usuario autenticarUsuario_Modo(pe.gob.oefa.ws.seguridad.bean.Usuario usuario,
			String contrasena) throws Exception {
		ServicioUsuario servicio = new ServicioUsuarioLocator();
		HTTP_ServicioUsuarioStub stub = new HTTP_ServicioUsuarioStub(new URL(wsUsuario), servicio);
		usuario = stub.autenticarUsuario_Modo(usuario, contrasena);

		return usuario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pe.gob.oefa.ws.seguridad.service.SisegSeguridadService#
	 * listarUsuarioPorSiglaRolAreaCargo(java.lang.Integer, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public pe.gob.oefa.ws.seguridad.bean.Usuario[] listarUsuarioPorSiglaRolAreaCargo(Integer idAplicacion,
			String siglaRol, String siglaArea, String siglaCargo) throws Exception {
		ServicioUsuario servicio = new ServicioUsuarioLocator();
		HTTP_ServicioUsuarioStub stub = new HTTP_ServicioUsuarioStub(new URL(wsUsuario), servicio);

		return stub.listarUsuarioPorSiglaRolAreaCargo(idAplicacion, siglaRol, siglaArea, siglaCargo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pe.gob.oefa.ws.seguridad.service.SisegSeguridadService#buscar_Usuario(pe.gob.
	 * oefa.ws.seguridad.bean.Usuario)
	 */
	@Override
	public Usuario buscar_Usuario(Usuario usuario) throws Exception {
		ServicioUsuario servicio = new ServicioUsuarioLocator();
		HTTP_ServicioUsuarioStub stub = new HTTP_ServicioUsuarioStub(new URL(wsUsuario), servicio);

		return stub.buscar_Usuario(usuario);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pe.gob.oefa.ws.seguridad.service.SisegSeguridadService#
	 * obtenerSitemapPorUsuario(java.lang.String, java.lang.Integer)
	 */
	@Override
	public pe.gob.oefa.ws.seguridad.bean.Pagina[] obtenerSitemapPorUsuario(String nombreUsuario, Integer idAplicacion)
			throws Exception {
		ServicioPerfil servicio = new ServicioPerfilLocator();
		HTTP_ServicioPerfilStub stub = new HTTP_ServicioPerfilStub(new URL(wsPefil), servicio);

		return stub.obtenerSitemapPorUsuario(nombreUsuario, idAplicacion);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pe.gob.oefa.ws.seguridad.service.SisegSeguridadService#
	 * obtenerPermisoPerfilPorGrupo(java.lang.Integer, java.lang.String)
	 */
	@Override
	public pe.gob.oefa.ws.seguridad.bean.PaginaAccion[] obtenerPermisoPerfilPorGrupo(Integer idUsuario, String idsGrupo)
			throws Exception {
		ServicioPerfil servicio = new ServicioPerfilLocator();
		HTTP_ServicioPerfilStub stub = new HTTP_ServicioPerfilStub(new URL(wsPefil), servicio);

		return stub.obtenerPermisoPerfilPorGrupo(idUsuario, idsGrupo);
	}

	@Override
	public Usuario[] listarUsuario() throws Exception {
		ServicioUsuario servicio = new ServicioUsuarioLocator();
		HTTP_ServicioUsuarioStub stub;
		stub = new HTTP_ServicioUsuarioStub(new URL(wsUsuario), servicio);
		return stub.listarUsuario();
	}

	@Override
	public UsuarioPaginacion searchUsuario(Usuario usuario, Integer idEmpresa, Integer idAplicacion, Integer idRol,
			Paginacion paginacion) throws Exception {
		ServicioUsuario servicio = new ServicioUsuarioLocator();
		HTTP_ServicioUsuarioStub stub;
		stub = new HTTP_ServicioUsuarioStub(new URL(wsUsuario), servicio);
		return stub.listarUsuarioPaginacion(usuario, idEmpresa, idAplicacion, idRol, paginacion);
	}

}