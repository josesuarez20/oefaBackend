package pe.gob.oefa.core.email;

import org.springframework.stereotype.Component;

import pe.gob.oefa.dto.core.EmailMetaDataDTO;

@Component("emailContext")
public class EmailContext {
	
	private EmailStrategy emailStrategy;
	
	/**
	 * 
	 * @param emailStrategy
	 */
	public void setEmailEstrategy(EmailStrategy emailStrategy) {
		this.emailStrategy = emailStrategy;
	}
	
	/**
	 * 
	 * @param emailMetaData
	 */
	public void createAndSendEmail(EmailMetaDataDTO emailMetaData) {
		emailStrategy.send(emailMetaData);
	}

}
