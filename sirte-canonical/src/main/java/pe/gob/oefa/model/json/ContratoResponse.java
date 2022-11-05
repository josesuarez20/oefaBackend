package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ContratoResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solicitudId;
	private String rucNatural;
	private String nombre;
	private String nombres;
	private String apellidopaterno;
	private String apellidomaterno;
	private String email;
	private String usuarioId;
	private String categorianivel;
	private BigDecimal codigsiga;
	private String nrocontrato;
	private Date fecini;
	private Date fecfin;
	private String fecinitexto;
	private String fecfintexto;
	private String oficina;
	private String oficinanombre;
	private String documento;
	private String oficinasiged;
	private String anio;
	private String ujecutora;
	private String itemcontrato;
	private String correlaitvocontrato;
	private String descripcioncontrato;

	private String estado;
	private BigDecimal contratosf;
	private BigDecimal contratocf;
	private String indvarprecio;
	
	private Date cdefecsus;//CDEFECSUS
	private BigDecimal arcmotivores;
	private BigDecimal idmotivores;
	private String idpsecodigo;
	
	public String getEstado() {
		return estado;
	}

	public BigDecimal getContratosf() {
		return contratosf;
	}

	public BigDecimal getContratocf() {
		return contratocf;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setContratosf(BigDecimal contratosf) {
		this.contratosf = contratosf;
	}

	public void setContratocf(BigDecimal contratocf) {
		this.contratocf = contratocf;
	}

	public ContratoResponse() {
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

	public String getOficinasiged() {
		return oficinasiged;
	}

	public void setOficinasiged(String oficinasiged) {
		this.oficinasiged = oficinasiged;
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

	public String getFecinitexto() {
		return fecinitexto;
	}

	public void setFecinitexto(String fecinitexto) {
		this.fecinitexto = fecinitexto;
	}

	public String getFecfintexto() {
		return fecfintexto;
	}

	public void setFecfintexto(String fecfintexto) {
		this.fecfintexto = fecfintexto;
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

	public String getDescripcioncontrato() {
		return descripcioncontrato;
	}

	public void setDescripcioncontrato(String descripcioncontrato) {
		this.descripcioncontrato = descripcioncontrato;
	}

	public String getIndvarprecio() {
		return indvarprecio;
	}

	public void setIndvarprecio(String indvarprecio) {
		this.indvarprecio = indvarprecio;
	}

	public Date getCdefecsus() {
		return cdefecsus;
	}

	public void setCdefecsus(Date cdefecsus) {
		this.cdefecsus = cdefecsus;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRucNatural() {
		return rucNatural;
	}

	public void setRucNatural(String rucNatural) {
		this.rucNatural = rucNatural;
	}

	public BigDecimal getArcmotivores() {
		return arcmotivores;
	}

	public void setArcmotivores(BigDecimal arcmotivores) {
		this.arcmotivores = arcmotivores;
	}

	public BigDecimal getIdmotivores() {
		return idmotivores;
	}

	public void setIdmotivores(BigDecimal idmotivores) {
		this.idmotivores = idmotivores;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getIdpsecodigo() {
		return idpsecodigo;
	}

	public void setIdpsecodigo(String idpsecodigo) {
		this.idpsecodigo = idpsecodigo;
	}
	
}
