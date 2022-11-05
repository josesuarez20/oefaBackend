package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolRepresentanteRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2171502850392441601L;
	private BigDecimal solRepId;
	private BigDecimal solicitudId;
	private BigDecimal tipoDocId;
	private String usuarioId;
	private String documento;
	private String nombres;
	private String ruc;
	private String libro;
	private String partida;
	private String zona;
	private BigDecimal flgactivo;
	
	public SolRepresentanteRequest() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
	public BigDecimal getSolRepId() {
		return solRepId;
	}
	public void setSolRepId(BigDecimal solRepId) {
		this.solRepId = solRepId;
	}
	public BigDecimal getTipoDocId() {
		return tipoDocId;
	}
	public void setTipoDocId(BigDecimal tipoDocId) {
		this.tipoDocId = tipoDocId;
	}
	public String getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) {
		this.libro = libro;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
}
