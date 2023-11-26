package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.tagName("input")).sendKeys("Abhishek");
		//there are more than one element by the tagname input that's why we will get unchecked exception by which our program will
		//stop`
		WebElement usn = driver.findElement(By.tagName("input"));
				
		usn.sendKeys("Abhishek");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
