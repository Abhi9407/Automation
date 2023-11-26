package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimescn {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://desktop-0imma8m/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String lgoinPageTitle = driver.getTitle();

		if (lgoinPageTitle.equals("actiTIME - Login")) {

			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

		} else {
			System.out.println("test case failed ");
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Logout']")));

		String loggedInPageTitle = driver.getTitle();

		if (loggedInPageTitle.equals("actiTIME - Enter Time-Track")) {

			driver.findElement(By.xpath("//a[text()='Logout']")).click();

		} else {
			System.out.println("test case failed");

		}

		driver.close();
	}

}
