package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include; 	
@JsonInclude(Include.NON_NULL)

public class InsertarUsuarioResponse extends BaseRequest  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1117174376466010426L;
	private String clave;
	private String nuevaclave;	
	private String codusuario;
	private String correoelectronico;
	private String 	flaglogin;	
	private BigDecimal idsesion;
	private BigDecimal idusuario;
	private String nombreusuario;
	private String observacion;
	
	
	public InsertarUsuarioResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getNuevaclave() {
		return nuevaclave;
	}


	public void setNuevaclave(String nuevaclave) {
		this.nuevaclave = nuevaclave;
	}

	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getCodusuario() {
		return codusuario;
	}


	public void setCodusuario(String codusuario) {
		this.codusuario = codusuario;
	}


	public String getCorreoelectronico() {
		return correoelectronico;
	}


	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}


	public BigDecimal getIdsesion() {
		return idsesion;
	}


	public void setIdsesion(BigDecimal idsesion) {
		this.idsesion = idsesion;
	}


	public BigDecimal getIdusuario() {
		return idusuario;
	}


	public void setIdusuario(BigDecimal idusuario) {
		this.idusuario = idusuario;
	}


	public String getNombreusuario() {
		return nombreusuario;
	}


	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	public String getFlaglogin() {
		return flaglogin;
	}


	public void setFlaglogin(String flaglogin) {
		this.flaglogin = flaglogin;
	}

	


}
