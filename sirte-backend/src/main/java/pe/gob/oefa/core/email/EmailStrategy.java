package pe.gob.oefa.core.email;

import pe.gob.oefa.dto.core.EmailMetaDataDTO;

public interface EmailStrategy {
	
	/**
	 * 
	 * @param emailMetaData
	 */
	public void send(EmailMetaDataDTO emailMetaData);

}
