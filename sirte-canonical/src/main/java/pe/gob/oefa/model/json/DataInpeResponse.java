package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DataInpeResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
    
	private String rpta;
	private BigDecimal id;

	public DataInpeResponse() {
		// TODO Auto-generated constructor stub
	}
	public String getRpta() {
		return rpta;
	}
	public void setRpta(String rpta) {
		this.rpta = rpta;
	}
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}

}
