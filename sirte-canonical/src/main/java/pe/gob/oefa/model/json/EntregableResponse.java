package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EntregableResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal codigsiga;
	private String nrocontrato;
	private Date fecvencimiento;
	private String fecvencimientotexto;
	private BigDecimal importe;
	private String observacion;
	private String anio;
	private String ujecutora;
	private String itemcontrato;
	private String itementregable;

	private BigDecimal terminado;

	// campos para grabar el archivo en el SIGA
	private String iduejecod;
	private String iduejeano;
	private String filetipdoc;
	private String filenumdoc;
	private Date filefecha;
	private String fileasunto;
	private String filesumilla;
	private String filetipo;
	private String filename;
	private String mgbsysuser;
	private String mbgcreauser;
	private String tipocontenido;
	private String filetipoarchivo;
	private String fileubicacion;

	private String correlaitvocontrato;
	private String ultimoenvio;
	private BigDecimal nroEnvios;
	private BigDecimal resuelto;
	private BigDecimal cancelado;
	
	// envios
	private List<EntregableEnvioResponse> envios;

	private BigDecimal solicitudId;

	public EntregableResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getCodigsiga() {
		return codigsiga;
	}

	public void setCodigsiga(BigDecimal codigsiga) {
		this.codigsiga = codigsiga;
	}

	public String getNrocontrato() {
		return nrocontrato;
	}

	public void setNrocontrato(String nrocontrato) {
		this.nrocontrato = nrocontrato;
	}

	public Date getFecvencimiento() {
		return fecvencimiento;
	}

	public void setFecvencimiento(Date fecvencimiento) {
		this.fecvencimiento = fecvencimiento;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getUjecutora() {
		return ujecutora;
	}

	public void setUjecutora(String ujecutora) {
		this.ujecutora = ujecutora;
	}

	public String getItemcontrato() {
		return itemcontrato;
	}

	public void setItemcontrato(String itemcontrato) {
		this.itemcontrato = itemcontrato;
	}

	public String getItementregable() {
		return itementregable;
	}

	public void setItementregable(String itementregable) {
		this.itementregable = itementregable;
	}

	public String getFecvencimientotexto() {
		return fecvencimientotexto;
	}

	public void setFecvencimientotexto(String fecvencimientotexto) {
		this.fecvencimientotexto = fecvencimientotexto;
	}

	public String getIduejecod() {
		return iduejecod;
	}

	public void setIduejecod(String iduejecod) {
		this.iduejecod = iduejecod;
	}

	public String getIduejeano() {
		return iduejeano;
	}

	public void setIduejeano(String iduejeano) {
		this.iduejeano = iduejeano;
	}

	public String getFiletipdoc() {
		return filetipdoc;
	}

	public void setFiletipdoc(String filetipdoc) {
		this.filetipdoc = filetipdoc;
	}

	public String getFilenumdoc() {
		return filenumdoc;
	}

	public void setFilenumdoc(String filenumdoc) {
		this.filenumdoc = filenumdoc;
	}

	public Date getFilefecha() {
		return filefecha;
	}

	public void setFilefecha(Date filefecha) {
		this.filefecha = filefecha;
	}

	public String getFileasunto() {
		return fileasunto;
	}

	public void setFileasunto(String fileasunto) {
		this.fileasunto = fileasunto;
	}

	public String getFilesumilla() {
		return filesumilla;
	}

	public void setFilesumilla(String filesumilla) {
		this.filesumilla = filesumilla;
	}

	public String getFiletipo() {
		return filetipo;
	}

	public void setFiletipo(String filetipo) {
		this.filetipo = filetipo;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMgbsysuser() {
		return mgbsysuser;
	}

	public void setMgbsysuser(String mgbsysuser) {
		this.mgbsysuser = mgbsysuser;
	}

	public String getMbgcreauser() {
		return mbgcreauser;
	}

	public void setMbgcreauser(String mbgcreauser) {
		this.mbgcreauser = mbgcreauser;
	}

	public String getTipocontenido() {
		return tipocontenido;
	}

	public void setTipocontenido(String tipocontenido) {
		this.tipocontenido = tipocontenido;
	}

	public String getFiletipoarchivo() {
		return filetipoarchivo;
	}

	public void setFiletipoarchivo(String filetipoarchivo) {
		this.filetipoarchivo = filetipoarchivo;
	}

	public String getFileubicacion() {
		return fileubicacion;
	}

	public void setFileubicacion(String fileubicacion) {
		this.fileubicacion = fileubicacion;
	}

	public String getCorrelaitvocontrato() {
		return correlaitvocontrato;
	}

	public void setCorrelaitvocontrato(String correlaitvocontrato) {
		this.correlaitvocontrato = correlaitvocontrato;
	}

	public List<EntregableEnvioResponse> getEnvios() {
		if (envios == null) {
			envios = new ArrayList<EntregableEnvioResponse>();
		}
		return envios;
	}

	public void setEnvios(List<EntregableEnvioResponse> envios) {
		this.envios = envios;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public String getUltimoenvio() {
		return ultimoenvio;
	}

	public void setUltimoenvio(String ultimoenvio) {
		this.ultimoenvio = ultimoenvio;
	}

	public BigDecimal getNroEnvios() {
		return nroEnvios;
	}

	public void setNroEnvios(BigDecimal nroEnvios) {
		this.nroEnvios = nroEnvios;
	}

	public BigDecimal getTerminado() {
		return terminado;
	}

	public void setTerminado(BigDecimal terminado) {
		this.terminado = terminado;
	}

	public BigDecimal getResuelto() {
		return resuelto;
	}

	public void setResuelto(BigDecimal resuelto) {
		this.resuelto = resuelto;
	}

	public BigDecimal getCancelado() {
		return cancelado;
	}

	public void setCancelado(BigDecimal cancelado) {
		this.cancelado = cancelado;
	}

	
}
