package pe.gob.oefa.sirte.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.gob.oefa.dto.core.ParametroDTO;
import pe.gob.oefa.sirte.dao.ParametroDAO;
import pe.gob.oefa.sirte.repository.ParametroRepository;

@Repository("parametroRepository")
public class ParametroRepositoryImpl implements ParametroRepository {

	@Autowired
	private ParametroDAO parametroDAO;

	@Override
	public List<ParametroDTO> obtener(ParametroDTO t) {
		Map<String, Object> map = new HashMap<>();
		map.put("aplicacioncodigo", t.getAplicacioncodigo());
		map.put("companiacodigo", t.getCompaniacodigo());
		map.put("parametroclave", t.getParametroclave());
		return parametroDAO.obtener(map);
	}

}
