package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProgramacionDetalleRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal secuencia;
	private String documento;
	private String documentoresponsable;
	private String codigovacuna;
	private Date fechadosis;
	private String realizado;
	private BigDecimal numerodosis;
	private String uuid;
	private BigDecimal diaspreviosnotifica;
	private String estado;
	private Date ultimafechamodif;
	private String ultimousuario;
	private BigDecimal idmarcadosis;

	public ProgramacionDetalleRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(BigDecimal secuencia) {
		this.secuencia = secuencia;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDocumentoresponsable() {
		return documentoresponsable;
	}

	public void setDocumentoresponsable(String documentoresponsable) {
		this.documentoresponsable = documentoresponsable;
	}

	public String getCodigovacuna() {
		return codigovacuna;
	}

	public void setCodigovacuna(String codigovacuna) {
		this.codigovacuna = codigovacuna;
	}

	public Date getFechadosis() {
		return fechadosis;
	}

	public void setFechadosis(Date fechadosis) {
		this.fechadosis = fechadosis;
	}

	public String getRealizado() {
		return realizado;
	}

	public void setRealizado(String realizado) {
		this.realizado = realizado;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public BigDecimal getDiaspreviosnotifica() {
		return diaspreviosnotifica;
	}

	public void setDiaspreviosnotifica(BigDecimal diaspreviosnotifica) {
		this.diaspreviosnotifica = diaspreviosnotifica;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getUltimafechamodif() {
		return ultimafechamodif;
	}

	public void setUltimafechamodif(Date ultimafechamodif) {
		this.ultimafechamodif = ultimafechamodif;
	}

	public String getUltimousuario() {
		return ultimousuario;
	}

	public void setUltimousuario(String ultimousuario) {
		this.ultimousuario = ultimousuario;
	}

	public BigDecimal getNumerodosis() {
		return numerodosis;
	}

	public void setNumerodosis(BigDecimal numerodosis) {
		this.numerodosis = numerodosis;
	}

	public BigDecimal getIdmarcadosis() {
		return idmarcadosis;
	}

	public void setIdmarcadosis(BigDecimal idmarcadosis) {
		this.idmarcadosis = idmarcadosis;
	}

}
