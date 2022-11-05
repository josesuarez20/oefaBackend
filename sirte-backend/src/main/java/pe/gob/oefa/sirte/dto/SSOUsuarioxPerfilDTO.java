package pe.gob.oefa.sirte.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class SSOUsuarioxPerfilDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5688303873036383910L;

	private BigDecimal idUsuario;
	private String idPersona;
	private String codUsuario;
	private String nombreUsuario;
	private String correoElectronico;

	public BigDecimal getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(BigDecimal idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

}
