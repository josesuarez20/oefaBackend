package pe.gob.oefa.sirte.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObtenerUsuarioSSODTO implements Serializable{
	
	/**
	 * 
	 */	
	
	private static final long serialVersionUID = -5688303873036383910L;
	    
	private String CodUsuario;
	private String CorreoElectronico;
	private String EstadoUsuario;	
	private String ExistePerfil;
	private String ExisteUsuario;
	private BigDecimal IdUsuario;
	private String Observacion;
	private BigDecimal TipoAutenticacion;
	
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
	public String getExistePerfil() {
		return ExistePerfil;
	}
	public void setExistePerfil(String existePerfil) {
		ExistePerfil = existePerfil;
	}
	public String getExisteUsuario() {
		return ExisteUsuario;
	}
	public void setExisteUsuario(String existeUsuario) {
		ExisteUsuario = existeUsuario;
	}
	public BigDecimal getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(BigDecimal idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getObservacion() {
		return Observacion;
	}
	public void setObservacion(String observacion) {
		Observacion = observacion;
	}
	public BigDecimal getTipoAutenticacion() {
		return TipoAutenticacion;
	}
	public void setTipoAutenticacion(BigDecimal tipoAutenticacion) {
		TipoAutenticacion = tipoAutenticacion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
	public String getEstadoUsuario() {
		return EstadoUsuario;
	}
	public void setEstadoUsuario(String estadoUsuario) {
		EstadoUsuario = estadoUsuario;
	}

	

}

