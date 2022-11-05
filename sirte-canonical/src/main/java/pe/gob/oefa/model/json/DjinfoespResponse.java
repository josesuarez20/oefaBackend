package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;



@JsonInclude(Include.NON_NULL)
public class DjinfoespResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -236953487304918103L;
	private String estado = "1";
	private BigDecimal djinfoespId;
	private String tipo;
	private String descripcion;
	private BigDecimal djinteresId;
	
	public BigDecimal getDjinfoespId() {
		return djinfoespId;
	}
	public void setDjinfoespId(BigDecimal djinfoespId) {
		this.djinfoespId = djinfoespId;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getDjinteresId() {
		return djinteresId;
	}
	public void setDjinteresId(BigDecimal djinteresId) {
		this.djinteresId = djinteresId;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
