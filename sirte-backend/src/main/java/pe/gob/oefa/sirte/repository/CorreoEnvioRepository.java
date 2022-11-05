package pe.gob.oefa.sirte.repository;

import java.math.BigDecimal;

import pe.gob.oefa.sirte.dto.CorreoEnvioDTO;

public interface CorreoEnvioRepository {

	CorreoEnvioDTO get(BigDecimal id);

	void save(CorreoEnvioDTO correoEnvioDTO);

	void update(CorreoEnvioDTO correoEnvioDTO);

	void delete(CorreoEnvioDTO correoEnvioDTO);
}
