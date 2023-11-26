package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateFlipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		//explicit wait object
		WebDriverWait exp = new WebDriverWait(driver, Duration.ofSeconds(30));
	
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text() = '✕']")).click();
		
		//Search the product 

		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("Laptops");
		driver.findElement(By.xpath("//button[@class = 'L0Z3Pu']")).click();
		
		//apply the filters 
		driver.findElement(By.xpath("//div[@class = '_24_Dny']/following-sibling :: div[text() = 'Core i7']")).click();
		
		exp.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = '_2gmUFU _3V8rao' and text() = 'Brand']")));
		driver.findElement(By.xpath("//div[@class = '_2gmUFU _3V8rao' and text() = 'Brand']")).click();
		driver.findElement(By.xpath("//div[@class = '_24_Dny']/following-sibling :: div[text() = 'HP']")).click();
		
		exp.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = '_24_Dny']/following-sibling :: div[text() = '4★ & above']")));
		driver.findElement(By.xpath("//div[@class = '_24_Dny']/following-sibling :: div[text() = '4★ & above']")).click();
		
		exp.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = '_2gmUFU _3V8rao' and text() = 'Operating System']")));
		driver.findElement(By.xpath("//div[@class = '_2gmUFU _3V8rao' and text() = 'Operating System']")).click();
		driver.findElement(By.xpath("//div[@class = '_24_Dny']/following-sibling :: div[text() = 'Windows 11']")).click();
		
		//storing the web element 
		List<WebElement> laptop = driver.findElements(By.xpath("// div[@class ='col col-7-12']/descendant :: div[@class = '_4rR01T']"));
		
		List<WebElement> price = driver.findElements(By.xpath("// div[@class ='_25b18c']/descendant :: div[@class = '_30jeq3 _1_WHN1']"));
		
		for (int i = 0; i < laptop.size(); i++) {
			
			for (int j = 0; j <= i; j++) {
				
			 String lap = laptop.get(i).getText();
			 String pri = laptop.get(j).getText();
			 
			 System.out.println(lap+" "+ pri);
			 
				
			}
			
		}
		
		
		driver.close();

	}

}
