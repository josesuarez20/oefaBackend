package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EntregableEnvioDetResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal envio;
	private BigDecimal secuencia;
	private String arcenvio;

	private BigDecimal codigsiga;

	// campos para grabar el archivo en el SIGA
	private String idcodigo;
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

	public EntregableEnvioDetResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getEnvio() {
		return envio;
	}

	public void setEnvio(BigDecimal envio) {
		this.envio = envio;
	}

	public BigDecimal getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(BigDecimal secuencia) {
		this.secuencia = secuencia;
	}

	public String getArcenvio() {
		return arcenvio;
	}

	public void setArcenvio(String arcenvio) {
		this.arcenvio = arcenvio;
	}

	public BigDecimal getCodigsiga() {
		return codigsiga;
	}

	public void setCodigsiga(BigDecimal codigsiga) {
		this.codigsiga = codigsiga;
	}

	public String getIdcodigo() {
		return idcodigo;
	}

	public void setIdcodigo(String idcodigo) {
		this.idcodigo = idcodigo;
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

	
}
