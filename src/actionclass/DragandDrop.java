package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement scr1 = driver.findElement(By.xpath("//a[text() = ' SALES ']"));
		WebElement target1 = driver.findElement(By.xpath("//ol[@id = 'loan']/li"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(scr1, target1).perform();
		
		WebElement scr2 = driver.findElement(By.xpath("//a[text() = ' BANK ']"));
	WebElement target2 = driver.findElement(By.xpath("//ol[@id = 'bank']/li[@class ='placeholder']"));
	
	act.dragAndDrop(scr2, target2).perform();
		
	WebElement scr3 = driver.findElement(By.xpath("//a[text() = ' 5000']"));
	WebElement target3 = driver.findElement(By.xpath("//ol[@id = 'amt7']/li[@class ='placeholder']"));
	
	act.dragAndDrop(scr3, target3).perform();
	
	
	WebElement target4 = driver.findElement(By.xpath("//ol[@id = 'amt8']/li[@class ='placeholder']"));
	Thread.sleep(2000);
	act.dragAndDrop(scr3, target4).perform();
	if (driver.findElement(By.xpath("//a[text () = 'Perfect!']")).isDisplayed()) {
	 System.out.println("test case passed");	
	 driver.quit();
	
		
	}else {
		System.out.println("exception");
	}
		
	}

}
