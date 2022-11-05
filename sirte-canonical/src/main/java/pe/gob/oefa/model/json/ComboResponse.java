package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

public class ComboResponse implements Serializable {

	private static final long serialVersionUID = 2243475940401676830L;
	private BigDecimal id;
	private String codigo;
	private String nombre;
	private String valorcodigo1;
	private String valorcodigo2;

	public ComboResponse() {
	}

	public ComboResponse(BigDecimal id, String codigo, String nombre) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public ComboResponse(BigDecimal id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public ComboResponse(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public ComboResponse(BigDecimal id, String codigo, String nombre, String valorcodigo1, String valorcodigo2) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.valorcodigo1 = valorcodigo1;
		this.valorcodigo2 = valorcodigo2;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
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

	public String getValorcodigo1() {
		return valorcodigo1;
	}

	public void setValorcodigo1(String valorcodigo1) {
		this.valorcodigo1 = valorcodigo1;
	}

	public String getValorcodigo2() {
		return valorcodigo2;
	}

	public void setValorcodigo2(String valorcodigo2) {
		this.valorcodigo2 = valorcodigo2;
	}
	
	
}
