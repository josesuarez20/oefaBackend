package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SolicitudRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2171502850392441601L;
	private BigDecimal solicitudId;
	private String usuarioId;
	private BigDecimal tipoSolId;
	private BigDecimal tipoDocId;
	private String documento;
	private String email1;
	private String telefono;
	private String celular;
	private BigDecimal estadoId;
	private BigDecimal flgpide;
	private String nombres;
	private String apellido1;
	private String apellido2;
	private String sexo;
	private Date fecNacimiento;
	private String nacionalidad;
	private String email2;
	private String rucNatural;
	private String anexo;
	private String tipoViaId;
	private String nomVia;
	private String numVia;
	private String interior;
	private String tipoZonaId;
	private String urbanizacion;
	private String ubigeo;
	private BigDecimal flgFfaa;
	private BigDecimal flgConadis;
	private String arcFfaa;
	private String arcConadis;
	private String razonSocial;
	private BigDecimal flgupd;
	private String domicilio;
	private String partida;
	private String ficha;
	private String zona;
	private BigDecimal tipoDocR;
	private String documentoR;
	private String nombreR;
	private String libro;
	private String partidaR;
	private String zonaR;
	private BigDecimal tipoPerId;
	private BigDecimal flgactivo;
	// auxiliares
	private String requerimientoOrden;
	private String requerimientoDJ;
	private String requerimientoTipo;
	private String requerimientoId;

	private BigDecimal salaId;
	private String codigo;
	private String titulo;
	private String solicitante;
	private String solicitanteDni;
	private String correoSolicitante;
	private String usuarioSolicitante;
	private String areaCodigo;
	private String ubicacionCodigo;
	private String esPeriodo;
	private Date fechaInicio;
	private Date fechaFin;
	private Timestamp horaInicio;
	private Timestamp horaFin;
	private Timestamp fechaSolicitud;
	private String motivoSolicitud;
	private String motivoCancelado;
	private String estadoCodigo;
	private String tipoReunionCodigo;
	private String ubicacionNombre;
	private List<RecursoSalaRequest> recursos;
	private BigDecimal reunionId;
	public Date fecha;
	public Date fechahasta;
	public String ruc;
	public String idCategoria;

	// cancelacion oefa
	private BigDecimal arcMotivocan;
	private BigDecimal motivocanId;
	private BigDecimal estadoDestinoId;
	private BigDecimal flgQuebranto;

	public SolicitudRequest() {
		// TODO Auto-generated constructor stub
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

	public String getRequerimientoId() {
		return requerimientoId;
	}

	public void setRequerimientoId(String requerimientoId) {
		this.requerimientoId = requerimientoId;
	}

	public BigDecimal getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public BigDecimal getTipoSolId() {
		return tipoSolId;
	}

	public BigDecimal getTipoDocId() {
		return tipoDocId;
	}

	public String getDocumento() {
		return documento;
	}

	public String getEmail1() {
		return email1;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCelular() {
		return celular;
	}

	public BigDecimal getEstadoId() {
		return estadoId;
	}

	public BigDecimal getFlgpide() {
		return flgpide;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public String getSexo() {
		return sexo;
	}

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public String getEmail2() {
		return email2;
	}

	public String getRucNatural() {
		return rucNatural;
	}

	public String getAnexo() {
		return anexo;
	}

	public String getTipoViaId() {
		return tipoViaId;
	}

	public String getNomVia() {
		return nomVia;
	}

	public String getNumVia() {
		return numVia;
	}

	public String getInterior() {
		return interior;
	}

	public String getTipoZonaId() {
		return tipoZonaId;
	}

	public String getUrbanizacion() {
		return urbanizacion;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public BigDecimal getFlgFfaa() {
		return flgFfaa;
	}

	public BigDecimal getFlgConadis() {
		return flgConadis;
	}

	public String getArcFfaa() {
		return arcFfaa;
	}

	public String getArcConadis() {
		return arcConadis;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public BigDecimal getFlgupd() {
		return flgupd;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getPartida() {
		return partida;
	}

	public String getFicha() {
		return ficha;
	}

	public String getZona() {
		return zona;
	}

	public BigDecimal getTipoDocR() {
		return tipoDocR;
	}

	public String getDocumentoR() {
		return documentoR;
	}

	public String getNombreR() {
		return nombreR;
	}

	public String getLibro() {
		return libro;
	}

	public String getPartidaR() {
		return partidaR;
	}

	public String getZonaR() {
		return zonaR;
	}

	public BigDecimal getTipoPerId() {
		return tipoPerId;
	}

	public BigDecimal getFlgactivo() {
		return flgactivo;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public void setTipoSolId(BigDecimal tipoSolId) {
		this.tipoSolId = tipoSolId;
	}

	public void setTipoDocId(BigDecimal tipoDocId) {
		this.tipoDocId = tipoDocId;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setEstadoId(BigDecimal estadoId) {
		this.estadoId = estadoId;
	}

	public void setFlgpide(BigDecimal flgpide) {
		this.flgpide = flgpide;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public void setRucNatural(String rucNatural) {
		this.rucNatural = rucNatural;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public void setTipoViaId(String tipoViaId) {
		this.tipoViaId = tipoViaId;
	}

	public void setNomVia(String nomVia) {
		this.nomVia = nomVia;
	}

	public void setNumVia(String numVia) {
		this.numVia = numVia;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public void setTipoZonaId(String tipoZonaId) {
		this.tipoZonaId = tipoZonaId;
	}

	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public void setFlgFfaa(BigDecimal flgFfaa) {
		this.flgFfaa = flgFfaa;
	}

	public void setFlgConadis(BigDecimal flgConadis) {
		this.flgConadis = flgConadis;
	}

	public void setArcFfaa(String arcFfaa) {
		this.arcFfaa = arcFfaa;
	}

	public void setArcConadis(String arcConadis) {
		this.arcConadis = arcConadis;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public void setFlgupd(BigDecimal flgupd) {
		this.flgupd = flgupd;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public void setFicha(String ficha) {
		this.ficha = ficha;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public void setTipoDocR(BigDecimal tipoDocR) {
		this.tipoDocR = tipoDocR;
	}

	public void setDocumentoR(String documentoR) {
		this.documentoR = documentoR;
	}

	public void setNombreR(String nombreR) {
		this.nombreR = nombreR;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public void setPartidaR(String partidaR) {
		this.partidaR = partidaR;
	}

	public void setZonaR(String zonaR) {
		this.zonaR = zonaR;
	}

	public void setTipoPerId(BigDecimal tipoPerId) {
		this.tipoPerId = tipoPerId;
	}

	public void setFlgactivo(BigDecimal flgactivo) {
		this.flgactivo = flgactivo;
	}

	public Timestamp getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Timestamp fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public BigDecimal getSalaId() {
		return salaId;
	}

	public void setSalaId(BigDecimal salaId) {
		this.salaId = salaId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getCorreoSolicitante() {
		return correoSolicitante;
	}

	public void setCorreoSolicitante(String correoSolicitante) {
		this.correoSolicitante = correoSolicitante;
	}

	public String getUsuarioSolicitante() {
		return usuarioSolicitante;
	}

	public void setUsuarioSolicitante(String usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}

	public String getAreaCodigo() {
		return areaCodigo;
	}

	public void setAreaCodigo(String areaCodigo) {
		this.areaCodigo = areaCodigo;
	}

	public String getEsPeriodo() {
		return esPeriodo;
	}

	public void setEsPeriodo(String esPeriodo) {
		this.esPeriodo = esPeriodo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Timestamp getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Timestamp horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Timestamp getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Timestamp horaFin) {
		this.horaFin = horaFin;
	}

	public String getMotivoSolicitud() {
		return motivoSolicitud;
	}

	public void setMotivoSolicitud(String motivoSolicitud) {
		this.motivoSolicitud = motivoSolicitud;
	}

	public String getMotivoCancelado() {
		return motivoCancelado;
	}

	public void setMotivoCancelado(String motivoCancelado) {
		this.motivoCancelado = motivoCancelado;
	}

	public String getEstadoCodigo() {
		return estadoCodigo;
	}

	public void setEstadoCodigo(String estadoCodigo) {
		this.estadoCodigo = estadoCodigo;
	}

	public List<RecursoSalaRequest> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<RecursoSalaRequest> recursos) {
		this.recursos = recursos;
	}

	public String getTipoReunionCodigo() {
		return tipoReunionCodigo;
	}

	public void setTipoReunionCodigo(String tipoReunionCodigo) {
		this.tipoReunionCodigo = tipoReunionCodigo;
	}

	public String getUbicacionCodigo() {
		return ubicacionCodigo;
	}

	public void setUbicacionCodigo(String ubicacionCodigo) {
		this.ubicacionCodigo = ubicacionCodigo;
	}

	public String getUbicacionNombre() {
		return ubicacionNombre;
	}

	public void setUbicacionNombre(String ubicacionNombre) {
		this.ubicacionNombre = ubicacionNombre;
	}

	public String getSolicitanteDni() {
		return solicitanteDni;
	}

	public void setSolicitanteDni(String solicitanteDni) {
		this.solicitanteDni = solicitanteDni;
	}

	public BigDecimal getReunionId() {
		return reunionId;
	}

	public void setReunionId(BigDecimal reunionId) {
		this.reunionId = reunionId;
	}

	public Date getFechahasta() {
		return fechahasta;
	}

	public void setFechahasta(Date fechahasta) {
		this.fechahasta = fechahasta;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getArcMotivocan() {
		return arcMotivocan;
	}

	public void setArcMotivocan(BigDecimal arcMotivocan) {
		this.arcMotivocan = arcMotivocan;
	}

	public BigDecimal getMotivocanId() {
		return motivocanId;
	}

	public void setMotivocanId(BigDecimal motivocanId) {
		this.motivocanId = motivocanId;
	}

	public BigDecimal getEstadoDestinoId() {
		return estadoDestinoId;
	}

	public void setEstadoDestinoId(BigDecimal estadoDestinoId) {
		this.estadoDestinoId = estadoDestinoId;
	}

	public BigDecimal getFlgQuebranto() {
		return flgQuebranto;
	}

	public void setFlgQuebranto(BigDecimal flgQuebranto) {
		this.flgQuebranto = flgQuebranto;
	}
	
}
