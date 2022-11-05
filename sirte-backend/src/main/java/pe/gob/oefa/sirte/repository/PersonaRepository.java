package pe.gob.oefa.sirte.repository;

import java.util.List;

import pe.gob.oefa.sirte.dto.PersonaDTO;

public interface PersonaRepository {

	PersonaDTO getByCodigoUsuario(String codigousuario);

	PersonaDTO getByDocumento(String documento);
	
	List<PersonaDTO> getByParameter(PersonaDTO obj);
}
