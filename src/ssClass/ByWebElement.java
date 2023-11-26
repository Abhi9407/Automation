package ssClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByWebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chroe.driver", "./drivers/chromerdriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/");
		
		
	}

}
