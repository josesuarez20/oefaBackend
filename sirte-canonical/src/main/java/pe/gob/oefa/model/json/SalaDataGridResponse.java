package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include; 	
@JsonInclude(Include.NON_NULL)
public class SalaDataGridResponse extends BaseRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2411463644707922885L;
	private BigDecimal salaId;
	private String nombre;
	private String descripcion;
	private String tipoSala;
	private BigDecimal capacidad;
	private String tipoAprobacion;
	private String ubicacion;
	private String area;
	private String ubicacionCodigo;
	private String areaCodigo;
	private String responsableSala;
	private String correoEncargado;

	public SalaDataGridResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSalaId() {
		return salaId;
	}

	public void setSalaId(BigDecimal salaId) {
		this.salaId = salaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}

	public BigDecimal getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(BigDecimal capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipoAprobacion() {
		return tipoAprobacion;
	}

	public void setTipoAprobacion(String tipoAprobacion) {
		this.tipoAprobacion = tipoAprobacion;
	}

	 

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getUbicacionCodigo() {
		return ubicacionCodigo;
	}

	public void setUbicacionCodigo(String ubicacionCodigo) {
		this.ubicacionCodigo = ubicacionCodigo;
	}

	public String getAreaCodigo() {
		return areaCodigo;
	}

	public void setAreaCodigo(String areaCodigo) {
		this.areaCodigo = areaCodigo;
	}

	public String getCorreoEncargado() {
		return correoEncargado;
	}

	public void setCorreoEncargado(String correoEncargado) {
		this.correoEncargado = correoEncargado;
	}

	public String getResponsableSala() {
		return responsableSala;
	}

	public void setResponsableSala(String responsableSala) {
		this.responsableSala = responsableSala;
	}
 
}
