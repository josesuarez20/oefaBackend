package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class ReunionDetalleRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6880636686498362272L;

	private ReunionResumenResponse reunion;
	private CollectionResponse<RecursoReunionDataGridResponse> recursoReunion;
	private CollectionResponse<ParticipanteReunionGridResponse> participanteReunion;
	private CollectionResponse<DocumentoDataGridResponse> documentoReunion;

	public ReunionDetalleRequest() {
	}

	public ReunionResumenResponse getReunion() {
		return reunion;
	}

	public void setReunion(ReunionResumenResponse reunion) {
		this.reunion = reunion;
	}

	public CollectionResponse<RecursoReunionDataGridResponse> getRecursoReunion() {
		return recursoReunion;
	}

	public void setRecursoReunion(CollectionResponse<RecursoReunionDataGridResponse> recursoReunion) {
		this.recursoReunion = recursoReunion;
	}

	/**
	 * @return the participanteReunion
	 */
	public CollectionResponse<ParticipanteReunionGridResponse> getParticipanteReunion() {
		return participanteReunion;
	}

	/**
	 * @param participanteReunion
	 *            the participanteReunion to set
	 */
	public void setParticipanteReunion(CollectionResponse<ParticipanteReunionGridResponse> participanteReunion) {
		this.participanteReunion = participanteReunion;
	}

	/**
	 * @return the documentoReunion
	 */
	public CollectionResponse<DocumentoDataGridResponse> getDocumentoReunion() {
		return documentoReunion;
	}

	/**
	 * @param documentoReunion
	 *            the documentoReunion to set
	 */
	public void setDocumentoReunion(CollectionResponse<DocumentoDataGridResponse> documentoReunion) {
		this.documentoReunion = documentoReunion;
	}

}
