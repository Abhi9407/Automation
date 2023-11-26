package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bluestoneautomate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait exp = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();

		WebElement target = driver.findElement(By.xpath("//a[text() = 'Coins ']"));

		Actions act = new Actions(driver);

		act.moveToElement(target).perform();
		//exp.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[@class = 'active']/span[text () = '1 gram']"))));
		//driver.findElement(By.xpath("//li[@class = 'active']/span[text () = '1 gram']")).click();
		driver.findElement(By.xpath("//span[text () = '1 gram' and @data-p = 'gold-coins-weight-1gms,m']")).click();
		exp.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id = 'details-top-inner']")));
		Boolean display = driver.findElement(By.xpath("//a[@id = '5920']")).isDisplayed();

		if (display) {

			
			driver.close();
			System.out.println("script is successfully executed");

		} else {
			System.out.println("exception ouccred");
		}
		

	}

}
