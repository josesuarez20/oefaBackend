package pe.gob.oefa.core.email;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import org.apache.poi.util.IOUtils;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.springframework.ui.velocity.VelocityEngineUtils;

import pe.gob.oefa.dto.core.EmailDTO;
import pe.gob.oefa.util.DateUtil;
import pe.gob.oefa.util.GenericUtil;

@SuppressWarnings("deprecation")
@Component("emailBaseComponente")
public class EmailBaseComponent {
	// private CoreLogger logger = LoggerFactory.getLogger(ActaServiceImpl.class);
	private static final String ENCODE_UTF8 = "UTF-8";

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private VelocityEngine velocityEngine;

	@Value("${email.from}")
	private String from;

	@Value("${invite.ics}")
	private String invite;

	protected void sendEmail(final EmailDTO email) {
		try {

			MimeMessagePreparator preparator = new MimeMessagePreparator() {

				public void prepare(MimeMessage mimeMessage) throws Exception {

					MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
					InputStream inputStream = null;
					// logger.info("El email.getFileName():::"+email.getFileName());
					if (GenericUtil.isNotEmpty(email.getFileName())) {
						if (GenericUtil.isNotEmpty(email.getFileContentType())) {
							inputStream = new ByteArrayInputStream(email.getFileContent());
							byte[] targetArray = new byte[inputStream.available()];
							inputStream.read(targetArray);
							helper.addAttachment(email.getFileName(), new InputStreamResource(inputStream),
									email.getFileContentType());
							inputStream.close();
						} else {
							inputStream = new ByteArrayInputStream(email.getFileContent());
							byte[] targetArray = new byte[inputStream.available()];
							inputStream.read(targetArray);
							inputStream.close();
							// helper.addAttachment(email.getFileName(), new
							// InputStreamResource(inputStream));

							helper.addAttachment(email.getFileName(),
									new ByteArrayResource(IOUtils.toByteArray(inputStream)));
						}
					}

					String mensaje = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, email.getTemplate(),
							ENCODE_UTF8, email.getParameters());

					// logger.info("El email.getSubject():::"+email.getSubject());
					mimeMessage.setSubject(email.getSubject());
					InternetAddress[] addressTo = new InternetAddress[email.getTos().size()];
					int i = 0;
					for (String row : email.getTos()) {
						addressTo[i] = new InternetAddress(row);
						i++;
					}
					
					InternetAddress[] addressCc = new InternetAddress[email.getCc().size()];
					int j = 0;
					for (String row : email.getCc()) {
						addressCc[j] = new InternetAddress(row);
						j++;
					}
					
					mimeMessage.addRecipients(Message.RecipientType.TO, addressTo);
					mimeMessage.addRecipients(Message.RecipientType.CC, addressCc);
					
					BodyPart message = new MimeBodyPart();
					message.setDataHandler(
							new DataHandler(new ByteArrayDataSource(mensaje, "text/html; charset=\"utf-8\"")));

					Multipart multipart = new MimeMultipart();

					if (GenericUtil.isNotEmpty(email.getiCalendar())) {
						BodyPart iCalAttachment = new MimeBodyPart();
						iCalAttachment.setDataHandler(new DataHandler(
								new javax.mail.util.ByteArrayDataSource(new ByteArrayInputStream(email.getiCalendar()),
										"text/calendar;method=REQUEST;charset=\"UTF-8\"")));
						iCalAttachment.setFileName(invite);
						multipart.addBodyPart(iCalAttachment);
					}

					/********
					 * DESCOMENTADO EL DIA 09082018
					 ************************************************************************/
					if (GenericUtil.isNotEmpty(email.getFileName())) {
						BodyPart fileAttachment = new MimeBodyPart();
						fileAttachment.setDataHandler(new DataHandler(new javax.mail.util.ByteArrayDataSource(
								new ByteArrayInputStream(email.getFileContent()), email.getFileContentType())));
						fileAttachment.setFileName(email.getFileName());
						multipart.addBodyPart(fileAttachment);
					}
					/********
					 * DESCOMENTADO EL DIA 09082018
					 ************************************************************************/
					// logger.info("El mensaje es::"+message);---mensaje encriptado

					multipart.addBodyPart(message);
					// logger.info("De....dE...::"+from);----correo desde donde sale
					mimeMessage.setFrom(new InternetAddress(from));
					mimeMessage.setSentDate(DateUtil.getCurrentDate());
					mimeMessage.setContent(multipart);
				}
			};
			this.mailSender.send(preparator);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
