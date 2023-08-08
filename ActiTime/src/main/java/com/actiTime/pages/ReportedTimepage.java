package com.actiTime.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actiTime.base.Baseclass;

public class ReportedTimepage extends Baseclass{

	public ReportedTimepage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='reportedTime']")
	WebElement Reportedtime;
	
	public AssignedUserpage clickreportedtime() throws IOException {
		
		Reportedtime.click();
		return new AssignedUserpage();
	}



}
