package pe.gob.oefa.sirte.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.authentication.session.UserSession;
import pe.gob.oefa.core.exception.ServiceException;
import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBaseIntranet;
import pe.gob.oefa.model.json.LoginRequest;
import pe.gob.oefa.model.json.LoginResponse;
import pe.gob.oefa.sirte.dto.CredencialesUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.DependienteDTO;
import pe.gob.oefa.sirte.dto.InsertarUsuarioResponseDTO;
import pe.gob.oefa.sirte.dto.PerfilPorUsuarioSSODTO;
import pe.gob.oefa.sirte.dto.PersonaDTO;
import pe.gob.oefa.sirte.dto.PersonaJuridicaSSODTO;
import pe.gob.oefa.sirte.dto.PersonaNaturalSSODTO;
import pe.gob.oefa.sirte.dto.SSOUsuarioxPerfilDTO;
import pe.gob.oefa.sirte.service.DependienteService;
import pe.gob.oefa.sirte.service.LoginService;
import pe.gob.oefa.sirte.service.PersonaService;
import pe.gob.oefa.sirte.service.SsoService;
import pe.gob.oefa.srsalas.dto.seguridad.PerfilDTO;
import pe.gob.oefa.util.GenericUtil;
import pe.gob.oefa.ws.seguridad.bean.Usuario;

@Service("loginService")
@Transactional
public class LoginServiceImpl extends ServiceBaseIntranet implements LoginService {
	private CoreLogger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	private SsoService wsrestSso;

	@Autowired
	private PersonaService personaService;

	@Autowired
	private DependienteService dependienteService;

	@Value("${aplicacion.id}")
	private String applicationId;
	
	@Value("${Token_REST:#{null}}")
	private String tokenSession;

	// @Value("${servicioExterno.intranet.loadFotoXDni}")
	// private String urlFoto;

	@Value("${perfil.aplicacion.sso.sirte.administrador}")
	private int perfilAdministradorAplicacion;

	@Value("${perfil.aplicacion.sso.sirte.responsable}")
	private int perfilResponsableAplicacion;

	@Value("${perfil.aplicacion.sso.sirte.adicional}")
	private int perfilResponsableAdicional;

	@Value("${perfil.aplicacion.sso.sirte.siga}")
	private int perfilSigaAplicacion;

