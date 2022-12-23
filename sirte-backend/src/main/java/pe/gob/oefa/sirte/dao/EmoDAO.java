package pe.gob.oefa.sirte.dao;

import java.util.List;
import java.util.Map;

import pe.gob.oefa.sirte.dto.BDTablesDTO;
import pe.gob.oefa.sirte.dto.EmoDTORequest;
import pe.gob.oefa.sirte.dto.EmoDTOResponse;
import pe.gob.oefa.sirte.dto.EmoDocumentDTOResponse;
import pe.gob.oefa.sirte.dto.EmoMatrizDTORequest;
import pe.gob.oefa.sirte.dto.EmoMatrizDTOResponse;

public interface EmoDAO {
	List<EmoDTOResponse> getAllEmo() throws Exception;
	List<BDTablesDTO> getAllTables() throws Exception;
	List<EmoDTOResponse> emoConsultaByDni(Map<String, Object> map) throws Exception;
	List<EmoDocumentDTOResponse> EmoExamenesById(Map<String, Object> map) throws Exception;
	List<EmoDocumentDTOResponse> getAllEmoExamenes(Map<Integer, Object> map) throws Exception;
	Integer saveEmo(EmoDTORequest emoDTORequest);
	Integer updateEmo(EmoDTORequest emoDTORequest);
	
	Integer saveEmoMatriz(EmoMatrizDTORequest emoDTORequest);
	List<EmoMatrizDTOResponse> getAllEmoMatriz() throws Exception;


}
