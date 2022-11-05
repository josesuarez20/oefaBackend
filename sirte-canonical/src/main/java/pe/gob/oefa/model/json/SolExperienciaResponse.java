package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolExperienciaResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solExperienciaId;
	private BigDecimal solicitudId;
	private String actividadId;
	private BigDecimal flgactivo;
	private String entidad;
	private String arcExperiencia;
	private String descripcion;
	private Date periodoIni; 
	private Date periodoFin;
	private BigDecimal flgControl;
	private String habilitado;
	private String flgpide;
	private String tipoInstitucion;
	private String tipoEntidad;
	private String nroRuc;
	private String especialidadId;
	private String materiaId;
	private String otramateria;
	private String otraactividad;
	private BigDecimal arc_observacion;
			
	public SolExperienciaResponse() {
		// TODO Auto-generated constructor stub
	}
	public String getActividadId() {
		return actividadId;
	}
	public void setActividadId(String actividadId) {
		this.actividadId = actividadId;
	}
	public String getEntidad() {
		return entidad;
	}
	public String getArcExperiencia() {
		return arcExperiencia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public void setArcExperiencia(String arcExperiencia) {
		this.arcExperiencia = arcExperiencia;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getPeriodoIni() {
		return periodoIni;
	}
	public void setPeriodoIni(Date periodoIni) {
		this.periodoIni = periodoIni;
	}
	public Date getPeriodoFin() {
		return periodoFin;
	}
	public void setPeriodoFin(Date periodoFin) {
		this.periodoFin = periodoFin;
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public BigDecimal getSolExperienciaId() {
		return solExperienciaId;
	}
	public void setSolExperienciaId(BigDecimal solExperienciaId) {
		this.solExperienciaId = solExperienciaId;
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
	public BigDecimal getArc_observacion() {
		return arc_observacion;
	}
	public void setArc_observacion(BigDecimal arc_observacion) {
		this.arc_observacion = arc_observacion;
	}
	
}
