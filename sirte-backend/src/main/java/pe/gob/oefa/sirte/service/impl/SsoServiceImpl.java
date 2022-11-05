package pe.gob.oefa.sirte.service.impl;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import pe.gob.oefa.apps.base.util.rest.UtilREST;
import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
//import pe.gob.oefa.core.service.ServiceBaseIntranet;
import pe.gob.oefa.core.service.ServiceBaseSSO;
import pe.gob.oefa.sirte.dto.CorreoEnvioDTO;
import pe.gob.oefa.sirte.dto.CredencialesUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.InsertarUsuarioDTO;
import pe.gob.oefa.sirte.dto.InsertarUsuarioResponseDTO;
import pe.gob.oefa.sirte.dto.ObtenerUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.OpcionesPorUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.PerfilPorUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.PersonaJuridicaSSODTO;
import pe.gob.oefa.sirte.dto.PersonaNaturalSSODTO;
import pe.gob.oefa.sirte.dto.SSOUsuarioxPerfilDTO;
import pe.gob.oefa.sirte.service.EnvioCorreoService;
import pe.gob.oefa.sirte.service.SsoService;
import pe.gob.oefa.srsalas.dto.seguridad.OpcionDTO;

@Service("ssoService")
@Transactional
public class SsoServiceImpl extends ServiceBaseSSO implements SsoService {

	private CoreLogger logger = LoggerFactory.getLogger(SsoServiceImpl.class);
	@Autowired
	private EnvioCorreoService envioCorreoService;

	@Value("${servicioExterno.sso.obtenerUsuario}")
	private String urlSSOObtenerUsuarioTipoDocumentoDocumento;

	@Value("${servicioExterno.sso.aseguraUsuario}")
	private String urlSSOAseguraUsuario;

	@Value("${perfil.aplicacion.sso.sirte.responsable}")
	private String idPerfilSSO;

	@Value("${servicioExterno.sso.findPersonaXDni}")
	private String urlSSOFindPersonaXDni;

	@Value("${servicioExterno.sso.findPersonaXCE}")
	private String urlSSOFindPersonaXCE;

	@Value("${servicioExterno.sso.findJuridicaXRuc}")
	private String urlSSOFindPersonaXRuc;

	@Value("${servicioExterno.sso.findPerfilPorUsuarioSSOByIdusuario}")
	private String findPerfilPorUsuarioSSOByIdusuario;

	@Value("${servicioExterno.sso.ListarOpcionPorIdUsuarioIdAplicacion}")
	private String ListarOpcionPorIdUsuarioIdAplicacion;

	@Value("${servicioExterno.sso.urlInsertaUsuarioSSO}")
	private String urlInsertaUsuarioSSO;

	@Value("${servicioExterno.sso.ListarPersonaPorIdAplicacion}")
	private String ListarPersonasPorIdAplicacion;

	@Value("${servicioExterno.sso.ListarPersonaPorIdPerfil}")
	private String ListarPersonaPorIdPerfil;

	@Value("${servicioExterno.sso.urlConsultarPersonaSSO}")
	private String urlConsultarPersonaSSO;

	@Value("${servicioExterno.sso.urlAsignarPerfilUsuarioREST}")
	private String urlAsignarPerfilUsuarioREST;

	@Value("${servicioExterno.sso.urlCambiarClaveUsuarioREST}")
	private String urlCambiarClaveUsuarioREST;

	@Value("${servicioExterno.sso.usuario}")
	private String SSOUsuario;

	@Value("${servicioExterno.sso.contrasenia}")
	private String SSOPassword;

	@Value("${servicioExterno.sso.dni.autorizado}")
	private String SSODniAutorizado;

	@Value("${servicioExterno.sso.id.aplicacion}")
	private String SSOIdAplicacion;

	@Value("${perfil.aplicacion.sso.sirte.administrador}")
	private String SSOIdPerfilAdmin;

	@Value("${perfil.aplicacion.sso.sirte.responsable}")
	private String SSOIdPerfilResponsable;

	@Value("${perfil.aplicacion.sso.sirte.adicional}")
	private String SSOIdPerfilAdicional;

	@Value("${perfil.aplicacion.sso.sirte.siga}")
	private String SSOIdPerfilSiga;

	@Value("${servicioExterno.sso.id.tipo.documento}")
	private String SSOTipoDocumento;

	@Value("${servicioExterno.sso.id.sesion}")
	private String SSOIdSession;

	@Value("${perfil.aplicacion.sso.sirte.responsable}")
	private int perfilResponsableAplicacion;

	@Override
	public ObtenerUsuarioSSODTO findSSOByTipoDocumentoDocumento(String tipodocumento, String documento) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::findSSOByTipoDocumentoDocumento::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			ObtenerUsuarioSSODTO obtenerusuarioBean = new ObtenerUsuarioSSODTO();
			String auth = SSOUsuario + ":" + SSOPassword;
			byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
			String authHeader = new String(encodedAuth);
			logger.info("authHeader:" + authHeader);
			String url = urlSSOObtenerUsuarioTipoDocumentoDocumento + "nroDNIConsulta=" + documento + "&IdPerfil="
					+ idPerfilSSO + "&IdTipoDocumento=" + tipodocumento;

