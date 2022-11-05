package pe.gob.oefa.sirte.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.gob.oefa.sirte.dao.DependienteCorreoDAO;
import pe.gob.oefa.sirte.dto.DependienteCorreoDTO;
import pe.gob.oefa.sirte.repository.DependienteCorreoRepository;

@Repository("DependienteCorreoRepository")
public class DependienteCorreoRepositoryImpl implements DependienteCorreoRepository {

	@Autowired
	private DependienteCorreoDAO dependienteCorreoDAO;

	@Override
	public List<DependienteCorreoDTO> getByParameter(DependienteCorreoDTO t) {
		Map<String, Object> map = new HashMap<>();
		map.put("documentoresponsable", t.getDocumentoresponsable());
		map.put("documento", t.getDocumento());
		map.put("tipo", t.getTipo());

		return dependienteCorreoDAO.getByParameter(map);
	}

	@Override
	public DependienteCorreoDTO get(DependienteCorreoDTO dependienteDTO) {
		return dependienteCorreoDAO.get(dependienteDTO);
	}

	@Override
	public void save(DependienteCorreoDTO materiaDTO) {
		dependienteCorreoDAO.save(materiaDTO);
	}

	@Override
	public void update(DependienteCorreoDTO materiaDTO) {
		dependienteCorreoDAO.update(materiaDTO);
	}

	@Override
	public void delete(DependienteCorreoDTO materiaDTO) {
		dependienteCorreoDAO.delete(materiaDTO);
	}

}
