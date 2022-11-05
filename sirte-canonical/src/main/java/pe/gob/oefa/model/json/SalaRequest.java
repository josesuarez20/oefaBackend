package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include; 	
@JsonInclude(Include.NON_NULL)
public class SalaRequest extends BaseRequest implements Serializable {

	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 4983905824817818777L;
	private BigDecimal salaId;
	private String tipoSalaCodigo;
	private String tipoFlujoCodigo;
	private String nombre;
	private String descripcion;
	private Integer capacidad;
	private String tipoAprobacionCodigo;
	private String nombreEncargado;
	private String correoEncargado;
	private String usuarioEncargado;
	private String ubicacionCodigo;
	private String ubicacionNombre;
	private String areaCodigo;
	private String areaNombre;
	private String usuarioDni;
	private List<RecursoSalaRequest> recursos;
	private List<EncargadoSalaRequest> encargados;

	public SalaRequest() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuarioDni() {
		return usuarioDni;
	}

	public void setUsuarioDni(String usuarioDni) {
		this.usuarioDni = usuarioDni;
	}

	public BigDecimal getSalaId() {
		return salaId;
	}

	public void setSalaId(BigDecimal salaId) {
		this.salaId = salaId;
	}

	public String getTipoSalaCodigo() {
		return tipoSalaCodigo;
	}

	public void setTipoSalaCodigo(String tipoSalaCodigo) {
		this.tipoSalaCodigo = tipoSalaCodigo;
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

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipoAprobacionCodigo() {
		return tipoAprobacionCodigo;
	}

	public void setTipoAprobacionCodigo(String tipoAprobacionCodigo) {
		this.tipoAprobacionCodigo = tipoAprobacionCodigo;
	}

	public String getNombreEncargado() {
		return nombreEncargado;
	}

	public void setNombreEncargado(String nombreEncargado) {
		this.nombreEncargado = nombreEncargado;
	}

	public String getCorreoEncargado() {
		return correoEncargado;
	}

	public void setCorreoEncargado(String correoEncargado) {
		this.correoEncargado = correoEncargado;
	}

	public String getUsuarioEncargado() {
		return usuarioEncargado;
	}

	public void setUsuarioEncargado(String usuarioEncargado) {
		this.usuarioEncargado = usuarioEncargado;
	}

	public String getUbicacionCodigo() {
		return ubicacionCodigo;
	}

	public void setUbicacionCodigo(String ubicacionCodigo) {
		this.ubicacionCodigo = ubicacionCodigo;
	}

	public String getUbicacionNombre() {
		return ubicacionNombre;
	}

	public void setUbicacionNombre(String ubicacionNombre) {
		this.ubicacionNombre = ubicacionNombre;
	}

	public String getAreaCodigo() {
		return areaCodigo;
	}

	public void setAreaCodigo(String areaCodigo) {
		this.areaCodigo = areaCodigo;
	}

	public String getAreaNombre() {
		return areaNombre;
	}

	public void setAreaNombre(String areaNombre) {
		this.areaNombre = areaNombre;
	}

	public List<RecursoSalaRequest> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<RecursoSalaRequest> recursos) {
		this.recursos = recursos;
	}

	public List<EncargadoSalaRequest> getEncargados() {
		return encargados;
	}

	public void setEncargados(List<EncargadoSalaRequest> encargados) {
		this.encargados = encargados;
	}

	public String getTipoFlujoCodigo() {
		return tipoFlujoCodigo;
	}

	public void setTipoFlujoCodigo(String tipoFlujoCodigo) {
		this.tipoFlujoCodigo = tipoFlujoCodigo;
	}


}
