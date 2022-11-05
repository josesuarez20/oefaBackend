package pe.gob.oefa.sirte.service;

import java.util.List;

import pe.gob.oefa.sirte.dto.DependienteDTO;
import pe.gob.oefa.sirte.dto.ProgramacionDTO;
import pe.gob.oefa.sirte.dto.PruebaDescarteDTO;

public interface DependienteService {

	List<DependienteDTO> findByParameter(DependienteDTO filter);

	List<DependienteDTO> findByParameterConResponsable(DependienteDTO filter);

	List<DependienteDTO> findByParameterAdicional(DependienteDTO filter);

	List<DependienteDTO> findprogramacion(ProgramacionDTO filter);

	List<DependienteDTO> findprogramacionAdmin(ProgramacionDTO filter) throws Exception;

	List<DependienteDTO> findpruebadescarte(PruebaDescarteDTO filter);

	List<DependienteDTO> findpruebadescarteAdmin(PruebaDescarteDTO filter) throws Exception;

	DependienteDTO get(DependienteDTO dependienteDTO);

	DependienteDTO nuevoByDni(String dniresponsable, String dni);

	void save(DependienteDTO colegio);

	void update(DependienteDTO colegio);

	void saveAdicional(DependienteDTO colegio);

	void updateAdicional(DependienteDTO colegio);

	void delete(DependienteDTO colegio);

	List<DependienteDTO> getByParameterConResponsableAll(DependienteDTO filter) throws Exception;
}
