package pe.gob.oefa.sirte.repository;

import java.util.List;

import pe.gob.oefa.sirte.dto.PruebaDescarteDTO;

public interface PruebaDescarteRepository {

	List<PruebaDescarteDTO> getByParameter(PruebaDescarteDTO filter);
	
	List<PruebaDescarteDTO> getByParameterAdmin(PruebaDescarteDTO filter);

	PruebaDescarteDTO get(PruebaDescarteDTO programacionDTO);

	void save(PruebaDescarteDTO programacionDTO);

	void update(PruebaDescarteDTO programacionDTO);

	void delete(PruebaDescarteDTO programacionDTO);
	
}
