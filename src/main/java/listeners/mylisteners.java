package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class mylisteners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Test started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Test completed");
	}

	public void onTestFailure(ITestResult result) {
	System.out.println(result.getName()+" Test failed");
	}
	

}
