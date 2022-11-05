package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class RepLegalRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private String ApellidoMaterno;
	private String ApellidoPaterno;
	private String CodCargo;
	private String Direccion;	
	private BigDecimal IdPersona;
	private String NombreCargo;
	private String NombreCompleto;
	private String Nombres;
	private String NroDocumento;
	private BigDecimal TipoDocumento;
	private String Ubigeo;
	
	
	public RepLegalRequest() {
		// TODO Auto-generated constructor stub
	}


	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}


	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}


	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}


	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}


	public String getCodCargo() {
		return CodCargo;
	}


	public void setCodCargo(String codCargo) {
		CodCargo = codCargo;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public BigDecimal getIdPersona() {
		return IdPersona;
	}


	public void setIdPersona(BigDecimal idPersona) {
		IdPersona = idPersona;
	}


	public String getNombreCargo() {
		return NombreCargo;
	}


	public void setNombreCargo(String nombreCargo) {
		NombreCargo = nombreCargo;
	}


	public String getNombreCompleto() {
		return NombreCompleto;
	}


	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}


	public String getNombres() {
		return Nombres;
	}


	public void setNombres(String nombres) {
		Nombres = nombres;
	}


	public String getNroDocumento() {
		return NroDocumento;
	}


	public void setNroDocumento(String nroDocumento) {
		NroDocumento = nroDocumento;
	}


	public BigDecimal getTipoDocumento() {
		return TipoDocumento;
	}


	public void setTipoDocumento(BigDecimal tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}


	public String getUbigeo() {
		return Ubigeo;
	}


	public void setUbigeo(String ubigeo) {
		Ubigeo = ubigeo;
	}	

}
