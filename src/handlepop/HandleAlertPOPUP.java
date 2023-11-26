package handlepop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HandleAlertPOPUP {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/User/Desktop/alertpopup.html");
		
		driver.findElement(By.xpath("//button[@type = 'button']")).click();
		/// by the alert method we can handle alert popup as well as confirmation popup
//		//by robot class
//		Robot rbt = new Robot();
//		rbt.keyPress(KeyEvent.VK_ENTER);
//		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		

	}

}
