package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DependienteCorreoRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal secuencia;
	private String documento;
	private String documentoresponsable;
	private String tipo;
	private String correosvacunas;
	private String estado;
	private Date ultimafechamodif;
	private String ultimousuario;
	
	public DependienteCorreoRequest() {
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


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDocumentoresponsable(String documentoresponsable) {
		this.documentoresponsable = documentoresponsable;
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

	public String getCorreosvacunas() {
		return correosvacunas;
	}

	public void setCorreosvacunas(String correosvacunas) {
		this.correosvacunas = correosvacunas;
	}
	
}
