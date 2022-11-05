package pe.gob.oefa.sirte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.sirte.dto.PruebaDescarteDTO;
import pe.gob.oefa.sirte.repository.PruebaDescarteRepository;
import pe.gob.oefa.sirte.service.PruebadescarteService;

@Service("pruebadescarteService")
@Transactional
public class PruebaDescarteServiceImpl extends ServiceBase implements PruebadescarteService {

	private CoreLogger logger = LoggerFactory.getLogger(PruebaDescarteServiceImpl.class);

	@Autowired
	private PruebaDescarteRepository pruebaDescarteRepository;


	@Override
	public List<PruebaDescarteDTO> findByParameter(PruebaDescarteDTO filter) {
		
		return pruebaDescarteRepository.getByParameter(filter);
	}
	
	@Override
	public List<PruebaDescarteDTO> findByParameterAdmin(PruebaDescarteDTO filter) {
		
		return pruebaDescarteRepository.getByParameterAdmin(filter);
	}

	@Override
	public PruebaDescarteDTO get(PruebaDescarteDTO dependienteDTO) {
		return pruebaDescarteRepository.get(dependienteDTO);
	}

	@Override
	public void save(PruebaDescarteDTO object) {
		pruebaDescarteRepository.save(object);
	}

	@Override
	public void update(PruebaDescarteDTO object) {
		pruebaDescarteRepository.update(object);
	}

	@Override
	public void delete(PruebaDescarteDTO object) {
		pruebaDescarteRepository.delete(object);
	}

}
