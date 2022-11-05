package pe.gob.oefa.sirte.service;

import pe.gob.oefa.sirte.dto.PersonaDTO;

public interface PersonaService {

	PersonaDTO getByCodigoUsuario(String codigousuario);

	PersonaDTO getByDocumento(String documento);
}
