package pe.gob.oefa.core.security.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import pe.gob.oefa.core.authentication.session.UserSession;
import pe.gob.oefa.core.security.util.SecurityUtil;
import pe.gob.oefa.srsalas.config.login.LoginToken;
import pe.gob.oefa.srsalas.dto.seguridad.PerfilDTO;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

	public JWTAuthorizationFilter(AuthenticationManager authManager) {
		super(authManager);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		String cookieHeader = req.getHeader("Set-Cookie");

		if (cookieHeader != null) {
			cookieHeader = cookieHeader.replace("\"", "");
		}

		if (cookieHeader == null || !cookieHeader.startsWith(SecurityUtil.TOKEN_PREFIX)) {
			chain.doFilter(req, res);
			return;
		}
		validateAuthentication(cookieHeader);
		chain.doFilter(req, res);
	}

	private void validateAuthentication(String token) {
		if (token != null) {
			Claims claims = Jwts.parser().setSigningKey(SecurityUtil.SECRET.getBytes())
					.parseClaimsJws(token.replace(SecurityUtil.TOKEN_PREFIX, "")).getBody();
			@SuppressWarnings("unchecked")
			Map<String,Object> mapa = LinkedHashMap.class.cast(claims.get("details"));
			
			System.out.println("mapamapamapamapamapa:::>>>"+mapa);
			
			UserSession userSession = new UserSession();
			userSession.setUsername(mapa.get("username").toString());
			userSession.setDni(mapa.get("dni").toString());
			userSession.setTipodocumento(mapa.get("tipodocumento").toString());
			userSession.setEmail(mapa.get("email").toString());
			userSession.setUuidUser(mapa.get("uuidUser").toString());
			userSession.setUserId(Integer.parseInt(mapa.get("userId").toString()));
			userSession.setNombres(mapa.get("nombres").toString());
			userSession.setTipodocumento(mapa.get("tipodocumento").toString());
			/*userSession.setUrlFoto(mapa.get("urlFoto").toString());*/
			
			@SuppressWarnings("unchecked")
			Map<String,Object> perfil = LinkedHashMap.class.cast(mapa.get("perfil"));
			
			userSession.setPerfil(new PerfilDTO(Integer.parseInt(perfil.get("perfilId").toString()), perfil.get("nombre").toString()));
			LoginToken loginToken = new LoginToken(claims.getSubject(), userSession, new ArrayList<GrantedAuthority>());
			loginToken.setAuthenticated(Boolean.TRUE);
			SecurityContextHolder.getContext().setAuthentication(loginToken);
		}else {
			
		}
	}
}
