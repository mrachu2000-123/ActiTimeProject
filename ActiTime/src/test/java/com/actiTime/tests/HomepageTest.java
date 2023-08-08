package com.actiTime.tests;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.actiTime.base.Baseclass;
import com.actiTime.pages.Homepage;
import com.actiTime.pages.Loginpage;
import com.sun.tools.sjavac.Log;

public class HomepageTest extends Baseclass {
	
	Homepage homepage;
	Loginpage loginpage;
	
	public HomepageTest() throws IOException {
		super();
	}
	
//	@BeforeClass
//	public void setup() throws InterruptedException, IOException {
//		initialization();
//		loginpage = new Loginpage();
//		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
//	}

	@Test(priority = 0)
	public void clickNasa() throws InterruptedException, IOException {
		
		Homepage homepage = new Homepage();
			homepage.clickonNasa();
	
	}

}
