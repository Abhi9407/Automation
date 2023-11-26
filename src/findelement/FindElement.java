package findelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		driver.switchTo().activeElement().sendKeys("BMW");

		Thread.sleep(2000);

		List<WebElement> bmw = driver.findElements(By.xpath("//div[@class = 'wM6W7d']"));

	
//		 for(WebElement el: bmw) { 
//			String bmwOption = el.getText();
//		    System.out.println(bmwOption); Thread.sleep(2000); }
		  
		for (int i = 0; i < bmw.size()-1; i++) {
			
			String bmwOption = bmw.get(i).getText();
			System.out.println(bmwOption);
			Thread.sleep(1000);
		}
		
		driver.close();

	}

}
