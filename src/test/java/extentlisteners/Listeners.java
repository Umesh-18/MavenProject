package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testcases.BaseTest;
import utility.Screenshot;

public class Listeners extends BaseTest implements ITestListener {

	ExtentReports extent = ExtentReporterNG.extentReporterGenerator();
	
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult Result) {
		test = extent.createTest(Result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult Result) {
		test.log(Status.PASS, "Test is Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult Result) {
		test.fail(Result.getThrowable());
		//To add screenshot after failure
		try {
			test.addScreenCaptureFromPath(Screenshot.captureScreenShot(driver), "ScreenShot Attached");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onStart(ITestContext Context) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onFinish(ITestContext Context) {
		extent.flush();
	}

}

