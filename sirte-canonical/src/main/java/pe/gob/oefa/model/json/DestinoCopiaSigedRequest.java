package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DestinoCopiaSigedRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6706992344065452420L;
	
	private BigDecimal	idArea; 
	

	public DestinoCopiaSigedRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public BigDecimal getIdArea() {
		return idArea;
	}

	public void setIdArea(BigDecimal idArea) {
		this.idArea = idArea;
	}
	
}
