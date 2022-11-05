package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;

import pe.gob.oefa.core.dto.BaseDTO;

public class SSTMarcaVacunaDTO extends BaseDTO {

	private static final long serialVersionUID = -5755883238715448589L;

	private BigDecimal idmarca;
	private String nombre;
	private String activo;

	public SSTMarcaVacunaDTO() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getIdmarca() {
		return idmarca;
	}

	public void setIdmarca(BigDecimal idmarca) {
		this.idmarca = idmarca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

}
