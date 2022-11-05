package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DjiempleoResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5590379308196001457L;
	private BigDecimal djiempleoId;
	private String ruc;
	private String nombre;
	private String cargo;
	private Date inicio;
	private Date fin;
	private Date creacion;
	private String estado;
	private BigDecimal djinteresId;
	private String tipo;
	private String lugar;
	private String naturaleza;
	private String parentesco;
	private String tidoc;
	private String sinicio;
	private String sfin;
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
	public Date getCreacion() {
		return creacion;
	}
	public void setCreacion(Date creacion) {
		this.creacion = creacion;
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
	public String getSinicio() {
		return sinicio;
	}
	public void setSinicio(String sinicio) {
		this.sinicio = sinicio;
	}
	public String getSfin() {
		return sfin;
	}
	public void setSfin(String sfin) {
		this.sfin = sfin;
	}
	
	
}
