package pe.gob.oefa.xdoc.component;

import java.io.ByteArrayOutputStream;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;


@Service("documentCreateWord")
public class DocumentCreateWordImpl extends GenericCreateDocument {

    

    @Override
    public void mergeReport(String templateName, String documentMerged, Map<String, Object> parameters) {
        String key = StringUtils.substringAfterLast(templateName, "/");

        SharedObjectsService.putInMemory(key);
        try {
            mergeReportTemplate(templateName, documentMerged, parameters);
        } finally {
            SharedObjectsService.deleteFromMemory(key);
        }
    }

    @Override
    public void mergeReportWithOutLogo(String templateName, ByteArrayOutputStream byteArrayOutputStream, Map<String, Object> parameters) {
        String key = StringUtils.substringAfterLast(templateName, "/");

        SharedObjectsService.putInMemory(key);
        try {
            mergeReportTemplateWithOutLogo(templateName,  byteArrayOutputStream, parameters);
        } finally {
            SharedObjectsService.deleteFromMemory(key);
        }

    } 
    
    @Override
    public void mergeReportWithOutLogo(String templateName, ByteArrayOutputStream byteArrayOutputStream, Map<String, Object> parameters,FieldsMetadata metadata) {
        String key = StringUtils.substringAfterLast(templateName, "/");

        SharedObjectsService.putInMemory(key);
        try {
            mergeReportTemplateWithOutLogo(templateName,  byteArrayOutputStream, parameters,metadata);
        } finally {
            SharedObjectsService.deleteFromMemory(key);
        }

    }
}
