package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PruebaDescarteResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal secuencia;
	private String documento;
	private String documentoresponsable;
	private String codigovacuna;
	private Date fechaprueba;
	private String realizado;
	private String resultado;
	private String uuid;
	private Date vigenciahasta;
	private String estado;
	private Date ultimafechamodif;
	private String ultimousuario;
	private String nombres;
	private String descripcionvacuna;
	
	public PruebaDescarteResponse() {
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

	public Date getFechaprueba() {
		return fechaprueba;
	}

	public void setFechaprueba(Date fechaprueba) {
		this.fechaprueba = fechaprueba;
	}

	public String getRealizado() {
		return realizado;
	}

	public void setRealizado(String realizado) {
		this.realizado = realizado;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getVigenciahasta() {
		return vigenciahasta;
	}

	public void setVigenciahasta(Date vigenciahasta) {
		this.vigenciahasta = vigenciahasta;
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

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDescripcionvacuna() {
		return descripcionvacuna;
	}

	public void setDescripcionvacuna(String descripcionvacuna) {
		this.descripcionvacuna = descripcionvacuna;
	}
	
}
