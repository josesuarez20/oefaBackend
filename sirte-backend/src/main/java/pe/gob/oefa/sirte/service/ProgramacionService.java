package pe.gob.oefa.sirte.service;

import java.util.List;

import pe.gob.oefa.sirte.dto.ProgramacionDTO;

public interface ProgramacionService {

	List<ProgramacionDTO> findByParameter(ProgramacionDTO filter);
	
	List<ProgramacionDTO> findByParameterAdmin(ProgramacionDTO filter);

	ProgramacionDTO get(ProgramacionDTO dependienteDTO);

	void save(ProgramacionDTO colegio);

	void update(ProgramacionDTO colegio);

	void delete(ProgramacionDTO colegio);

}
