package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import pe.gob.oefa.core.dto.BaseDTO;

public class ProgramacionDTO extends BaseDTO {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal secuencia;
	private String documento;
	private String documentoresponsable;
	private String codigovacuna;
	private String estado;
	private Date ultimafechamodif;
	private String ultimousuario;

	// auxiliar
	private String descripcionvacuna;
	private BigDecimal dosis;
	private String frecuencia;
	private String frecuencianombre;
	private List<ProgramacionDetalleDTO> lstProgramacionDetalle;

	private String responsable;
	private Date fechadosis;
	private String correo;
	private String dependiente;
	private BigDecimal numerodosis;
	private String correosvacunas;
	private String nombres;

	public ProgramacionDTO() {
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

	public List<ProgramacionDetalleDTO> getLstProgramacionDetalle() {
		return lstProgramacionDetalle;
	}

	public void setLstProgramacionDetalle(List<ProgramacionDetalleDTO> lstProgramacionDetalle) {
		this.lstProgramacionDetalle = lstProgramacionDetalle;
	}

	public BigDecimal getDosis() {
		return dosis;
	}

	public void setDosis(BigDecimal dosis) {
		this.dosis = dosis;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getFrecuencianombre() {
		Double valor = 0.0;
		if (frecuencia != null) {
			valor = Double.parseDouble(frecuencia);
			if (valor >= 1) {
				frecuencianombre = "Cada " + valor.intValue() + " mes(es)";
			} else if (valor > 11) {
				valor = valor / 12;
				frecuencianombre = "Cada " + valor.intValue() + " año(s)";
			} else {
				valor = valor * 30;
				frecuencianombre = "Cada " + valor.intValue() + " día(s)";
			}
		}
		return frecuencianombre;
	}

	public void setFrecuencianombre(String frecuencianombre) {
		this.frecuencianombre = frecuencianombre;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Date getFechadosis() {
		return fechadosis;
	}

	public void setFechadosis(Date fechadosis) {
		this.fechadosis = fechadosis;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDependiente() {
		return dependiente;
	}

	public void setDependiente(String dependiente) {
		this.dependiente = dependiente;
	}

	public BigDecimal getNumerodosis() {
		return numerodosis;
	}

	public void setNumerodosis(BigDecimal numerodosis) {
		this.numerodosis = numerodosis;
	}

	public String getCorreosvacunas() {
		return correosvacunas;
	}

	public void setCorreosvacunas(String correosvacunas) {
		this.correosvacunas = correosvacunas;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

}
