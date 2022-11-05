package pe.gob.oefa.dto.security;

import java.io.Serializable;

public class DashboardRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6002882610040053279L;
	
	private String username;

	public DashboardRequest() {
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
