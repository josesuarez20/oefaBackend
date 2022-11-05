package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.gob.oefa.util.CustomDateTimeReporteSerializer;

@JsonInclude(Include.NON_NULL)
public class SolEstudioGridResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solEstudioId;
	private BigDecimal solicitudId;
	private BigDecimal gradoAcademicoId;
	private String gradoAcademico;
	private String carrera;
	private String institucion;
	private String lugar;
	private String periodo;
	private Date fecExtension;
	private String arcEstudio;
	private String habilitado;
	private BigDecimal flgControl;
	private BigDecimal flgactivo;
	private String observacion;

	private BigDecimal idtipoEntidad;
	private String tipoEntidad;
	private BigDecimal idtipoInstitucion;

	private String tipoInstitucion;
	private String nroRuc;
	private String flgTercio;

	private BigDecimal arc_observacion;
	
	public BigDecimal getIdtipoEntidad() {
		return idtipoEntidad;
	}

	public void setIdtipoEntidad(BigDecimal idtipoEntidad) {
		this.idtipoEntidad = idtipoEntidad;
	}

	public BigDecimal getIdtipoInstitucion() {
		return idtipoInstitucion;
	}

	public void setIdtipoInstitucion(BigDecimal idtipoInstitucion) {
		this.idtipoInstitucion = idtipoInstitucion;
	}

	public String getTipoEntidad() {
		return tipoEntidad;
	}

	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}

	public String getTipoInstitucion() {
		return tipoInstitucion;
	}

	public void setTipoInstitucion(String tipoInstitucion) {
		this.tipoInstitucion = tipoInstitucion;
	}

	public SolEstudioGridResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getFlgControl() {
		return flgControl;
	}

	public void setFlgControl(BigDecimal flgControl) {
		this.flgControl = flgControl;
	}

	public BigDecimal getFlgactivo() {
		return flgactivo;
	}

	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public String getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getNroRuc() {
		return nroRuc;
	}

	public void setNroRuc(String nroRuc) {
		this.nroRuc = nroRuc;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	@JsonSerialize(using = CustomDateTimeReporteSerializer.class)
	public Date getFecExtension() {
		return fecExtension;
	}

	public void setFecExtension(Date fecExtension) {
		this.fecExtension = fecExtension;
	}

	public String getArcEstudio() {
		return arcEstudio;
	}

	public void setArcEstudio(String arcEstudio) {
		this.arcEstudio = arcEstudio;
	}

	public BigDecimal getSolEstudioId() {
		return solEstudioId;
	}

	public void setSolEstudioId(BigDecimal solEstudioId) {
		this.solEstudioId = solEstudioId;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public BigDecimal getGradoAcademicoId() {
		return gradoAcademicoId;
	}

	public void setGradoAcademicoId(BigDecimal gradoAcademicoId) {
		this.gradoAcademicoId = gradoAcademicoId;
	}

	public String getFlgTercio() {
		return flgTercio;
	}

	public void setFlgTercio(String flgTercio) {
		this.flgTercio = flgTercio;
	}

	public BigDecimal getArc_observacion() {
		return arc_observacion;
	}

	public void setArc_observacion(BigDecimal arc_observacion) {
		this.arc_observacion = arc_observacion;
	}
	
}
