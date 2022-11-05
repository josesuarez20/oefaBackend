package pe.gob.oefa.sirte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.core.service.ServiceBase;
import pe.gob.oefa.dto.core.ParametroDTO;
import pe.gob.oefa.sirte.repository.ParametroRepository;
import pe.gob.oefa.sirte.service.ParametroService;

@Service("parametroService")
@Transactional
public class ParametroServiceImpl extends ServiceBase implements ParametroService {

	private CoreLogger logger = LoggerFactory.getLogger(ParametroServiceImpl.class);

	@Autowired
	private ParametroRepository parametroRepository;

	@Override
	public ParametroDTO obtener(ParametroDTO t) {
		// TODO Auto-generated method stub
		ParametroDTO resultado = null;
		List<ParametroDTO> lista = parametroRepository.obtener(t);

		if (lista != null) {
			resultado = lista.get(0);
		}

		return resultado;
	}

}
