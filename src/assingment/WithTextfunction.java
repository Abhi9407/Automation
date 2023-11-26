package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithTextfunction {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.netflix.com/in/login");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name ='userLoginId']")).sendKeys("Abhishek@546gmail.com");
		
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("Abhi@1234");
		
		driver.findElement(By.xpath("//button[text() ='Sign In']")).click();
		
		Thread.sleep(10000);
		
		
		driver.close();
		
		
		
		
		
		
		
	}

}
