package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolicitudFiltroRequest  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8739822906016509283L;
	private String ubicacionCodigo;
	private BigDecimal salaId;
	private String estadoCodigo;
	private String titulo;
	private String solicitante;
	private Date desde;
	private Date hasta;

	public SolicitudFiltroRequest() {
		// TODO Auto-generated constructor stub
	}
 

	public String getUbicacionCodigo() {
		return ubicacionCodigo;
	}


	public void setUbicacionCodigo(String ubicacionCodigo) {
		this.ubicacionCodigo = ubicacionCodigo;
	}


	public BigDecimal getSalaId() {
		return salaId;
	}

	public void setSalaId(BigDecimal salaId) {
		this.salaId = salaId;
	}

	public String getEstadoCodigo() {
		return estadoCodigo;
	}

	public void setEstadoCodigo(String estadoCodigo) {
		this.estadoCodigo = estadoCodigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public Date getDesde() {
		return desde;
	}

	public void setDesde(Date desde) {
		this.desde = desde;
	}

	public Date getHasta() {
		return hasta;
	}

	public void setHasta(Date hasta) {
		this.hasta = hasta;
	}

}
