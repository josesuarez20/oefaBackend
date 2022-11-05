package pe.gob.oefa.srsalas.config.login;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import pe.gob.oefa.core.authentication.session.UserSession;

public class LoginFilter extends OncePerRequestFilter{

	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String requestPath = request.getPathInfo();
		if (requestPath == null) {
			requestPath = request.getServletPath();
		}
		
		if(SecurityContextHolder.getContext().getAuthentication() != null) {
			UserSession authenticatedUserSession = (UserSession) SecurityContextHolder.getContext().getAuthentication().getDetails();
			
			//TODO Por Implementar
		}
		
		
		filterChain.doFilter(request, response);
	}

}
