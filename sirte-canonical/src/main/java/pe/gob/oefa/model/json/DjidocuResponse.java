package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DjidocuResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5782079441375619241L;
	private BigDecimal djidocuId;
	private String nombre;
	private String uid;
	private String estado;
	private BigDecimal djinteresId;
	private BigDecimal documentoId;
	private BigDecimal djiplantId;
	private String unid;
	private BigDecimal pdocumentoId;
	private String link;
	private Integer orden;
	public BigDecimal getDjiplantId() {
		return djiplantId;
	}
	public void setDjiplantId(BigDecimal djiplantId) {
		this.djiplantId = djiplantId;
	}
	public String getUnid() {
		return unid;
	}
	public void setUnid(String unid) {
		this.unid = unid;
	}
	public BigDecimal getPdocumentoId() {
		return pdocumentoId;
	}
	public void setPdocumentoId(BigDecimal pdocumentoId) {
		this.pdocumentoId = pdocumentoId;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Integer getOrden() {
		return orden;
	}
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	public BigDecimal getDjidocuId() {
		return djidocuId;
	}
	public void setDjidocuId(BigDecimal djidocuId) {
		this.djidocuId = djidocuId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public BigDecimal getDjinteresId() {
		return djinteresId;
	}
	public void setDjinteresId(BigDecimal djinteresId) {
		this.djinteresId = djinteresId;
	}
	public BigDecimal getDocumentoId() {
		return documentoId;
	}
	public void setDocumentoId(BigDecimal documentoId) {
		this.documentoId = documentoId;
	}

}
