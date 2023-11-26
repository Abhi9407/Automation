package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	@FindBy(xpath ="//input[@value='Create New User']") private WebElement createUserButton;
	@FindBy(xpath ="//input[@name='username']") private WebElement usnTB;
	@FindBy(xpath ="//input[@name='passwordText']") private WebElement pssTB;
	@FindBy(xpath ="//input[@name='passwordTextRetype']") private WebElement pssTBRetype;
	@FindBy(xpath ="//input[@name='firstName']") private WebElement firstName;
	@FindBy(xpath ="//input[@name='lastName']") private WebElement lastName;
	@FindBy(xpath ="//input[@id='right12']") private WebElement modifyTimeTrack;
	@FindBy(xpath ="//input[@id='right2']") private WebElement manageCust;
	@FindBy(xpath ="//input[@id='right13']") private WebElement manageTask;
	@FindBy(xpath ="//input[@id='right1']") private WebElement generatesReport;
	@FindBy(xpath ="//input[@id='right5']") private WebElement manageUser;
	@FindBy(xpath ="//input[@id='right7']") private WebElement manageBilling;
	@FindBy(xpath ="//input[@type='submit']") private WebElement createUser;
	@FindBy(xpath ="//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement cancelButton;
	@FindBy(xpath ="//a[normalize-space()='qsp, rancht (testeng)']") private WebElement userLink;
	@FindBy(xpath ="//input[@value='Delete This User']") private WebElement deleteUserButton;
	
	 public UserPage( WebDriver driver)   {
    	 PageFactory.initElements(driver,this);
     }

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getPssTBRetype() {
		return pssTBRetype;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getModifyTimeTrack() {
		return modifyTimeTrack;
	}

	public WebElement getManageCust() {
		return manageCust;
	}

	public WebElement getManageTask() {
		return manageTask;
	}

	public WebElement getGeneratesReport() {
		return generatesReport;
	}

	public WebElement getManageUser() {
		return manageUser;
	}

	public WebElement getManageBilling() {
		return manageBilling;
	}

	public WebElement getCreateUser() {
		return createUser;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getUserLink() {
		return userLink;
	}

	public WebElement getDeleteUserButton() {
		return deleteUserButton;
	}
	 
	public void createManager(String username,String password,String fn,String ln) throws InterruptedException
    {
   	 createUserButton.click();
   	 Thread.sleep(1000);
   	 usnTB.sendKeys(username);
   	 pssTB.sendKeys(password);
   	 pssTBRetype.sendKeys(password);
   	 firstName.sendKeys(fn);
   	 lastName.sendKeys(ln);
   	 Thread.sleep(1000);
   	 modifyTimeTrack.click();
   	 manageCust.click();
   	 generatesReport.click();
   	 manageUser.click();
   	 manageBilling.click();
   	 Thread.sleep(1000);
   	 createUser.click();
    }
   
	 public void deleteManager()
     {
    	 userLink.click();
    	 deleteUserButton.click();
    	
     }
	
	

}
