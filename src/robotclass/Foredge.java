package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Foredge {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		WebDriverWait exp = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		
		Thread.sleep(2000);
		//shift control to cancel button 
		Thread.sleep(2000);
		Actions act =new Actions(driver);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		exp.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text () = 'Cancel' and @class ='c01129']")));
		
		WebElement target = driver.findElement(By.xpath("//span[@class ='c01129']/ancestor :: button [@class ='c01123 c01154']"));	
		act.doubleClick(target).perform();
		
		

	}

}
