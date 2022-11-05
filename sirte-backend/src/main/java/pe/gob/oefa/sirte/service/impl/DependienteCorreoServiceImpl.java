package pe.gob.oefa.sirte.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.sirte.dto.DependienteCorreoDTO;
import pe.gob.oefa.sirte.repository.DependienteCorreoRepository;
import pe.gob.oefa.sirte.service.DependienteCorreoService;

@Service("dependienteCorreoService")
@Transactional
public class DependienteCorreoServiceImpl extends ServiceBase implements DependienteCorreoService {

	private CoreLogger logger = LoggerFactory.getLogger(DependienteCorreoServiceImpl.class);

	@Autowired
	private DependienteCorreoRepository dependienteCorreoRepository;

	@Override
	public List<DependienteCorreoDTO> findByParameter(DependienteCorreoDTO filter) {

		return dependienteCorreoRepository.getByParameter(filter);
	}

	@Override
	public DependienteCorreoDTO get(DependienteCorreoDTO dependienteDTO) {

		List<DependienteCorreoDTO> datos = new ArrayList<>();
		DependienteCorreoDTO retorno = null;

		datos = dependienteCorreoRepository.getByParameter(dependienteDTO);
		if (datos != null) {
			if (datos.size() > 0) {
				retorno = datos.get(0);
			}
		}

		return retorno;
	}

	@Override
	public void save(DependienteCorreoDTO object) {
		dependienteCorreoRepository.save(object);
	}

	@Override
	public void update(DependienteCorreoDTO object) {
		dependienteCorreoRepository.update(object);
	}

	@Override
	@Transactional
	public void delete(DependienteCorreoDTO object) {
		dependienteCorreoRepository.delete(object);
	}

}
