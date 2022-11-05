package pe.gob.oefa.sirte.dao;

import java.util.List;

import pe.gob.oefa.sirte.dto.PersonaDTO;
public interface PersonaDAO {

	PersonaDTO getByCodigoUsuario(String codigousuario);

	PersonaDTO getByDocumento(String documento);
	
	List<PersonaDTO> getByParameter(PersonaDTO obj);
}
