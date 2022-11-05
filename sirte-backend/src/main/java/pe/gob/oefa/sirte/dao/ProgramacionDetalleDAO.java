package pe.gob.oefa.sirte.dao;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.sirte.dto.ProgramacionDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDetalleDTO;

public interface ProgramacionDetalleDAO {

	List<ProgramacionDetalleDTO> getByParameter(Map<String, Object> map);
	
	List<ProgramacionDetalleDTO> getByParameterAdmin(Map<String, Object> map);

	List<ProgramacionDetalleDTO> getForAlerta(Map<String, Object> map);

	ProgramacionDetalleDTO get(ProgramacionDetalleDTO programacionDTO);

	void save(ProgramacionDetalleDTO programacionDTO);

	void update(ProgramacionDetalleDTO programacionDTO);

	void delete(ProgramacionDetalleDTO programacionDTO);

}
