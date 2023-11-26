package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://desktop-0imma8m/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class = 'content administration']")));
		
		driver.findElement(By.xpath("//a[@class = 'content administration']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text () = 'Logo & Color Scheme']")));
		
		driver.findElement(By.xpath("//a[text () = 'Logo & Color Scheme']")).click();
		
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name ='formCustomInterfaceLogo.logo']")));
		//driver.findElement(By.xpath("//input[@name ='formCustomInterfaceLogo.logo']/ancestor :: td [@style = 'padding-left:8px']")).click();
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//input[@name ='formCustomInterfaceLogo.logo']"));
		
		act.doubleClick(target).perform();
		
		Thread.sleep(2000);
		
		
		
		

	}

}
