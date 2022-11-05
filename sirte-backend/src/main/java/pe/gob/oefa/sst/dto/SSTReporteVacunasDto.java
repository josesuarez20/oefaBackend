package pe.gob.oefa.sst.dto;

import java.util.Date;

public class SSTReporteVacunasDto extends SSTReporteDto {

	private String area;
	private String persona;
	private String correo;
	private String usuario;
	private String primera_dosis;
	private Date fecha_primera_dosis;
	private String segunda_dosis;
	private Date fecha_segunda_dosis;
	private String tercera_dosis;
	private Date fecha_tercera_dosis;
	private String cuarta_dosis;
	private Date fecha_cuarta_dosis;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPrimera_dosis() {
		return primera_dosis;
	}

	public void setPrimera_dosis(String primera_dosis) {
		this.primera_dosis = primera_dosis;
	}

	public Date getFecha_primera_dosis() {
		return fecha_primera_dosis;
	}

	public void setFecha_primera_dosis(Date fecha_primera_dosis) {
		this.fecha_primera_dosis = fecha_primera_dosis;
	}

	public String getSegunda_dosis() {
		return segunda_dosis;
	}

	public void setSegunda_dosis(String segunda_dosis) {
		this.segunda_dosis = segunda_dosis;
	}

	public Date getFecha_segunda_dosis() {
		return fecha_segunda_dosis;
	}

	public void setFecha_segunda_dosis(Date fecha_segunda_dosis) {
		this.fecha_segunda_dosis = fecha_segunda_dosis;
	}

	public String getTercera_dosis() {
		return tercera_dosis;
	}

	public void setTercera_dosis(String tercera_dosis) {
		this.tercera_dosis = tercera_dosis;
	}

	public Date getFecha_tercera_dosis() {
		return fecha_tercera_dosis;
	}

	public void setFecha_tercera_dosis(Date fecha_tercera_dosis) {
		this.fecha_tercera_dosis = fecha_tercera_dosis;
	}

	public String getCuarta_dosis() {
		return cuarta_dosis;
	}

	public void setCuarta_dosis(String cuarta_dosis) {
		this.cuarta_dosis = cuarta_dosis;
	}

	public Date getFecha_cuarta_dosis() {
		return fecha_cuarta_dosis;
	}

	public void setFecha_cuarta_dosis(Date fecha_cuarta_dosis) {
		this.fecha_cuarta_dosis = fecha_cuarta_dosis;
	}

}
