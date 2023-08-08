package com.actiTime.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.actiTime.base.Baseclass;
import com.actiTime.pages.Homepage;
import com.actiTime.pages.Loginpage;

public class LoginpageTest extends Baseclass{

	Loginpage loginpage;
	Homepage homepage;

	public LoginpageTest() throws IOException {
		super();
	}

	@BeforeClass
	public void setup() throws IOException {
		initialization();
		loginpage = new Loginpage();
	}


	@Test
	public void loginTest() throws InterruptedException, IOException {

		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}



}
