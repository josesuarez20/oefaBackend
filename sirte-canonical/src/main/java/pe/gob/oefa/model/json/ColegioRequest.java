package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ColegioRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal colegioId;
	private String nombre;
	private String descripcion;
	private BigDecimal flgonline;
	private BigDecimal flgactivo;
	
	public ColegioRequest() {
		// TODO Auto-generated constructor stub
	}	
	public BigDecimal getColegioId() {
		return colegioId;
	}
	public BigDecimal getFlgonline() {
		return flgonline;
	}
	public void setColegioId(BigDecimal colegioId) {
		this.colegioId = colegioId;
	}
	public void setFlgonline(BigDecimal flgonline) {
		this.flgonline = flgonline;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
}
