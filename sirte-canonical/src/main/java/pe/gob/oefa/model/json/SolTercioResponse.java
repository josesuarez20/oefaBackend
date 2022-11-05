package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolTercioResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solTercioId;
	private BigDecimal solicitudId;
	private BigDecimal institucionId;	
	private String institucion;
	private BigDecimal especialidadId;
	private String especialidad;
	private String arcTercio;
	private BigDecimal flgactivo;
	private String habilitado;
	private BigDecimal flgControl;
	private String observacion;
	private BigDecimal arc_observacion;
	
	public SolTercioResponse() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getFlgControl() {
		return flgControl;
	}
	public void setFlgControl(BigDecimal flgControl) {
		this.flgControl = flgControl;
	}
	public BigDecimal getSolTercioId() {
		return solTercioId;
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	public String getInstitucion() {
		return institucion;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public String getArcTercio() {
		return arcTercio;
	}
	public void setSolTercioId(BigDecimal solTercioId) {
		this.solTercioId = solTercioId;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public void setArcTercio(String arcTercio) {
		this.arcTercio = arcTercio;
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
	
	public BigDecimal getInstitucionId() {
		return institucionId;
	}
	public void setInstitucionId(BigDecimal institucionId) {
		this.institucionId = institucionId;
	}
	public BigDecimal getEspecialidadId() {
		return especialidadId;
	}
	public void setEspecialidadId(BigDecimal especialidadId) {
		this.especialidadId = especialidadId;
	}
	public BigDecimal getArc_observacion() {
		return arc_observacion;
	}
	public void setArc_observacion(BigDecimal arc_observacion) {
		this.arc_observacion = arc_observacion;
	}
	
}
