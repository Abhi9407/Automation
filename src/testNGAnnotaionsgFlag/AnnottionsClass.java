package testNGAnnotaionsgFlag;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnottionsClass {
  @Test
  public void method1() {
	  Reporter.log("this is method1 of test annotation", true);
	  	  
  }
  @AfterMethod
  public void method2() {
	  Reporter.log("After method1 test annotation", true);
  }
  @BeforeMethod
  public void method3() {
	  Reporter.log("before method1 test annotation", true);
  }
  @BeforeClass
  public void method4() {
	  Reporter.log("before class test annotation", true);
  }
  @AfterClass
  public void method5() {
	  Reporter.log("After class test annotation", true);
  }
  @BeforeSuite
  public void method6() {
	  Reporter.log("before suite test annotation", true);
	  

  }
  @AfterSuite
  public void method7() {
	  Reporter.log("After suite test annotation", true);

  }
  @BeforeTest
  public void method8() {
	  Reporter.log("before test test annotation", true);

  }
  @AfterTest
  public void mehtod9() {
	  Reporter.log("before test test annotation", true);

  }
  @Test
  public void method10() {
	  Reporter.log(" test annotation 2", true);

  }
}
