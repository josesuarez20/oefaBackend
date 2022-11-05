package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EntregableEnvioResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solicitudId;
	private String usuarioId;
	private Date fecha;
	private String nrocontrato;
	private String nroentregable;
	private BigDecimal envio;
	private BigDecimal secuencia;
	private String fechatexto;

	// documentos
	private List<EntregableResponse> documentosreg;

	public EntregableEnvioResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNrocontrato() {
		return nrocontrato;
	}

	public void setNrocontrato(String nrocontrato) {
		this.nrocontrato = nrocontrato;
	}

	public String getNroentregable() {
		return nroentregable;
	}

	public void setNroentregable(String nroentregable) {
		this.nroentregable = nroentregable;
	}

	public BigDecimal getEnvio() {
		return envio;
	}

	public void setEnvio(BigDecimal envio) {
		this.envio = envio;
	}

	public List<EntregableResponse> getDocumentosreg() {
		return documentosreg;
	}

	public void setDocumentosreg(List<EntregableResponse> documentosreg) {
		this.documentosreg = documentosreg;
	}

	public BigDecimal getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(BigDecimal secuencia) {
		this.secuencia = secuencia;
	}

	public String getFechatexto() {
		return fechatexto;
	}

	public void setFechatexto(String fechatexto) {
		this.fechatexto = fechatexto;
	}
	
}
