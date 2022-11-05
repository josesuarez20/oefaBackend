package pe.gob.oefa.model.core;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseBase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -819889188656363491L;
	private String codigo;
	private String mensaje;
	
	public ResponseBase() {
		// TODO Auto-generated constructor stub
	}

	public ResponseBase(String codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
