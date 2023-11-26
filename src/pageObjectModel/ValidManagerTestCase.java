package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ValidManagerTestCase extends Basetest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		Basetest bt = new Basetest();
		bt.openBrowser();
		
		FLib flib = new FLib();
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		UserPage up = new UserPage(driver);
		
		WorkLib worklib = new WorkLib();
		
		//perform Valid Login
		lp.validLoginMethod(flib.readPropertyData(Proppath,"Username"),flib.readPropertyData(Proppath, "Password"));
		// click on users Module
		hp.clickOnusersModule();
		// create the manager
		up.createManager(flib.readExcelData(Excelpath,"managercreds",1,0),flib.readExcelData(Excelpath,"managercreds",1,1),flib.readExcelData(Excelpath,"managercreds",1,2),flib.readExcelData(Excelpath,"managercreds",1,3));
		// Delete User
		up.deleteManager();
		worklib.handleConfirmationPopup();
		
		Thread.sleep(2000);
		bt.closeBrowser();
	}

}
