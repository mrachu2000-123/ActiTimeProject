package com.actiTime.Screenshot;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.actiTime.util.TestUtil;

public class TestListenersLog extends TestUtil implements ITestListener {

	public TestListenersLog() throws IOException {
		super();
	}
	
	public void onTestStart(ITestResult result) {
		Logs.info(result.getMethod().getMethodName() + " Started");
	}
	public void onTestSuccess(ITestResult result) {
		Logs.info(result.getMethod().getMethodName() + " Passed");				
	}
	public void onTestFailure(ITestResult result) {
		Logs.info("Failed because of - "+ result.getThrowable());
		try {
			capture(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void onTestSkipped(ITestResult result) {
		Logs.info("Skipped because of - "+ result.getThrowable());		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub		
	}
	public void onStart(ITestContext context) {
		Logs.info("=========== onStart :-" + context.getName() + "===============");
	        deleteFolder();

	}
	
	public void onFinish(ITestContext context) {
		Logs.info("=========== onFinish :-" + context.getName() + "===============");

	}

}
