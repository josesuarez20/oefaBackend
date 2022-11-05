package pe.gob.oefa.model.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CreaExpedienteSigedRequest implements Serializable {

	private static final long serialVersionUID = -6706992344065452420L;

	private BigDecimal idSolicitud;
	private BigDecimal idEntregable;
	private int tipoDocumento;
	private String nroDocumento;
	private String asunto;
	private String titulo;
	private String contrato;
	private String anioContrato;
	private String codigoSiga;
	private String unidadEjecutora;
	private String itemContrato;
	private String itemCorrelativoContrato;
	private int numeroFolio;
	private int areaDestino;
	private List<ArchivoSigedRequest> archivos = new ArrayList<>();

	public CreaExpedienteSigedRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreaExpedienteSigedRequest(BigDecimal idSolicitud, BigDecimal idEntregable, int tipoDocumento,
			String nroDocumento, String asunto, String titulo, String contrato, int numeroFolio, int areaDestino, List<ArchivoSigedRequest> archivos) {
		super();
		this.idSolicitud = idSolicitud;
		this.idEntregable = idEntregable;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.asunto = asunto;
		this.titulo = titulo;
		this.contrato = contrato;
		this.archivos = archivos;
		this.numeroFolio = numeroFolio;
		this.areaDestino = areaDestino;
	}

	public BigDecimal getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(BigDecimal idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public BigDecimal getIdEntregable() {
		return idEntregable;
	}

	public void setIdEntregable(BigDecimal idEntregable) {
		this.idEntregable = idEntregable;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public List<ArchivoSigedRequest> getArchivos() {
		return archivos;
	}

	public void setArchivos(List<ArchivoSigedRequest> archivos) {
		this.archivos = archivos;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getAnioContrato() {
		return anioContrato;
	}

	public void setAnioContrato(String anioContrato) {
		this.anioContrato = anioContrato;
	}

	public String getCodigoSiga() {
		return codigoSiga;
	}

	public void setCodigoSiga(String codigoSiga) {
		this.codigoSiga = codigoSiga;
	}

	public String getUnidadEjecutora() {
		return unidadEjecutora;
	}

	public void setUnidadEjecutora(String unidadEjecutora) {
		this.unidadEjecutora = unidadEjecutora;
	}

	public String getItemContrato() {
		return itemContrato;
	}

	public void setItemContrato(String itemContrato) {
		this.itemContrato = itemContrato;
	}

	public String getItemCorrelativoContrato() {
		return itemCorrelativoContrato;
	}

	public void setItemCorrelativoContrato(String itemCorrelativoContrato) {
		this.itemCorrelativoContrato = itemCorrelativoContrato;
	}

	public int getNumeroFolio() {
		return numeroFolio;
	}

	public void setNumeroFolio(int numeroFolio) {
		this.numeroFolio = numeroFolio;
	}

	public int getAreaDestino() {
		return areaDestino;
	}

	public void setAreaDestino(int areaDestino) {
		this.areaDestino = areaDestino;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}
