package pe.gob.oefa.sirte.dao;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.sirte.dto.ProgramacionDTO;

public interface ProgramacionDAO {

	List<ProgramacionDTO> getByParameter(Map<String,Object> map);
	
	List<ProgramacionDTO> getByParameterAdmin(Map<String,Object> map);

	ProgramacionDTO get(ProgramacionDTO programacionDTO);

	void save(ProgramacionDTO programacionDTO);

	void update(ProgramacionDTO programacionDTO);

	void delete(ProgramacionDTO programacionDTO);

	void deleteDetalle(ProgramacionDTO programacionDTO);
}
