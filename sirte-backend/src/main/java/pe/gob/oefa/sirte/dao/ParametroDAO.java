package pe.gob.oefa.sirte.dao;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.dto.core.ParametroDTO;

public interface ParametroDAO {

	List<ParametroDTO> obtener(Map<String, Object> map);
	
}
