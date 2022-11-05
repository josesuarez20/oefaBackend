package pe.gob.oefa.srsalas.config.login;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import pe.gob.oefa.core.authentication.session.UserSession;

public class LoginToken extends AbstractAuthenticationToken{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3684774326920362636L;
	
	private String token;
	
	public LoginToken(Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
	}
	
	public LoginToken(String token, UserSession userSession,Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
		this.token = token;
		setDetails(userSession);
	}
	
	@Override
	public Object getCredentials() {
		return this.token;
	}
	
	@Override
	public Object getPrincipal() {
		UserSession userSession = (UserSession) this.getDetails();
		return userSession.getUuidUser();
	}
 
}
