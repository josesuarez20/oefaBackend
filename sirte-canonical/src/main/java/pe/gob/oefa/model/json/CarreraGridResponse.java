package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CarreraGridResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal carreraId;
	private BigDecimal grupoCarreraId;
	private String grupoCarrera;
	private String nombre;
	private String descripcion;
	private BigDecimal flgacolegio;
	private BigDecimal flgactivo;

	public CarreraGridResponse() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getCarreraId() {
		return carreraId;
	}
	public BigDecimal getGrupoCarreraId() {
		return grupoCarreraId;
	}
	public String getGrupoCarrera() {
		return grupoCarrera;
	}
	public void setGrupoCarrera(String grupoCarrera) {
		this.grupoCarrera = grupoCarrera;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public BigDecimal getFlgacolegio() {
		return flgacolegio;
	}
	public void setCarreraId(BigDecimal carreraId) {
		this.carreraId = carreraId;
	}
	public void setGrupoCarreraId(BigDecimal grupoCarreraId) {
		this.grupoCarreraId = grupoCarreraId;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setFlgacolegio(BigDecimal flgacolegio) {
		this.flgacolegio = flgacolegio;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
}
