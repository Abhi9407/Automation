package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://integrator.actitime.com/auth/at");
		
		driver.findElement(By.name("actiTimeUrl")).sendKeys("Abhisehk@qa112gmail.com");
		
		driver.findElement(By.name("username")).sendKeys("Abhisehk@qa112gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Abhi@1234");
		
		driver.findElement(By.className("_2m183 _2E5C_")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
