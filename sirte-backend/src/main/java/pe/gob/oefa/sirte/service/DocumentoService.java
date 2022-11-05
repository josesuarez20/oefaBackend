package pe.gob.oefa.sirte.service;

import java.math.BigDecimal;

import pe.gob.oefa.model.json.ReporteResponse;
import pe.gob.oefa.sirte.dto.DocumentoDTO;

public interface DocumentoService {

	/**
	 * 
	 * @param object
	 */
	ReporteResponse save(DocumentoDTO object);


	/**
	 * 
	 * @param id
	 * @return
	 */
	ReporteResponse get(String uuid);


}
