package keyworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends Basetest{

	public static void main(String[] args) throws IOException, InterruptedException {
		Basetest bt = new Basetest();
		bt.openBrowser();
		FLib flib =new FLib();
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(Proppath, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(Proppath, "Password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		bt.closeBrowser();
		
		
		

	}

}
