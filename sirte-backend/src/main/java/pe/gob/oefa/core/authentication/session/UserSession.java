package pe.gob.oefa.core.authentication.session;

import java.io.Serializable;

import pe.gob.oefa.srsalas.dto.seguridad.PerfilDTO;

public class UserSession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8811210314815288461L;

	private String uuidUser;
	private Integer userId;
	private String username;
	private String nombres;
	private String email;
	private String dni;	
	private String tipodocumento;	
	private String urlFoto;
	private PerfilDTO perfil;
	private String estado; //0=activo, 2=cesado

	public UserSession() {
	}

	/**
	 * @return the uuidUser
	 */
	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	
	public String getUuidUser() {
		return uuidUser;
	}

	/**
	 * @param uuidUser the uuidUser to set
	 */
	public void setUuidUser(String uuidUser) {
		this.uuidUser = uuidUser;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
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

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the urlFoto
	 */
	public String getUrlFoto() {
		return urlFoto;
	}

	/**
	 * @param urlFoto the urlFoto to set
	 */
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	/**
	 * @return the perfil
	 */
	public PerfilDTO getPerfil() {
		return perfil;
	}

	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(PerfilDTO perfil) {
		this.perfil = perfil;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
		
}