			logger.info("URL:" + url);
			content = UtilREST.getREST(url, authHeader);
			Gson gson = new Gson();
			System.out.println("content " + content);
			obtenerusuarioBean = gson.fromJson(content, ObtenerUsuarioSSODTO.class);

			return obtenerusuarioBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	@Override
	public PersonaNaturalSSODTO findSSOByDni(String dni) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::findSSOByDni::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			PersonaNaturalSSODTO personaBean = new PersonaNaturalSSODTO();
			String auth = SSOUsuario + ":" + SSOPassword;
			byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
			String authHeader = /* "Basic " + */ new String(encodedAuth);
			logger.info("authHeader:" + authHeader);
			String url = urlSSOFindPersonaXDni + "nroDNIAutorizado=" + SSODniAutorizado + "&nroDNIConsulta=" + dni
					+ "&IdAplicacion=" + SSOIdAplicacion + "&IdTipoDocumento=" + SSOTipoDocumento + "&IdSesion="
					+ SSOIdSession;
			logger.info("URL:" + url);
			content = UtilREST.getREST(url, authHeader);
			Gson gson = new Gson();
			System.out.println("content " + content);
			personaBean = gson.fromJson(content, PersonaNaturalSSODTO.class);

			return personaBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	@Override
	public PersonaNaturalSSODTO findSSOByCE(String ce) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::findSSOByDni::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			PersonaNaturalSSODTO personaBean = new PersonaNaturalSSODTO();
			String auth = SSOUsuario + ":" + SSOPassword;
			byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
			String authHeader = /* "Basic " + */ new String(encodedAuth);
			logger.info("authHeader:" + authHeader);
			String url = urlSSOFindPersonaXCE + "nroDocConsulta=" + ce + "&IdAplicacion=" + SSOIdAplicacion
					+ "&IdTipoDocumento=3";
			logger.info("URL:" + url);
			content = UtilREST.getREST(url, authHeader);
			Gson gson = new Gson();
			System.out.println("content " + content);
			personaBean = gson.fromJson(content, PersonaNaturalSSODTO.class);

			return personaBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	@Override
	public PersonaJuridicaSSODTO findSSOByRuc(String ruc) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::findSSOByRuc::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			PersonaJuridicaSSODTO personajuridicaBean = new PersonaJuridicaSSODTO();

			String auth = SSOUsuario + ":" + SSOPassword;
			byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
			String authHeader = new String(encodedAuth);
			logger.info("authHeader:" + authHeader);

			String url = urlSSOFindPersonaXRuc + "&Ruc=" + ruc + "&nroDNIAutorizado=" + SSODniAutorizado
					+ "&incluirRepLegal=true" + "&IdAplicacion=" + SSOIdAplicacion + "&IdTipoDocumento="
					+ SSOTipoDocumento + "&IdSesion=" + SSOIdSession;

			logger.info("URL:" + url);
			content = UtilREST.getREST(url, authHeader);
			Gson gson = new Gson();
			System.out.println("content " + content);
			personajuridicaBean = gson.fromJson(content, PersonaJuridicaSSODTO.class);

			return personajuridicaBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	@Override
	public List<PerfilPorUsuarioSSODTO> findPerfilPorUsuarioSSOByIdusuario(String idusuario) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::findSSOByDni::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;

			List<PerfilPorUsuarioSSODTO> listPerfiles = new ArrayList<PerfilPorUsuarioSSODTO>();

			PerfilPorUsuarioSSODTO personaBean = new PerfilPorUsuarioSSODTO();
			String auth = SSOUsuario + ":" + SSOPassword;
			byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
			String authHeader = /* "Basic " + */ new String(encodedAuth);
			logger.info("authHeader:" + authHeader);
			String url = findPerfilPorUsuarioSSOByIdusuario + "IdUsuario=" + idusuario + "&IdAplicacion="
					+ SSOIdAplicacion;
			logger.info("URL:" + url);
			content = UtilREST.getREST(url, authHeader);
			Gson gson = new Gson();
			System.out.println("content " + content);
			PerfilPorUsuarioSSODTO[] arregloPerfilesUsuario = gson.fromJson(content, PerfilPorUsuarioSSODTO[].class);

			for (int i = 0; i < arregloPerfilesUsuario.length; i++) {
				listPerfiles.add(arregloPerfilesUsuario[i]);

			}

			// personaBean=arregloPerfilesUsuario[0];

			return listPerfiles;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	@Override

	public List<OpcionesPorUsuarioSSODTO> ListarOpcionPorIdUsuarioIdAplicacion(String idusuario) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::ListarOpcionPorIdUsuarioIdAplicacion::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			// PerfilPorUsuarioSSODTO personaBean= new PerfilPorUsuarioSSODTO();
			List<OpcionesPorUsuarioSSODTO> listOpcionPorIdUsuarioIdAplicacionBean = new ArrayList<OpcionesPorUsuarioSSODTO>();

			String auth = SSOUsuario + ":" + SSOPassword;
			byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
			String authHeader = /* "Basic " + */ new String(encodedAuth);
			logger.info("authHeader:" + authHeader);
			String url = ListarOpcionPorIdUsuarioIdAplicacion + "IdUsuario=" + idusuario + "&IdAplicacion="
					+ SSOIdAplicacion;
			logger.info("URL:" + url);
			content = UtilREST.getREST(url, authHeader);
			Gson gson = new Gson();
			System.out.println("content " + content);
			OpcionesPorUsuarioSSODTO[] arregloOpcionesUsuario = gson.fromJson(content,
					OpcionesPorUsuarioSSODTO[].class);

