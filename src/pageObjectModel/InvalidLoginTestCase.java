package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends Basetest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		Basetest bt = new Basetest();
		bt.openBrowser();
		
		LoginPage lp = new LoginPage(driver);
		
		FLib flib = new FLib();
		
		int rc = flib.getLastRowCount(Excelpath, "invalidcred");
		
		for (int i = 1; i <rc; i++) {
			lp.invalidLoginMethod(flib.readExcelData(Excelpath,"invalidcred", i, 0), flib.readExcelData(Excelpath, "invalidcred", i, 1));
			
		}
		
	}

}
