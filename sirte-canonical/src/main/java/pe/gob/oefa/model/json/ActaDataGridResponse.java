package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.gob.oefa.util.CustomDateSerializer;

@JsonInclude(Include.NON_NULL)
public class ActaDataGridResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal actaId;
	private BigDecimal reunionId;
	private String codigo;
	private String tipoContenido;
	private String tipoContenidoCodigo;
	private String sustento;
	private Date fechaCumplimiento;
	private String responsable;

	public ActaDataGridResponse() {
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipoContenido() {
		return tipoContenido;
	}

	public void setTipoContenido(String tipoContenido) {
		this.tipoContenido = tipoContenido;
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

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaCumplimiento() {
		return fechaCumplimiento;
	}

	public void setFechaCumplimiento(Date fechaCumplimiento) {
		this.fechaCumplimiento = fechaCumplimiento;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

}
