package pe.gob.oefa.sirte.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.gob.oefa.sirte.dao.PersonaDAO;
import pe.gob.oefa.sirte.dto.PersonaDTO;
import pe.gob.oefa.sirte.repository.PersonaRepository;

@Repository("personaRepository")
public class PersonaRepositoryImpl implements PersonaRepository {

	@Autowired
	private PersonaDAO personaDAO;
	
	@Override
	public PersonaDTO getByCodigoUsuario(String codigousuario) {
		// TODO Auto-generated method stub
		return personaDAO.getByCodigoUsuario(codigousuario);
	}

	@Override
	public PersonaDTO getByDocumento(String documento) {
		// TODO Auto-generated method stub
		return personaDAO.getByDocumento(documento);
	}

	@Override
	public List<PersonaDTO> getByParameter(PersonaDTO obj) {
		// TODO Auto-generated method stub
		return personaDAO.getByParameter(obj);
	}
	
}
