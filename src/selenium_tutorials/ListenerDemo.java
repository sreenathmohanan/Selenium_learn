package selenium_tutorials;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener


{

	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The tests have failed on "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The tests have skipped on "+ result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The tests have started on "+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The tests have run sucessfully on "+ result.getName());
		
		
	}

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
