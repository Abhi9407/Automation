package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void method3() {
	  Reporter.log("this is method 1", true);
  }
  @Test
  public void method4() {
	  int i = 5;
	  int j = 15;
	  int k = j/i;
	  Reporter.log("this is method 1", true);
  }
}
