package pe.gob.oefa.sirte.dao;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.sirte.dto.DependienteCorreoDTO;

public interface DependienteCorreoDAO {

	List<DependienteCorreoDTO> getByParameter(Map<String,Object> map);

	DependienteCorreoDTO get(DependienteCorreoDTO DependienteCorreoDTO);

	void save(DependienteCorreoDTO DependienteCorreoDTO);

	void update(DependienteCorreoDTO DependienteCorreoDTO);

	void delete(DependienteCorreoDTO DependienteCorreoDTO);

	void deleteDetalle(DependienteCorreoDTO DependienteCorreoDTO);
}
