package com.actiTime.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.base.Baseclass;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestUtil extends Baseclass{

	public TestUtil() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public static void scrolldown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
	}

	public static void scrollup() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");		
		Thread.sleep(2000);
	}

	public static String capture(String testName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"/screenshots/"+testName+".png";
		File destination = new File(dest);
		FileUtils.copyFile(Source, destination);
		return dest;

	}

	public void deleteFolder() {
		
		String screenshotFolderPath = ".//screenshots/";
		
//		try {
//			Path path = Paths.get(screenshotFolderPath);
//			Files.walk(path)
//			.map(Path::toFile)
//			.forEach(File::delete);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	
	public static void captureScreenshotAndAttachToReport(ExtentTest test) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"/screenshots/"+test.getTest().getName()+".png";
		File destination = new File(dest);
		try {
		FileUtils.copyFile(Source, destination);
		test.log(LogStatus.FAIL, "Screenshot below: "+test.addScreenCapture(dest));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
