package pe.gob.oefa.sirte.controler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.oefa.dto.core.UserDTO;
import pe.gob.oefa.sirte.dao.EmoDAO;
import pe.gob.oefa.sirte.dao.UserDAO;
import pe.gob.oefa.sirte.dto.BDTablesDTO;
import pe.gob.oefa.sirte.dto.EmoDTORequest;
import pe.gob.oefa.sirte.dto.EmoDTOResponse;
import pe.gob.oefa.sirte.dto.EmoDocumentDTOResponse;
import pe.gob.oefa.sirte.dto.EmoMatrizDTORequest;
import pe.gob.oefa.sirte.dto.EmoMatrizDTOResponse;
import pe.gob.oefa.sirte.dto.ResponseGenericDTO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/emo")
public class EmoController {
	private static final  String MESSAGE_UPDATE = "Registro actualizado";
	private static final  String MESSAGE_CREATE = "Registro creado";
	private static final  String MESSAGE_ERROR_404 = "Registro no encontrado";
	private static final  String MESSAGE_ERROR_400 = "No envío el parametro:";
	private static final  String MESSAGE_ERROR_500 = "Error interno servidor";



	@Autowired
	private EmoDAO emoDAO;

	@CrossOrigin("*")
	@GetMapping("/consulta")
	public List<EmoDTOResponse> getAll() throws Exception {
		return emoDAO.getAllEmo();
	}
	@GetMapping("/tables")
	public List<BDTablesDTO> getAllTables() throws Exception {
		return emoDAO.getAllTables();
	}
	@CrossOrigin("*")
	@PostMapping("/consulta")
	public ResponseGenericDTO registrar(@RequestBody EmoDTORequest emoDTORequest) throws Exception {
		ResponseGenericDTO response = new ResponseGenericDTO();
		try {
			response.setSuccess(emoDAO.saveEmo(emoDTORequest) == 1 ? true : false);
			response.setCode(201);
			response.setMessage(MESSAGE_CREATE);
			
		} catch (Exception e) {
			response.setSuccess(false);
			response.setCode(500);
			response.setMessage(e.getMessage());
		}
		return response;
		
	}
	@CrossOrigin("*")
	@PutMapping("/consulta")
	public ResponseGenericDTO update(@RequestBody EmoDTORequest emoDTORequest) throws Exception {
		ResponseGenericDTO response = new ResponseGenericDTO();
		
		try {
			response.setSuccess(emoDAO.updateEmo(emoDTORequest) == 1 ? true : false);
			response.setCode(200);
			response.setMessage(MESSAGE_UPDATE);
			
		} catch (Exception e) {
			response.setSuccess(false);
			response.setCode(500);
			response.setMessage(e.getMessage());
		}
		return response;
		
	}

	@CrossOrigin("*")
	@GetMapping("/consulta/{dni}")
	public List<EmoDocumentDTOResponse> getEmoDni(@PathVariable String dni)
	throws Exception {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("dni", dni);
		String id = emoDAO.emoConsultaByDni(map).get(0).getId().toString();
		
		Map<String, Object> map_ = new HashMap<>();
		map_.put("id", id);
		List<EmoDocumentDTOResponse> emoExamenes = emoDAO.EmoExamenesById(map_);
		return emoExamenes;
	}
	/**
	 * 
	 * */
	@CrossOrigin("*")
	@GetMapping("/matriz")
	public List<EmoMatrizDTOResponse> getAllMatriz() throws Exception {
		return emoDAO.getAllEmoMatriz();
	}
	
	@Transactional
	@CrossOrigin("*")
	@PostMapping("/matriz")
	public ResponseGenericDTO registrarMatriz(@RequestBody List<EmoMatrizDTORequest> requestList) throws Exception {
		ResponseGenericDTO response = new ResponseGenericDTO();
		try {
			for (int i = 0; i < requestList.size(); i++) {
				emoDAO.saveEmoMatriz(requestList.get(i));
			}
			response.setSuccess(true);
			response.setCode(201);
			response.setMessage(MESSAGE_CREATE);
			
		} catch (Exception e) {
			response.setSuccess(false);
			response.setCode(500);
			response.setMessage(e.getMessage());
		}
		return response;
		
	}
	 
}
