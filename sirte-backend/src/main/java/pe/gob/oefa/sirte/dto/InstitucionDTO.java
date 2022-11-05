package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;

import pe.gob.oefa.core.dto.BaseDTO;

public class InstitucionDTO extends BaseDTO {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal institucionId;
	private String nombre;
	private String descripcion;
	private BigDecimal flgactivo;
	
	public InstitucionDTO() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getInstitucionId() {
		return institucionId;
	}
	public void setInstitucionId(BigDecimal institucionId) {
		this.institucionId = institucionId;
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
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
}
