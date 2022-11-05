package pe.gob.oefa.srsalas.config.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import pe.gob.oefa.core.authentication.session.UserSession;
import pe.gob.oefa.sirte.service.LoginService;

@Component
public class LoginProvider implements AuthenticationProvider {

	@Autowired
	private LoginService loginService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		UserSession userSession = UserSession.class.cast(authentication.getDetails());
		userSession = loginService.validateRequest(userSession.getUsername(),String.class.cast(authentication.getCredentials()));
		LoginToken loginToken = (LoginToken) authentication;
		if(userSession!=null ) {
			loginToken.setDetails(userSession);
			loginToken.setAuthenticated(Boolean.TRUE);
		}else {
			loginToken.setAuthenticated(Boolean.FALSE);
		}
		return loginToken;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return LoginToken.class.isAssignableFrom(authentication);
	}

}
