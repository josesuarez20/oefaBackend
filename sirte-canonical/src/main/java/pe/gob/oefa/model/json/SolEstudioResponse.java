package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolEstudioResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solEstudioId;
	private BigDecimal solicitudId;
	private BigDecimal gradoAcademicoId;
	private BigDecimal carreraId;
	private BigDecimal flgpide;
	private BigDecimal colegioId;
	private BigDecimal flgactivo;
	private String institucion;
	private String lugar;
	private BigDecimal arcEstudio;
	private String nroRegistro;
	private BigDecimal arcColegio;
	private Date periodoIni; 
	private Date periodoFin;
	private Date fecExtension;
	private Date fecRegistro;
	private String carrera_sunedu;
	private String institucion_sunedu;
	private String fecha_sunedu;
	private String carrera;
	private String habilitado;
	private String tipoEntidad;
	
	private String tipoInstitucion;
	private String nroRuc;
	private String flgTercio;

	public String getTipoEntidad() {
		return tipoEntidad;
	}
	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}
	public String getTipoInstitucion() {
		return tipoInstitucion;
	}
	public void setTipoInstitucion(String tipoInstitucion) {
		this.tipoInstitucion = tipoInstitucion;
	}
	public String getNroRuc() {
		return nroRuc;
	}
	public void setNroRuc(String nroRuc) {
		this.nroRuc = nroRuc;
	}
	
	public SolEstudioResponse() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getSolEstudioId() {
		return solEstudioId;
	}
	public BigDecimal getGradoAcademicoId() {
		return gradoAcademicoId;
	}
	public Date getPeriodoIni() {
		return periodoIni;
	}
	public void setPeriodoIni(Date periodoIni) {
		this.periodoIni = periodoIni;
	}
	public Date getPeriodoFin() {
		return periodoFin;
	}
	public void setPeriodoFin(Date periodoFin) {
		this.periodoFin = periodoFin;
	}
	public BigDecimal getCarreraId() {
		return carreraId;
	}
	public BigDecimal getFlgpide() {
		return flgpide;
	}
	public BigDecimal getColegioId() {
		return colegioId;
	}
	public String getInstitucion() {
		return institucion;
	}
	public String getLugar() {
		return lugar;
	}
	public BigDecimal getArcEstudio() {
		return arcEstudio;
	}
	public String getNroRegistro() {
		return nroRegistro;
	}
	public BigDecimal getArcColegio() {
		return arcColegio;
	}
	public Date getFecExtension() {
		return fecExtension;
	}
	public Date getFecRegistro() {
		return fecRegistro;
	}
	public void setSolEstudioId(BigDecimal solEstudioId) {
		this.solEstudioId = solEstudioId;
	}
	public void setGradoAcademicoId(BigDecimal gradoAcademicoId) {
		this.gradoAcademicoId = gradoAcademicoId;
	}
	public void setCarreraId(BigDecimal carreraId) {
		this.carreraId = carreraId;
	}
	public void setFlgpide(BigDecimal flgpide) {
		this.flgpide = flgpide;
	}
	public void setColegioId(BigDecimal colegioId) {
		this.colegioId = colegioId;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public void setArcEstudio(BigDecimal arcEstudio) {
		this.arcEstudio = arcEstudio;
	}
	public void setNroRegistro(String nroRegistro) {
		this.nroRegistro = nroRegistro;
	}
	public void setArcColegio(BigDecimal arcColegio) {
		this.arcColegio = arcColegio;
	}
	public void setFecExtension(Date fecExtension) {
		this.fecExtension = fecExtension;
	}
	public void setFecRegistro(Date fecRegistro) {
		this.fecRegistro = fecRegistro;
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public BigDecimal getFlgactivo() {
		return flgactivo;
	}
	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}
	public String getCarrera_sunedu() {
		return carrera_sunedu;
	}
	public void setCarrera_sunedu(String carrera_sunedu) {
		this.carrera_sunedu = carrera_sunedu;
	}
	public String getInstitucion_sunedu() {
		return institucion_sunedu;
	}
	public void setInstitucion_sunedu(String institucion_sunedu) {
		this.institucion_sunedu = institucion_sunedu;
	}
	public String getFecha_sunedu() {
		return fecha_sunedu;
	}
	public void setFecha_sunedu(String fecha_sunedu) {
		this.fecha_sunedu = fecha_sunedu;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	public String getFlgTercio() {
		return flgTercio;
	}
	public void setFlgTercio(String flgTercio) {
		this.flgTercio = flgTercio;
	}
	
}
