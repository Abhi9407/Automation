package pageObjectModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FLib {
	
	public String readExcelData(String loc, String sheetname, int rowcount, int cellcount ) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(loc);//provide the path
		
		Workbook wb = WorkbookFactory.create(file);//make the file ready to read
		//workbook is a interface of the apche poi
		Sheet sheet = wb.getSheet(sheetname);// get into the sheet	
		Row row=sheet.getRow(rowcount);//get innto the desired row
		Cell cell = row.getCell(cellcount);	//get innto the desired cell
		
		String data = cell.getStringCellValue();//get the value
		
		return data;
	}
	public int getLastRowCount(String loc, String sheetname) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream(loc);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;
	}
	
	public void writeDataIntoCell(String loc, String sheetname, int rowcount, int cellcount, String value) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(loc);
		Workbook wb =  WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetname);
		Row row= sheet.createRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(loc);
		wb.write(fos);
	
		
		
	}
	public String readPropertyData(String proppath, String key ) throws IOException {
		FileInputStream file = new FileInputStream(proppath);
		Properties prop = new Properties();
		prop.load(file);
		String data=prop.getProperty(key);
		return data;
		
		
	}
	}

