package pe.gob.oefa.sirte.repository;

import java.util.List;

import pe.gob.oefa.sirte.dto.ProgramacionDTO;

public interface ProgramacionRepository {

	List<ProgramacionDTO> getByParameter(ProgramacionDTO filter);
	
	List<ProgramacionDTO> getByParameterAdmin(ProgramacionDTO filter);
	
	ProgramacionDTO get(ProgramacionDTO programacionDTO);

	void save(ProgramacionDTO programacionDTO);

	void update(ProgramacionDTO programacionDTO);

	void delete(ProgramacionDTO programacionDTO);
	
	void deleteDetalle(ProgramacionDTO programacionDTO);
}
