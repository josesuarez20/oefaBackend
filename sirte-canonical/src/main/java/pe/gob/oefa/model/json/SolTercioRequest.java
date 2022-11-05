package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolTercioRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solTercioId;
	private BigDecimal solicitudId;
	private String institucion;
	private String especialidad;
	private String arcTercio;
	private BigDecimal flgactivo;
	private String habilitado;	
				
	public SolTercioRequest() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getSolTercioId() {
		return solTercioId;
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
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
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	
	
}
