package pageObjectModel;

import java.io.IOException;

public class ValidLoginTestc extends Basetest{

	public static void main(String[] args) throws IOException {
		
		Basetest bt = new Basetest();
		bt.openBrowser();
		FLib flib = new FLib();
		LoginPage lp = new LoginPage(driver);
		lp.getUsnTB().sendKeys(flib.readPropertyData(Proppath, "Username"));
		lp.getPssTB().sendKeys(flib.readPropertyData(Proppath, "Password"));
		lp.getLoginButton().click();
	
		

	}

}
