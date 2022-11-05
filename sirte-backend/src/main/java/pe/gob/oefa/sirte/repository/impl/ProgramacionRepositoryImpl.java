package pe.gob.oefa.sirte.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.gob.oefa.sirte.dao.ProgramacionDAO;
import pe.gob.oefa.sirte.dto.ProgramacionDTO;
import pe.gob.oefa.sirte.repository.ProgramacionRepository;

@Repository("programacionRepository")
public class ProgramacionRepositoryImpl implements ProgramacionRepository {

	@Autowired
	private ProgramacionDAO programacionDAO;

	@Override
	public List<ProgramacionDTO> getByParameter(ProgramacionDTO t) {
		Map<String, Object> map = new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		map.put("codigovacuna", t.getCodigovacuna());

		return programacionDAO.getByParameter(map);
	}

	@Override
	public List<ProgramacionDTO> getByParameterAdmin(ProgramacionDTO t) {
		Map<String, Object> map = new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		map.put("codigovacuna", t.getCodigovacuna());

		return programacionDAO.getByParameterAdmin(map);
	}

	
	@Override
	public ProgramacionDTO get(ProgramacionDTO dependienteDTO) {
		return programacionDAO.get(dependienteDTO);
	}

	@Override
	public void save(ProgramacionDTO materiaDTO) {
		programacionDAO.save(materiaDTO);
	}

	@Override
	public void update(ProgramacionDTO materiaDTO) {
		programacionDAO.update(materiaDTO);
	}

	@Override
	public void delete(ProgramacionDTO materiaDTO) {
		programacionDAO.delete(materiaDTO);
	}

	@Override
	public void deleteDetalle(ProgramacionDTO programacionDTO) {
		// TODO Auto-generated method stub
		programacionDAO.deleteDetalle(programacionDTO);
	}

}
