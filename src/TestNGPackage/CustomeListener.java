package TestNGPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomeListener extends BaseTest implements ITestListener {
  @Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test actual started", true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test Executed succesfully", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod =result.getMethod().getMethodName();
		Reporter.log("this method is falied and taken Screenshot "+ failedMethod, true);
		failedmethod(failedMethod);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("test started", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("test finished", true);
		
	}


}
