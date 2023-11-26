package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	static WebDriver driver;

	@Test
	@Parameters({"browser","url","Vusername","Vpassword"})
	// we can add multiple parameters by adding on curly brackets inside the
	// paranthesis() for eg ({"browser","url","Vusername"})
	public void chromeMethod(String browservalue, String url, String usn, String pass) {
		if (browservalue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();

		} else if (browservalue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
		}
	}
}
