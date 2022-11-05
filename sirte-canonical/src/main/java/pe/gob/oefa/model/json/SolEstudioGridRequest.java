package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolEstudioGridRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solEstudioId;
	private BigDecimal solicitudId;
	private String gradoAcademico;
	private String carrera;
	private String institucion;
	private String lugar;
	private String periodo;
	private Date fecExtension;
	private String arcEstudio;
				
	public SolEstudioGridRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSolEstudioId() {
		return solEstudioId;
	}

	public void setSolEstudioId(BigDecimal solEstudioId) {
		this.solEstudioId = solEstudioId;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
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

	public Date getFecExtension() {
		return fecExtension;
	}

	public void setFecExtension(Date fecExtension) {
		this.fecExtension = fecExtension;
	}

	public String getArcEstudio() {
		return arcEstudio;
	}

	public void setArcEstudio(String arcEstudio) {
		this.arcEstudio = arcEstudio;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	
}
