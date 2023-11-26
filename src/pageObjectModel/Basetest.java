package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest extends FLib implements IautoConstant {

	static WebDriver driver;

	public void openBrowser() throws IOException {
		FLib flib = new FLib();
		String browserValue = flib.readPropertyData(Proppath, "Browser");
		String url = flib.readPropertyData(Proppath, "Url");

		if (browserValue.equalsIgnoreCase("chrome")) {

			System.setProperty(Chrome_key, Chrome_Path);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		} else if (browserValue.equalsIgnoreCase("edge")) {

			System.setProperty(Edge_key, Edge_Path);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		} else if (browserValue.equalsIgnoreCase("Firefox")) {

			System.setProperty(Firefox_key, Firefox_Path);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		}

	}
	public void closeBrowser() {
		driver.quit();
	}

}
