package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.gob.oefa.util.CustomDateSerializer;

@JsonInclude(Include.NON_NULL)
public class ActaResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal actaId;
	private BigDecimal reunionId;
	private String tipoContenidoCodigo;
	private String sustento;
	private String responsable;
	private Date fechaCumplimiento;

	public ActaResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getActaId() {
		return actaId;
	}

	public void setActaId(BigDecimal actaId) {
		this.actaId = actaId;
	}

	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	public String getTipoContenidoCodigo() {
		return tipoContenidoCodigo;
	}

	public void setTipoContenidoCodigo(String tipoContenidoCodigo) {
		this.tipoContenidoCodigo = tipoContenidoCodigo;
	}

	public String getSustento() {
		return sustento;
	}

	public void setSustento(String sustento) {
		this.sustento = sustento;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaCumplimiento() {
		return fechaCumplimiento;
	}

	public void setFechaCumplimiento(Date fechaCumplimiento) {
		this.fechaCumplimiento = fechaCumplimiento;
	}

}
