package pe.gob.oefa.sirte.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmoDTORequest {
	private Integer id;
	private String dni;
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")

    private Date fechaRegistro;
	private Integer sede;
	private Integer aptitudMedico;
	private Integer tipoEmo;
	private Integer anexo;
	private Integer interconsulta;
	private String recomendaciones;
	private String restricciones;
	private Date fechaCreacion;
	private String usuarioCreacion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Integer getSede() {
		return sede;
	}
	public void setSede(Integer sede) {
		this.sede = sede;
	}
	public Integer getAptitudMedico() {
		return aptitudMedico;
	}
	public void setAptitudMedico(Integer aptitudMedico) {
		this.aptitudMedico = aptitudMedico;
	}
	public Integer getTipoEmo() {
		return tipoEmo;
	}
	public void setTipoEmo(Integer tipoEmo) {
		this.tipoEmo = tipoEmo;
	}
	public Integer getAnexo() {
		return anexo;
	}
	public void setAnexo(Integer anexo) {
		this.anexo = anexo;
	}
	public Integer getInterconsulta() {
		return interconsulta;
	}
	public void setInterconsulta(Integer interconsulta) {
		this.interconsulta = interconsulta;
	}
	public String getRecomendaciones() {
		return recomendaciones;
	}
	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	public String getRestricciones() {
		return restricciones;
	}
	public void setRestricciones(String restricciones) {
		this.restricciones = restricciones;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}


}
