package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

public class SSOObtenerUsuarioResponse implements Serializable{

	/**
	 * 
	 */
	private static long serialVersionUID = -5688303873036383910L;
	
	private String CodUsuario;
	private String CorreoElectronico;
	private String EstadoUsuario;	
	private String ExistePerfil;
	private String ExisteUsuario;
	private BigDecimal IdUsuario;
	private String Observacion;
	private BigDecimal TipoAutenticacion;
	
	
	public SSOObtenerUsuarioResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}


	public static void setSerialVersionUID(long serialVersionUID) {
		SSOObtenerUsuarioResponse.serialVersionUID = serialVersionUID;
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

	public String getEstadoUsuario() {
		return EstadoUsuario;
	}

	public void setEstadoUsuario(String estadoUsuario) {
		EstadoUsuario = estadoUsuario;
	}

	
	
	

	

}
