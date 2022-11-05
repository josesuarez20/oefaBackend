package pe.gob.oefa.sirte.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.gob.oefa.sirte.dao.ProgramacionDetalleDAO;
import pe.gob.oefa.sirte.dao.PruebaDescarteDAO;
import pe.gob.oefa.sirte.dto.PruebaDescarteDTO;
import pe.gob.oefa.sirte.repository.ProgramacionDetalleRepository;
import pe.gob.oefa.sirte.repository.PruebaDescarteRepository;

@Repository("pruebadescarteRepository")
public class PruebaDescarteRepositoryImpl implements PruebaDescarteRepository {

	@Autowired
	private PruebaDescarteDAO pruebaDescarteDAO;

	@Override
	public List<PruebaDescarteDTO> getByParameter(PruebaDescarteDTO t) {
		Map<String, Object> map = new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		map.put("codigovacuna", t.getCodigovacuna());
		map.put("realizado", t.getRealizado());
		return pruebaDescarteDAO.getByParameter(map);
	}
	
	@Override
	public List<PruebaDescarteDTO> getByParameterAdmin(PruebaDescarteDTO t) {
		Map<String, Object> map = new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		map.put("codigovacuna", t.getCodigovacuna());
		return pruebaDescarteDAO.getByParameterAdmin(map);
	}

	@Override
	public PruebaDescarteDTO get(PruebaDescarteDTO dependienteDTO) {
		return pruebaDescarteDAO.get(dependienteDTO);
	}

	@Override
	public void save(PruebaDescarteDTO materiaDTO) {
		pruebaDescarteDAO.save(materiaDTO);
	}

	@Override
	public void update(PruebaDescarteDTO materiaDTO) {
		pruebaDescarteDAO.update(materiaDTO);
	}

	@Override
	public void delete(PruebaDescarteDTO materiaDTO) {
		pruebaDescarteDAO.delete(materiaDTO);
	}

}
