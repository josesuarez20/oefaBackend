package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolOtroEstudioGridRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solOtroEstudioId;
	private BigDecimal solicitudId;
	private BigDecimal otroGradoId;
	private String otroGrado;
	private String nombre;
	private String institucion;
	private String lugar;
	private String periodo; 
	private String horas;
	private String arcOtroEstudio;
	private BigDecimal flgactivo;	
	private String tipoInstitucion;
	private String tipoEntidad;
	private String nroRuc;
	
				
	public String getTipoInstitucion() {
		return tipoInstitucion;
	}
	public void setTipoInstitucion(String tipoInstitucion) {
		this.tipoInstitucion = tipoInstitucion;
	}
	public String getTipoEntidad() {
		return tipoEntidad;
	}
	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}
	public String getNroRuc() {
		return nroRuc;
	}
	public void setNroRuc(String nroRuc) {
		this.nroRuc = nroRuc;
	}
	public SolOtroEstudioGridRequest() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public BigDecimal getSolOtroEstudioId() {
		return solOtroEstudioId;
	}
	public void setSolOtroEstudioId(BigDecimal solOtroEstudioId) {
		this.solOtroEstudioId = solOtroEstudioId;
	}
	public String getOtroGrado() {
		return otroGrado;
	}
	public void setOtroGrado(String otroGrado) {
		this.otroGrado = otroGrado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getHoras() {
		return horas;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	public String getArcOtroEstudio() {
		return arcOtroEstudio;
	}
	public void setArcOtroEstudio(String arcOtroEstudio) {
		this.arcOtroEstudio = arcOtroEstudio;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
	public BigDecimal getOtroGradoId() {
		return otroGradoId;
	}
	public void setOtroGradoId(BigDecimal otroGradoId) {
		this.otroGradoId = otroGradoId;
	}
	
}
