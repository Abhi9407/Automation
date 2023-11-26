package handlepop;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptException;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsPopUp {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		WebElement target	=driver.findElement(By.id("uploadfile"));
		
//		Point loc = target.getLocation();
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy" + loc);
//		
//		target.click();
			
				
		Actions act = new Actions(driver);
		act.click(target).perform();
		
		Runtime.getRuntime().exec("./autoItPrograms/FILEupload.exe");
		
	}

}
