package pe.gob.oefa.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import pe.gob.oefa.model.core.CollectionResponse;

@JsonInclude(Include.NON_NULL)
public class ReunionProgresoResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5073271883646255766L;

	private ReunionResponse reunionResponse;
	private CollectionResponse<ParticipanteReunionGridResponse> participantes;
	private CollectionResponse<DocumentoDataGridResponse> documentos;

	public ReunionProgresoResponse() {
	}

	/**
	 * @return the reunionResponse
	 */
	public ReunionResponse getReunionResponse() {
		return reunionResponse;
	}

	/**
	 * @param reunionResponse
	 *            the reunionResponse to set
	 */
	public void setReunionResponse(ReunionResponse reunionResponse) {
		this.reunionResponse = reunionResponse;
	}

	/**
	 * @return the participantes
	 */
	public CollectionResponse<ParticipanteReunionGridResponse> getParticipantes() {
		return participantes;
	}

	/**
	 * @param participantes
	 *            the participantes to set
	 */
	public void setParticipantes(CollectionResponse<ParticipanteReunionGridResponse> participantes) {
		this.participantes = participantes;
	}

	public CollectionResponse<DocumentoDataGridResponse> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(CollectionResponse<DocumentoDataGridResponse> documentos) {
		this.documentos = documentos;
	}

	 

}
