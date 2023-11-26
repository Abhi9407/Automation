package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void method1() {
	  Reporter.log("this is method 1", true);
  }
  @Test
  public void method2() {
	  Reporter.log("this is method 2", true);
  }
}
