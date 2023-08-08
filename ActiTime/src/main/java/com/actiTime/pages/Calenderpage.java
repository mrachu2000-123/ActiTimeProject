package com.actiTime.pages;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actiTime.base.Baseclass;
import com.actiTime.util.TestUtil;

public class Calenderpage extends Baseclass {

	public Calenderpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	Actions act = new Actions(driver);
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_calendar']")
	WebElement CalenderIcon;
	
	@FindBy(xpath="//div[text()='Corporate Work Schedule']")
	WebElement WorkSchedule;
	
	@FindBy(xpath="//div[@class='holidayListButton']")
	WebElement Holidaylist;
	
	@FindBy(xpath="(//div[text()='Import Holidays'])[2]")
	WebElement Import;
	
	@FindBy(xpath="//div[@class='countriesList']//div[text()='India']")
	WebElement India;
	
	@FindBy(xpath="//div[text()='Import']")
	WebElement ImportBtn;
	
	@FindBy(xpath="//div[text()='Remove all']")
	WebElement RemoveIcon;
	
	@FindBy(xpath="//div[text()='        Remove All Holidays      ']")
	WebElement Removeall;
	
	@FindBy(xpath="(//div[@class='hideButton_panelContainer'])[1]")
	WebElement Close;
	
	@FindBy(xpath="//div[text()='JUNE']")
	WebElement scrollJune;
	
	@FindBy(xpath="(//div[text()='15'])[6]")
	WebElement Date;
	
	@FindBy(xpath="//div[@class='nameColumn']")
	WebElement EditHoliday;
	
	@FindBy(xpath="//div[@class='nameContainer']//div[@class='deleteIcon']")
	WebElement DeleteIcon;
	
	@FindBy(xpath="//div[text()='Remove']")
	WebElement Remove;
	
	@FindBy(xpath="//div[@class='simpleListMenuButton  emptyList notEmpty']")
	WebElement YearDrp;
	
	@FindBy(xpath="//div[text()='2018']")
	WebElement SelectYear;
	
	@FindBy(xpath="//a[@class='content tt']")
	WebElement TimetrackTab;
	
//	@FindBy(xpath="//body[1]/div[20]/div[1]/div[3]")
//	WebElement HolidayDelete;
	
//	@FindBy(xpath="(//div[text()='Corporate Holiday'])[2]")
//	WebElement overHoliday;

	public Integrationpage clickCalender() throws InterruptedException, IOException {
		
		CalenderIcon.click();
		Thread.sleep(2000);
		WorkSchedule.click();
		Thread.sleep(2000);
		Holidaylist.click();
		Thread.sleep(2000);
		Import.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",India);
		Thread.sleep(2000);
		India.click();
		Thread.sleep(2000);
		ImportBtn.click();
		Thread.sleep(2000);
		RemoveIcon.click();
		Thread.sleep(2000);
		Removeall.click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(2000);
		TestUtil.scrolldown();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",scrollJune);
		Thread.sleep(2000);
		Date.click();
//		Thread.sleep(2000);
//		act.moveToElement(Date).build().perform();
		Thread.sleep(2000);
		Holidaylist.click();
		Thread.sleep(2000);
		act.moveToElement(EditHoliday).click().build().perform();
		DeleteIcon.click();
		Thread.sleep(2000);
		Remove.click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(2000);
		TestUtil.scrollup();
		Thread.sleep(2000);
		YearDrp.click();
		Thread.sleep(3000);
//		js.executeScript("arguments[0].scrollIntoView(true);",SelectYear);		
//		Thread.sleep(5000);
		SelectYear.click();
		Thread.sleep(5000);
		TestUtil.scrolldown();
		Thread.sleep(2000);
		TestUtil.scrollup();
		Thread.sleep(3000);
		TimetrackTab.click();
		Thread.sleep(3000);

		return  new Integrationpage();
		
	}
}
