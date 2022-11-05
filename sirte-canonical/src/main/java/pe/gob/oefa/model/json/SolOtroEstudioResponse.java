package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolOtroEstudioResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solOtroEstudioId;
	private BigDecimal solicitudId;
	private BigDecimal otroGradoId;
	private String nombre;
	private String institucion;
	private String lugar;
	private String periodoIni; 
	private String periodoFin;
	private String horas;
	private String arcOtroEstudio;
	private BigDecimal flgactivo;
	private BigDecimal flgControl;
	private String habilitado;
	private BigDecimal idtipoEntidad;
	private String tipoEntidad;
	private BigDecimal idtipoInstitucion;
	private BigDecimal arc_observacion;
	
	private String tipoInstitucion;
		private String nroRuc;

	
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
	public String getNroRuc() {
		return nroRuc;
	}
	public void setNroRuc(String nroRuc) {
		this.nroRuc = nroRuc;
	}
	
	public SolOtroEstudioResponse() {
		// TODO Auto-generated constructor stub
	}
	public String getPeriodoIni() {
		return periodoIni;
	}
	public void setPeriodoIni(String periodoIni) {
		this.periodoIni = periodoIni;
	}
	public String getPeriodoFin() {
		return periodoFin;
	}
	public void setPeriodoFin(String periodoFin) {
		this.periodoFin = periodoFin;
	}
	public BigDecimal getSolOtroEstudioId() {
		return solOtroEstudioId;
	}
	public BigDecimal getOtroGradoId() {
		return otroGradoId;
	}
	public String getNombre() {
		return nombre;
	}
	public String getInstitucion() {
		return institucion;
	}
	public String getLugar() {
		return lugar;
	}
	public String getHoras() {
		return horas;
	}
	public String getArcOtroEstudio() {
		return arcOtroEstudio;
	}
	public void setSolOtroEstudioId(BigDecimal solOtroEstudioId) {
		this.solOtroEstudioId = solOtroEstudioId;
	}
	public void setOtroGradoId(BigDecimal otroGradoId) {
		this.otroGradoId = otroGradoId;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	public void setArcOtroEstudio(String arcOtroEstudio) {
		this.arcOtroEstudio = arcOtroEstudio;
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
	public BigDecimal getArc_observacion() {
		return arc_observacion;
	}
	public void setArc_observacion(BigDecimal arc_observacion) {
		this.arc_observacion = arc_observacion;
	}
}
