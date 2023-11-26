package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("Abhishke");
		
		driver.findElement(By.cssSelector("input[id = 'pass']")).sendKeys("Abhishke");
		driver.findElement(By.cssSelector("button[name = 'login']")).click();
		Thread.sleep(2000);
		
		

	}

}
