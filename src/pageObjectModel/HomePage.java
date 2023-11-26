package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[@class='content tt_selected selected']//div//img") private WebElement timetrackmodule;
	@FindBy(xpath = "//a[@class='content tasks']//img[@class='sizer']") private WebElement taskmodule;
	@FindBy(xpath = "//a[@class='content reports']//img[@class='sizer']") private WebElement reportsmodule;
	@FindBy(xpath = "//a[@class='content users']//img[@class='sizer']") private WebElement usersmodule;
	@FindBy(xpath = "//a[@class='content calendar']//img[@class='sizer']") private WebElement schedulemodule;
	@FindBy(xpath = "//a[@class='content administration_selected selected']//div//img") private WebElement settingsmodule;
	@FindBy(xpath = "//a[@class='logout']") private WebElement logoutLink;
	
	public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
				
	}

	public WebElement getTimetrackmodule() {
		return timetrackmodule;
	}

	public WebElement getTaskmodule() {
		return taskmodule;
	}

	public WebElement getReportsmodule() {
		return reportsmodule;
	}

	public WebElement getUsersmodule() {
		return usersmodule;
	}

	public WebElement getCalendermodule() {
		return schedulemodule;
	}

	public WebElement getSttingsmodule() {
		return settingsmodule;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public void clickOntimeTrackModule()
	{
		timetrackmodule.click();
	}
	
	public void clickOntaskModule()
	{
		taskmodule.click();
	}
	
	public void clickOnReportesModule()
	{
		reportsmodule.click();
	}
	
	public void clickOnusersModule()
	{
		usersmodule.click();
	}
	
	public void clickOnWorkScheduleModule()
	{
		schedulemodule.click();
	}
	
	public void clickOnSettings()
	{
		settingsmodule.click();
	}
	
	public void clickOnLogoutLink()
	{
		logoutLink.click();
	}
	
	

}
