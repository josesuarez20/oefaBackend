package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class InstitucionResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal institucionId;
	private String nombre;
	private String descripcion;
	private BigDecimal flgactivo;
	
	public InstitucionResponse() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getInstitucionId() {
		return institucionId;
	}
	public void setInstitucionId(BigDecimal institucionId) {
		this.institucionId = institucionId;
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
