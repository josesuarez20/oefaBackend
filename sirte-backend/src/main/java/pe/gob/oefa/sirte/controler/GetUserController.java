package pe.gob.oefa.sirte.controler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.dto.core.UserDTO;
import pe.gob.oefa.sirte.dao.UserDAO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class GetUserController {
	
	@Autowired
	private UserDAO userDAO;

	@CrossOrigin("*")
	@GetMapping("/get/{dni}")
	public List<UserDTO> getUsetByDni(@PathVariable String dni) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("dni", dni);
		
		List<UserDTO> ListuserDTO = userDAO.listarUsuarios(map);
		System.out.println("HOLAMUNDO:::");
		return ListuserDTO;
	}
}
