package pe.gob.oefa.sirte.repository.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.gob.oefa.sirte.dao.CorreoEnvioDAO;
import pe.gob.oefa.sirte.dto.CorreoEnvioDTO;
import pe.gob.oefa.sirte.repository.CorreoEnvioRepository;

@Repository("correoFormatoRepository")
public class CorreoEnvioRepositoryImpl implements CorreoEnvioRepository {

	@Autowired
	private CorreoEnvioDAO correoEnvioDAO;

	@Override
	public CorreoEnvioDTO get(BigDecimal id) {
		return correoEnvioDAO.get(id);
	}

	@Override
	public void save(CorreoEnvioDTO correoEnvioDTO) {
		correoEnvioDAO.save(correoEnvioDTO);
	}

	@Override
	public void update(CorreoEnvioDTO correoEnvioDTO) {
		correoEnvioDAO.update(correoEnvioDTO);
	}

	@Override
	public void delete(CorreoEnvioDTO correoEnvioDTO) {
		correoEnvioDAO.delete(correoEnvioDTO);
	}

}
