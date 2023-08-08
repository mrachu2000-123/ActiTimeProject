package com.actiTime.Retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyzer implements IRetryAnalyzer {
	
	int counter = 0;
	int retrylimit = 1;

	@Override
	public boolean retry(ITestResult result) {
		if(counter< retrylimit) {
			counter++;
			return true;
		}
		return false;
	}

}
