package pe.gob.oefa.sirte.service;

import pe.gob.oefa.dto.core.EmailDTO;

public interface EnvioMailService {

	public void sendEmail(EmailDTO emailDTO);
}
