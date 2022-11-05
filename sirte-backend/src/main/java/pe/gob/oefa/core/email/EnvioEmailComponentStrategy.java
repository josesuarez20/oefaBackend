package pe.gob.oefa.core.email;

import org.springframework.stereotype.Component;

import pe.gob.oefa.dto.core.EmailDTO;
import pe.gob.oefa.dto.core.EmailMetaDataDTO;

@Component("envioEmailComponentStrategy")
public class EnvioEmailComponentStrategy extends EmailBaseComponent implements EmailStrategy{

	@Override
	public void send(EmailMetaDataDTO emailMetaData) {
		EmailDTO email = new EmailDTO();	
		email.setSubject(emailMetaData.getSubject());
		email.setTos(emailMetaData.getListTo());
		email.setCc(emailMetaData.getListCc());
		email.setBcc(emailMetaData.getListBc());
		email.setParameters(emailMetaData.getParametros());
		email.setTemplate(emailMetaData.getTemplate());
		email.setiCalendar(emailMetaData.getiCalendar());
		email.setFileContent(emailMetaData.getFileContent());
		email.setFileName(emailMetaData.getFileName());
		super.sendEmail(email);
	}

}
