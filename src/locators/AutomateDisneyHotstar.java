package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateDisneyHotstar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait exp = new WebDriverWait(driver, Duration.ofSeconds(15));// object for explicit wait
		driver.get("https://www.hotstar.com/in/mypage#mp-login");

		driver.findElement(By.xpath("//span[text() = 'Log In']")).click();

		driver.findElement(By.id("7")).sendKeys("9407255433");
		exp.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']")));//using explicit wait

		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		Thread.sleep(10000);

		driver.close();
	}

}
