package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
public class SedeRequest extends BaseRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7020743606473189710L;
	private BigDecimal sedeId;
	private String codigo;
	private String nombre;
	private String descripcion;
	private String orden;

	public BigDecimal getSedeId() {
		return sedeId;
	}

	public void setSedeId(BigDecimal sedeId) {
		this.sedeId = sedeId;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

}
