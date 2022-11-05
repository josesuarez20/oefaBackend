package pe.gob.oefa.sirte.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.gob.oefa.sirte.dao.ProgramacionDetalleDAO;
import pe.gob.oefa.sirte.dto.ProgramacionDetalleDTO;
import pe.gob.oefa.sirte.repository.ProgramacionDetalleRepository;

@Repository("programaciondetalleRepository")
public class ProgramacionDetalleRepositoryImpl implements ProgramacionDetalleRepository {

	@Autowired
	private ProgramacionDetalleDAO programacioDetallenDAO;

	@Override
	public List<ProgramacionDetalleDTO> getByParameter(ProgramacionDetalleDTO t) {
		Map<String, Object> map = new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		map.put("codigovacuna", t.getCodigovacuna());
		map.put("realizado", t.getRealizado());
		return programacioDetallenDAO.getByParameter(map);
	}
	
	@Override
	public List<ProgramacionDetalleDTO> getByParameterAdmin(ProgramacionDetalleDTO t) {
		Map<String, Object> map = new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		map.put("codigovacuna", t.getCodigovacuna());
		map.put("realizado", t.getRealizado());
		return programacioDetallenDAO.getByParameterAdmin(map);
	}
	
	@Override
	public List<ProgramacionDetalleDTO> getForAlerta(ProgramacionDetalleDTO t) {
		Map<String, Object> map = new HashMap<>();
		return programacioDetallenDAO.getForAlerta(map);
	}

	@Override
	public ProgramacionDetalleDTO get(ProgramacionDetalleDTO dependienteDTO) {
		return programacioDetallenDAO.get(dependienteDTO);
	}

	@Override
	public void save(ProgramacionDetalleDTO materiaDTO) {
		programacioDetallenDAO.save(materiaDTO);
	}

	@Override
	public void update(ProgramacionDetalleDTO materiaDTO) {
		programacioDetallenDAO.update(materiaDTO);
	}

	@Override
	public void delete(ProgramacionDetalleDTO materiaDTO) {
		programacioDetallenDAO.delete(materiaDTO);
	}

}