	@Override
	public UserSession validateRequest(String codigo, String state) {
		System.out.println("Este es el paso 11111111aaaaa");

		UserSession userSession = null;

		Usuario usuario = new Usuario();
		usuario.setUserName(codigo);
		usuario.setContrasena(state);
		usuario.setIdAplicacion(Integer.parseInt(applicationId));

		try {

			// InsertarUsuarioResponseDTO validarUsuario(CredencialesUsuarioSSODTO
			// credencialusuarioDTO);
			CredencialesUsuarioSSODTO user = new CredencialesUsuarioSSODTO();
			user.setUsuario(usuario.getUserName());
			user.setClave(usuario.getContrasena());

			InsertarUsuarioResponseDTO usuarioverificadoSSO = wsrestSso.validarUsuario(user);

			System.out.println("__________________________________");
			System.out.println("usuarioverificadoSSO.getIdUsuario():::>>>>" + usuarioverificadoSSO.getIdUsuario());
			System.out.println("usuarioverificadoSSO.getCodUsuario():::>>>>" + usuarioverificadoSSO.getCodUsuario());
			System.out.println(
					"usuarioverificadoSSO.getCorreoElectronico():::>>>>" + usuarioverificadoSSO.getCorreoElectronico());
			System.out.println("__________________________________");

			// usuario = wsSisegCliente.autenticarUsuario(usuario);//

			System.out.println("usuarioverificadoSSO.getIdUsuario().intValue()::::"
					+ usuarioverificadoSSO.getIdUsuario().intValue());

			// if (usuario.getIdUsuario() != 0) {
			if (usuarioverificadoSSO.getObservacion().equalsIgnoreCase("Usuario Autenticado")) {

				userSession = new UserSession();
				// userSession.setUserId(usuario.getIdUsuario());
				userSession.setUserId(usuarioverificadoSSO.getIdUsuario().intValue());
				// userSession.setNombres(usuario.getNombreApellido());
				// userSession.setNombres();
				userSession.setUsername(usuarioverificadoSSO.getCodUsuario());
				// userSession.setEmail(usuario.getEmailCoorporativo());
				userSession.setEmail(usuarioverificadoSSO.getCorreoElectronico());
				// userSession.setDni(usuario.getDNI());
				userSession.setDni(usuarioverificadoSSO.getCodUsuario());

				System.out.println("userSession.getDni()::::" + userSession.getDni() + " tamaño:::"
						+ userSession.getDni().trim().length());

				if (GenericUtil.isNotEmpty(userSession.getDni())) {

					boolean isNumero = false;

					// validamos si es DNI o usuario de red
					int cantnumeros = 0;
					char userchart[] = userSession.getDni().toCharArray();

					if (userchart != null) {
						for (int i = 0; i < userchart.length; i++) {

							if ((userchart[i] + "").matches("[+-]?[\\d]*[.]?[\\d]+")) {
								cantnumeros = cantnumeros + 1;
							}
						}
						if (cantnumeros == userchart.length) {
							isNumero = true;
						}
					}

					if (isNumero) {
						System.out.println("Estamos en el traer los datos de la persona natural paso 1");

						if (userSession.getDni().trim().length() == 8) {
							PersonaNaturalSSODTO perNatu = wsrestSso.findSSOByDni(userSession.getDni().trim());

							userSession.setNombres(perNatu.getNombreCompleto());
							userSession.setTipodocumento(perNatu.getTipoDocumento().toString());
							userSession.setUuidUser(UUID.randomUUID().toString());

							// obtenemos datos de persona del SIA por dni
							PersonaDTO personaDTO = personaService.getByDocumento(userSession.getDni());
							if (personaDTO == null) {
								userSession.setEstado("2");
							} else {
								userSession.setDni(personaDTO.getDocumento());
								userSession.setEstado(personaDTO.getEstadoempleado());
							}

						} else {
							if (userSession.getDni().trim().length() == 9) {
								PersonaNaturalSSODTO perNatu = wsrestSso.findSSOByCE(userSession.getDni().trim());

								userSession.setNombres(perNatu.getNombreCompleto());
								userSession.setTipodocumento(perNatu.getTipoDocumento().toString());
								userSession.setUuidUser(UUID.randomUUID().toString());
							} else {
								if (userSession.getDni().trim().length() == 11) {
									PersonaJuridicaSSODTO perJuri = wsrestSso.findSSOByRuc(userSession.getDni().trim());

									userSession.setNombres(perJuri.getNombreCompleto());
									userSession.setTipodocumento(perJuri.getTipoDocumento().toString());
									userSession.setUuidUser(UUID.randomUUID().toString());
								}
							}
						}
					} else {

						// ----para el admin
						List<SSOUsuarioxPerfilDTO> lstUsuarios = wsrestSso.ListarUsuariosPorPerfilAdmin(tokenSession);
						if (lstUsuarios != null) {
							for (SSOUsuarioxPerfilDTO obj : lstUsuarios) {

								if (userSession.getUserId() == obj.getIdUsuario().intValue()) {
									userSession.setNombres(obj.getNombreUsuario());
								}
							}
						}
						if (userSession.getNombres() == null || "".equals(userSession.getNombres())) {
							// ----para empleado
							lstUsuarios = wsrestSso.ListarUsuariosPorPerfilResponsable(tokenSession);
							if (lstUsuarios != null) {
								for (SSOUsuarioxPerfilDTO obj : lstUsuarios) {

									if (userSession.getUserId() == obj.getIdUsuario().intValue()) {
										userSession.setNombres(obj.getNombreUsuario());
										// obtenemos datos de persona del SIA por el codigo de usuario
										PersonaDTO personaDTO = personaService
												.getByCodigoUsuario(userSession.getDni().toUpperCase());
										userSession.setDni(personaDTO.getDocumento());
										userSession.setEstado(personaDTO.getEstadoempleado());
									}
								}
							}
						}

						userSession.setTipodocumento("2");
						userSession.setUuidUser(UUID.randomUUID().toString());
					}

					// }
					if (userSession.getUserId() != null) {
						System.out.println("Estamos en el traer los datos de la persona natural paso 2");

						List<PerfilPorUsuarioSSODTO> listperfilPorUsuario = new ArrayList<PerfilPorUsuarioSSODTO>();

						listperfilPorUsuario = wsrestSso
								.findPerfilPorUsuarioSSOByIdusuario(userSession.getUserId().toString().trim());

						for (int i = 0; i < listperfilPorUsuario.size(); i++) {

							System.out.println("A111:" + listperfilPorUsuario.get(i).getPK_eIdPerfil().intValue());
							System.out.println("A222:" + listperfilPorUsuario.get(i).getuNombrePerfil().toUpperCase());

							if (perfilAdministradorAplicacion == listperfilPorUsuario.get(i).getPK_eIdPerfil()
									.intValue()
									|| perfilResponsableAplicacion == listperfilPorUsuario.get(i).getPK_eIdPerfil()
											.intValue()
									|| perfilSigaAplicacion == listperfilPorUsuario.get(i).getPK_eIdPerfil().intValue()
									|| perfilResponsableAdicional == listperfilPorUsuario.get(i).getPK_eIdPerfil()
											.intValue()) {

								userSession.setPerfil(
										new PerfilDTO(listperfilPorUsuario.get(i).getPK_eIdPerfil().intValue(),
												listperfilPorUsuario.get(i).getuNombrePerfil().toUpperCase()));
							}
						}

						/*
						 * for (Rol rol : usuario.getListaRol()) { userSession.setPerfil(new
						 * PerfilDTO(rol.getIdRol(), rol.getNombre())); }
						 */
					}
				}
				System.out.println("Estamos en el traer los datos de la persona natural paso 3");

			} else {
				throw new ServiceException(usuarioverificadoSSO.getObservacion().toUpperCase());

			}

			// para usuarios adicionales
			DependienteDTO adicionalDTO = new DependienteDTO();
			adicionalDTO.setDocumento(userSession.getDni());
			List<DependienteDTO> adicional = dependienteService.findByParameterAdicional(adicionalDTO);

			if (adicional != null) {
				if (adicional.size() > 0) {
					userSession.setDni(adicional.get(0).getDocumentoresponsable());
				}
			}

		} catch (Exception e) {

			super.launchException(logger, e);
			// throw new ExternalServiceException(e);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>" + userSession.getPerfil());
		return userSession;
	}

	@Override
	public LoginResponse login(LoginRequest request) {
		System.out.println(request);
		return null;
	}

}
