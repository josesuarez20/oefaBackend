package pe.gob.oefa.sirte.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class PerfilPorUsuarioSSODTO  implements Serializable{
	
	/**
	 * 
	 */	
	
	private static final long serialVersionUID = -5688303873036383910L;
	    
	private String EsEdicion;
	private String MensajeError;	
	private BigDecimal TotalVirtual;
	private String Existe;
	private BigDecimal FK_eIdAplicacion;
	private String Nombre_Aplicacion;
	private BigDecimal OptionSelected;
	private BigDecimal PK_eIdPerfil;
	private String cFlgActivo;
	private String cFlgEliminado;
	private BigDecimal eIdSesionIngresa;
	private BigDecimal eIdSesionModifica;
	private String uNombrePerfil;
	
	public String getEsEdicion() {
		return EsEdicion;
	}
	public void setEsEdicion(String esEdicion) {
		EsEdicion = esEdicion;
	}
	public String getMensajeError() {
		return MensajeError;
	}
	public void setMensajeError(String mensajeError) {
		MensajeError = mensajeError;
	}
	public BigDecimal getTotalVirtual() {
		return TotalVirtual;
	}
	public void setTotalVirtual(BigDecimal totalVirtual) {
		TotalVirtual = totalVirtual;
	}
	public String getExiste() {
		return Existe;
	}
	public void setExiste(String existe) {
		Existe = existe;
	}
	public BigDecimal getFK_eIdAplicacion() {
		return FK_eIdAplicacion;
	}
	public void setFK_eIdAplicacion(BigDecimal fK_eIdAplicacion) {
		FK_eIdAplicacion = fK_eIdAplicacion;
	}
	public String getNombre_Aplicacion() {
		return Nombre_Aplicacion;
	}
	public void setNombre_Aplicacion(String nombre_Aplicacion) {
		Nombre_Aplicacion = nombre_Aplicacion;
	}
	public BigDecimal getOptionSelected() {
		return OptionSelected;
	}
	public void setOptionSelected(BigDecimal optionSelected) {
		OptionSelected = optionSelected;
	}
	public BigDecimal getPK_eIdPerfil() {
		return PK_eIdPerfil;
	}
	public void setPK_eIdPerfil(BigDecimal pK_eIdPerfil) {
		PK_eIdPerfil = pK_eIdPerfil;
	}
	public String getcFlgActivo() {
		return cFlgActivo;
	}
	public void setcFlgActivo(String cFlgActivo) {
		this.cFlgActivo = cFlgActivo;
	}
	public String getcFlgEliminado() {
		return cFlgEliminado;
	}
	public void setcFlgEliminado(String cFlgEliminado) {
		this.cFlgEliminado = cFlgEliminado;
	}
	public BigDecimal geteIdSesionIngresa() {
		return eIdSesionIngresa;
	}
	public void seteIdSesionIngresa(BigDecimal eIdSesionIngresa) {
		this.eIdSesionIngresa = eIdSesionIngresa;
	}
	public BigDecimal geteIdSesionModifica() {
		return eIdSesionModifica;
	}
	public void seteIdSesionModifica(BigDecimal eIdSesionModifica) {
		this.eIdSesionModifica = eIdSesionModifica;
	}
	public String getuNombrePerfil() {
		return uNombrePerfil;
	}
	public void setuNombrePerfil(String uNombrePerfil) {
		this.uNombrePerfil = uNombrePerfil;
	}
	
	}
