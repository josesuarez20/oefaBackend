package pe.gob.oefa.sirte.facade;

import org.springframework.web.multipart.MultipartFile;

import pe.gob.oefa.model.json.ReporteResponse;

public interface DocumentoFacade {

	/**
	 * 
	 * @param id
	 * @return
	 */
	ReporteResponse get(String uuid);
	
	ReporteResponse updload(MultipartFile[] files);
}