			for (int i = 0; i < arregloOpcionesUsuario.length; i++) {
				listOpcionPorIdUsuarioIdAplicacionBean.add(arregloOpcionesUsuario[i]);
			}

			return listOpcionPorIdUsuarioIdAplicacionBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	public List<InsertarUsuarioResponseDTO> ListarUsuariosPorAplicacion() {
		// logger.info(":::::::::::::::::::::::::::::::::::::::::::::ListarOpcionPorIdUsuarioIdAplicacion::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			// PerfilPorUsuarioSSODTO personaBean= new PerfilPorUsuarioSSODTO();
			List<InsertarUsuarioResponseDTO> listOpcionPorIdUsuarioIdAplicacionBean = new ArrayList<InsertarUsuarioResponseDTO>();

			String auth = SSOUsuario + ":" + SSOPassword;
			byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
			String authHeader = /* "Basic " + */ new String(encodedAuth);
			// logger.info("authHeader:"+authHeader);
			String url = ListarPersonasPorIdAplicacion + "IdAplicacion=" + SSOIdAplicacion;
			// logger.info("URL:" + url);
			content = UtilREST.getREST(url, authHeader);
			Gson gson = new Gson();
			// System.out.println("content "+content);
			InsertarUsuarioResponseDTO[] arregloOpcionesUsuario = gson.fromJson(content,
					InsertarUsuarioResponseDTO[].class);

			for (int i = 0; i < arregloOpcionesUsuario.length; i++) {
				listOpcionPorIdUsuarioIdAplicacionBean.add(arregloOpcionesUsuario[i]);
			}

			return listOpcionPorIdUsuarioIdAplicacionBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	//

	public List<OpcionDTO> ListarOpcionHomePorIdUsuarioIdAplicacion(String idusuario) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::ListarOpcionHomePorIdUsuarioIdAplicacion::::::::::::::::::::::::::::::::::::::::::::");
		try {

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;

	}

	@Override
	public InsertarUsuarioResponseDTO findUsuarioSIRTE(InsertarUsuarioDTO insertausuarioDTO) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::findUsuarioSIRTE::::::::::::::::::::::::::::::::::::::::::::");
		InsertarUsuarioResponseDTO usuarioBean = new InsertarUsuarioResponseDTO();

		try {
			String content;

			List<InsertarUsuarioResponseDTO> listPersonasAplicacion = new ArrayList<InsertarUsuarioResponseDTO>();

			InsertarUsuarioResponseDTO auxPersonaAsignadoPerfil = null;

			if (insertausuarioDTO.getIdusuario() != null) {

				String authString = SSOUsuario + ":" + SSOPassword;

				String rest = "{\"IdUsuario\": " + insertausuarioDTO.getIdusuario() + "," + "\"CodUsuario\": \""
						+ insertausuarioDTO.getCodusuario() + "\"," + "\"NombreUsuario\": \""
						+ insertausuarioDTO.getNombreusuario() + "\"," + "\"CorreoElectronico\": \""
						+ insertausuarioDTO.getCorreoelectronico() + "\"," + "\"Clave\": \""
						+ insertausuarioDTO.getClave() + "\"," + "\"IdSesion\": " + insertausuarioDTO.getIdsesion()
						+ "," + "\"Observacion\": \"" + "OK" + "\"," + "}";

				content = UtilREST.postREST(urlInsertaUsuarioSSO, rest, authString);

				Gson gson = new Gson();

				usuarioBean = gson.fromJson(content, InsertarUsuarioResponseDTO.class);

				if (usuarioBean.getObservacion().toUpperCase().equalsIgnoreCase(
						"El usuario ya se encuentra registrado. La cuenta esta en situacion ACTIVO".toUpperCase())) {
					System.out.println("Estamos con la observacion de existencia...");

					int intaux = 0;

					listPersonasAplicacion = ListarUsuariosPorAplicacion();

					System.out.println("Tamaño es:" + listPersonasAplicacion.size());

					if (listPersonasAplicacion.size() > 0) {

						for (InsertarUsuarioResponseDTO insertarUsuarioResponseDTO : listPersonasAplicacion) {

							if (insertarUsuarioResponseDTO.getCodUsuario()
									.equalsIgnoreCase(insertausuarioDTO.getCodusuario())) {
								intaux++;

								usuarioBean.setCorreoElectronico(insertarUsuarioResponseDTO.getCorreoElectronico());

							}

						}

						if (intaux > 0) {
							usuarioBean.setObservacion("-2");
						}
					}
				} else {
					System.out.println("222.." + usuarioBean.getObservacion().toUpperCase());

					if (usuarioBean.getObservacion().toUpperCase().equalsIgnoreCase("El Correo  "
							+ usuarioBean.getCorreoElectronico() + " ya estÃ¡ siendo utilizado\n\r".toUpperCase())) {
						System.out.println("Estamos con la observacion de existencia...");
						usuarioBean.setObservacion("-3");
					} else {
						usuarioBean.setObservacion("-5");
					}

				}

				/*
				 * if(usuarioBean != null ) { if(usuarioBean.getIdUsuario().intValue() == 0 ) {
				 * usuarioBean.setObservacion(usuarioBean.getObservacion()+
				 * "y no se le puede asignar el perfil."); return usuarioBean;
				 * 
				 * 
				 * } else {
				 * 
				 * if (this.asignarPerfil(insertausuarioDTO.getIdusuario().intValue(),
				 * perfilTercerAplicacion)) {
				 * 
				 * listPersonasAplicacion = ListarUsuariosPorAplicacion();
				 * 
				 * System.out.println("Tamaño es:" + listPersonasAplicacion.size());
				 * 
				 * if (listPersonasAplicacion.size() > 0) {
				 * 
				 * for (InsertarUsuarioResponseDTO insertarUsuarioResponseDTO :
				 * listPersonasAplicacion) {
				 * 
				 * if (insertarUsuarioResponseDTO.getIdUsuario().toString().equalsIgnoreCase(
				 * insertausuarioDTO.getIdusuario().toString())) { System.out.println("val1::" +
				 * insertarUsuarioResponseDTO.getIdUsuario()); System.out.println("val2::" +
				 * insertausuarioDTO.getIdusuario());
				 * 
				 * auxPersonaAsignadoPerfil = insertarUsuarioResponseDTO;
				 * 
				 * System.out.println( ":::::El correo es:::" +
				 * auxPersonaAsignadoPerfil.getCorreoElectronico()); System.out
				 * .println(":::::El correo es:::" +
				 * auxPersonaAsignadoPerfil.getNombreUsuario());
				 * 
				 * }
				 * 
				 * } }
				 * 
				 * 
				 * 
				 * 
				 * 
				 * if (auxPersonaAsignadoPerfil.getCorreoElectronico()
				 * .equalsIgnoreCase(insertausuarioDTO.getCorreoelectronico())) { CorreoEnvioDTO
				 * auxCorreo = envioCorreoService.sendCorreoCreacionUsuario(insertausuarioDTO);
				 * } else {
				 * 
				 * usuarioBean.setObservacion(
				 * "Usted ya cuenta con un usuario registrado en el Sirte, debido a ello, no será; posible continuar. El correo asociado a su cuenta es:"
				 * + auxPersonaAsignadoPerfil.getCorreoElectronico().toUpperCase()); }
				 * 
				 * return usuarioBean; }
				 * 
				 * } } else { usuarioBean.setObservacion("Usuario no pudo ser asignado");
				 * 
				 * return usuarioBean; }
				 * 
				 */

			}

			System.out.println("Estamos con la observacion de existencia......:::" + usuarioBean.getObservacion());

		} catch (Exception e) {
			launchException(logger, e);
		}
		return usuarioBean;
	}

