package com.actiTime.tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.actiTime.base.Baseclass;
import com.actiTime.pages.AssignedUserpage;
import com.actiTime.pages.Detailpage;
import com.actiTime.pages.Homepage;
import com.actiTime.pages.Loginpage;
import com.actiTime.pages.Managerpage;
import com.actiTime.pages.ReportedTimepage;

public class DetailpageTest extends Baseclass{

	public DetailpageTest() throws IOException {
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
//
//	@Test
//	public void clickNasa() throws InterruptedException, IOException {
//
//		JavascriptExecutor jsc = (JavascriptExecutor) driver;
//		jsc.executeScript("window.scrollTo(0, 300)");
//
//		homepage.clickonNasa();
//	}

	@Test(priority = 1)
	public void checkDetails() throws InterruptedException, IOException {

		Detailpage details = new Detailpage();

		Thread.sleep(2000);
		details.clickstatus();
		Thread.sleep(3000);

		details.clickdeadline();
		Thread.sleep(3000);

		details.clickworktype();
		Thread.sleep(3000);

		details.clickestimate();
		Thread.sleep(3000);

		details.typedescription();
		Thread.sleep(3000);

		details.typecomment();
		Thread.sleep(3000);

		details.mouseoverdel();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void reportedUser() throws InterruptedException, IOException {

		ReportedTimepage report = new ReportedTimepage();
		report.clickreportedtime();
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void AssignedUser() throws InterruptedException, IOException {

		AssignedUserpage assign = new AssignedUserpage();
		assign.clickassignedUsers();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void Managers() throws InterruptedException, IOException {

		Managerpage manager = new Managerpage();
		manager.clickaddmanagers();
		Thread.sleep(3000);
	}


}
