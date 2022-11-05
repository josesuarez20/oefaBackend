package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ExpedienteSigedResponse implements Serializable{
	
	private static final long serialVersionUID = 1911490414698379171L;
	
	private String estado;
	private String mensaje;
	private BigDecimal idExpediente;
	private String numero;
	private String titulo;
	private Object autor;
	private Object proceso;
	private BigDecimal plazo;
	private BigDecimal tipoDias;
	private String fechaCreacion;
	private String horaCreacion;
	private Object carpeta;
	private List<Object> documentos;
	private List<Object> trazas;
	private List<Object> expedientesVinculados;
	private BigDecimal fechaCreacionExpediente;
	private BigDecimal fechaCreacionTramite;
	private String estadoTramite;
	
	
	public ExpedienteSigedResponse() {
		super();
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public BigDecimal getIdExpediente() {
		return idExpediente;
	}
	public void setIdExpediente(BigDecimal idExpediente) {
		this.idExpediente = idExpediente;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Object getAutor() {
		return autor;
	}
	public void setAutor(Object autor) {
		this.autor = autor;
	}
	public Object getProceso() {
		return proceso;
	}
	public void setProceso(Object proceso) {
		this.proceso = proceso;
	}
	public BigDecimal getPlazo() {
		return plazo;
	}
	public void setPlazo(BigDecimal plazo) {
		this.plazo = plazo;
	}
	public BigDecimal getTipoDias() {
		return tipoDias;
	}
	public void setTipoDias(BigDecimal tipoDias) {
		this.tipoDias = tipoDias;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getHoraCreacion() {
		return horaCreacion;
	}
	public void setHoraCreacion(String horaCreacion) {
		this.horaCreacion = horaCreacion;
	}
	public List<Object> getTrazas() {
		return trazas;
	}
	public void setTrazas(List<Object> trazas) {
		this.trazas = trazas;
	}
	public List<Object> getExpedientesVinculados() {
		return expedientesVinculados;
	}
	public void setExpedientesVinculados(List<Object> expedientesVinculados) {
		this.expedientesVinculados = expedientesVinculados;
	}
	public BigDecimal getFechaCreacionExpediente() {
		return fechaCreacionExpediente;
	}
	public void setFechaCreacionExpediente(BigDecimal fechaCreacionExpediente) {
		this.fechaCreacionExpediente = fechaCreacionExpediente;
	}
	public BigDecimal getFechaCreacionTramite() {
		return fechaCreacionTramite;
	}
	public void setFechaCreacionTramite(BigDecimal fechaCreacionTramite) {
		this.fechaCreacionTramite = fechaCreacionTramite;
	}
	public String getEstadoTramite() {
		return estadoTramite;
	}
	public void setEstadoTramite(String estadoTramite) {
		this.estadoTramite = estadoTramite;
	}

	public Object getCarpeta() {
		return carpeta;
	}

	public void setCarpeta(Object carpeta) {
		this.carpeta = carpeta;
	}

	public List<Object> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Object> documentos) {
		this.documentos = documentos;
	}
	
	
}
