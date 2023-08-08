package com.actiTime.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.actiTime.base.Baseclass;
import com.actiTime.pages.Calenderpage;
import com.actiTime.pages.Homepage;
import com.actiTime.pages.Loginpage;

public class CalenderpageTest extends Baseclass{

	public CalenderpageTest() throws IOException {
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
	
	@Test
	public void calenderS() throws IOException, InterruptedException {
		Calenderpage cal = new Calenderpage();
		cal.clickCalender();
	}

}
