package pe.gob.oefa.sirte.service;

import java.util.List;

import pe.gob.oefa.sirte.dto.ProgramacionDetalleDTO;

public interface ProgramacionDetalleService {

	List<ProgramacionDetalleDTO> findByParameter(ProgramacionDetalleDTO filter);

	List<ProgramacionDetalleDTO> findByParameterAdmin(ProgramacionDetalleDTO filter);

	List<ProgramacionDetalleDTO> findForAlerta(ProgramacionDetalleDTO filter);

	ProgramacionDetalleDTO get(ProgramacionDetalleDTO dependienteDTO);

	void save(ProgramacionDetalleDTO colegio);

	void update(ProgramacionDetalleDTO colegio);

	void delete(ProgramacionDetalleDTO colegio);
}
