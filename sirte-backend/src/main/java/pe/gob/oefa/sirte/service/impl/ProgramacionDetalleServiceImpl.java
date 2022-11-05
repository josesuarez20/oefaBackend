package pe.gob.oefa.sirte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.sirte.dto.ProgramacionDetalleDTO;
import pe.gob.oefa.sirte.repository.ProgramacionDetalleRepository;
import pe.gob.oefa.sirte.service.ProgramacionDetalleService;

@Service("programaciondetalleService")
@Transactional
public class ProgramacionDetalleServiceImpl extends ServiceBase implements ProgramacionDetalleService {

	private CoreLogger logger = LoggerFactory.getLogger(ProgramacionDetalleServiceImpl.class);

	@Autowired
	private ProgramacionDetalleRepository programacionDetalleRepository;


	@Override
	public List<ProgramacionDetalleDTO> findByParameter(ProgramacionDetalleDTO filter) {
		
		return programacionDetalleRepository.getByParameter(filter);
	}
	
	@Override
	public List<ProgramacionDetalleDTO> findByParameterAdmin(ProgramacionDetalleDTO filter) {
		
		return programacionDetalleRepository.getByParameterAdmin(filter);
	}

	@Override
	public ProgramacionDetalleDTO get(ProgramacionDetalleDTO dependienteDTO) {
		return programacionDetalleRepository.get(dependienteDTO);
	}

	@Override
	public void save(ProgramacionDetalleDTO object) {
		programacionDetalleRepository.save(object);
	}

	@Override
	public void update(ProgramacionDetalleDTO object) {
		programacionDetalleRepository.update(object);
	}

	@Override
	public void delete(ProgramacionDetalleDTO object) {
		programacionDetalleRepository.delete(object);
	}

	@Override
	public List<ProgramacionDetalleDTO> findForAlerta(ProgramacionDetalleDTO filter) {
		// TODO Auto-generated method stub
		return programacionDetalleRepository.getForAlerta(filter);
	}

}
