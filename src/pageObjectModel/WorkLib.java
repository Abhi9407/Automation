package pageObjectModel;

public class WorkLib extends Basetest {
	
	public void handleConfirmationPopup()
	{
		driver.switchTo().alert().accept();
	}
}
