package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include; 	
@JsonInclude(Include.NON_NULL)

public class CreaExpedienteSigedResponse extends BaseRequest  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1117174376466010426L;
	private String estado;
	private String mensaje;	
	private String idExpediente;
	private String 	numeroExpediente;		
	
	public CreaExpedienteSigedResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(String idExpediente) {
		this.idExpediente = idExpediente;
	}

	public String getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	

	
}
