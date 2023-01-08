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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import pe.gob.oefa.dto.core.UserDTO;
import pe.gob.oefa.model.json.ReporteResponse;
import pe.gob.oefa.sirte.dao.EmoDAO;
import pe.gob.oefa.sirte.dao.UserDAO;
import pe.gob.oefa.sirte.dto.BDTablesDTO;
import pe.gob.oefa.sirte.dto.EmoDTORequest;
import pe.gob.oefa.sirte.dto.EmoDTOResponse;
import pe.gob.oefa.sirte.dto.EmoDocumentDTORequest;
import pe.gob.oefa.sirte.dto.EmoDocumentDTOResponse;
import pe.gob.oefa.sirte.dto.EmoMatrizDTORequest;
import pe.gob.oefa.sirte.dto.EmoMatrizDTOResponse;
import pe.gob.oefa.sirte.dto.ResponseGenericDTO;
import pe.gob.oefa.sirte.facade.DocumentoEmoFacade;
import pe.gob.oefa.sirte.facade.DocumentoFacade;

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
	private DocumentoEmoFacade documentoFacade;

	@Autowired
	private EmoDAO emoDAO;
	@Autowired
	private UserDAO userDAO;

	@CrossOrigin("*")
	@PostMapping("/updload")
	public ResponseGenericDTO updload(
			@RequestParam("files") MultipartFile[] files, 
			@RequestParam("idEmoConsulta") Integer idEmoConsulta,
			@RequestParam("usuarioCreacion") String usuarioCreacion,
			@RequestParam("habilitado") Integer habilitado,
			@RequestParam("nombreExamen") String nombreExamen

			) {
		ResponseGenericDTO response = new ResponseGenericDTO();
		try {
			ReporteResponse responseDocumento =  documentoFacade.updload(files);
			EmoDocumentDTORequest request = new EmoDocumentDTORequest();
			request.setCodigoExamen(responseDocumento.getNombre());
			request.setNombreArchivo(responseDocumento.getNombreArchivo());
			request.setHabilitado(habilitado);
			request.setUsuarioCreacion(usuarioCreacion);
			request.setIdEmoConsulta(idEmoConsulta);
			request.setPathExamen(responseDocumento.getExtension());
			request.setNombreExamen(nombreExamen);
			
			response.setSuccess(emoDAO.saveEmoDocumento(request) == 1? true : false);
			response.setCode(201);
			response.setMessage(responseDocumento.getNombre());
			
		} catch (Exception e) {
			response.setSuccess(false);
			response.setCode(500);
			response.setMessage(e.getMessage());
		}
		System.out.println("Estamos en el subir documento....------///ZZZZZ>>>>>>>>>>>>>>>>>>>>>" + files.length);
		return response;
		
	}

	@CrossOrigin("*")
	@PostMapping("/updloasd")
	public ReporteResponse updload(
			@RequestParam("files") MultipartFile[] files
			

			) {
				return documentoFacade.updload(files);
		
	}
	@CrossOrigin("*")
	@GetMapping("/consulta")
	public List<EmoDTOResponse> getAll() throws Exception {
		List<EmoDTOResponse> emos = emoDAO.getAllEmo();
		for (int i = 0; i < emos.size(); i++) {
			Map<String, Object> map = new HashMap<>();
			map.put("dni", emos.get(i).getDni());
			UserDTO ListuserDTO = userDAO.listarUsuariosByDni(map).get(0);
			Map<String, Integer> map2 = new HashMap<>();
			
			map2.put("idEmoConsulta", emos.get(i).getId());
			
			List<EmoDocumentDTORequest> emoExamenes = emoDAO.getAllEmoExamenes(map2);
			
			emos.get(i).setUser(ListuserDTO);
			emos.get(i).setDocumentos(emoExamenes);

		}

		return emos;
	}
	
	@CrossOrigin("*")
	@GetMapping("/consulta/user/{dni}")
	public List<EmoDTOResponse> getOneEmo(@PathVariable String dni) throws Exception {
		Map<String, Object> map_ = new HashMap<>();
		map_.put("dni", dni);
		List<EmoDTOResponse> emos = emoDAO.getOneEmo(map_);
		
		for (int i = 0; i < emos.size(); i++) {
			Map<String, Object> map = new HashMap<>();
			map.put("dni", emos.get(i).getDni());
			UserDTO ListuserDTO = userDAO.listarUsuariosByDni(map).get(0);
			Map<String, Integer> map2 = new HashMap<>();
			
			map2.put("idEmoConsulta", emos.get(i).getId());
			
			List<EmoDocumentDTORequest> emoExamenes = emoDAO.getAllEmoExamenes(map2);
			
			emos.get(i).setUser(ListuserDTO);
			emos.get(i).setDocumentos(emoExamenes);

		}

		return emos;
	}
	
	@GetMapping("/tables")
	public List<BDTablesDTO> getAllTables() throws Exception {
		
		return emoDAO.getAllTables();
	}
	
	@CrossOrigin("*")
	@GetMapping("/get/{uuid}")
	public ReporteResponse get(@PathVariable String uuid) {
		return documentoFacade.get(uuid);
	}

	@CrossOrigin("*")
	@PostMapping("/consulta")
	public ResponseGenericDTO registrar(@RequestBody EmoDTORequest emoDTORequest) throws Exception {
		ResponseGenericDTO response = new ResponseGenericDTO();
		
		
		try {
			Integer respuesta = emoDAO.saveEmo(emoDTORequest);
			if(respuesta == 1) {
				List<EmoDTOResponse> lista = emoDAO.getAllEmo();;
				response.setSuccess(true);
				response.setCode(201);
				response.setMessage(lista.get(lista.size()-1).getId().toString());
			}
			
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
	@GetMapping("/documentos/{idEmoConsulta}")
	public List<EmoDocumentDTORequest> getEmoDni(@PathVariable Integer idEmoConsulta)
	throws Exception {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("idEmoConsulta", idEmoConsulta);
		
		List<EmoDocumentDTORequest> emoExamenes = emoDAO.getAllEmoExamenes(map);
		return emoExamenes;
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
