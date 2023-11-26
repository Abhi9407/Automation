package ssClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ByDowncasting {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait exp = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");

		// by downcasting to remotewebdriver

		RemoteWebDriver rwd = (RemoteWebDriver) driver;

		File scr = rwd.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshot/anotherone.png");

		Files.copy(scr, dest);

	}

}
