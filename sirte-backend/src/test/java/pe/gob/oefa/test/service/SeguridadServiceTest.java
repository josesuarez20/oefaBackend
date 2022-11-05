package pe.gob.oefa.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.gob.oefa.core.authentication.session.UserSession;
import pe.gob.oefa.srsalas.dto.seguridad.MenuDTO;
import pe.gob.oefa.srsalas.dto.seguridad.OpcionDTO;
import pe.gob.oefa.srsalas.dto.seguridad.PerfilDTO;
import pe.gob.oefa.test.TestSeguridadConfig;
import pe.gob.oefa.util.GenericUtil;
import pe.gob.oefa.ws.seguridad.bean.Pagina;
import pe.gob.oefa.ws.seguridad.bean.Paginacion;
import pe.gob.oefa.ws.seguridad.bean.Rol;
import pe.gob.oefa.ws.seguridad.bean.Usuario;
import pe.gob.oefa.ws.seguridad.bean.UsuarioPaginacion;
import pe.gob.oefa.ws.seguridad.service.SisegSeguridadService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestSeguridadConfig.class)
public class SeguridadServiceTest {

	private static final Integer ID_APLICACION = 43;
	@Autowired
	private SisegSeguridadService seguridadService;

	@Test
//	@Ignore
	public void accesoAlSistema() {

		Usuario u = new Usuario();
		u.setUserName("OTEJADAQ");
		u.setContrasena("oefa2018");
		u.setIdAplicacion(ID_APLICACION);
		Usuario uv;
		try {
			uv = seguridadService.autenticarUsuario(u);
			System.out.println("Correo: " + uv.getCorreo());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	@Test
	public void login() {
		UserSession usuarioResponse=new UserSession();
		Usuario request= new Usuario();
		request.setUserName("OTEJADAQ");
		request.setContrasena("oefa2018");
		request.setIdAplicacion(ID_APLICACION);
		
		try {
			Usuario usuario = seguridadService.autenticarUsuario(request);
			if(GenericUtil.isNotNull(usuario) && GenericUtil.isNotNull(usuario.getIdUsuario()) && usuario.getIdUsuario()>0  ) {
				usuarioResponse.setUserId(usuario.getIdUsuario());
				usuarioResponse.setUsername(usuario.getUserName());
				usuarioResponse.setNombres(usuario.getNombreApellido());
				usuarioResponse.setEmail(usuario.getEmailCoorporativo());
				List<MenuDTO> listaMenu = new ArrayList<MenuDTO>();
				Pagina paginas[] = seguridadService.obtenerSitemapPorUsuario(usuarioResponse.getUsername(),ID_APLICACION);
				for (Pagina pagina : paginas) {
					System.out.println(pagina.getUrl() + "::" + pagina.getNombre());

					if (pagina.getIdPaginaPadre() == 0 && pagina.getVisible() == true) {
						MenuDTO menu = new MenuDTO();
						menu.setMenu(pagina);
						listaMenu.add(menu);
					}
				}
				
				for (int i = 0; i < listaMenu.size(); i++) {
					MenuDTO menu = listaMenu.get(i);
					for (Pagina pag : paginas) {
						System.out.println("MENU::" + menu.getMenu().getNombre());
						System.out.println(pag.getUrl() + "::" + pag.getNombre());
						int paginaPadre = pag.getIdPaginaPadre();
						int paginaMenu = menu.getMenu().getIdPagina();
						System.out.println(paginaPadre + "::" + paginaMenu);
						if (paginaPadre == paginaMenu) {
							OpcionDTO opcion = new OpcionDTO();
							opcion.setOpcion(pag);
							listaMenu.get(i).getOpciones().add(opcion);
						}
					}
				}
				
				System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::...");
				for (MenuDTO m : listaMenu) {
					System.out.println("MENU::" + m.getMenu().getNombre());
					List<OpcionDTO> opcions = m.getOpciones();
					for (OpcionDTO o : opcions) {
						System.out.println("OPCIONES:X MENU:::\t :" + o.getOpcion().getNombre() + "::" 	+ o.getOpcion().getUrl());
					}
				}
				
				
			}
			System.out.println(usuario.getCorreo());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	@Ignore
	public void listar() {

		try {
			Usuario[] usuarios = seguridadService.listarUsuario();
			System.out.println(usuarios);
			List<Usuario> list=	Arrays.asList(usuarios);
			for (Usuario usuario : list) {
				System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
				System.out.println(usuario.getIdUsuario()+"|"+usuario.getUserName()+"|"+usuario.getEmailCoorporativo()+"|"+usuario.getNombreApellido());
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	@Ignore
	public void buscarUsuario() {

		try {
			Usuario usuario=new Usuario();
//			usuario.setIdUsuario(2063);
//			usuario.setUserName("OTEJADAQ");
			usuario.setNombreApellido("MARCOS MARVIN ZAMORA CARBAJAL");
			Usuario usuarioRespuesta = seguridadService.buscar_Usuario(usuario);
			System.out.println(usuarioRespuesta);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	@Test
	@Ignore
	public void buscarUsuarioRemoto() {
		Usuario usuario = new Usuario();
//		usuario.setUserName("OTEJADA");
		usuario.setNombreApellido("MARCOS");
		Paginacion paginacion = new Paginacion();
		paginacion.setPage(2);
		paginacion.setRowsPerPage(20);
		paginacion.setSortDir("ASC");
		try {
			UsuarioPaginacion usuarioPaginacion = seguridadService.searchUsuario(usuario, null, null, null, paginacion);
			System.out.println(usuarioPaginacion.getListaUsuario());
			Usuario[] usuarios = usuarioPaginacion.getListaUsuario();
			for (Usuario x : usuarios) {
				System.out.println(x.getIdUsuario() + "::" + x.getUserName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