	@Override
	public InsertarUsuarioResponseDTO validarUsuario(CredencialesUsuarioSSODTO credencialusuarioDTO) {

		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::saveOrUpdate::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			logger.info("Paso 1");
			InsertarUsuarioResponseDTO personaBean = new InsertarUsuarioResponseDTO();

			logger.info("credencialusuarioDTO.getUsuario()..." + credencialusuarioDTO.getUsuario());
			logger.info("credencialusuarioDTO.getClave()..." + credencialusuarioDTO.getClave());

			String authString = SSOUsuario + ":" + SSOPassword;

			logger.info("Paso 2");
			logger.info("authHeader:" + authString);

			/*
			 * String rest = "{\"Usuario\": " + credencialusuarioDTO.getUsuario() + "," +
			 * "\"Clave\": " + credencialusuarioDTO.getClave() + "" + "}";
			 */

			logger.info("Paso 3");

			/* logger.info("URL:" + rest); */
			logger.info("Paso 4");

			logger.info("urlConsultarPersonaSSO 1::" + urlConsultarPersonaSSO);

			// this.urlConsultarPersonaSSO=urlConsultarPersonaSSO;

			String params = "Usuario=" + credencialusuarioDTO.getUsuario().trim() + "&Clave="
					+ credencialusuarioDTO.getClave().trim();

			// logger.info("rest 2::" + rest);

			logger.info("authString 3::" + authString);

			byte[] encodedAuth = Base64.getEncoder().encode(authString.getBytes(StandardCharsets.UTF_8));

			authString = new String(encodedAuth);

			logger.info("urlConsultarPersonaSSO::" + urlConsultarPersonaSSO);
			logger.info("params::" + params);
			logger.info("authString::" + authString);

			content = UtilREST.postRESTWithParams(urlConsultarPersonaSSO, params, authString);
			// content = UtilREST.postREST(urlConsultarPersonaSSO, rest, authString);

			logger.info("Paso 6372");
			Gson gson = new Gson();
			System.out.println("content " + content);
			personaBean = gson.fromJson(content, InsertarUsuarioResponseDTO.class);
			logger.info("Paso 7");

			return personaBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;

	}

	@Override

