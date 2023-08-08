package com.actiTime.tests;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.actiTime.base.Baseclass;
import com.actiTime.pages.Homepage;
import com.actiTime.pages.Integrationpage;
import com.actiTime.pages.LeaveMangementpage;
import com.actiTime.pages.Loginpage;

public class IntegrationpageTest extends Baseclass {

	public IntegrationpageTest() throws IOException {
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

	@Test(priority = 0)
	public void clickIntegration() throws InterruptedException, IOException {
		
		Integrationpage integ = new Integrationpage();
		integ.IntegrationTab();
		integ.Search("Maria");
		integ.selectUser();
		integ.Alluser();
		integ.ClickRequest();
	}

	@Test(priority = 1)
	public void clickLeaveManagement() throws InterruptedException, IOException {
		
		LeaveMangementpage leave = new LeaveMangementpage();
		leave.leavemanage();
	}
}
