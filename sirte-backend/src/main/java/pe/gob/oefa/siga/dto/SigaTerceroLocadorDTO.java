package pe.gob.oefa.siga.dto;

import java.math.BigDecimal;
import java.util.Date;

import pe.gob.oefa.core.dto.BaseDTO;

public class SigaTerceroLocadorDTO extends BaseDTO {

	private static final long serialVersionUID = -5755883238715448589L;

	private String dni;
	private String ruc;
	private String nombrecompleto;
	private String oficina;
	private String nroordencontrato;
	private String contratodescripcion;
	private Date fechadesde;
	private Date fechahasta;

	private String idanoproc;
	private String iduejecod;
	private String idppicodigo;
	private String flgVigente;
	private BigDecimal idareasia;
	private String nombreareasia;

	public SigaTerceroLocadorDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNombrecompleto() {
		return nombrecompleto;
	}

	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String getNroordencontrato() {
		return nroordencontrato;
	}

	public void setNroordencontrato(String nroordencontrato) {
		this.nroordencontrato = nroordencontrato;
	}

	public String getContratodescripcion() {
		return contratodescripcion;
	}

	public void setContratodescripcion(String contratodescripcion) {
		this.contratodescripcion = contratodescripcion;
	}

	public Date getFechadesde() {
		return fechadesde;
	}

	public void setFechadesde(Date fechadesde) {
		this.fechadesde = fechadesde;
	}

	public Date getFechahasta() {
		return fechahasta;
	}

	public void setFechahasta(Date fechahasta) {
		this.fechahasta = fechahasta;
	}

	public String getIdanoproc() {
		return idanoproc;
	}

	public void setIdanoproc(String idanoproc) {
		this.idanoproc = idanoproc;
	}

	public String getIduejecod() {
		return iduejecod;
	}

	public void setIduejecod(String iduejecod) {
		this.iduejecod = iduejecod;
	}

	public String getIdppicodigo() {
		return idppicodigo;
	}

	public void setIdppicodigo(String idppicodigo) {
		this.idppicodigo = idppicodigo;
	}

	public String getFlgVigente() {
		return flgVigente;
	}

	public void setFlgVigente(String flgVigente) {
		this.flgVigente = flgVigente;
	}

	public BigDecimal getIdareasia() {
		return idareasia;
	}

	public void setIdareasia(BigDecimal idareasia) {
		this.idareasia = idareasia;
	}

	public String getNombreareasia() {
		return nombreareasia;
	}

	public void setNombreareasia(String nombreareasia) {
		this.nombreareasia = nombreareasia;
	}

}