	public InsertarUsuarioResponseDTO cambiarClave(InsertarUsuarioDTO credencialusuarioDTO) {

		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::saveOrUpdate::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String ret;
			logger.info("Paso 1");
			InsertarUsuarioResponseDTO personaBean = new InsertarUsuarioResponseDTO();

			logger.info("credencialusuarioDTO.getUsuario()..." + credencialusuarioDTO.getIdusuario());
			logger.info("credencialusuarioDTO.getClave()..." + credencialusuarioDTO.getClave());

			String authString = SSOUsuario + ":" + SSOPassword;

			logger.info("Paso 2");
			logger.info("authHeader:" + authString);

			/*
			 * String rest = "{\"Usuario\": " + credencialusuarioDTO.getUsuario() + "," +
			 * "\"Clave\": " + credencialusuarioDTO.getClave() + "" + "}";
			 */

			logger.info("Paso 3");

			/* logger.info("URL:" + rest); */
			logger.info("Paso 4");

			logger.info("urlCambiarClaveUsuarioREST 1::" + urlCambiarClaveUsuarioREST);

			// this.urlConsultarPersonaSSO=urlConsultarPersonaSSO;
			/*
			 * String params = "Usuario=" + credencialusuarioDTO.getUsuario().trim() +
			 * "&Clave=" + credencialusuarioDTO.getClave().trim();
			 */

			String params = "IdUsuario=" + credencialusuarioDTO.getIdusuario() + "&ClaveActual="
					+ credencialusuarioDTO.getClave().trim() + "&ClaveNueva="
					+ credencialusuarioDTO.getNuevaclave().trim() + "&IdSesion=0";

			/*
			 * String params="IdUsuario="+IdUsuario+"&ClaveActual="+ClaveActual+
			 * "&ClaveNueva="+ClaveNueva+"&IdSesion=0";
			 */

			// logger.info("rest 2::" + rest);

			logger.info("authString 3::" + authString);

			byte[] encodedAuth = Base64.getEncoder().encode(authString.getBytes(StandardCharsets.UTF_8));

			authString = new String(encodedAuth);

			logger.info("urlConsultarPersonaSSO::" + urlConsultarPersonaSSO);
			logger.info("params::" + params);
			logger.info("authString::" + authString);

			ret = UtilREST.postRESTWithParams(urlCambiarClaveUsuarioREST, params, authString);
			// content = UtilREST.postREST(urlConsultarPersonaSSO, rest, authString);

			logger.info("Paso 6372");
			Gson gson = new Gson();
			System.out.println("content " + ret);
			personaBean = gson.fromJson(ret, InsertarUsuarioResponseDTO.class);
			logger.info("Paso 7");

			return personaBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;

	}

	public boolean asignarPerfil(int IdUsuario, int IdPerfil) {
		try {
			logger.info("Input: asignarPerfil");
			String URL;
			URL = urlAsignarPerfilUsuarioREST;
			URL += "IdUsuario=" + IdUsuario + "&IdPerfil=" + IdPerfil + "&IdSesion=0";

			// String authString= UtilProperties.getKey(SSOUsuario) + ":" +
			// UtilProperties.getKey(SSOPassword);
			// String authString = SSOUsuario + ":" + SSOPassword;

			String auth = SSOUsuario + ":" + SSOPassword;
			byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
			String authHeader = /* "Basic " + */ new String(encodedAuth);

			String ret = UtilREST.getREST(URL, authHeader);

			logger.info("Output: asignarPerfil");

			if (ret != null) {
				return ret.equals("1") ? true : false;
			}
		} catch (Exception e) {
			logger.error("this.logBase" + " : asignarPerfil" + e.getMessage());
			return false;
		}
		return false;
	}

	/*
	 * @Value("${servicioExterno.intranet.allEmpleado}") private String
	 * urlFindAllEmpleados;
	 * 
	 * 
	 * @Value("${servicioExterno.intranet.findPersonaXNombre}") private String
	 * urlFindPersonaXNombre;
	 */

