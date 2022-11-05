package pe.gob.oefa.sirte.dto;

import java.math.BigDecimal;
import java.sql.Date;

import pe.gob.oefa.core.dto.BaseDTO;

public class InvitacionDTO extends BaseDTO {

	private static final long serialVersionUID = 4544668036294283339L;
	private BigDecimal inivitacionId;
	private String usuarioId;
	private String pselanoord;
	private String idpsecodigo;
	private String iduejecod;
	private String psemodo;
	private String psenroversion;
	private String codigo;
	private String pseobjeto;
	private String psevalorref;
	private Date psebasfini;
	private Date psebasffin;
	private Date fecenvdoc;
	private String mofidescri;
	private String idcatcodigo;
	private String flg_participa;
	private String archivo;
	private String nomarchivo;
	private String itemreq;
	private String estconvocatoria;
	private String pdetitem;
	//JCMF Adaptación para djinteres
	private String estdocumento; 
	private Date psepreobsfecini;
	private Date psepreobsfecfin;
	private String ganador;
	private String pseestado;
	
	public InvitacionDTO() {
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public BigDecimal getInivitacionId() {
		return inivitacionId;
	}

	public void setInivitacionId(BigDecimal inivitacionId) {
		this.inivitacionId = inivitacionId;
	}

	public String getPselanoord() {
		return pselanoord;
	}

	public void setPselanoord(String pselanoord) {
		this.pselanoord = pselanoord;
	}

	public String getIdpsecodigo() {
		return idpsecodigo;
	}

	public void setIdpsecodigo(String idpsecodigo) {
		this.idpsecodigo = idpsecodigo;
	}

	public String getIduejecod() {
		return iduejecod;
	}

	public void setIduejecod(String iduejecod) {
		this.iduejecod = iduejecod;
	}

	public String getPsemodo() {
		return psemodo;
	}

	public void setPsemodo(String psemodo) {
		this.psemodo = psemodo;
	}

	public String getPsenroversion() {
		return psenroversion;
	}

	public void setPsenroversion(String psenroversion) {
		this.psenroversion = psenroversion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPseobjeto() {
		return pseobjeto;
	}

	public void setPseobjeto(String pseobjeto) {
		this.pseobjeto = pseobjeto;
	}

	public String getPsevalorref() {
		return psevalorref;
	}

	public void setPsevalorref(String psevalorref) {
		this.psevalorref = psevalorref;
	}

	public Date getPsebasfini() {
		return psebasfini;
	}

	public void setPsebasfini(Date psebasfini) {
		this.psebasfini = psebasfini;
	}

	public Date getPsebasffin() {
		return psebasffin;
	}

	public void setPsebasffin(Date psebasffin) {
		this.psebasffin = psebasffin;
	}

	public String getMofidescri() {
		return mofidescri;
	}

	public void setMofidescri(String mofidescri) {
		this.mofidescri = mofidescri;
	}

	public String getIdcatcodigo() {
		return idcatcodigo;
	}

	public void setIdcatcodigo(String idcatcodigo) {
		this.idcatcodigo = idcatcodigo;
	}

	public String getFlg_participa() {
		return flg_participa;
	}

	public void setFlg_participa(String flg_participa) {
		this.flg_participa = flg_participa;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getNomarchivo() {
		return nomarchivo;
	}

	public void setNomarchivo(String nomarchivo) {
		this.nomarchivo = nomarchivo;
	}

	public String getItemreq() {
		return itemreq;
	}

	public void setItemreq(String itemreq) {
		this.itemreq = itemreq;
	}

	public String getEstconvocatoria() {
		return estconvocatoria;
	}

	public void setEstconvocatoria(String estconvocatoria) {
		this.estconvocatoria = estconvocatoria;
	}

	public String getPdetitem() {
		return pdetitem;
	}

	public void setPdetitem(String pdetitem) {
		this.pdetitem = pdetitem;
	}

	public String getEstdocumento() {
		return estdocumento;
	}

	public void setEstdocumento(String estdocumento) {
		this.estdocumento = estdocumento;
	}

	public Date getPsepreobsfecini() {
		return psepreobsfecini;
	}

	public void setPsepreobsfecini(Date psepreobsfecini) {
		this.psepreobsfecini = psepreobsfecini;
	}

	public Date getPsepreobsfecfin() {
		return psepreobsfecfin;
	}

	public void setPsepreobsfecfin(Date psepreobsfecfin) {
		this.psepreobsfecfin = psepreobsfecfin;
	}

	public Date getFecenvdoc() {
		return fecenvdoc;
	}

	public void setFecenvdoc(Date fecenvdoc) {
		this.fecenvdoc = fecenvdoc;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

	public String getPseestado() {
		return pseestado;
	}

	public void setPseestado(String pseestado) {
		this.pseestado = pseestado;
	}
	
}
