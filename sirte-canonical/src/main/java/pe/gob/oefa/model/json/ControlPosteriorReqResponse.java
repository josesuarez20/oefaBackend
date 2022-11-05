package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ControlPosteriorReqResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal idControlPosterior;;
	private String idRequerimiento;
	private BigDecimal conforme;
	private int cantidadSinControl;

	private String requerimientoOrden;
	private String requerimientoDJ;
	private String requerimientoTipo;

	public ControlPosteriorReqResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getIdControlPosterior() {
		return idControlPosterior;
	}

	public void setIdControlPosterior(BigDecimal idControlPosterior) {
		this.idControlPosterior = idControlPosterior;
	}

	public String getIdRequerimiento() {
		return idRequerimiento;
	}

	public void setIdRequerimiento(String idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
	}

	public BigDecimal getConforme() {
		return conforme;
	}

	public void setConforme(BigDecimal conforme) {
		this.conforme = conforme;
	}

	public int getCantidadSinControl() {
		return cantidadSinControl;
	}

	public void setCantidadSinControl(int cantidadSinControl) {
		this.cantidadSinControl = cantidadSinControl;
	}

	public String getRequerimientoOrden() {
		return requerimientoOrden;
	}

	public void setRequerimientoOrden(String requerimientoOrden) {
		this.requerimientoOrden = requerimientoOrden;
	}

	public String getRequerimientoDJ() {
		return requerimientoDJ;
	}

	public void setRequerimientoDJ(String requerimientoDJ) {
		this.requerimientoDJ = requerimientoDJ;
	}

	public String getRequerimientoTipo() {
		return requerimientoTipo;
	}

	public void setRequerimientoTipo(String requerimientoTipo) {
		this.requerimientoTipo = requerimientoTipo;
	}

}
