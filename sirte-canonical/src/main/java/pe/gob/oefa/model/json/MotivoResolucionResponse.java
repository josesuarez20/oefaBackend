package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MotivoResolucionResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private Integer sec;
	private BigDecimal motivoResolucionId;
	private String nombre;
	private String descripcion;
	private BigDecimal flgactivo;
	private BigDecimal flgsustento;
	private String correocopia;
	private Boolean seleccionado;
	public BigDecimal getMotivoResolucionId() {
		return motivoResolucionId;
	}
	public void setMotivoResolucionId(BigDecimal motivoResolucionId) {
		this.motivoResolucionId = motivoResolucionId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
	public BigDecimal getFlgsustento() {
		return flgsustento;
	}
	public void setFlgsustento(BigDecimal flgsustento) {
		this.flgsustento = flgsustento;
	}
	public String getCorreocopia() {
		return correocopia;
	}
	public void setCorreocopia(String correocopia) {
		this.correocopia = correocopia;
	}
	public Boolean getSeleccionado() {
		return seleccionado;
	}
	public void setSeleccionado(Boolean seleccionado) {
		this.seleccionado = seleccionado;
	}
	public Integer getSec() {
		return sec;
	}
	public void setSec(Integer sec) {
		this.sec = sec;
	}
}
