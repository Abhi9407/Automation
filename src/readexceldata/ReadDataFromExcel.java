package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//read data from ipl sheet
		//implementation of  read the data from excel
		
		FileInputStream file = new FileInputStream("./data/testingdata.xlsx");//provide the path
		
		Workbook wb = WorkbookFactory.create(file);//make the file ready to read
		//workbook is a interface of the apche poi
		Sheet sheet = wb.getSheet("IPL");// get into the sheet
		Row row=sheet.getRow(3);//get innto the desired row
		Cell cell = row.getCell(1);	//get innto the desired cell
		
		String data = cell.getStringCellValue();//get the value
		System.out.println(data);
		
		
		
	}

}

