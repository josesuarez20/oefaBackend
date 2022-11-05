package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProgramacionResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal secuencia;
	private String documento;
	private String documentoresponsable;
	private String codigovacuna;
	private String estado;
	private Date ultimafechamodif;
	private String ultimousuario;
	private String correosvacunas;
	// auxiliar
	private String descripcionvacuna;
	private BigDecimal dosis;
	private String frecuencia;
	private String frecuencianombre;
	private List<ProgramacionDetalleResponse> lstProgramacionDetalle;

	public ProgramacionResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(BigDecimal secuencia) {
		this.secuencia = secuencia;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDocumentoresponsable() {
		return documentoresponsable;
	}

	public void setDocumentoresponsable(String documentoresponsable) {
		this.documentoresponsable = documentoresponsable;
	}

	public String getCodigovacuna() {
		return codigovacuna;
	}

	public void setCodigovacuna(String codigovacuna) {
		this.codigovacuna = codigovacuna;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getUltimafechamodif() {
		return ultimafechamodif;
	}

	public void setUltimafechamodif(Date ultimafechamodif) {
		this.ultimafechamodif = ultimafechamodif;
	}

	public String getUltimousuario() {
		return ultimousuario;
	}

	public void setUltimousuario(String ultimousuario) {
		this.ultimousuario = ultimousuario;
	}

	public String getDescripcionvacuna() {
		return descripcionvacuna;
	}

	public void setDescripcionvacuna(String descripcionvacuna) {
		this.descripcionvacuna = descripcionvacuna;
	}

	public BigDecimal getDosis() {
		return dosis;
	}

	public void setDosis(BigDecimal dosis) {
		this.dosis = dosis;
	}

	public List<ProgramacionDetalleResponse> getLstProgramacionDetalle() {
		return lstProgramacionDetalle;
	}

	public void setLstProgramacionDetalle(List<ProgramacionDetalleResponse> lstProgramacionDetalle) {
		this.lstProgramacionDetalle = lstProgramacionDetalle;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getFrecuencianombre() {
		return frecuencianombre;
	}

	public void setFrecuencianombre(String frecuencianombre) {
		
		this.frecuencianombre = frecuencianombre;
	}

	public String getCorreosvacunas() {
		return correosvacunas;
	}

	public void setCorreosvacunas(String correosvacunas) {
		this.correosvacunas = correosvacunas;
	}

	
}
