package pe.gob.oefa.sirte.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class OpcionesPorUsuarioSSODTO implements Serializable{
	
	/**
	 * 
	 */	
	
	private static final long serialVersionUID = -5688303873036383910L;
	    
	private String EsEdicion;
	private String MensajeError;
	private BigDecimal TotalVirtual;
	private String Accion;
	private String Area;
	private String Controladora;
	private BigDecimal FK_eIdAplicacion;
	private String NombreGrupo;
	private BigDecimal OptionSelected;
	private BigDecimal PK_eIdOpcion;
	private BigDecimal PerfilOpcionID;
	private Boolean cEsVisible;
	private String cFlgActivo;
	private String cFlgEliminado;
	private BigDecimal eIdGrupoOpcion;
	private BigDecimal eIdSesionIngresa;
	private BigDecimal eIdSesionModifica;
	private BigDecimal eNroOrden;
	private String uDireccionOpcion;
	private String uNombreOpcion;
	private String uTituloOpcion;
	private String uUrl;
	
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
	public String getAccion() {
		return Accion;
	}
	public void setAccion(String accion) {
		Accion = accion;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getControladora() {
		return Controladora;
	}
	public void setControladora(String controladora) {
		Controladora = controladora;
	}
	public BigDecimal getFK_eIdAplicacion() {
		return FK_eIdAplicacion;
	}
	public void setFK_eIdAplicacion(BigDecimal fK_eIdAplicacion) {
		FK_eIdAplicacion = fK_eIdAplicacion;
	}
	public String getNombreGrupo() {
		return NombreGrupo;
	}
	public void setNombreGrupo(String nombreGrupo) {
		NombreGrupo = nombreGrupo;
	}
	public BigDecimal getOptionSelected() {
		return OptionSelected;
	}
	public void setOptionSelected(BigDecimal optionSelected) {
		OptionSelected = optionSelected;
	}
	public BigDecimal getPK_eIdOpcion() {
		return PK_eIdOpcion;
	}
	public void setPK_eIdOpcion(BigDecimal pK_eIdOpcion) {
		PK_eIdOpcion = pK_eIdOpcion;
	}
	public BigDecimal getPerfilOpcionID() {
		return PerfilOpcionID;
	}
	public void setPerfilOpcionID(BigDecimal perfilOpcionID) {
		PerfilOpcionID = perfilOpcionID;
	}
	
	public Boolean getcEsVisible() {
		return cEsVisible;
	}
	public void setcEsVisible(Boolean cEsVisible) {
		this.cEsVisible = cEsVisible;
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
	public BigDecimal geteIdGrupoOpcion() {
		return eIdGrupoOpcion;
	}
	public void seteIdGrupoOpcion(BigDecimal eIdGrupoOpcion) {
		this.eIdGrupoOpcion = eIdGrupoOpcion;
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
	public BigDecimal geteNroOrden() {
		return eNroOrden;
	}
	public void seteNroOrden(BigDecimal eNroOrden) {
		this.eNroOrden = eNroOrden;
	}
	public String getuDireccionOpcion() {
		return uDireccionOpcion;
	}
	public void setuDireccionOpcion(String uDireccionOpcion) {
		this.uDireccionOpcion = uDireccionOpcion;
	}
	public String getuNombreOpcion() {
		return uNombreOpcion;
	}
	public void setuNombreOpcion(String uNombreOpcion) {
		this.uNombreOpcion = uNombreOpcion;
	}
	public String getuTituloOpcion() {
		return uTituloOpcion;
	}
	public void setuTituloOpcion(String uTituloOpcion) {
		this.uTituloOpcion = uTituloOpcion;
	}
	public String getuUrl() {
		return uUrl;
	}
	public void setuUrl(String uUrl) {
		this.uUrl = uUrl;
	}
	
	
	
}
