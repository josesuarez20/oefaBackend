package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolAntecedenteRequest implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal solAntecedenteId;
	private BigDecimal tipoId;
	private BigDecimal idPJ;
	private BigDecimal idInpe;
	private BigDecimal flgactivo;
	private BigDecimal flgtiene;
	private BigDecimal solicitudId;
	private String arcAntecedentes;
	private String arcPenales;
	private String arcJudiciales;
	private String habilitado;
	
	public SolAntecedenteRequest() {
		// TODO Auto-generated constructor stub
	}

	public String getArcAntecedentes() {
		return arcAntecedentes;
	}

	public void setArcAntecedentes(String arcAntecdentes) {
		this.arcAntecedentes = arcAntecdentes;
	}

	public BigDecimal getSolAntecedenteId() {
		return solAntecedenteId;
	}

	public void setSolAntecedenteId(BigDecimal solAntecdenteId) {
		this.solAntecedenteId = solAntecdenteId;
	}

	public BigDecimal getFlgactivo() {
		return flgactivo;
	}

	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}

	public BigDecimal getTipoId() {
		return tipoId;
	}

	public void setTipoId(BigDecimal tipoId) {
		this.tipoId = tipoId;
	}

	public BigDecimal getIdPJ() {
		return idPJ;
	}

	public void setIdPJ(BigDecimal idPJ) {
		this.idPJ = idPJ;
	}

	public BigDecimal getIdInpe() {
		return idInpe;
	}

	public void setIdInpe(BigDecimal idInpe) {
		this.idInpe = idInpe;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public String getArcPenales() {
		return arcPenales;
	}

	public void setArcPenales(String arcPenales) {
		this.arcPenales = arcPenales;
	}

	public String getArcJudiciales() {
		return arcJudiciales;
	}

	public void setArcJudiciales(String arcJudiciales) {
		this.arcJudiciales = arcJudiciales;
	}

	public BigDecimal getFlgtiene() {
		return flgtiene;
	}

	public void setFlgtiene(BigDecimal flgtiene) {
		this.flgtiene = flgtiene;
	}

	public String getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	
}

