package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class InvitacionResponse extends BaseRequest implements Serializable {

	private static final long serialVersionUID = -7277958607367458698L;
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
	private String mofidescri;
	private String idcatcodigo;
	private String flg_participa;
	private String habilitado;
	private String archivo;
	private String nomarchivo;
	private String itemreq;
	private String estconvocatoria;
	private String pdetitem;
	private String estdocumento; //JCMF
	private Date fecenvdoc;
	private Date psepreobsfecini;
	private Date psepreobsfecfin;
	private String estfuera;
	private String ganador;
	public InvitacionResponse() {
		// TODO Auto-generated constructor stub
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

	public String getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
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

	public String getEstfuera() {
		return estfuera;
	}

	public void setEstfuera(String estfuera) {
		this.estfuera = estfuera;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

}
