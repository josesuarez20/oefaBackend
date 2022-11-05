package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EntregableHistorialResponse implements Serializable{
	
	private static final long serialVersionUID = 4409180811342073189L;
	private BigDecimal id;
	private String fechaEnvio;
	private String hojaTramite;
	private String esUltimo;
	private String expediente;
	
	public EntregableHistorialResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	public String getHojaTramite() {
		return hojaTramite;
	}
	public void setHojaTramite(String hojaTramite) {
		this.hojaTramite = hojaTramite;
	}
	public String getEsUltimo() {
		return esUltimo;
	}
	public void setEsUltimo(String esUltimo) {
		this.esUltimo = esUltimo;
	}
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	
	

}
