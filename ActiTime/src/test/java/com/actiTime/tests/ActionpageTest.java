package com.actiTime.tests;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.actiTime.base.Baseclass;
import com.actiTime.pages.Actionpage;
import com.actiTime.pages.Homepage;
import com.actiTime.pages.Loginpage;

public class ActionpageTest extends Baseclass{

	
	public ActionpageTest() throws IOException {
		super();
	}

	Homepage homepage;
	Loginpage loginpage;

//	@BeforeClass
//	public void setup() throws InterruptedException, IOException {
//		initialization();
//		loginpage = new Loginpage();
//		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
//	}

//	@Test
//	public void clickNasa() throws InterruptedException, IOException {
//
//		JavascriptExecutor jsc = (JavascriptExecutor) driver;
//		jsc.executeScript("window.scrollTo(0, 300)");
//
//		homepage.clickonNasa();
//	}
	
	@Test(priority = 0)
	public void Actions() throws InterruptedException, IOException {
		
		Actionpage act = new Actionpage();
		act.CopyTask();
		Thread.sleep(3000);
		act.MoveTask();
		Thread.sleep(3000);
		act.DeleteTask();
		
	}

}
