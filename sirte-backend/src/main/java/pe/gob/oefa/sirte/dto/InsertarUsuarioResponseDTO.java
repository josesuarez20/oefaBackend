package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;

import pe.gob.oefa.core.dto.BaseDTO;

public class InsertarUsuarioResponseDTO  extends BaseDTO {
	
	private static final long serialVersionUID = -5755883238715448589L;	
	private String 		Clave;
	private String 		nuevaClave;	
	private String 		CodUsuario;
	private String 		CorreoElectronico;	
	private String 		Flaglogin;
	private BigDecimal 	IdSesion;
	private BigDecimal 	IdUsuario;
	private String 		NombreUsuario;
	private String 		Observacion;
	
	public InsertarUsuarioResponseDTO() 
	{
		
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}
	
	public String getNuevaClave() {
		return nuevaClave;
	}

	public void setNuevaClave(String nuevaClave) {
		this.nuevaClave = nuevaClave;
	}

	public String getCodUsuario() {
		return CodUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		CodUsuario = codUsuario;
	}

	public String getCorreoElectronico() {
		return CorreoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}

	public String getFlaglogin() {
		return Flaglogin;
	}

	public void setFlaglogin(String flaglogin) {
		Flaglogin = flaglogin;
	}

	public BigDecimal getIdSesion() {
		return IdSesion;
	}

	public void setIdSesion(BigDecimal idSesion) {
		IdSesion = idSesion;
	}

	public BigDecimal getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(BigDecimal idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	

	
	

}
