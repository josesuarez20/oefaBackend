package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DataPersonaResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
    
	private String apPrimer;
    private String apSegundo;
    private String direccion;
    private String estadoCivil;
    private byte[] foto;
    private String prenombres;
    private String restriccion;
    private String ubigeo;
    private String tipoDoc;
    private String tipoPer;
    private String dni;
    private String correo;

	public DataPersonaResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getTipoPer() {
		return tipoPer;
	}

	public void setTipoPer(String tipoPer) {
		this.tipoPer = tipoPer;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApPrimer() {
		return apPrimer;
	}

	public void setApPrimer(String apPrimer) {
		this.apPrimer = apPrimer;
	}

	public String getApSegundo() {
		return apSegundo;
	}

	public void setApSegundo(String apSegundo) {
		this.apSegundo = apSegundo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getPrenombres() {
		return prenombres;
	}

	public void setPrenombres(String prenombres) {
		this.prenombres = prenombres;
	}

	public String getRestriccion() {
		return restriccion;
	}

	public void setRestriccion(String restriccion) {
		this.restriccion = restriccion;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
