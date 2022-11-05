package pe.gob.oefa.xdoc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;
import pe.gob.oefa.core.exception.ServiceException;

public interface DocumentCreateService {

    public static final String DOCXFILE = ".DOCX";
	public static final String PDFFILE = ".PDF";

	void mergeReport(String templateName, String documentMerged, Map<String, Object> parameters) throws IOException, XDocReportException, ServiceException;
	
	void mergeReportWithOutLogo(String templateName, ByteArrayOutputStream byteArrayOutputStream, Map<String, Object> parameters) throws IOException, XDocReportException, ServiceException;
	
	void mergeReportWithOutLogo(String templateName, ByteArrayOutputStream byteArrayOutputStream, Map<String, Object> parameters,FieldsMetadata metadata) throws IOException, XDocReportException, ServiceException;
}