	/*
	 * @Override public List<UbicacionDTO> loadUbicacion() { try { HttpHeaders
	 * headers = new HttpHeaders(); headers.set("Accept", "application/json");
	 * HttpEntity<Object> entidadPedido = new HttpEntity<Object>(headers);
	 * ResponseEntity<UbicacionDTO[]> entidadRespuesta =
	 * restTemplate.exchange(urlUbicacion, HttpMethod.GET, entidadPedido,
	 * UbicacionDTO[].class); UbicacionDTO[]
	 * ubicacionDTOs=entidadRespuesta.getBody(); return
	 * Arrays.asList(ubicacionDTOs);
	 * 
	 * } catch (Exception e) { launchException(logger, e); } return null; }
	 */
	/*
	 * @Override public List<AreaDTO> loadArea(String codigo) { try { HttpHeaders
	 * headers = new HttpHeaders(); headers.set("Accept", "application/json");
	 * HttpEntity<Object> entidadPedido = new HttpEntity<Object>(headers); String
	 * url=urlArea+codigo; ResponseEntity<AreaDTO[]> entidadRespuesta =
	 * restTemplate.exchange(url, HttpMethod.GET, entidadPedido, AreaDTO[].class);
	 * AreaDTO[] ubicacionDTOs=entidadRespuesta.getBody(); return
	 * Arrays.asList(ubicacionDTOs); } catch (Exception e) { launchException(logger,
	 * e); } return null; }
	 */
	/*
	 * @Override public List<PersonaDTO> findByCorreo(String correo) { try {
	 * HttpHeaders headers = new HttpHeaders(); headers.set("Accept",
	 * "application/json"); HttpEntity<Object> entidadPedido = new
	 * HttpEntity<Object>(headers); String url=urlLoadInformacionCorreo+correo;
	 * ResponseEntity<PersonaDTO[]> entidadRespuesta = restTemplate.exchange(url,
	 * HttpMethod.GET, entidadPedido, PersonaDTO[].class); PersonaDTO[]
	 * ubicacionDTOs=entidadRespuesta.getBody(); return
	 * Arrays.asList(ubicacionDTOs);
	 * 
	 * } catch (Exception e) { launchException(logger, e); } return null; }
	 */
	/*
	 * @Override public List<PersonaDTO> findByArea(String nombreArea) {
	 * logger.info(
	 * ":::::::::::::::::::::::::::::::::::::::::::::findByArea::::::::::::::::::::::::::::::::::::::::::::"
	 * ); try { HttpHeaders headers = new HttpHeaders(); headers.set("Accept",
	 * "application/json"); HttpEntity<Object> entidadPedido = new
	 * HttpEntity<Object>(headers); String url=urlLoadPersonaXArea+nombreArea;
	 * ResponseEntity<PersonaDTO[]> entidadRespuesta = restTemplate.exchange(url,
	 * HttpMethod.GET, entidadPedido, PersonaDTO[].class); PersonaDTO[]
	 * ubicacionDTOs=entidadRespuesta.getBody(); return
	 * Arrays.asList(ubicacionDTOs); } catch (Exception e) { launchException(logger,
	 * e); } return null; }
	 */
	/*
	 * @Override public List<PersonaDTO> findByUbicacion(String nombreUbicacion) {
	 * logger.info(
	 * ":::::::::::::::::::::::::::::::::::::::::::::findByUbicacion::::::::::::::::::::::::::::::::::::::::::::"
	 * ); try { HttpHeaders headers = new HttpHeaders(); headers.set("Accept",
	 * "application/json"); HttpEntity<Object> entidadPedido = new
	 * HttpEntity<Object>(headers); String
	 * url=urlLoadPersonaXUbicacion+nombreUbicacion; ResponseEntity<PersonaDTO[]>
	 * entidadRespuesta = restTemplate.exchange(url, HttpMethod.GET, entidadPedido,
	 * PersonaDTO[].class); PersonaDTO[] ubicacionDTOs=entidadRespuesta.getBody();
	 * return Arrays.asList(ubicacionDTOs); } catch (Exception e) {
	 * launchException(logger, e); } return null; }
	 */
	/*
	 * @Override public List<PersonaDTO> findByNombre(String nombreCompleto) {
	 * logger.info(
	 * ":::::::::::::::::::::::::::::::::::::::::::::findByNombre::::::::::::::::::::::::::::::::::::::::::::"
	 * ); try { HttpHeaders headers = new HttpHeaders(); headers.set("Accept",
	 * "application/json"); HttpEntity<Object> entidadPedido = new
	 * HttpEntity<Object>(headers); String url=urlFindPersonaXNombre+nombreCompleto;
	 * ResponseEntity<PersonaDTO[]> entidadRespuesta = restTemplate.exchange(url,
	 * HttpMethod.GET, entidadPedido, PersonaDTO[].class); PersonaDTO[]
	 * ubicacionDTOs=entidadRespuesta.getBody(); return
	 * Arrays.asList(ubicacionDTOs); } catch (Exception e) { launchException(logger,
	 * e); } return null; }
	 */

	/*
	 * @Override public List<PersonaDTO> findAllEmpleado() { logger.info(
	 * ":::::::::::::::::::::::::::::::::::::::::::::findAllEmpleado::::::::::::::::::::::::::::::::::::::::::::"
	 * ); try { HttpHeaders headers = new HttpHeaders(); headers.set("Accept",
	 * "application/json"); HttpEntity<Object> entidadPedido = new
	 * HttpEntity<Object>(headers); ResponseEntity<PersonaDTO[]> entidadRespuesta =
	 * restTemplate.exchange(urlFindAllEmpleados, HttpMethod.GET, entidadPedido,
	 * PersonaDTO[].class); PersonaDTO[] ubicacionDTOs=entidadRespuesta.getBody();
	 * return Arrays.asList(ubicacionDTOs); } catch (Exception e) {
	 * launchException(logger, e); } return null; }
	 */

