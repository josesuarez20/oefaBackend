package pe.gob.oefa.sirte.controler;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import pe.gob.oefa.apps.base.util.TokenProviderPlusd;
import pe.gob.oefa.seguridad.util.Constante;
import pe.gob.oefa.seguridad.util.UtilEncrypt;
import pe.gob.oefa.sso.response.RespuestaHttp;
import pe.gob.oefa.sso.response.Sso;

@RestController
@RequestMapping("/v1/seguridad")
public class SeguridadController {

	@Value("${Token_REST:#{null}}")
	private String tokenSession;

	@Value("${encrypt.key}")
	private String key;
	
	@Value("${urlAplicativo}")
	private String urlAplicativo;

	public static final String SECRET_KEY = "51636fa70b8b3471272a5df283e145c9";

	@CrossOrigin("*")
	@PostMapping("/confirmsso2")
	public RespuestaHttp confirmSSO2(@RequestBody Sso ssoidem, HttpSession session) {
		RespuestaHttp respuesta = new RespuestaHttp();
		try {
			if (ssoidem != null) {
				session.setAttribute(Constante.CONSTANTE_TOKEN, ssoidem.getToken());
				tokenSession = ssoidem.getToken();
				respuesta.setValido(true);
				UtilEncrypt.init(key);
				String ref = UtilEncrypt.encrypt(ssoidem.geteIdUsuario()) + "&wk"
						+ UtilEncrypt.encrypt(ssoidem.getuCodUsuario()) + "&wkuNomUsu=" + ssoidem.getuNombreCompleto()
						+ "&wkt=1";
				// initJob();
				// initInitializingService();
				respuesta.setMensaje(ref);

			}
		} catch (GeneralSecurityException e) {
			// log.error("confirmsso2: {}", e.getMessage());
		}
		return respuesta;
	}

	@GetMapping("/confirmsiscore/auth")
	public RespuestaHttp confirmplusd(@RequestParam(value = "token", required = false) String token,
			HttpSession session, HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, GeneralSecurityException {
		RespuestaHttp respuesta = new RespuestaHttp();
		UtilEncrypt.init(key);

		try {

			Claims claims = TokenProviderPlusd.obtenerTodosLosClaimsDelToken(token);
			String idUsuario = (String) claims.get("idusuario");
			String documento = (String) claims.get("documento");
			String tipoIdentificacion = (String) claims.get("tipoIdentificacion");
			String nroIdentificacion = (String) claims.get("nroIdentificacion");
			String nombreUsuario = (String) claims.get("nombre");
			String correo = (String) claims.get("correo");
			String tokensso = (String) claims.get("token");

			System.out.println("idUsuario:" + idUsuario);
			System.out.println("documento:" + documento);
			System.out.println("tipoIdentificacion:" + tipoIdentificacion);
			System.out.println("nroIdentificacion:" + nroIdentificacion);
			System.out.println("correo:" + correo);
			System.out.println("nombreUsuario:" + nombreUsuario);
			System.out.println("tokensso:" + tokensso);

			session.setAttribute("token", tokensso);
			tokenSession = tokensso;

			Sso ssoidem = new Sso();
			ssoidem.seteIdUsuario(idUsuario);
			ssoidem.setuCodUsuario(documento);
			ssoidem.setNumDocumento(documento);
			ssoidem.setuNombreCompleto(nombreUsuario);
			ssoidem.setToken(tokensso);

//			String ref = UtilEncrypt.encrypt(idUsuario) + "&wk" + UtilEncrypt.encrypt(documento) + "&wkt=2";

			String ref = UtilEncrypt.encrypt(idUsuario) + "&wk"
					+ UtilEncrypt.encrypt(ssoidem.getuCodUsuario()) + "&wkuNomUsu=" + ssoidem.getuNombreCompleto()
					+ "&wkt=1";
			
			String url = urlAplicativo + "/#/principal?ref=" + ref;

			respuesta.setValido(true);
			respuesta.setMensaje(ref);
			response.sendRedirect(url);

		} catch (Exception e) {
			e.printStackTrace();
			respuesta.setValido(false);
			respuesta.setMensaje(e.getMessage());
		}

		return respuesta;
	}

	private static Claims getAllClaimsFromToken(String token) {
		Claims claims;
		byte signingKey[] = SECRET_KEY.getBytes();
		try {
			claims = Jwts.parser().setSigningKey(signingKey).parseClaimsJws(token).getBody();

			System.out.println(claims);
		} catch (Exception e) {
			claims = null;
		}
		return claims;
	}

}
