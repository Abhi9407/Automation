package ssClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.print.attribute.standard.Destination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class SShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait exp = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");

		// typecasting from webdriver to takescreenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		// storing it in a refrence
		File scr = ts.getScreenshotAs(OutputType.FILE);
		// storing it in a folder
		// here we will give
//		1.path 
//		2.name of the file 
//		3.extension of the fil2
		//we will use the relative path
		File dest = new File("./screenshot/google.png");
		
		Files.copy(scr, dest);
		
	}

}
