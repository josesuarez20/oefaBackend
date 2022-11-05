package pe.gob.oefa.sirte.repository;

import java.util.List;

import pe.gob.oefa.sirte.dto.ProgramacionDetalleDTO;

public interface ProgramacionDetalleRepository {

	List<ProgramacionDetalleDTO> getByParameter(ProgramacionDetalleDTO filter);
	
	List<ProgramacionDetalleDTO> getByParameterAdmin(ProgramacionDetalleDTO filter);
	
	List<ProgramacionDetalleDTO> getForAlerta(ProgramacionDetalleDTO filter);

	ProgramacionDetalleDTO get(ProgramacionDetalleDTO programacionDTO);

	void save(ProgramacionDetalleDTO programacionDTO);

	void update(ProgramacionDetalleDTO programacionDTO);

	void delete(ProgramacionDetalleDTO programacionDTO);
	
}
