package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
  @Test
  public void testMethod1() {
  long threadId = Thread.currentThread().getId();
  Reporter.log("thread ID of testmethod1"+ threadId, true);
    
  }
  @Test
  public void testMethod2() {
  long threadId1 = Thread.currentThread().getId();
  Reporter.log("thread ID of testmethod2" + threadId1, true);
    
  }
}
