package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EntregableEnvioDetRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal envio;
	private BigDecimal secuencia;
	private String arcenvio;

	public EntregableEnvioDetRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getEnvio() {
		return envio;
	}

	public void setEnvio(BigDecimal envio) {
		this.envio = envio;
	}

	public BigDecimal getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(BigDecimal secuencia) {
		this.secuencia = secuencia;
	}

	public String getArcenvio() {
		return arcenvio;
	}

	public void setArcenvio(String arcenvio) {
		this.arcenvio = arcenvio;
	}

}
