package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DjinfoespRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5367959560529838085L;
	private BigDecimal djinfoespId;
	private String tipo;
	private String descripcion;
	private String estado;
	private BigDecimal djinteresId;
	private Integer userId;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public BigDecimal getDjinteresId() {
		return djinteresId;
	}
	public void setDjinteresId(BigDecimal djinteresId) {
		this.djinteresId = djinteresId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
