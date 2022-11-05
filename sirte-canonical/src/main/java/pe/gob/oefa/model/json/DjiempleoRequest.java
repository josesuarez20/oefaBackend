package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DjiempleoRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5684744006480529304L;

	private BigDecimal djiempleoId;
	private String ruc;
	private String nombre;
	private String cargo;
	private Date inicio;
	private Date fin;
	private String estado;
	private BigDecimal djinteresId;
	private Integer userId;
	private String tipo;
	private String lugar;
	private String naturaleza;
	private String parentesco;
	private String tidoc;
	public BigDecimal getDjiempleoId() {
		return djiempleoId;
	}
	public void setDjiempleoId(BigDecimal djiempleoId) {
		this.djiempleoId = djiempleoId;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getNaturaleza() {
		return naturaleza;
	}
	public void setNaturaleza(String naturaleza) {
		this.naturaleza = naturaleza;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getTidoc() {
		return tidoc;
	}
	public void setTidoc(String tidoc) {
		this.tidoc = tidoc;
	}
}
