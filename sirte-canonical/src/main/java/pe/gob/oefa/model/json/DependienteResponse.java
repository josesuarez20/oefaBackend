package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DependienteResponse implements Serializable {

	private static final long serialVersionUID = -5755883238715448589L;
	private BigDecimal secuencia;
	private String documento;
	private String documentoresponsable;
	private String nombres;
	private String apellidopaterno;
	private String apellidomaterno;
	private String nacionalidad;
	private String tipodependiente;
	private String otrotipodependiente;
	private Date fechanacimiento;
	private String sexo;
	private String direccioncompleta;
	private String tipodependientenombre;
	private String fechanacimientonombre;
	private String estado;
	private Date ultimafechamodif;
	private String ultimousuario;
	private String origen;
	// para respuesta de Reniec en caso de nuevo dependiente
	private BigDecimal secuenciacorreo;
	private String correosvacunas;
	private BigDecimal codigo;
	private List<ProgramacionResponse> lstProgramacion;
	private List<PruebaDescarteResponse> lstPruebaDescarte;
	private String correoelectronico;
	private String nombreresponsable;

	public DependienteResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(BigDecimal secuencia) {
		this.secuencia = secuencia;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDocumentoresponsable() {
		return documentoresponsable;
	}

	public void setDocumentoresponsable(String documentoresponsable) {
		this.documentoresponsable = documentoresponsable;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidopaterno() {
		return apellidopaterno;
	}

	public void setApellidopaterno(String apellidopaterno) {
		this.apellidopaterno = apellidopaterno;
	}

	public String getApellidomaterno() {
		return apellidomaterno;
	}

	public void setApellidomaterno(String apellidomaterno) {
		this.apellidomaterno = apellidomaterno;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipodependiente() {
		return tipodependiente;
	}

	public void setTipodependiente(String tipodependiente) {
		this.tipodependiente = tipodependiente;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccioncompleta() {
		return direccioncompleta;
	}

	public void setDireccioncompleta(String direccioncompleta) {
		this.direccioncompleta = direccioncompleta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getUltimafechamodif() {
		return ultimafechamodif;
	}

	public void setUltimafechamodif(Date ultimafechamodif) {
		this.ultimafechamodif = ultimafechamodif;
	}

	public String getUltimousuario() {
		return ultimousuario;
	}

	public void setUltimousuario(String ultimousuario) {
		this.ultimousuario = ultimousuario;
	}

	public String getTipodependientenombre() {
		return tipodependientenombre;
	}

	public void setTipodependientenombre(String tipodependientenombre) {
		this.tipodependientenombre = tipodependientenombre;
	}

	public String getFechanacimientonombre() {
		return fechanacimientonombre;
	}

	public void setFechanacimientonombre(String fechanacimientonombre) {
		this.fechanacimientonombre = fechanacimientonombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public BigDecimal getCodigo() {
		return codigo;
	}

	public void setCodigo(BigDecimal codigo) {
		this.codigo = codigo;
	}

	public List<ProgramacionResponse> getLstProgramacion() {
		return lstProgramacion;
	}

	public void setLstProgramacion(List<ProgramacionResponse> lstProgramacion) {
		this.lstProgramacion = lstProgramacion;
	}

	public String getOtrotipodependiente() {
		return otrotipodependiente;
	}

	public void setOtrotipodependiente(String otrotipodependiente) {
		this.otrotipodependiente = otrotipodependiente;
	}

	public BigDecimal getSecuenciacorreo() {
		return secuenciacorreo;
	}

	public void setSecuenciacorreo(BigDecimal secuenciacorreo) {
		this.secuenciacorreo = secuenciacorreo;
	}

	public String getCorreosvacunas() {
		return correosvacunas;
	}

	public void setCorreosvacunas(String correosvacunas) {
		this.correosvacunas = correosvacunas;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getNombreresponsable() {
		return nombreresponsable;
	}

	public void setNombreresponsable(String nombreresponsable) {
		this.nombreresponsable = nombreresponsable;
	}

	public List<PruebaDescarteResponse> getLstPruebaDescarte() {
		return lstPruebaDescarte;
	}

	public void setLstPruebaDescarte(List<PruebaDescarteResponse> lstPruebaDescarte) {
		this.lstPruebaDescarte = lstPruebaDescarte;
	}

}
