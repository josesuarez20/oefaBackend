package pe.gob.oefa.sirte.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class PersonaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5688303873036383910L;
	private BigDecimal persona;
	private String documento;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombres;
	private String sexo;
	private String numeroRuc;
	private String rol;
	private String flagEstado;
	private String codOficina;
	private String codCargo;
	private String codDepartamento;
	private String codProvincia;
	private String codDistrito;
	private String telefono;
	private String codigoProfesional;
	private String correoelectronico;
	private String codigoArea;
	private String nombreArea;
	private String codigoUbicacion;
	private String descripcionUbicacion;
	private String usuarioRed;
	private String codigoPersonal;
	private String foto;
	private byte[] fotografia;
	private String descripcionCargo;
	private String estadoempleado;
	private String flgAdmin;
	private String documentobusqueda;
	private BigDecimal idArea;
	private String nombrecompleto;

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNumeroRuc() {
		return numeroRuc;
	}

	public void setNumeroRuc(String numeroRuc) {
		this.numeroRuc = numeroRuc;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getFlagEstado() {
		return flagEstado;
	}

	public void setFlagEstado(String flagEstado) {
		this.flagEstado = flagEstado;
	}

	public String getCodOficina() {
		return codOficina;
	}

	public void setCodOficina(String codOficina) {
		this.codOficina = codOficina;
	}

	public String getCodCargo() {
		return codCargo;
	}

	public void setCodCargo(String codCargo) {
		this.codCargo = codCargo;
	}

	public String getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public String getCodProvincia() {
		return codProvincia;
	}

	public void setCodProvincia(String codProvincia) {
		this.codProvincia = codProvincia;
	}

	public String getCodDistrito() {
		return codDistrito;
	}

	public void setCodDistrito(String codDistrito) {
		this.codDistrito = codDistrito;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCodigoProfesional() {
		return codigoProfesional;
	}

	public void setCodigoProfesional(String codigoProfesional) {
		this.codigoProfesional = codigoProfesional;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public String getCodigoUbicacion() {
		return codigoUbicacion;
	}

	public void setCodigoUbicacion(String codigoUbicacion) {
		this.codigoUbicacion = codigoUbicacion;
	}

	public String getDescripcionUbicacion() {
		return descripcionUbicacion;
	}

	public void setDescripcionUbicacion(String descripcionUbicacion) {
		this.descripcionUbicacion = descripcionUbicacion;
	}

	public String getUsuarioRed() {
		return usuarioRed;
	}

	public void setUsuarioRed(String usuarioRed) {
		this.usuarioRed = usuarioRed;
	}

	public String getCodigoPersonal() {
		return codigoPersonal;
	}

	public void setCodigoPersonal(String codigoPersonal) {
		this.codigoPersonal = codigoPersonal;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}

	public String getDescripcionCargo() {
		return descripcionCargo;
	}

	public void setDescripcionCargo(String descripcionCargo) {
		this.descripcionCargo = descripcionCargo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEstadoempleado() {
		return estadoempleado;
	}

	public void setEstadoempleado(String estadoempleado) {
		this.estadoempleado = estadoempleado;
	}

	public String getFlgAdmin() {
		return flgAdmin;
	}

	public void setFlgAdmin(String flgAdmin) {
		this.flgAdmin = flgAdmin;
	}

	public String getDocumentobusqueda() {
		return documentobusqueda;
	}

	public void setDocumentobusqueda(String documentobusqueda) {
		this.documentobusqueda = documentobusqueda;
	}

	public BigDecimal getIdArea() {
		return idArea;
	}

	public void setIdArea(BigDecimal idArea) {
		this.idArea = idArea;
	}

	public String getNombrecompleto() {
		return nombrecompleto;
	}

	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

	public BigDecimal getPersona() {
		return persona;
	}

	public void setPersona(BigDecimal persona) {
		this.persona = persona;
	}

}
