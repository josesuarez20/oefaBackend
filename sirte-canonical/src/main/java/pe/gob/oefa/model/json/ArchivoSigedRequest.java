package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ArchivoSigedRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8273375014300220418L;

	private String nombre;
	private String uuidAlfresco;
	private int esPrincipal;

	public ArchivoSigedRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArchivoSigedRequest(String nombre, String uuidAlfresco, int esPrincipal) {
		super();
		this.nombre = nombre;
		this.uuidAlfresco = uuidAlfresco;
		this.esPrincipal = esPrincipal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUuidAlfresco() {
		return uuidAlfresco;
	}

	public void setUuidAlfresco(String uuidAlfresco) {
		this.uuidAlfresco = uuidAlfresco;
	}

	public int getEsPrincipal() {
		return esPrincipal;
	}

	public void setEsPrincipal(int esPrincipal) {
		this.esPrincipal = esPrincipal;
	}

}
