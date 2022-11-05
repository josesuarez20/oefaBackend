package pe.gob.oefa.model.json;

import java.math.BigDecimal;

public class EncargadoSalaRequest extends BaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8284164000105643534L;
	private BigDecimal encargadoSalaId;
	private BigDecimal salaId;
	private String codigo;
	private String nombre;
	private String correo;

	public EncargadoSalaRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getEncargadoSalaId() {
		return encargadoSalaId;
	}

	public void setEncargadoSalaId(BigDecimal encargadoSalaId) {
		this.encargadoSalaId = encargadoSalaId;
	}

	public BigDecimal getSalaId() {
		return salaId;
	}

	public void setSalaId(BigDecimal salaId) {
		this.salaId = salaId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
