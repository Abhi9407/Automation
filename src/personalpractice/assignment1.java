package personalpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement ele = driver.findElement(By.id("Email"));
		ele.clear();

		Thread.sleep(2000);
		ele.sendKeys("admin@yourstore.com");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("Password"));
		ele1.clear();

		Thread.sleep(2000);
		ele1.sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		
		Thread.sleep(2000);
		
		String acttxt =driver.findElement(By.xpath("//title[text()='Dashboard / nopCommerce administration']")).getText();
		String exptxt = "Dashboard / nopCommerce administration";
		
		System.out.println(acttxt);
		/*if (acttxt.equals(exptxt)) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("test case failed");
		}
		
		driver.close();*/
	}

}
