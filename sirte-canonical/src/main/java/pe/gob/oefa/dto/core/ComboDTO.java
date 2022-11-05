package pe.gob.oefa.dto.core;

import java.io.Serializable;

public class ComboDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1567000318340535533L;

	private Long id;
	private String codigo;
	private String nombre;
	private String valorcodigo1;
	private String valorcodigo2;

	public ComboDTO() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValorcodigo1() {
		if (valorcodigo1 == null) {
			valorcodigo1 = "0";
		}
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
