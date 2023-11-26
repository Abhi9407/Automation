package TestNGPackage;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method2() throws InterruptedException {
	  Reporter.log("this is a demo class", true);
	  System.setProperty("webdriver.chrme.driver", "./driver/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  Thread.sleep(2000);
	  driver.quit();
  }
}
