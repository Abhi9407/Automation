package readexceldata;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filelibraray.FLib;

public class ActitimeLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");
		
		FLib flib = new FLib();
		
		String validusername = flib.readExcelData("./data/actitimedata.xlsx", "validcred", 1, 0);
		String validpassword = flib.readExcelData("./data/actitimedata.xlsx", "validcred", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(validusername);
		driver.findElement(By.name("pwd")).sendKeys(validpassword);
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
		
		}

	}


