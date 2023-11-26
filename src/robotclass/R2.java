package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class R2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait exp = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");

		Actions act= new Actions(driver);
		
		 WebElement target = driver.findElement(By.xpath("//span[text () ='Downloads']"));
		 
		 act.contextClick(target).perform();
		 
		 Robot robot = new Robot();
		 for (int i = 1; i <= 6; i++) {
			 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			 Thread.sleep(2000);
		}
		 
		 robot.keyPress(KeyEvent.VK_ENTER);	
		
		
		
		

	}

}
