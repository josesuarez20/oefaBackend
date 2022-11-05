package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.gob.oefa.model.core.CollectionResponse;
import pe.gob.oefa.util.CustomCalendarSerializer;
import pe.gob.oefa.util.CustomDateSerializer;
import pe.gob.oefa.util.CustomDateTimeSerializer;

/**
 * @author LIBERATO
 *
 */
@JsonInclude(Include.NON_NULL)
public class SolicitudResponse extends BaseRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7277958607367458698L;
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
	private BigDecimal activoId;
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
	
	private BigDecimal salaId;
	private String capacidad;
	private String codigo;
	private String titulo;
	private String solicitante;
	private BigDecimal usuarioSolicitanteId;
	private String correoSolicitannte;
	private String usuarioSolicitante;
	private String areaCodigo;
	private String esPeriodo;
	private Date fechaInicio;
	private Date fechaFin;
	private Date fechaMinima;
	private Date fechaMaxima;
	private Timestamp horaInicio;
	private Timestamp horaFin;
	private String motivoSolicitud;
	private String motivoCancelado;
	private String estadoCodigo;
	private BigDecimal sedeId;
	private String tipoReunionCodigo;
	private String ubicacionCodigo;
	private List<RecursoSalaDataGridResponse> recursos;
	private SolicitudCombosResponse combosResponse;
	private String codigoRpta;

	public SolicitudResponse() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(BigDecimal solicitudId) {
		this.solicitudId = solicitudId;
	}
	public String getTipoZonaId() {
		return tipoZonaId;
	}
	public void setTipoZonaId(String tipoZonaId) {
		this.tipoZonaId = tipoZonaId;
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

	public BigDecimal getUsuarioSolicitanteId() {
		return usuarioSolicitanteId;
	}

	public void setUsuarioSolicitanteId(BigDecimal usuarioSolicitanteId) {
		this.usuarioSolicitanteId = usuarioSolicitanteId;
	}

	public String getCorreoSolicitannte() {
		return correoSolicitannte;
	}

	public void setCorreoSolicitannte(String correoSolicitannte) {
		this.correoSolicitannte = correoSolicitannte;
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

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@JsonSerialize(using = CustomDateTimeSerializer.class)
	public Timestamp getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Timestamp horaInicio) {
		this.horaInicio = horaInicio;
	}

	@JsonSerialize(using = CustomDateTimeSerializer.class)
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

	public List<RecursoSalaDataGridResponse> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<RecursoSalaDataGridResponse> recursos) {
		this.recursos = recursos;
	}

	public BigDecimal getSedeId() {
		return sedeId;
	}

	public void setSedeId(BigDecimal sedeId) {
		this.sedeId = sedeId;
	}

	public String getTipoReunionCodigo() {
		return tipoReunionCodigo;
	}

	public void setTipoReunionCodigo(String tipoReunionCodigo) {
		this.tipoReunionCodigo = tipoReunionCodigo;
	}

	public SolicitudCombosResponse getCombosResponse() {
		return combosResponse;
	}

	public void setCombosResponse(SolicitudCombosResponse combosResponse) {
		this.combosResponse = combosResponse;
	}

	@JsonSerialize(using = CustomCalendarSerializer.class)
	public Date getFechaMinima() {
		return fechaMinima;
	}

	public void setFechaMinima(Date fechaMinima) {
		this.fechaMinima = fechaMinima;
	}

	@JsonSerialize(using = CustomCalendarSerializer.class)
	public Date getFechaMaxima() {
		return fechaMaxima;
	}

	public void setFechaMaxima(Date fechaMaxima) {
		this.fechaMaxima = fechaMaxima;
	}

	public String getUbicacionCodigo() {
		return ubicacionCodigo;
	}

	public void setUbicacionCodigo(String ubicacionCodigo) {
		this.ubicacionCodigo = ubicacionCodigo;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public BigDecimal getActivoId() {
		return activoId;
	}
	public void setActivoId(BigDecimal activoId) {
		this.activoId = activoId;
	}
	public String getCodigoRpta() {
		return codigoRpta;
	}
	public void setCodigoRpta(String codigoRpta) {
		this.codigoRpta = codigoRpta;
	}
	
}
