package pe.gob.oefa.dto.web;

import java.io.Serializable;

public class RespuestaErrorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 443012311103809705L;

	private String codigo;
	private String mensaje;

	public RespuestaErrorDTO() {
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
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje
	 *            the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
