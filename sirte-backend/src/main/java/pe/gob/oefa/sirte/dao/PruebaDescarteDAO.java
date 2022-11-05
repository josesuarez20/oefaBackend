package pe.gob.oefa.sirte.dao;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.sirte.dto.PruebaDescarteDTO;

public interface PruebaDescarteDAO {

	List<PruebaDescarteDTO> getByParameter(Map<String, Object> map);
	
	List<PruebaDescarteDTO> getByParameterAdmin(Map<String, Object> map);

	PruebaDescarteDTO get(PruebaDescarteDTO programacionDTO);

	void save(PruebaDescarteDTO programacionDTO);

	void update(PruebaDescarteDTO programacionDTO);

	void delete(PruebaDescarteDTO programacionDTO);

}
