package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolExperienciaGridResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solExperienciaId;
	private BigDecimal solicitudId;
	private String actividad;
	private String entidad;
	private String periodo; 
	private String tiempo;
	private String arcExperiencia;
	private BigDecimal flgactivo;
	private String habilitado;
	private BigDecimal flgControl;
	private String observacion;
	private String flgpide;
	private String tipoInstitucion;
	private String tipoEntidad;
	private String nroRuc;
	private String especialidadId;
	private String actividadId;
	private String materiaId;
	private String otramateria;
	private String otraactividad;
	private BigDecimal arc_observacion;
	
	public SolExperienciaGridResponse() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getFlgControl() {
		return flgControl;
	}
	public void setFlgControl(BigDecimal flgControl) {
		this.flgControl = flgControl;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	public BigDecimal getSolExperienciaId() {
		return solExperienciaId;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public String getEntidad() {
		return entidad;
	}
	public String getArcExperiencia() {
		return arcExperiencia;
	}
	public void setSolExperienciaId(BigDecimal solExperienciaId) {
		this.solExperienciaId = solExperienciaId;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public void setArcExperiencia(String arcExperiencia) {
		this.arcExperiencia = arcExperiencia;
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getFlgpide() {
		return flgpide;
	}
	public void setFlgpide(String flgpide) {
		this.flgpide = flgpide;
	}
	public String getTipoInstitucion() {
		return tipoInstitucion;
	}
	public void setTipoInstitucion(String tipoInstitucion) {
		this.tipoInstitucion = tipoInstitucion;
	}
	public String getTipoEntidad() {
		return tipoEntidad;
	}
	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}
	public String getNroRuc() {
		return nroRuc;
	}
	public void setNroRuc(String nroRuc) {
		this.nroRuc = nroRuc;
	}
	
	public String getEspecialidadId() {
		return especialidadId;
	}
	public void setEspecialidadId(String especialidadId) {
		this.especialidadId = especialidadId;
	}
	public String getMateriaId() {
		return materiaId;
	}
	public void setMateriaId(String materiaId) {
		this.materiaId = materiaId;
	}
	public String getOtramateria() {
		return otramateria;
	}
	public void setOtramateria(String otramateria) {
		this.otramateria = otramateria;
	}
	public String getOtraactividad() {
		return otraactividad;
	}
	public void setOtraactividad(String otraactividad) {
		this.otraactividad = otraactividad;
	}
	public String getActividadId() {
		return actividadId;
	}
	public void setActividadId(String actividadId) {
		this.actividadId = actividadId;
	}
	public BigDecimal getArc_observacion() {
		return arc_observacion;
	}
	public void setArc_observacion(BigDecimal arc_observacion) {
		this.arc_observacion = arc_observacion;
	}
	
}
