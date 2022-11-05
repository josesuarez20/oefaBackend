package pe.gob.oefa.sirte.dao;

import java.math.BigDecimal;
import java.util.List;

import pe.gob.oefa.sirte.dto.DocumentoDTO;

public interface DocumentoDAO {

	
	/**
	 * 
	 * @param idReunion
	 * @return
	 */
	List<DocumentoDTO> listDocumemtoReunion(BigDecimal idReunion);

	/**
	 * 
	 * @param id
	 * @return
	 */
	DocumentoDTO get(BigDecimal id);

	/**
	 * 
	 * @param documentoDTO
	 */
	void save(DocumentoDTO documentoDTO);

	/**
	 * 
	 * @param documentoDTO
	 */
	void update(DocumentoDTO documentoDTO);

	/**
	 * 
	 * @param id
	 */
	void delete(BigDecimal documentoId);
}
