package pe.gob.oefa.core.security.util;

import org.springframework.security.core.context.SecurityContextHolder;

import pe.gob.oefa.core.authentication.session.UserSession;

public class SecurityUtil {

	public static final String SECRET = "SecretKeyToGenJWTs";
	public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	public static final String TOKEN_PREFIX = "Bearer";
	public static final String URL_BASE = "/reuniones-backend";
	public static final String SIGN_UP_URL = "/security/login/sing-up";
	public static final String SSO_URL = "/security/login/confirmsso";
	public static final String DOCUMENTO_LINEAMIENTOS = "/business/acta/descargarlineamientos";
	public static final String VERSION_TABLET_INIT = "/business/tablet/init";
	public static final String VERSION_TABLET_FIND = "/business/tablet/find";
	public static final String VERSION_TABLET_SALA_UBICACION = "/comun/combo/loadSalaPorUbicacion/**";
	public static final String VERSION_REGISTRO_TIPO_PERSONA = "/comun/combo/tiposPersonas/**";
	public static final String VERSION_REGISTRO_PERSONA_SSO_DNI = "/comun/combo/SSOfindPersonaPorDni/**";
	public static final String VERSION_REGISTRO_OBTENER_USUARIO = "/comun/combo/SSOObtenerUsuario/**";
	public static final String VERSION_REGISTRO_ASEGURA_USUARIO = "/comun/combo/SSOAseguraUsuario";
	public static final String VERSION_REGISTRO_PERSONA_SSO_CE = "/comun/combo/SSOfindPersonaPorCE/**";
	public static final String VERSION_REGISTRO_JURIDICAS_SSO_RUC = "/comun/combo/SSOfindJuridicasPorRuc/**";
	public static final String VERSION_SAVE_VERIFICAR_PERSONA_SSO_DNI = "/comun/combo/findUsuarioSIRTE";
	public static final String VERSION_SAVE_REGISTRO_PERSONA_SSO_DNI = "/comun/combo/saveOrUpdate";
	public static final String VERSION_REGISTRO_TIPO_DOCUMENTO_PERSONA = "/comun/combo/tiposDocumentos/**";
	public static final String SUBIR_DOCUMENTOS = "/business/documento/updload";
	public static final String DESCARGAR_DOCUMENTOS_SIGA = "/business/documento/getSiga";
	public static final String DESCARGAR_DOCUMENTOS_SIGED = "/business/documento/getSiged";
	public static final String DESCARGAR_DOCUMENTOS = "/business/documento/get/**";

	
	public static final String SOLICITUD_LISTA_FILTRO_EXT = "/business/solicitud/listaFiltrosExt";
	public static final String SOLICITUD_INIT_ESTADO_EXT = "/business/solicitud/initEstadoExt";

	// public static final String VERSION_TABLET_TIPO_SALA_UBICACION =
	// "/comun/combo/loadTipoSalaPorUbicacion/**";

	private SecurityUtil() {
	}

	public static UserSession getUserSession() {
		try {
			return UserSession.class.cast(SecurityContextHolder.getContext().getAuthentication().getDetails());
		} catch (Exception e) {
			return null;
		}

	}

	public static class Rol {

		public static String ADMINISTRADOR = "ADMINISTRADOR";
		public static String TERCERO = "TERCERO";
		public static String SIGA = "SIGA";
		public static String ADMINISTRADO = "ADMINISTRADO";
		public static String RESPONSABLE_SALA = "RESPONSABLE_SALA";
		public static String ESPECIALISTA_CTER = "ESPECIALISTA_CTER";
	}

}
