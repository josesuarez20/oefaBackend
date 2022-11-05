package pe.gob.oefa.sirte.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.oefa.core.authentication.session.UserSession;
import pe.gob.oefa.core.security.util.SecurityUtil;
import pe.gob.oefa.dto.security.DashboardResponse;
import pe.gob.oefa.dto.security.MenuResponse;
import pe.gob.oefa.sirte.dto.OpcionesPorUsuarioSSODTO;
import pe.gob.oefa.sirte.service.HomeService;
import pe.gob.oefa.sirte.service.SsoService;
import pe.gob.oefa.ws.seguridad.bean.Pagina;

@Service
public class HomeServiceImpl implements HomeService {


	@Autowired
	private SsoService wsrestSso;

	// @Value("${aplicacion.id}")
	// private String applicationId;

	@Override
	public DashboardResponse getDashboard() {
		DashboardResponse dashboardResponse = new DashboardResponse();

		try {
			System.out.println("Estamos en  el getDashboard 1");
			UserSession userSession = SecurityUtil.getUserSession();
			System.out.println("Estamos en  el getDashboard 2:::" + userSession.getNombres());
			dashboardResponse.setNombres(userSession.getNombres());

		
			dashboardResponse.setMenus(this.getListMenu(userSession.getUserId().toString()));

			System.out.println("Estamos en  el getDashboard 5");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dashboardResponse;
	}

	@Override
	public DashboardResponse getHeader() {
		DashboardResponse dashboardResponse = new DashboardResponse();
		try {
			UserSession userSession = SecurityUtil.getUserSession();
			System.out.println("----------userSession.getUserId()::" + userSession.getUserId());
			System.out.println("----------userSession..getDni()::" + userSession.getDni());

			dashboardResponse.setNombres(userSession.getNombres());
			dashboardResponse.setDni(userSession.getDni());
			dashboardResponse.setPerfil(userSession.getPerfil().getNombre());
			dashboardResponse.setTipodocumento(userSession.getTipodocumento().trim());
			dashboardResponse.setCorreoelectronico(userSession.getEmail());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dashboardResponse;
	}
	
	private List<MenuResponse> getListMenuSSO2(String idusuario, String tokenSession)
			throws Exception {
		List<MenuResponse> listMenu = new ArrayList<>();
		listMenu.clear();

		List<OpcionesPorUsuarioSSODTO> opcionesSSO = new ArrayList<>();
		opcionesSSO.clear();

		opcionesSSO = wsrestSso.ListarOpcionPorIdUsuarioIdAplicacionSSO2(idusuario, tokenSession);

		List<Pagina> auxPagina = new ArrayList<>();
		auxPagina.clear();

		for (OpcionesPorUsuarioSSODTO pagina : opcionesSSO) {

			Pagina paginaaux = new Pagina();

			String[] arrOfStr = pagina.getuNombreOpcion().split("¬", 2);

			for (String a : arrOfStr)
				System.out.println(a);

			String strpagina = arrOfStr[0];

			String stricono = arrOfStr[1];

			System.out.println(strpagina);
			System.out.println(stricono);

			paginaaux.setNombre(strpagina);
			paginaaux.setUrl(pagina.getuDireccionOpcion());
			paginaaux.setIcono(stricono);
			paginaaux.setIdPaginaPadre(pagina.geteIdGrupoOpcion().intValue());
			paginaaux.setVisible(pagina.getcEsVisible());
			paginaaux.setIdPagina(pagina.getPK_eIdOpcion().intValue());
			System.out.println("Orden es:::" + pagina.geteNroOrden().intValue());
			paginaaux.setOrden(pagina.geteNroOrden().intValue());
			auxPagina.add(paginaaux);

		}

		System.out.println("La cantidad de opciones totales paginas es::" + auxPagina.size());
		if (auxPagina.size() > 0) {
			for (Pagina pagina : auxPagina) {
				if (pagina.getIdPaginaPadre() == 0) {
					System.out.println("El id de la pagina padre es:::" + pagina.getIdPagina());

					MenuResponse menuResponse = new MenuResponse(pagina.getNombre(), "/" + pagina.getUrl(),
							pagina.getIcono());
					menuResponse.setPaginaPadre(pagina.getIdPaginaPadre());
					menuResponse.setVisible(pagina.getVisible());
					menuResponse.setIdMenu(pagina.getIdPagina());
					menuResponse.setOrden(pagina.getOrden());
					System.out.println("El ORDEN ORDEN" + menuResponse.getOrden());
					// menuResponse.setHijos(cargarHijos(pagina.getIdPagina(), paginaArray));
					menuResponse.setHijos(cargarHijosLista(pagina.getIdPagina(), auxPagina));

					listMenu.add(menuResponse);
				}

			}

			System.out.println("El tamaño 11  es:" + listMenu.size());

			MenuResponse auxMenu = null;
			for (int ii = 0; ii < listMenu.size(); ii++) {
				for (int kk = 0; kk < listMenu.size(); kk++) {
					if (listMenu.get(ii).getOrden() < listMenu.get(kk).getOrden()) {
						auxMenu = listMenu.get(ii);
						listMenu.set(ii, listMenu.get(kk));
						listMenu.set(kk, auxMenu);
					}
				}
			}

			for (int ii = 0; ii < listMenu.size(); ii++) {
				int contador = 0;
				for (int kk = 0; kk < listMenu.size(); kk++) {
					if (listMenu.get(ii).getOrden() == listMenu.get(kk).getOrden()) {
						contador++;
						if (contador > 1) {
							listMenu.remove(ii);
						}
					}
				}
			}
		}

		System.out.println("El tamaño 22  es:" + listMenu.size());
		for (int a = 0; a < listMenu.size(); a++) {
			System.out.println(a + ":::" + listMenu.get(a).getOrden() + ":::" + listMenu.get(a).getNombre() + ":::"
					+ listMenu.get(a).getPaginaPadre());

		}

		return listMenu;
	}

	private List<MenuResponse> getListMenu(String username) throws Exception {
		List<MenuResponse> listMenu = new ArrayList<>();
		listMenu.clear();

		List<OpcionesPorUsuarioSSODTO> opcionesSSO = new ArrayList<>();
		opcionesSSO.clear();

		opcionesSSO = wsrestSso.ListarOpcionPorIdUsuarioIdAplicacion(username);

		List<Pagina> auxPagina = new ArrayList<>();
		auxPagina.clear();

		for (OpcionesPorUsuarioSSODTO pagina : opcionesSSO) {

			Pagina paginaaux = new Pagina();

			String[] arrOfStr = pagina.getuNombreOpcion().split("¬", 2);

			for (String a : arrOfStr)
				System.out.println(a);

			String strpagina = arrOfStr[0];

			String stricono = arrOfStr[1];

			System.out.println(strpagina);
			System.out.println(stricono);

			paginaaux.setNombre(strpagina);
			paginaaux.setUrl(pagina.getuDireccionOpcion());
			paginaaux.setIcono(stricono);
			paginaaux.setIdPaginaPadre(pagina.geteIdGrupoOpcion().intValue());
			paginaaux.setVisible(pagina.getcEsVisible());
			paginaaux.setIdPagina(pagina.getPK_eIdOpcion().intValue());
			System.out.println("Orden es:::" + pagina.geteNroOrden().intValue());
			paginaaux.setOrden(pagina.geteNroOrden().intValue());
			auxPagina.add(paginaaux);

		}

		System.out.println("La cantidad de opciones totales paginas es::" + auxPagina.size());
		if (auxPagina.size() > 0) {
			for (Pagina pagina : auxPagina) {
				if (pagina.getIdPaginaPadre() == 0) {
					System.out.println("El id de la pagina padre es:::" + pagina.getIdPagina());

					MenuResponse menuResponse = new MenuResponse(pagina.getNombre(), "/" + pagina.getUrl(),
							pagina.getIcono());
					menuResponse.setPaginaPadre(pagina.getIdPaginaPadre());
					menuResponse.setVisible(pagina.getVisible());
					menuResponse.setIdMenu(pagina.getIdPagina());
					menuResponse.setOrden(pagina.getOrden());
					System.out.println("El ORDEN ORDEN" + menuResponse.getOrden());
					// menuResponse.setHijos(cargarHijos(pagina.getIdPagina(), paginaArray));
					menuResponse.setHijos(cargarHijosLista(pagina.getIdPagina(), auxPagina));

					listMenu.add(menuResponse);
				}

			}

			System.out.println("El tamaño 11  es:" + listMenu.size());

			MenuResponse auxMenu = null;
			for (int ii = 0; ii < listMenu.size(); ii++) {
				for (int kk = 0; kk < listMenu.size(); kk++) {
					if (listMenu.get(ii).getOrden() < listMenu.get(kk).getOrden()) {
						auxMenu = listMenu.get(ii);
						listMenu.set(ii, listMenu.get(kk));
						listMenu.set(kk, auxMenu);
					}
				}
			}

			for (int ii = 0; ii < listMenu.size(); ii++) {
				int contador = 0;
				for (int kk = 0; kk < listMenu.size(); kk++) {
					if (listMenu.get(ii).getOrden() == listMenu.get(kk).getOrden()) {
						contador++;
						if (contador > 1) {
							listMenu.remove(ii);
						}
					}
				}
			}
		}

		System.out.println("El tamaño 22  es:" + listMenu.size());
		for (int a = 0; a < listMenu.size(); a++) {
			System.out.println(a + ":::" + listMenu.get(a).getOrden() + ":::" + listMenu.get(a).getNombre() + ":::"
					+ listMenu.get(a).getPaginaPadre());

		}

		return listMenu;
	}

	private List<MenuResponse> cargarHijosLista(Integer codigoPadre, List<Pagina> Listapaginas) {
		List<MenuResponse> listMenu2 = new ArrayList<>();

		if (Listapaginas.size() > 0) {
			for (Pagina pagina : Listapaginas) {

				System.out.println("cargarHijosdel padre:::" + codigoPadre);
				System.out.println("pagina.getIdPaginaPadre():::" + pagina.getIdPaginaPadre());
				System.out.println("pagina.getIdPagina():::" + pagina.getIdPagina());

				if (pagina.getIdPaginaPadre().toString().equalsIgnoreCase(codigoPadre.toString())) {
					System.out.println("xxxxxxEl codigo padre es:" + codigoPadre);
					System.out.println("xxxxxxLa pagina hija recibida con id pagina es:" + pagina.getIdPagina());

					MenuResponse menuResponse = new MenuResponse(pagina.getNombre(), "/" + pagina.getUrl(),
							pagina.getIcono());
					menuResponse.setPaginaPadre(pagina.getIdPaginaPadre());
					menuResponse.setVisible(pagina.getVisible());
					menuResponse.setIdMenu(pagina.getIdPagina());
					menuResponse.setOrden(pagina.getOrden());
					menuResponse.setNombre(pagina.getNombre());
					menuResponse.setIcono(pagina.getIcono());
					/*
					 * private Integer idMenu; private Integer paginaPadre; private String nombre;
					 * private String url; private String icono; private Integer Orden; private
					 * String mensaje; private Boolean visible;
					 */

					listMenu2.add(menuResponse);

				}
			}

		}

		for (MenuResponse menuResponse : listMenu2) {

			System.out.println("El orden es:" + menuResponse.getOrden() + " con el nombre" + menuResponse.getNombre());
		}

		MenuResponse auxMenu = null;

		for (int ii = 0; ii < listMenu2.size(); ii++) {
			for (int kk = 0; kk < listMenu2.size(); kk++) {
				if (listMenu2.get(ii).getOrden() < listMenu2.get(kk).getOrden()) {
					auxMenu = listMenu2.get(ii);
					listMenu2.set(ii, listMenu2.get(kk));
					listMenu2.set(kk, auxMenu);
				}
			}
		}

		return listMenu2;
	}

	private List<MenuResponse> cargarHijos(Integer codigoPadre, Pagina[] paginaArray) {
		List<MenuResponse> listMenu = new ArrayList<>();

		listMenu.clear();

		System.out.println("cargarHijos::paginaArray.length::" + paginaArray.length);

		for (int i = 0; i < paginaArray.length; i++) {
			for (int k = 0; k < paginaArray.length; k++) {
				if (paginaArray[k].getOrden() > paginaArray[i].getOrden()) {
					System.out.println("paginaArray[i].getOrden()::[" + i + "]" + paginaArray[i].getIdPagina());
					Pagina auxiliar = paginaArray[k];
					paginaArray[k] = paginaArray[i];
					paginaArray[i] = auxiliar;
				}

			}
		}

		for (int j = 0; j < paginaArray.length; j++) {
			System.out
					.println("El id es::::" + paginaArray[j].getIdPagina() + "nombre::::" + paginaArray[j].getNombre());
		}

		for (Pagina pagina : paginaArray) {
			if (codigoPadre.equals(pagina.getIdPaginaPadre())) {
				MenuResponse menuResponse = new MenuResponse(pagina.getNombre(), "/" + pagina.getUrl(),
						pagina.getIcono());
				menuResponse.setPaginaPadre(pagina.getIdPaginaPadre());
				menuResponse.setVisible(pagina.getVisible());
				menuResponse.setIdMenu(pagina.getIdPagina());
				listMenu.add(menuResponse);
			}
		}
		/*
		 * System.out.println("....-...-.."); MenuResponse menuResponseAux=null;
		 * 
		 * for(int aa=0;aa<listMenu.size();aa++) { for(int bb=0;bb<listMenu.size();bb++)
		 * { if(listMenu.get(aa).getIdMenu() < listMenu.get(bb).getIdMenu()) {
		 * menuResponseAux=listMenu.get(aa); listMenu.set(aa,listMenu.get(bb));
		 * listMenu.set(bb,menuResponseAux);
		 * 
		 * } } }
		 * 
		 * 
		 * for (MenuResponse menuResponse : listMenu) {
		 * System.out.println(">>>>>>>>>>>>"+menuResponse.getIdMenu()+"-->"+menuResponse
		 * .getNombre()); }
		 */

		return listMenu;
	}

	@Override
	public DashboardResponse getDashboardSSO2(String idusuario, String token) {
		DashboardResponse dashboardResponse = new DashboardResponse();

		try {

			dashboardResponse.setMenus(this.getListMenuSSO2(idusuario, token));

			System.out.println("Estamos en  el getDashboard 5");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dashboardResponse;
	}

	
}
