package com.qa.Listeners;
//
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.qa.base.TestBase;
//import com.qa.testutil.ExtentTestManager;
//import com.qa.testutil.TestUtil;
//import com.relevantcodes.extentreports.LogStatus;




import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.qa.base.TestBase;
import com.qa.testutil.ExtentManager;
import com.qa.testutil.ExtentTestManager;
import com.qa.testutil.TestUtil;





public class CustomListeners extends TestBase  implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
test = rep.startTest(result.getName().toUpperCase());	
		System.out.println("moni on teststart"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
     test.log(LogStatus.PASS, result.getName().toUpperCase()+" PASS");
	//	System.out.println("moni on success"+result.getName());
		rep.endTest(test);
		rep.flush();
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+" FAILed with excepton "+result.getThrowable());
		try {
			test.log(LogStatus.INFO, test.addScreenCapture(TestUtil.capturescreenshot()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rep.endTest(test);
		rep.flush();
	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("moni on teststart");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	}
