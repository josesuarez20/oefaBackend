package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class SedeResponse  extends BaseRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7020743606473189710L;
	private BigDecimal sedeId;
	private String codigo;
	private String nombre;
	private String descripcion;
	private String orden;
	
	public SedeResponse() {
	}

	public SedeResponse(BigDecimal sedeId, String codigo, String nombre, String descripcion, String orden) {
		super();
		this.sedeId = sedeId;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.orden = orden;
	}

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
