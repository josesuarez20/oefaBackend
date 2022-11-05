package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ContratoResolucionResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8072136130164612104L;
	private BigDecimal resolucionId;
	private BigDecimal motivoResolucionId;

	private BigDecimal codigsiga;
	private String anio;
	private String ujecutora;
	private String itemcontrato;
	private String documento;

	private BigDecimal arcMotivores;

	public BigDecimal getResolucionId() {
		return resolucionId;
	}

	public void setResolucionId(BigDecimal resolucionId) {
		this.resolucionId = resolucionId;
	}

	public BigDecimal getMotivoResolucionId() {
		return motivoResolucionId;
	}

	public void setMotivoResolucionId(BigDecimal motivoResolucionId) {
		this.motivoResolucionId = motivoResolucionId;
	}

	public BigDecimal getCodigsiga() {
		return codigsiga;
	}

	public void setCodigsiga(BigDecimal codigsiga) {
		this.codigsiga = codigsiga;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getUjecutora() {
		return ujecutora;
	}

	public void setUjecutora(String ujecutora) {
		this.ujecutora = ujecutora;
	}

	public String getItemcontrato() {
		return itemcontrato;
	}

	public void setItemcontrato(String itemcontrato) {
		this.itemcontrato = itemcontrato;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public BigDecimal getArcMotivores() {
		return arcMotivores;
	}

	public void setArcMotivores(BigDecimal arcMotivores) {
		this.arcMotivores = arcMotivores;
	}
	
}
