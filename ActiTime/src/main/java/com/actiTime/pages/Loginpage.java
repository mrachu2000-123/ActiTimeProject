package com.actiTime.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actiTime.base.Baseclass;

public class Loginpage extends Baseclass {
	
	@FindBy(xpath="//input[@name='username']")
	WebElement UserName;

	@FindBy(xpath="//input[@name='pwd']")
	WebElement Password;

	@FindBy(id="loginButtonContainer")
	WebElement LoginButton;


	public  Loginpage() throws IOException{
		super();
		PageFactory.initElements(driver, this);
	}

	public Homepage login(String Uname,String pswd) throws InterruptedException, IOException {
		UserName.sendKeys(Uname);
		Thread.sleep(2000);
		Password.sendKeys(pswd);
		Thread.sleep(2000);
		
		LoginButton.click();
		Thread.sleep(2000);

		return new Homepage();
	}

}
