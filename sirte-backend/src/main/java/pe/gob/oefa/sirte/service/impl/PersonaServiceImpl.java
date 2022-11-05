package pe.gob.oefa.sirte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.sirte.dto.PersonaDTO;
import pe.gob.oefa.sirte.repository.PersonaRepository;
import pe.gob.oefa.sirte.service.PersonaService;

@Service("personaService")
@Transactional
public class PersonaServiceImpl extends ServiceBase implements PersonaService {

	private CoreLogger logger = LoggerFactory.getLogger(PersonaServiceImpl.class);

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public PersonaDTO getByCodigoUsuario(String codigousuario) {
		// TODO Auto-generated method stub
		return personaRepository.getByCodigoUsuario(codigousuario);
	}

	@Override
	public PersonaDTO getByDocumento(String documento) {
		// TODO Auto-generated method stub
		return personaRepository.getByDocumento(documento);
	}

}
