package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(CustomeListener.class)
public class TestCase extends BaseTest {
	
	@Test
  public void loginMethod() {
	  WebElement usn = driver.findElement(By.name("username"));
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(usn.isDisplayed(), true);
	  usn.sendKeys("admin");
	  WebElement pss = driver.findElement(By.name("pwd"));
	  sa.assertEquals(pss.isDisplayed(), true);
	  pss.sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  sa.assertAll();
	  
	  
  }
  @Test(dependsOnMethods = "loginMethod")
  public void createUser() {
	  WebElement usn = driver.findElement(By.name("username"));
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(usn.isDisplayed(), true);
	  usn.sendKeys("admin");
	  WebElement pss = driver.findElement(By.name("pwd"));
	  sa.assertEquals(pss.isDisplayed(), true);
	  pss.sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  sa.assertAll();
	  String expectedTilte = driver.getTitle();
	  Assert.assertEquals(driver.getTitle(), expectedTilte);
	  driver.findElement(By.xpath("//div[text() ='Users']/ancesrtor::a/img"));
  }
  @Test(dependsOnMethods = "createUser")
  public void logout() {
	  driver.findElement(By.partialLinkText("log")).click();
  }
}
