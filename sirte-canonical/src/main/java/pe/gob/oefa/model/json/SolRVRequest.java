package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolRVRequest implements Serializable {

	private static final long serialVersionUID = -2171502850392441601L;
	private BigDecimal solRVId;
	private BigDecimal solicitudId;
	private BigDecimal reglaId;
	private BigDecimal tipoReglaId;
	private BigDecimal tipoPersonaId;
	private String catCodigoId;
	private String nombreRegla;
	private BigDecimal nivelEstudioId;
	private BigDecimal experiencia;
	private BigDecimal flgactivo;
	private BigDecimal flgcumple;

	private String catalogoId;
	private BigDecimal gradoAcademicoId;
	private Date fecExtension;
	private Date periodoIni;
	private Date periodoFin;	
	private BigDecimal solEquipoId;
	private BigDecimal equipoId;
	private String habilitado;

	public SolRVRequest() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSolRVId() {
		return solRVId;
	}

	public void setSolRVId(BigDecimal solRVId) {
		this.solRVId = solRVId;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public BigDecimal getReglaId() {
		return reglaId;
	}

	public void setReglaId(BigDecimal reglaId) {
		this.reglaId = reglaId;
	}

	public BigDecimal getTipoReglaId() {
		return tipoReglaId;
	}

	public void setTipoReglaId(BigDecimal tipoReglaId) {
		this.tipoReglaId = tipoReglaId;
	}

	public BigDecimal getTipoPersonaId() {
		return tipoPersonaId;
	}

	public void setTipoPersonaId(BigDecimal tipoPersonaId) {
		this.tipoPersonaId = tipoPersonaId;
	}

	public String getCatCodigoId() {
		return catCodigoId;
	}

	public void setCatCodigoId(String catCodigoId) {
		this.catCodigoId = catCodigoId;
	}

	public String getNombreRegla() {
		return nombreRegla;
	}

	public void setNombreRegla(String nombreRegla) {
		this.nombreRegla = nombreRegla;
	}

	public BigDecimal getNivelEstudioId() {
		return nivelEstudioId;
	}

	public void setNivelEstudioId(BigDecimal nivelEstudioId) {
		this.nivelEstudioId = nivelEstudioId;
	}

	public BigDecimal getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(BigDecimal experiencia) {
		this.experiencia = experiencia;
	}

	public BigDecimal getFlgactivo() {
		return flgactivo;
	}

	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}

	public BigDecimal getFlgcumple() {
		return flgcumple;
	}

	public void setFlgcumple(BigDecimal flgcumple) {
		this.flgcumple = flgcumple;
	}

	public String getCatalogoId() {
		return catalogoId;
	}

	public void setCatalogoId(String catalogoId) {
		this.catalogoId = catalogoId;
	}

	public BigDecimal getGradoAcademicoId() {
		return gradoAcademicoId;
	}

	public void setGradoAcademicoId(BigDecimal gradoAcademicoId) {
		this.gradoAcademicoId = gradoAcademicoId;
	}

	public Date getFecExtension() {
		return fecExtension;
	}

	public void setFecExtension(Date fecExtension) {
		this.fecExtension = fecExtension;
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

	public BigDecimal getSolEquipoId() {
		return solEquipoId;
	}

	public void setSolEquipoId(BigDecimal solEquipod) {
		this.solEquipoId = solEquipod;
	}

	public BigDecimal getEquipoId() {
		return equipoId;
	}

	public void setEquipoId(BigDecimal equipoId) {
		this.equipoId = equipoId;
	}

	public String getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	
}
