package pe.gob.oefa.core.security.filter;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import pe.gob.oefa.core.authentication.session.UserSession;
import pe.gob.oefa.core.exception.ServiceException;
import pe.gob.oefa.core.security.util.SecurityUtil;
import pe.gob.oefa.model.json.LoginRequest;
import pe.gob.oefa.srsalas.config.login.LoginToken;
import pe.gob.oefa.util.GenericUtil;

public class JWTAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

	private ObjectMapper mapper;
	private String mensaje;

	public JWTAuthenticationFilter(String url, AuthenticationManager authenticationManager) {
		super(new AntPathRequestMatcher(url));
		setAuthenticationManager(authenticationManager);
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		try {

			LoginRequest loginRequest = new ObjectMapper().readValue(request.getInputStream(), LoginRequest.class);
			UserSession userSession = new UserSession();
			userSession.setUsername(loginRequest.getUsuario());
			LoginToken loginToken = new LoginToken(loginRequest.getPassword(),userSession,new ArrayList<GrantedAuthority>());
			
			/*Authentication aux=getAuthenticationManager().authenticate(loginToken);
			//aux.getDetails().get
			
			UserSession userSession22 = UserSession.class.cast(aux.getDetails());
			userSession22.get
			*/
			return getAuthenticationManager().authenticate(loginToken);

		} catch (Exception e) {
			
			/*e.printStackTrace();*/
			
			//new ServiceException(
			/*
			ServiceException aux =(ServiceException)e;

			System.out.println(aux.getLocalizedMessage()); 
			System.out.println(aux.getMessage());
			System.out.println(aux.getStackTrace().getClass());
			*/
			e.getStackTrace();
			
			
			
			this.mensaje=e.getMessage();
			
			System.out.println("e::::"+e.getMessage());
			//System.out.println("e.getMessage()::::"+new Exception("FIRST EXCEPTION" + e.getMessage(), e));
			
			 
			
			throw new BadCredentialsException(e.getMessage(),e);
		}
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		
		Map<String,Object> mapClaims = new HashMap<>();
		mapClaims.put("details", authResult.getDetails());
		
		String token = Jwts.builder().setSubject(authResult.getPrincipal().toString())
				.setClaims(mapClaims)
				.setExpiration(new Date(System.currentTimeMillis() + SecurityUtil.EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS512, SecurityUtil.SECRET.getBytes()).compact();

		SecurityContextHolder.getContext().setAuthentication(authResult);
		
		response.addHeader(HttpHeaders.AUTHORIZATION, SecurityUtil.TOKEN_PREFIX + token);
		response.addCookie(new Cookie("SIRTE", token));

		UserSession usuarioSession = (UserSession)authResult.getDetails();
		
		Map<String, Object> mapResponse = new HashMap<>();
		mapResponse.put("username", GenericUtil.emptyIfStringNull(authResult.getPrincipal().toString()));
		mapResponse.put("names",GenericUtil.emptyIfStringNull( usuarioSession.getNombres()));
		mapResponse.put("dni", GenericUtil.emptyIfStringNull(usuarioSession.getDni()));
		mapResponse.put("estado", GenericUtil.emptyIfStringNull(usuarioSession.getEstado()));
		mapResponse.put("U_SESION", usuarioSession);
		mapResponse.put("URL_FOTO", usuarioSession);
		mapResponse.put("token", SecurityUtil.TOKEN_PREFIX + token);
		mapper = new ObjectMapper();
		mapper.writeValue(response.getWriter(), mapResponse);
	}
	
	@Override
	protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
		
		response.setStatus(HttpStatus.UNAUTHORIZED.value());
		mapper = new ObjectMapper();
		Map<String, Object> mapResponse = new HashMap<>();
		
		//System.out.println("8==========D:"+failed.getMessage());
		//mapResponse.put("message", this.mensaje/*"Verifique sus Credenciales"*/);
		mapResponse.put("message", "Verifique sus Credenciales");
		mapResponse.put("code", "401");
		mapper.writeValue(response.getWriter(), mapResponse);
	}
}
