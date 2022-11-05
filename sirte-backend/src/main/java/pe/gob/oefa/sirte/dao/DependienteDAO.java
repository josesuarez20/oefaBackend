package pe.gob.oefa.sirte.dao;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.sirte.dto.DependienteDTO;

public interface DependienteDAO {

	List<DependienteDTO> getByParameter(Map<String, Object> map);

	List<DependienteDTO> getByParameterConResponsable(Map<String, Object> map);
	
	List<DependienteDTO> getByParameterAdicional(Map<String, Object> map);

	DependienteDTO get(DependienteDTO dependienteDTO);

	void save(DependienteDTO colegioDTO);

	void update(DependienteDTO colegioDTO);

	void saveAdicional(DependienteDTO colegioDTO);

	void updateAdicional(DependienteDTO colegioDTO);

	void delete(DependienteDTO colegioDTO);
	
	List<DependienteDTO> getByParameterConResponsableAll(Map<String, Object> map);
	
}
