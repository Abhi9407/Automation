package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// for active elements	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.switchTo().activeElement().sendKeys("selenium", Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.close();
		
			

	}

}
