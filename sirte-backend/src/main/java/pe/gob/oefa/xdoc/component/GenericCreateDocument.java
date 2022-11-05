package pe.gob.oefa.xdoc.component;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.opensagres.xdocreport.converter.ConverterTypeTo;
import fr.opensagres.xdocreport.converter.ConverterTypeVia;
import fr.opensagres.xdocreport.converter.Options;
import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;
import pe.gob.oefa.core.exception.ServiceException;
import pe.gob.oefa.xdoc.DocumentCreateService;

public abstract class GenericCreateDocument implements DocumentCreateService {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected void createReport(String templateName, String reportName, ConverterTypeVia typeVia,
			Map<String, Object> parameters) {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		File agreementFile = null;
		try {
			File file = new File(templateName);
			inputStream = new FileInputStream(file);
			IXDocReport report = XDocReportRegistry.getRegistry().loadReport(inputStream, TemplateEngineKind.Velocity);
			IContext context = report.createContext();

			mergeParameters(parameters, context);
			agreementFile = new File(reportName);
			outputStream = new FileOutputStream(agreementFile);
			Options options = Options.getTo(ConverterTypeTo.PDF).via(typeVia);

			report.convert(context, options, outputStream);
			outputStream.flush();
		} catch (XDocReportException e) {
			logger.error(e.getMessage(), e);
			FileUtils.deleteQuietly(agreementFile);
			throw new ServiceException(e.getMessage(), e);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			FileUtils.deleteQuietly(agreementFile);
			throw new ServiceException(e.getMessage(), e);
		} finally {
			IOUtils.closeQuietly(inputStream);
			IOUtils.closeQuietly(outputStream);
		}
	}

	private void mergeParameters(Map<String, Object> parameters, IContext context) {
		for (String key : parameters.keySet()) {
			context.put(key, parameters.get(key));
		}
	}

	protected void mergeReportTemplate(String templateName, String reportName, Map<String, Object> parameters) {

		InputStream inputStream = null;
		OutputStream outputStream = null;
		File agreementFile = null;
		try {
			File file = new File(templateName);
			inputStream = new FileInputStream(file);
			IXDocReport report = XDocReportRegistry.getRegistry().loadReport(inputStream, TemplateEngineKind.Velocity);

			// FieldsMetadata metadata = report.createFieldsMetadata();
			// metadata.addFieldAsTextStyling("ACUERDO",SyntaxKind.Html,true);
			// metadata.addFieldAsTextStyling("EJECUCION_REUNION",SyntaxKind.Html,true);
			// metadata.load("td", EquipoDetalleAdapter.class, true );
			IContext context = report.createContext();
			mergeParameters(parameters, context);
			agreementFile = new File(reportName);
			outputStream = new FileOutputStream(agreementFile);
			report.process(context, outputStream);
			outputStream.flush();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			logger.info("=====================================");
			logger.error(e.getMessage(), e);
			logger.info("=====================================");
			FileUtils.deleteQuietly(agreementFile);
			throw new ServiceException(e.getMessage(), e);
		} catch (XDocReportException e) {
			logger.error(e.getMessage(), e);
			logger.info("=====================================");
			logger.error(e.getMessage(), e);
			logger.info("=====================================");
			FileUtils.deleteQuietly(agreementFile);
			throw new ServiceException(e.getMessage(), e);
		} finally {
			IOUtils.closeQuietly(inputStream);
			IOUtils.closeQuietly(outputStream);
		}
	}

