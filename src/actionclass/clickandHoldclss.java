package actionclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clickandHoldclss {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait exp = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();

		WebElement target = driver.findElement(By.xpath("//a[@title = 'Watch Jewellery']"));

		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[@title = 'Band']")).click();
		
		exp.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class = 'opt-title' and text() = 'Filter by']")));
		
		WebElement target2 =driver.findElement(By.xpath("//div[@class = 'opt-title' and text() = 'Filter by']"));
		
		for(int i = 0 ; i<=1 ; i++) {
			
			act.doubleClick(target2).perform();
			act.clickAndHold(target2).perform();
		}
		
		
		 Robot rbt = new Robot();
		 
		 rbt.keyPress(KeyEvent.VK_CONTROL);
		 rbt.keyPress(KeyEvent.VK_C);
		 
		 rbt.keyRelease(KeyEvent.VK_CONTROL);
		 rbt.keyRelease(KeyEvent.VK_C);
		 
		 
		 driver.findElement(By.xpath("//input[@id = 'search_query_top_elastic_search']")).click();
		 
		 rbt.keyPress(KeyEvent.VK_CONTROL);
		 rbt.keyPress(KeyEvent.VK_V);
		 
		 rbt.keyRelease(KeyEvent.VK_CONTROL);
		 rbt.keyRelease(KeyEvent.VK_V);
		 
		 rbt.keyPress(KeyEvent.VK_ENTER);
		 rbt.keyRelease(KeyEvent.VK_ENTER);
		 
		 //verify 1 design is displayed or not
		 
		 if((driver.findElement(By.xpath("//span[@class = 'total-designs' and text() = '1 Designs']"))).isDisplayed()) {
			 
			 System.out.println("test case passed");
		 }
		 
		 else {
			 System.out.println("test case failed");
		 }
		 
		 
		 driver.quit();
		 
		 
		 
		
		


	}
}
