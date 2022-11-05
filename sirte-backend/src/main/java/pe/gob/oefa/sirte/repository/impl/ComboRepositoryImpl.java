package pe.gob.oefa.sirte.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.gob.oefa.dto.core.ComboDTO;
import pe.gob.oefa.sirte.dao.ComboDAO;
import pe.gob.oefa.sirte.repository.ComboRepository;

@Repository("comboRepository")
public class ComboRepositoryImpl implements ComboRepository {

	@Autowired
	private ComboDAO comboDAO;

	@Override
	public List<ComboDTO> listarTipoVinculo(ComboDTO t) {
		Map<String, Object> map = new HashMap<>();
		return comboDAO.listarTipoVinculo(map);
	}

	@Override
	public List<ComboDTO> listarVacuna(ComboDTO t) {
		Map<String, Object> map = new HashMap<>();
		map.put("codigoelemento", t.getCodigo());
		return comboDAO.listarVacuna(map);
	}

}
