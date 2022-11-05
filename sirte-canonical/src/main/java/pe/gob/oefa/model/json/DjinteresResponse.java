package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DjinteresResponse implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -6084791450186354069L;
	private BigDecimal djinteresId;
	private String pdeitem;
	private String pselanoord;
	private String idpsecodigo;
	private String iduejecod;
	private String declaro;
	private Date envio;
	private String estado;
	public BigDecimal getDjinteresId() {
		return djinteresId;
	}
	public void setDjinteresId(BigDecimal djinteresId) {
		this.djinteresId = djinteresId;
	}
	public String getPdeitem() {
		return pdeitem;
	}
	public void setPdeitem(String pdeitem) {
		this.pdeitem = pdeitem;
	}
	public String getPselanoord() {
		return pselanoord;
	}
	public void setPselanoord(String pselanoord) {
		this.pselanoord = pselanoord;
	}
	public String getIdpsecodigo() {
		return idpsecodigo;
	}
	public void setIdpsecodigo(String idpsecodigo) {
		this.idpsecodigo = idpsecodigo;
	}
	public String getIduejecod() {
		return iduejecod;
	}
	public void setIduejecod(String iduejecod) {
		this.iduejecod = iduejecod;
	}
	public String getDeclaro() {
		return declaro;
	}
	public void setDeclaro(String declaro) {
		this.declaro = declaro;
	}
	public Date getEnvio() {
		return envio;
	}
	public void setEnvio(Date envio) {
		this.envio = envio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
