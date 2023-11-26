package javascriptexiecuterclss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executescript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/");

		Point loc = driver.findElement(By.xpath("//h2[text() = 'News']")).getLocation();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// to generate alert popup
		// jse.executeScript("window.alert('hello')");

		// String js = "window.scrollBy" + loc ;

		// to scroll till the specific element
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy" + loc);

		// to scroll up
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1000)");

		//jse.executeScript("document.getElementById('enter element id').click();");
		//jse.executeScript("documnet.getElementById('enter element id').value = "the value you want to provide";")
		//or
		//jse.executeScript("arguments[0].click();", okButton);
		//jse.executeScript("arguments[0].scrollIntoView(true), webelement we have to provide);
		
		//in the above line if we pass true then it will move till the end of the element and 
		//if we use false the it will move to the start of the webelement 
		driver.quit();

	}

}
