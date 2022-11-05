package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SSTMarcaVacunaResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal idmarca;
	private String nombre;

	public SSTMarcaVacunaResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getIdmarca() {
		return idmarca;
	}

	public void setIdmarca(BigDecimal idmarca) {
		this.idmarca = idmarca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
