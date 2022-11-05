package pe.gob.oefa.sirte.repository;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.sirte.dto.DependienteDTO;

public interface DependienteRepository {

	List<DependienteDTO> getByParameter(DependienteDTO filter);

	List<DependienteDTO> getByParameterConResponsable(DependienteDTO filter);

	List<DependienteDTO> getByParameterAdicional(DependienteDTO filter);

	DependienteDTO get(DependienteDTO dependienteDTO);

	void save(DependienteDTO colegioDTO);

	void update(DependienteDTO colegioDTO);

	void saveAdicional(DependienteDTO colegioDTO);

	void updateAdicional(DependienteDTO colegioDTO);

	void delete(DependienteDTO colegioDTO);
	
	List<DependienteDTO> getByParameterConResponsableAll(DependienteDTO filter);
}
