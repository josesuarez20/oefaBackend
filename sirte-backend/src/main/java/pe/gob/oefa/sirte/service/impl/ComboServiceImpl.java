package pe.gob.oefa.sirte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.dto.core.ComboDTO;
import pe.gob.oefa.sirte.repository.ComboRepository;
import pe.gob.oefa.sirte.service.ComboService;

@Service("comboService")
@Transactional
public class ComboServiceImpl extends ServiceBase implements ComboService {

	private CoreLogger logger = LoggerFactory.getLogger(ComboServiceImpl.class);
	
	@Autowired
	private ComboRepository comboRepository;

	@Override
	public List<ComboDTO> listarTipoVinculo(ComboDTO t) {
		// TODO Auto-generated method stub
		return comboRepository.listarTipoVinculo(t);
	}

	@Override
	public List<ComboDTO> listarVacuna(ComboDTO t) {
		// TODO Auto-generated method stub
		return comboRepository.listarVacuna(t);
	}
}
