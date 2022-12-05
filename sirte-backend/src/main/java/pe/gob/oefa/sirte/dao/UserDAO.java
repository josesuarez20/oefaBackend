package pe.gob.oefa.sirte.dao;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.dto.core.UserDTO;

public interface UserDAO {
	List<UserDTO> listarUsuarios(Map<String, Object> map) throws Exception;
}
