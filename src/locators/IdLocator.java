package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		// by the help of ID method we provide value

		WebElement usn = driver.findElement(By.id("email"));
		
		usn.sendKeys("Abhishek");
		
		
		WebElement pwd = driver.findElement(By.id("pass"));
		
		pwd.sendKeys("pass");


	}

}
