package methodsOfWebDriver;
	
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Manage method for the maximize

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// Manage method to set size

		Dimension size = new Dimension(500, 600);

		driver.manage().window().setSize(size);

		Thread.sleep(2000);

		// Manage method for the position

		Point point = new Point(100, 200);

		driver.manage().window().setPosition(point);

		Thread.sleep(2000);

		driver.close();

	}

}
