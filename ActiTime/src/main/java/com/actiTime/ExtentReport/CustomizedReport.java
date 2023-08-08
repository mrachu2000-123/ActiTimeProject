package com.actiTime.ExtentReport;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

public class CustomizedReport implements IReporter{

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

		for(ISuite ist : suites){

			Map<String, ISuiteResult> resultMap = ist.getResults();

			Set<String> key = resultMap.keySet();

			for(String k : key){

				ITestContext cntx = resultMap.get(k).getTestContext();

				System.out.println("Suite Name- "+cntx.getName()
				+"\n Report Directory- "+cntx.getOutputDirectory()
				+"\n Test Suite Name- "+cntx.getSuite().getName()
				+ "\n Start Date and Time of Execution- "+cntx.getStartDate()
				+ "\n End Date and Time of Execution- "+cntx.getEndDate());

				IResultMap failedTest = cntx.getFailedTests();

				Collection<ITestNGMethod> failedMethods = failedTest.getAllMethods();

				System.out.println("------Failed Test Case-----");

				for(ITestNGMethod imd : failedMethods){
					System.out.println("Test Case Name- "+imd.getMethodName());
				}


				IResultMap passedTest = cntx.getPassedTests();


				Collection<ITestNGMethod> passedMethods = passedTest.getAllMethods();

				System.out.println("------Passed Test Case-----");

				for(ITestNGMethod imd1 : passedMethods){

					System.out.println("Test Case Name- "+imd1.getMethodName());

				}
				for (ISuite suite : suites) {
					String suiteName = suite.getName();
					Map<String, ISuiteResult> suiteResults = suite.getResults();
					for (ISuiteResult sr : suiteResults.values()) {
						ITestContext tc = sr.getTestContext();
						System.out.println("Passed tests for suite '" + suiteName +
								"' is:" + tc.getPassedTests().getAllResults().size());
						System.out.println("Failed tests for suite '" + suiteName +
								"' is:" + tc.getFailedTests().getAllResults().size());
						System.out.println("Skipped tests for suite '" + suiteName +
								"' is:" + tc.getSkippedTests().getAllResults().size());
						System.out.println("Retried tests for suite '" + suiteName +
								"' is:" + tc.getSkippedTests().getAllResults().size());
					}
				}
			}
		}
	}
}
