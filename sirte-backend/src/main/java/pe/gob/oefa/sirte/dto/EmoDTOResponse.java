package pe.gob.oefa.sirte.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import pe.gob.oefa.dto.core.UserDTO;

public class EmoDTOResponse {
	private Integer id;
	private String dni;
    private String fechaRegistro;
	private Integer sede;
	private Integer aptitudMedico;
	private Integer tipoEmo;
	private Integer anexo;
	private Integer interconsulta;
	private String recomendaciones;
	private String restricciones;
	private LocalDateTime fechaCreacion;
	private String usuarioCreacion;
	private UserDTO user;
	private List<EmoDocumentDTORequest> documentos;
	
	public List<EmoDocumentDTORequest> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<EmoDocumentDTORequest> documentos) {
		this.documentos = documentos;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Integer getSede() {
		return sede;
	}
	public void setSede(Integer sede) {
		this.sede = sede;
	}
	public Integer getAptitudMedico() {
		return aptitudMedico;
	}
	public void setAptitudMedico(Integer aptitudMedico) {
		this.aptitudMedico = aptitudMedico;
	}
	public Integer getTipoEmo() {
		return tipoEmo;
	}
	public void setTipoEmo(Integer tipoEmo) {
		this.tipoEmo = tipoEmo;
	}
	public Integer getAnexo() {
		return anexo;
	}
	public void setAnexo(Integer anexo) {
		this.anexo = anexo;
	}
	public Integer getInterconsulta() {
		return interconsulta;
	}
	public void setInterconsulta(Integer interconsulta) {
		this.interconsulta = interconsulta;
	}
	public String getRecomendaciones() {
		return recomendaciones;
	}
	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	public String getRestricciones() {
		return restricciones;
	}
	public void setRestricciones(String restricciones) {
		this.restricciones = restricciones;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	
	
}
