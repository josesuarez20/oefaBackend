package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DjinteresRequest  implements Serializable {
	
	private static final long serialVersionUID = -8023462207223845698L;
	private BigDecimal djinteresId;
	private String pdeitem;
	private String pselanoord;
	private String idpsecodigo;
	private String iduejecod;
	private String psenroversion;
	private int usuario = 1;
	private Integer userId;
	
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
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPsenroversion() {
		return psenroversion;
	}
	public void setPsenroversion(String psenroversion) {
		this.psenroversion = psenroversion;
	}
	
}
