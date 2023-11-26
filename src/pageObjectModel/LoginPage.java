package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='username']") private WebElement usnTB;
	@FindBy(xpath = "//input[@name='pwd']") private WebElement pssTB;
	@FindBy(xpath = "//input[@id='keepLoggedInCheckBox']") private WebElement chekbox;
	@FindBy(xpath = "//a[@id='loginButton']") private WebElement loginButton;
	@FindBy(xpath = "//a[@id='licenseLink']") private WebElement licenseLink;

	
	//initialization
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

	//getters
	//utilisation
	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getChekbox() {
		return chekbox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
	public void validLoginMethod(String validUsername, String validPassword) {
		usnTB.sendKeys(validUsername);
		pssTB.sendKeys(validPassword);
		loginButton.click();
	}
	
	public void invalidLoginMethod(String invalidUsername, String invalidPassword) throws InterruptedException {
		
		usnTB.sendKeys(invalidUsername);
		pssTB.sendKeys(invalidPassword);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		usnTB.clear();
	}
		
}
