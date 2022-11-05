package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ControlPosteriorItemResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal idControlPosterior;
	private BigDecimal idControlPosteriorItem;
	private String observacion;
	private int conforme;
	private int flgFuerzasArmadas;
	private int flgConadis;
	private BigDecimal idSolicitudEstudio;
	private BigDecimal idSolicitudExperiencia;
	private BigDecimal flgactivo;

	private BigDecimal idSolicitudOtroEstudio;
	private BigDecimal idSolicitudTercio;
	private BigDecimal idSolDecJur;
	private BigDecimal idSolAntecedente;

	// auxiliares
	private Boolean blFfaa;
	private Boolean blConadis;
	private Boolean blEstudio;
	private Boolean blExperiencia;
	private Boolean blOtroEstudio;
	private Boolean blTercio;

	private String observacionFfaa;
	private String observacionConadis;
	private BigDecimal arcObservacionFfaa;
	private BigDecimal arcObservacionConadis;

	public ControlPosteriorItemResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getIdControlPosterior() {
		return idControlPosterior;
	}

	public void setIdControlPosterior(BigDecimal idControlPosterior) {
		this.idControlPosterior = idControlPosterior;
	}

	public BigDecimal getIdControlPosteriorItem() {
		return idControlPosteriorItem;
	}

	public void setIdControlPosteriorItem(BigDecimal idControlPosteriorItem) {
		this.idControlPosteriorItem = idControlPosteriorItem;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getConforme() {
		return conforme;
	}

	public void setConforme(int conforme) {
		this.conforme = conforme;
	}

	public int getFlgFuerzasArmadas() {
		return flgFuerzasArmadas;
	}

	public void setFlgFuerzasArmadas(int flgFuerzasArmadas) {
		this.flgFuerzasArmadas = flgFuerzasArmadas;
	}

	public int getFlgConadis() {
		return flgConadis;
	}

	public void setFlgConadis(int flgConadis) {
		this.flgConadis = flgConadis;
	}

	public BigDecimal getIdSolicitudEstudio() {
		return idSolicitudEstudio;
	}

	public void setIdSolicitudEstudio(BigDecimal idSolicitudEstudio) {
		this.idSolicitudEstudio = idSolicitudEstudio;
	}

	public BigDecimal getIdSolicitudExperiencia() {
		return idSolicitudExperiencia;
	}

	public void setIdSolicitudExperiencia(BigDecimal idSolicitudExperiencia) {
		this.idSolicitudExperiencia = idSolicitudExperiencia;
	}

	public BigDecimal getFlgactivo() {
		return flgactivo;
	}

	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}

	public BigDecimal getIdSolicitudOtroEstudio() {
		return idSolicitudOtroEstudio;
	}

	public void setIdSolicitudOtroEstudio(BigDecimal idSolicitudOtroEstudio) {
		this.idSolicitudOtroEstudio = idSolicitudOtroEstudio;
	}

	public BigDecimal getIdSolicitudTercio() {
		return idSolicitudTercio;
	}

	public void setIdSolicitudTercio(BigDecimal idSolicitudTercio) {
		this.idSolicitudTercio = idSolicitudTercio;
	}

	public Boolean getBlFfaa() {
		return blFfaa;
	}

	public void setBlFfaa(Boolean blFfaa) {
		this.blFfaa = blFfaa;
	}

	public Boolean getBlConadis() {
		return blConadis;
	}

	public void setBlConadis(Boolean blConadis) {
		this.blConadis = blConadis;
	}

	public Boolean getBlEstudio() {
		return blEstudio;
	}

	public void setBlEstudio(Boolean blEstudio) {
		this.blEstudio = blEstudio;
	}

	public Boolean getBlExperiencia() {
		return blExperiencia;
	}

	public void setBlExperiencia(Boolean blExperiencia) {
		this.blExperiencia = blExperiencia;
	}

	public Boolean getBlOtroEstudio() {
		return blOtroEstudio;
	}

	public void setBlOtroEstudio(Boolean blOtroEstudio) {
		this.blOtroEstudio = blOtroEstudio;
	}

	public Boolean getBlTercio() {
		return blTercio;
	}

	public void setBlTercio(Boolean blTercio) {
		this.blTercio = blTercio;
	}

	public String getObservacionFfaa() {
		return observacionFfaa;
	}

	public void setObservacionFfaa(String observacionFfaa) {
		this.observacionFfaa = observacionFfaa;
	}

	public String getObservacionConadis() {
		return observacionConadis;
	}

	public void setObservacionConadis(String observacionConadis) {
		this.observacionConadis = observacionConadis;
	}

	public BigDecimal getIdSolDecJur() {
		return idSolDecJur;
	}

	public void setIdSolDecJur(BigDecimal idSolDecJur) {
		this.idSolDecJur = idSolDecJur;
	}

	public BigDecimal getIdSolAntecedente() {
		return idSolAntecedente;
	}

	public void setIdSolAntecedente(BigDecimal idSolAntecedente) {
		this.idSolAntecedente = idSolAntecedente;
	}

	public BigDecimal getArcObservacionFfaa() {
		return arcObservacionFfaa;
	}

	public void setArcObservacionFfaa(BigDecimal arcObservacionFfaa) {
		this.arcObservacionFfaa = arcObservacionFfaa;
	}

	public BigDecimal getArcObservacionConadis() {
		return arcObservacionConadis;
	}

	public void setArcObservacionConadis(BigDecimal arcObservacionConadis) {
		this.arcObservacionConadis = arcObservacionConadis;
	}

}
