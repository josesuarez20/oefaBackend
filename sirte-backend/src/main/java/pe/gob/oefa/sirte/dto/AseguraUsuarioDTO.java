package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;

import pe.gob.oefa.core.dto.BaseDTO;

public class AseguraUsuarioDTO  extends BaseDTO {
	
	private static final long serialVersionUID = -5755883238715448589L;	
	private BigDecimal 		IdTipoDocumento;
	private String 			nroDNIConsulta;
	private BigDecimal 		IdPerfil;
	private BigDecimal 		IdAplicacion;
	private String 			nroDNIAutorizado;
	private String 			Clave;
	private String 			CorreoElectronico;
		
	
	
	
	public AseguraUsuarioDTO() 
	{
		
	}




	public BigDecimal getIdTipoDocumento() {
		return IdTipoDocumento;
	}




	public void setIdTipoDocumento(BigDecimal idTipoDocumento) {
		IdTipoDocumento = idTipoDocumento;
	}




	public String getNroDNIConsulta() {
		return nroDNIConsulta;
	}




	public void setNroDNIConsulta(String nroDNIConsulta) {
		this.nroDNIConsulta = nroDNIConsulta;
	}




	public BigDecimal getIdPerfil() {
		return IdPerfil;
	}




	public void setIdPerfil(BigDecimal idPerfil) {
		IdPerfil = idPerfil;
	}




	public BigDecimal getIdAplicacion() {
		return IdAplicacion;
	}




	public void setIdAplicacion(BigDecimal idAplicacion) {
		IdAplicacion = idAplicacion;
	}




	public String getNroDNIAutorizado() {
		return nroDNIAutorizado;
	}




	public void setNroDNIAutorizado(String nroDNIAutorizado) {
		this.nroDNIAutorizado = nroDNIAutorizado;
	}




	public String getClave() {
		return Clave;
	}




	public void setClave(String clave) {
		Clave = clave;
	}




	public String getCorreoElectronico() {
		return CorreoElectronico;
	}




	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
