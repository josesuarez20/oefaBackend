package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EstadoSolRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal estadoSolId;
	private String nombre;

	public EstadoSolRequest() {
		// TODO Auto-generated constructor stub
	}	
	public BigDecimal getEstadoSolId() {
		return estadoSolId;
	}
	public void setEstadoSolId(BigDecimal estadoSolId) {
		this.estadoSolId = estadoSolId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
