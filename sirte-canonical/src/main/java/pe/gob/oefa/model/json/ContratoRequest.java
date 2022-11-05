package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ContratoRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solicitudId;
	private String rucNatural;
	private String nombres;
	private String apellidopaterno;
	private String apellidomaterno;
	private String email;
	private String categorianivel;
	private BigDecimal codigsiga;
	private String nrocontrato;
	private Date fecini;
	private Date fecfin;
	private String oficina;
	private String oficinanombre;

	private String documento;
	private String anio;
	private String ujecutora;
	private String itemcontrato;
	private String correlaitvocontrato;
	private String idpsecodigo;

	public ContratoRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidopaterno() {
		return apellidopaterno;
	}

	public void setApellidopaterno(String apellidopaterno) {
		this.apellidopaterno = apellidopaterno;
	}

	public String getApellidomaterno() {
		return apellidomaterno;
	}

	public void setApellidomaterno(String apellidomaterno) {
		this.apellidomaterno = apellidomaterno;
	}

	public String getCategorianivel() {
		return categorianivel;
	}

	public void setCategorianivel(String categorianivel) {
		this.categorianivel = categorianivel;
	}

	public BigDecimal getCodigsiga() {
		return codigsiga;
	}

	public void setCodigsiga(BigDecimal codigsiga) {
		this.codigsiga = codigsiga;
	}

	public String getNrocontrato() {
		return nrocontrato;
	}

	public void setNrocontrato(String nrocontrato) {
		this.nrocontrato = nrocontrato;
	}

	public Date getFecini() {
		return fecini;
	}

	public void setFecini(Date fecini) {
		this.fecini = fecini;
	}

	public Date getFecfin() {
		return fecfin;
	}

	public void setFecfin(Date fecfin) {
		this.fecfin = fecfin;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String getOficinanombre() {
		return oficinanombre;
	}

	public void setOficinanombre(String oficinanombre) {
		this.oficinanombre = oficinanombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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

	public String getCorrelaitvocontrato() {
		return correlaitvocontrato;
	}

	public void setCorrelaitvocontrato(String correlaitvocontrato) {
		this.correlaitvocontrato = correlaitvocontrato;
	}

	public String getRucNatural() {
		return rucNatural;
	}

	public void setRucNatural(String rucNatural) {
		this.rucNatural = rucNatural;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdpsecodigo() {
		return idpsecodigo;
	}

	public void setIdpsecodigo(String idpsecodigo) {
		this.idpsecodigo = idpsecodigo;
	}
}
