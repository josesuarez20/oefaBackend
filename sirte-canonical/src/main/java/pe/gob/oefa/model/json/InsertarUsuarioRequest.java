package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class InsertarUsuarioRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6706992344065452420L;
	private BigDecimal 	idusuario;
	private String 		codusuario;
	private String 		nombreusuario;
	private String 		correoelectronico;
	private String 		clave;
	private String 		nuevaclave;	
	private BigDecimal 	idsesion;
	
	public InsertarUsuarioRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(BigDecimal idusuario) {
		this.idusuario = idusuario;
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
	
	public String getNuevaclave() {
		return nuevaclave;
	}

	public void setNuevaclave(String nuevaclave) {
		this.nuevaclave = nuevaclave;
	}

	public BigDecimal getIdsesion() {
		return idsesion;
	}

	public void setIdsesion(BigDecimal idsesion) {
		this.idsesion = idsesion;
	}


	

	

}
