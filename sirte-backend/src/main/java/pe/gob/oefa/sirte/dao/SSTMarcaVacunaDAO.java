package pe.gob.oefa.sirte.dao;

import java.util.Map;

public interface SSTMarcaVacunaDAO {

	Map<String, Object> getByParameter(Map<String, Object> map);

	Map<String, Object> get(Map<String, Object> map);

	Map<String, Object> save(Map<String, Object> map) throws Exception;

	Map<String, Object> update(Map<String, Object> map) throws Exception;

	Map<String, Object> delete(Map<String, Object> map) throws Exception;

}
