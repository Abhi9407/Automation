package locators;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateNetflixLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.netflix.com/in/login");
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("Abhishek@546gmail.com");
		
		driver.findElement(By.id("id_password")).sendKeys("Abhi@1234");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(10000);
		
		driver.close();
	}

}
