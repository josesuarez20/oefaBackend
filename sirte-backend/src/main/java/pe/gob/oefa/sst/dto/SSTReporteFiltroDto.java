package pe.gob.oefa.sst.dto;

import java.math.BigDecimal;
import java.util.Date;

public class SSTReporteFiltroDto {

	private String documentobusqueda;
	private BigDecimal idarea;
	private Date fechadesde;
	private Date fechahasta;

	public String getDocumentobusqueda() {
		return documentobusqueda;
	}

	public void setDocumentobusqueda(String documentobusqueda) {
		this.documentobusqueda = documentobusqueda;
	}

	public BigDecimal getIdarea() {
		return idarea;
	}

	public void setIdarea(BigDecimal idarea) {
		this.idarea = idarea;
	}

	public Date getFechadesde() {
		return fechadesde;
	}

	public void setFechadesde(Date fechadesde) {
		this.fechadesde = fechadesde;
	}

	public Date getFechahasta() {
		return fechahasta;
	}

	public void setFechahasta(Date fechahasta) {
		this.fechahasta = fechahasta;
	}

}
