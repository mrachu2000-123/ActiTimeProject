package com.actiTime.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.actiTime.base.Baseclass;
import com.actiTime.pages.Homepage;
import com.actiTime.pages.Loginpage;
import com.actiTime.pages.Projectpage;

public class ProjectpageTest extends Baseclass{

	
	public ProjectpageTest() throws IOException {
		super();
	}

//
//	Homepage homepage;
//	Loginpage loginpage;
//	
//	@BeforeClass
//	public void setup() throws InterruptedException, IOException {
//		initialization();
//		loginpage = new Loginpage();
//		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
//	}


	@Test
	public void verifyTasks() throws InterruptedException, IOException {

		Projectpage cust = new Projectpage();
		cust.VerifyTask();
	}

}
