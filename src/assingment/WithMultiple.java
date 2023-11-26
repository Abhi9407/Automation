package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.linkText("Login"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type = 'text' and @class ='_2IX_2- VJZDxU']")).sendKeys("abhishek@1234gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() = 'Request OTP' and @class ='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
