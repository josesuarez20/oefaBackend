package pe.gob.oefa.sirte.service;

import java.util.List;

import pe.gob.oefa.sirte.dto.DependienteCorreoDTO;

public interface DependienteCorreoService {

	List<DependienteCorreoDTO> findByParameter(DependienteCorreoDTO filter);

	DependienteCorreoDTO get(DependienteCorreoDTO dependienteDTO);

	void save(DependienteCorreoDTO colegio);

	void update(DependienteCorreoDTO colegio);

	void delete(DependienteCorreoDTO colegio);

}
