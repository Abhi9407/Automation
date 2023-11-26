package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExactSame {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

FileInputStream file = new FileInputStream("./data/testingdata.xlsx");//provide the path
		
		Workbook wb = WorkbookFactory.create(file);//make the file ready to read
		//workbook is a interface of the apche poi
		Sheet sheet = wb.getSheet("IPL");// get into the sheet
		int k = 0;
		int l= 1;
		for (int i = 1; i < 10 ; i++) {
			Row row=sheet.getRow(i);
			Cell cell = row.getCell(k);	
			String data = cell.getStringCellValue();
			
			Cell cell1 = row.getCell(l);
			String data2 = cell1.getStringCellValue();
			System.out.print(data + "  " + data2 );
			
			System.out.println("");
			
			
		}
		
			}

}
