package pe.gob.oefa.dto.core;

import java.io.Serializable;
import java.math.BigDecimal;

public class BaseRestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3086616909649754955L;
	
	private BigDecimal idSesion;
	private String username;
	
	public BaseRestDTO() {
	}
	
	/**
	 * @return the idSesion
	 */
	public BigDecimal getIdSesion() {
		return idSesion;
	}
	/**
	 * @param idSesion the idSesion to set
	 */
	public void setIdSesion(BigDecimal idSesion) {
		this.idSesion = idSesion;
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
