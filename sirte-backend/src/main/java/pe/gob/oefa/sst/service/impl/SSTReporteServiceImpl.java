package pe.gob.oefa.sst.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.oefa.apps.base.util.UtilFile;
import pe.gob.oefa.core.logger.CoreLogger;
import pe.gob.oefa.core.logger.LoggerFactory;
import pe.gob.oefa.sst.dto.SSTReporteDto;
import pe.gob.oefa.sst.service.SSTReporteService;

@Service("sstreporteService")
@Transactional
public class SSTReporteServiceImpl implements SSTReporteService<SSTReporteDto> {

	private CoreLogger logger = LoggerFactory.getLogger(SSTReporteServiceImpl.class);

	@Override
	public File generarReporteExcel(String plantilla, ArrayList<HashMap<Integer, String>> data, int rowIni)
			throws Exception {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource(plantilla);
		FileInputStream inputStream = null;

		File fileReporteMuestra = resource.getFile();
		String excelFilePath = fileReporteMuestra.getAbsolutePath();
		String excelFilePathCopy = fileReporteMuestra.getAbsolutePath().replace(fileReporteMuestra.getName(),
				UtilFile.obtenerArchivoUnico(fileReporteMuestra.getName()));
		File fileCopia = new File(excelFilePathCopy);

		if (!fileCopia.exists()) {
			if (UtilFile.copyFile(excelFilePath, excelFilePathCopy)) {
				inputStream = new FileInputStream(new File(excelFilePathCopy));
			}
		}

		Workbook workbook = WorkbookFactory.create(inputStream);

		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short) 14);
		headerFont.setColor(IndexedColors.DARK_BLUE.getIndex());
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		workbook = crearHoja(workbook, headerCellStyle, data, rowIni);

		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(excelFilePathCopy);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();

		return fileCopia;
	}

	private Workbook crearHoja(Workbook workbook, CellStyle headerCellStyle, ArrayList<HashMap<Integer, String>> data,
			int rowIni) {
		// TODO Auto-generated method stub
		Sheet sheet = workbook.getSheetAt(0);
		int rowCount = rowIni;

		for (Object rowObj : data) {
			Row row = sheet.createRow(++rowCount);

			HashMap<Integer, String> hashObj = (HashMap<Integer, String>) rowObj;
			Iterator itr = hashObj.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry entry = (Map.Entry) itr.next();
				String valor = hashObj.get(entry.getKey());
				row.createCell((int) entry.getKey()).setCellValue(valor);
			}

		}

		return workbook;
	}

}
