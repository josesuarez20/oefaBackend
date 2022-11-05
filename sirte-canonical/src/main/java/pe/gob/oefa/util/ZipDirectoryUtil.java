package pe.gob.oefa.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDirectoryUtil  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5974495908569877229L;
	public static byte[] getZip(String path) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ZipOutputStream zipOut = new ZipOutputStream(baos);
			File fileToZip = new File(path); 
			zipFile(fileToZip, fileToZip.getName(), zipOut);
			zipOut.close();
			baos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return baos.toByteArray();
	}
	private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
		 if(fileToZip.isHidden()){
			 return;
		 }
		 if(fileToZip.isDirectory()){
			 File[] children = fileToZip.listFiles();
			 for (File childFile : children) {
				 zipFile(childFile, fileName + "/" + childFile.getName(), zipOut);
			 }
			  return;
		 }
		 FileInputStream fis = new FileInputStream(fileToZip);
		 ZipEntry zipEntry = new ZipEntry(fileName);
		 zipOut.putNextEntry(zipEntry);
		 byte[] bytes = new byte[1024];
		 int length;
		 while ((length = fis.read(bytes)) >= 0) { 
			 zipOut.write(bytes, 0, length);
		 }
		 fis.close();
	}
}
