package pe.gob.oefa.sirte.service;

import java.util.List;

import pe.gob.oefa.sirte.dto.PruebaDescarteDTO;

public interface PruebadescarteService {

	List<PruebaDescarteDTO> findByParameter(PruebaDescarteDTO filter);

	List<PruebaDescarteDTO> findByParameterAdmin(PruebaDescarteDTO filter);

	PruebaDescarteDTO get(PruebaDescarteDTO dependienteDTO);

	void save(PruebaDescarteDTO colegio);

	void update(PruebaDescarteDTO colegio);

	void delete(PruebaDescarteDTO colegio);
}