	protected void mergeReportTemplateWithOutLogo(String templateName, ByteArrayOutputStream byteArrayOutputStream,
			Map<String, Object> parameters) {

		InputStream inputStream = null;
		try {

			File file = new File(templateName);
			inputStream = new FileInputStream(file);
			IXDocReport report = XDocReportRegistry.getRegistry().loadReport(inputStream, TemplateEngineKind.Velocity);
			IContext context = report.createContext();

			FieldsMetadata metadata = new FieldsMetadata();
			metadata.addFieldAsList("categoriasniveles.CategoriaId");
			metadata.addFieldAsList("categoriasniveles.Nombre");
			metadata.addFieldAsList("categoriasniveles.Nombrenivel");

			metadata.addFieldAsList("declaracionjurada.Nombre");

			metadata.addFieldAsList("experiencias.SolExperienciaId");
			metadata.addFieldAsList("experiencias.Entidad");
			metadata.addFieldAsList("experiencias.Actividad");
			metadata.addFieldAsList("experiencias.Periodo");
			metadata.addFieldAsList("experiencias.Materia");
			metadata.addFieldAsList("experiencias.TipoInstitucionNombre");
			metadata.addFieldAsList("experiencias.TipoEntidadNombre");
			metadata.addFieldAsList("experiencias.Tiempo");
			metadata.addFieldAsList("experiencias.ArcExperiencia");

			metadata.addFieldAsList("estudios.SolEstudioId");
			metadata.addFieldAsList("estudios.GradoAcademico");
			metadata.addFieldAsList("estudios.Carrera");
			metadata.addFieldAsList("estudios.Institucion");
			metadata.addFieldAsList("estudios.Lugar");
			metadata.addFieldAsList("estudios.Periodo");
			metadata.addFieldAsList("estudios.CreadoPor");
			metadata.addFieldAsList("estudios.ArcEstudio");

			metadata.addFieldAsList("otros.SolOtroEstudioId");
			metadata.addFieldAsList("otros.OtroGrado");
			metadata.addFieldAsList("otros.Nombre");
			metadata.addFieldAsList("otros.Institucion");
			metadata.addFieldAsList("otros.Lugar");
			metadata.addFieldAsList("otros.Periodo");
			metadata.addFieldAsList("otros.Horas");
			metadata.addFieldAsList("otros.ArcOtroEstudio");

			metadata.addFieldAsList("tercios.SolTercioId");
			metadata.addFieldAsList("tercios.Institucion");
			metadata.addFieldAsList("tercios.Especialidad");
			metadata.addFieldAsList("tercios.ArcTercio");

			// JURIDICA
			metadata.addFieldAsList("pjrepresentantelegal.Sec");
			metadata.addFieldAsList("pjrepresentantelegal.Nombres");
			metadata.addFieldAsList("pjrepresentantelegal.Ruc");
			metadata.addFieldAsList("pjrepresentantelegal.Partida");
			metadata.addFieldAsList("pjrepresentantelegal.Zona");

			metadata.addFieldAsList("pjdeclaracionjurada.Nombre");
			
			metadata.addFieldAsList("equipo.Sec");
			metadata.addFieldAsList("equipo.Nombre");
			metadata.addFieldAsList("equipo.Especialidad");
			
			metadata.addFieldAsList("totalexperiencias.Descripcion");
			metadata.addFieldAsList("totalexperiencias.ArcExperiencia");
			
			report.setFieldsMetadata(metadata);
			mergeParameters(parameters, context);
			// -----------------------------------------------------
			Options options = Options.getTo(ConverterTypeTo.PDF);
			report.convert(context, options, byteArrayOutputStream);
			// -----------------------------------------------------
			// report.process(context, byteArrayOutputStream);------se cambio para el pdf

			byteArrayOutputStream.flush();
			byteArrayOutputStream.close();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(e.getMessage(), e);
		} catch (XDocReportException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(e.getMessage(), e);
		} finally {
			IOUtils.closeQuietly(inputStream);
		}
	}
	
	
	protected void mergeReportTemplateWithOutLogo(String templateName, ByteArrayOutputStream byteArrayOutputStream,
			Map<String, Object> parameters,FieldsMetadata metadata ) {

		InputStream inputStream = null;
		try {

			File file = new File(templateName);
			inputStream = new FileInputStream(file);
			IXDocReport report = XDocReportRegistry.getRegistry().loadReport(inputStream, TemplateEngineKind.Velocity);
			IContext context = report.createContext();

			if(metadata!=null)
				report.setFieldsMetadata(metadata);
			mergeParameters(parameters, context);
			// -----------------------------------------------------
			Options options = Options.getTo(ConverterTypeTo.PDF);
			report.convert(context, options, byteArrayOutputStream);
			// -----------------------------------------------------
			// report.process(context, byteArrayOutputStream);------se cambio para el pdf

			byteArrayOutputStream.flush();
			byteArrayOutputStream.close();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(e.getMessage(), e);
		} catch (XDocReportException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(e.getMessage(), e);
		} finally {
			IOUtils.closeQuietly(inputStream);
		}
	}
}
