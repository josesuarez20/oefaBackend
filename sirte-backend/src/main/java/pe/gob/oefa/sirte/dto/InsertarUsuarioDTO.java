package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;

import pe.gob.oefa.core.dto.BaseDTO;

public class InsertarUsuarioDTO  extends BaseDTO {
	
	private static final long serialVersionUID = -5755883238715448589L;	
	private BigDecimal 	idusuario;
	private String 		codusuario;
	private String 		nombreusuario;
	private String 		correoelectronico;
	private String 		clave;
	private String 		nuevaclave;	
	private BigDecimal 	idsesion;
	
	
	public InsertarUsuarioDTO() 
	{
		
	}
	
	public BigDecimal getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(BigDecimal idusuario) {
		this.idusuario = idusuario;
	}
	
	public String getNuevaclave() {
		return nuevaclave;
	}

	public void setNuevaclave(String nuevaclave) {
		this.nuevaclave = nuevaclave;
	}

	public String getCodusuario() {
		return codusuario;
	}

	public void setCodusuario(String codusuario) {
		this.codusuario = codusuario;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public BigDecimal getIdsesion() {
		return idsesion;
	}

	public void setIdsesion(BigDecimal idsesion) {
		this.idsesion = idsesion;
	}

	

}
