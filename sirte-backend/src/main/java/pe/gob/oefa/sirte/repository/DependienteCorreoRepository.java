package pe.gob.oefa.sirte.repository;

import java.util.List;

import pe.gob.oefa.sirte.dto.DependienteCorreoDTO;

public interface DependienteCorreoRepository {

	List<DependienteCorreoDTO> getByParameter(DependienteCorreoDTO filter);
	
	DependienteCorreoDTO get(DependienteCorreoDTO DependienteCorreoDTO);

	void save(DependienteCorreoDTO DependienteCorreoDTO);

	void update(DependienteCorreoDTO DependienteCorreoDTO);

	void delete(DependienteCorreoDTO DependienteCorreoDTO);
	
}