	public List<InsertarUsuarioResponseDTO> ListarUsuariosPorPerfil() {
		// logger.info(":::::::::::::::::::::::::::::::::::::::::::::ListarOpcionPorIdUsuarioIdAplicacion::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			// PerfilPorUsuarioSSODTO personaBean= new PerfilPorUsuarioSSODTO();
			List<InsertarUsuarioResponseDTO> listOpcionPorIdUsuarioIdAplicacionBean = new ArrayList<InsertarUsuarioResponseDTO>();

			String auth = SSOUsuario + ":" + SSOPassword;
			byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
			String authHeader = /* "Basic " + */ new String(encodedAuth);
			// logger.info("authHeader:"+authHeader);
			String url = ListarPersonaPorIdPerfil + "IdPerfil=" + SSOIdPerfilAdmin;
			// logger.info("URL:" + url);
			content = UtilREST.getREST(url, authHeader);
			Gson gson = new Gson();
			// System.out.println("content "+content);
			InsertarUsuarioResponseDTO[] arregloOpcionesUsuario = gson.fromJson(content,
					InsertarUsuarioResponseDTO[].class);

			for (int i = 0; i < arregloOpcionesUsuario.length; i++) {
				listOpcionPorIdUsuarioIdAplicacionBean.add(arregloOpcionesUsuario[i]);
			}

			return listOpcionPorIdUsuarioIdAplicacionBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	public List<SSOUsuarioxPerfilDTO> ListarUsuariosPorPerfilSiga(String tokenSession) {
		// logger.info(":::::::::::::::::::::::::::::::::::::::::::::ListarOpcionPorIdUsuarioIdAplicacion::::::::::::::::::::::::::::::::::::::::::::");
		try {

			String content;
			// PerfilPorUsuarioSSODTO personaBean= new PerfilPorUsuarioSSODTO();
			List<SSOUsuarioxPerfilDTO> listOpcionPorIdUsuarioIdAplicacionBean = new ArrayList<SSOUsuarioxPerfilDTO>();

			// logger.info("URL:" + url);
			content = UtilREST.postRESTPerfil(ListarPersonaPorIdPerfil, SSOIdPerfilSiga, tokenSession);
			Gson gson = new Gson();
			// System.out.println("content "+content);
			SSOUsuarioxPerfilDTO[] arregloOpcionesUsuario = gson.fromJson(content, SSOUsuarioxPerfilDTO[].class);

			for (int i = 0; i < arregloOpcionesUsuario.length; i++) {
				listOpcionPorIdUsuarioIdAplicacionBean.add(arregloOpcionesUsuario[i]);
			}

			return listOpcionPorIdUsuarioIdAplicacionBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	public List<SSOUsuarioxPerfilDTO> ListarUsuariosPorPerfilAdmin(String tokenSession) {
		// logger.info(":::::::::::::::::::::::::::::::::::::::::::::ListarOpcionPorIdUsuarioIdAplicacion::::::::::::::::::::::::::::::::::::::::::::");

		try {

			String content;
			// PerfilPorUsuarioSSODTO personaBean= new PerfilPorUsuarioSSODTO();
			List<SSOUsuarioxPerfilDTO> listOpcionPorIdUsuarioIdAplicacionBean = new ArrayList<SSOUsuarioxPerfilDTO>();

			// logger.info("URL:" + url);
			content = UtilREST.postRESTPerfil(ListarPersonaPorIdPerfil, SSOIdPerfilAdmin, tokenSession);
			Gson gson = new Gson();
			// System.out.println("content "+content);
			SSOUsuarioxPerfilDTO[] arregloOpcionesUsuario = gson.fromJson(content, SSOUsuarioxPerfilDTO[].class);

			for (int i = 0; i < arregloOpcionesUsuario.length; i++) {
				listOpcionPorIdUsuarioIdAplicacionBean.add(arregloOpcionesUsuario[i]);
			}

			return listOpcionPorIdUsuarioIdAplicacionBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;

	}

	public List<SSOUsuarioxPerfilDTO> ListarUsuariosPorPerfilResponsable(String tokenSession) {
		// logger.info(":::::::::::::::::::::::::::::::::::::::::::::ListarOpcionPorIdUsuarioIdAplicacion::::::::::::::::::::::::::::::::::::::::::::");
		try {

			String content;
			// PerfilPorUsuarioSSODTO personaBean= new PerfilPorUsuarioSSODTO();
			List<SSOUsuarioxPerfilDTO> listOpcionPorIdUsuarioIdAplicacionBean = new ArrayList<SSOUsuarioxPerfilDTO>();

			// logger.info("URL:" + url);
			content = UtilREST.postRESTPerfil(ListarPersonaPorIdPerfil, SSOIdPerfilResponsable, tokenSession);
			Gson gson = new Gson();
			// System.out.println("content "+content);
			SSOUsuarioxPerfilDTO[] arregloOpcionesUsuario = gson.fromJson(content, SSOUsuarioxPerfilDTO[].class);

			for (int i = 0; i < arregloOpcionesUsuario.length; i++) {
				listOpcionPorIdUsuarioIdAplicacionBean.add(arregloOpcionesUsuario[i]);
			}

			return listOpcionPorIdUsuarioIdAplicacionBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	public List<SSOUsuarioxPerfilDTO> ListarUsuariosPorPerfilAdicional(String tokenSession) {
		// logger.info(":::::::::::::::::::::::::::::::::::::::::::::ListarOpcionPorIdUsuarioIdAplicacion::::::::::::::::::::::::::::::::::::::::::::");
		try {

			String content;
			// PerfilPorUsuarioSSODTO personaBean= new PerfilPorUsuarioSSODTO();
			List<SSOUsuarioxPerfilDTO> listOpcionPorIdUsuarioIdAplicacionBean = new ArrayList<SSOUsuarioxPerfilDTO>();

			// logger.info("URL:" + url);
			content = UtilREST.postRESTPerfil(ListarPersonaPorIdPerfil, SSOIdPerfilAdicional, tokenSession);
			Gson gson = new Gson();
			// System.out.println("content "+content);
			SSOUsuarioxPerfilDTO[] arregloOpcionesUsuario = gson.fromJson(content, SSOUsuarioxPerfilDTO[].class);

			for (int i = 0; i < arregloOpcionesUsuario.length; i++) {
				listOpcionPorIdUsuarioIdAplicacionBean.add(arregloOpcionesUsuario[i]);
			}

			return listOpcionPorIdUsuarioIdAplicacionBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	@Override
	public ObtenerUsuarioSSODTO findSSOaseguraUsuario(String idusuario, String tipodocumento, String documento,
			String clave, String correo) {
		logger.info("idusuario....." + idusuario);
		System.out.println("idusuario...." + idusuario);

		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::findSSOByTipoDocumentoDocumento::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			ObtenerUsuarioSSODTO obtenerusuarioBean = new ObtenerUsuarioSSODTO();

			if (idusuario != null) {
				System.out.println("Integer.parseInt(idusuario)...." + Integer.parseInt(idusuario));
				System.out.println("perfilTercerAplicacion...." + SSOIdPerfilAdicional);
				this.asignarPerfil(Integer.parseInt(idusuario), Integer.parseInt(SSOIdPerfilAdicional));

				InsertarUsuarioDTO auxcorreo = new InsertarUsuarioDTO();

				auxcorreo.setIdusuario(new BigDecimal(idusuario));
				logger.info("correo........>>>>8=====D" + correo);
				System.out.println("correo........>>>>8=====D" + correo);

				auxcorreo.setCorreoelectronico(correo);
				auxcorreo.setCodusuario(documento);
				auxcorreo.setNombreusuario(documento);

				CorreoEnvioDTO auxCorreo = envioCorreoService.sendCorreoCreacionUsuario(auxcorreo);

				return null;
			} else {
				// generamos clave aleatoria
				// clave = GeneradorCodigo.getPassword(8);
				clave = "12345678";

				String auth = SSOUsuario + ":" + SSOPassword;
				byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
				String authHeader = new String(encodedAuth);
				logger.info("authHeader:" + authHeader);
				String url = urlSSOAseguraUsuario + "IdTipoDocumento=" + tipodocumento + "&nroDNIConsulta=" + documento
						+ "&IdPerfil=" + SSOIdPerfilAdicional + "&IdAplicacion=" + SSOIdAplicacion
						+ "&nroDNIAutorizado=" + SSODniAutorizado + "&Clave=" + clave + "&CorreoElectronico=" + correo;

				logger.info("URL:" + url);
				content = UtilREST.getREST(url, authHeader);
				Gson gson = new Gson();
				System.out.println("content " + content);
				obtenerusuarioBean = gson.fromJson(content, ObtenerUsuarioSSODTO.class);

				InsertarUsuarioDTO auxcorreo = new InsertarUsuarioDTO();

				auxcorreo.setIdusuario(obtenerusuarioBean.getIdUsuario());
				auxcorreo.setCorreoelectronico(correo);
				auxcorreo.setCodusuario(documento);
				auxcorreo.setNombreusuario(documento);
				auxcorreo.setClave(clave);

				if (obtenerusuarioBean.getCodUsuario() != null) {
					logger.info("No se debe de enviar correo");
					envioCorreoService.sendCorreoCreacionUsuario(auxcorreo);
				}

				return obtenerusuarioBean;
			}

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	@Override
	public List<PerfilPorUsuarioSSODTO> findPerfilPorUsuarioSSOByIdusuarioSSO2(String idusuario, String tokenSession) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::findSSOByDni::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;

			List<PerfilPorUsuarioSSODTO> listPerfiles = new ArrayList<PerfilPorUsuarioSSODTO>();

			content = UtilREST.postREST(findPerfilPorUsuarioSSOByIdusuario, idusuario, SSOIdAplicacion, tokenSession);

			Gson gson = new Gson();
			System.out.println("content " + content);
			PerfilPorUsuarioSSODTO[] arregloPerfilesUsuario = gson.fromJson(content, PerfilPorUsuarioSSODTO[].class);

			for (int i = 0; i < arregloPerfilesUsuario.length; i++) {
				listPerfiles.add(arregloPerfilesUsuario[i]);

			}

			return listPerfiles;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

	@Override
	public List<OpcionesPorUsuarioSSODTO> ListarOpcionPorIdUsuarioIdAplicacionSSO2(String idUsuario,
			String tokenSession) {
		logger.info(
				":::::::::::::::::::::::::::::::::::::::::::::ListarOpcionPorIdUsuarioIdAplicacion::::::::::::::::::::::::::::::::::::::::::::");
		try {
			String content;
			// PerfilPorUsuarioSSODTO personaBean= new PerfilPorUsuarioSSODTO();
			List<OpcionesPorUsuarioSSODTO> listOpcionPorIdUsuarioIdAplicacionBean = new ArrayList<OpcionesPorUsuarioSSODTO>();

			content = UtilREST.postREST(ListarOpcionPorIdUsuarioIdAplicacion, idUsuario, SSOIdAplicacion, tokenSession);

			Gson gson = new Gson();
			System.out.println("content " + content);
			OpcionesPorUsuarioSSODTO[] arregloOpcionesUsuario = gson.fromJson(content,
					OpcionesPorUsuarioSSODTO[].class);

			for (int i = 0; i < arregloOpcionesUsuario.length; i++) {
				listOpcionPorIdUsuarioIdAplicacionBean.add(arregloOpcionesUsuario[i]);
			}

			return listOpcionPorIdUsuarioIdAplicacionBean;

		} catch (Exception e) {
			launchException(logger, e);
		}
		return null;
	}

}
