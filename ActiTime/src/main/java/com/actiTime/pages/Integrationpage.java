package com.actiTime.pages;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.base.Baseclass;

public class Integrationpage extends Baseclass {

	public Integrationpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_addons']")
	WebElement Integration;

	@FindBy(xpath="(//div[text()='Switch to actiPLANS'])[2]")
	WebElement Switchtoplan ;

	@FindBy(xpath="//div[@id='closeProjectLightBoxBtn']")
	WebElement Adds;

	@FindBy(xpath="//div[@id='previousWeekButton']")
	WebElement PreviousButton ;

	@FindBy(xpath="//div[@id='nextWeekButton']")
	WebElement NextButton ;

	@FindBy(xpath="(//td[@class='dayCell leaveType2 approved fullLeave'])")
	WebElement MouseOver;

	@FindBy(xpath="//input[@id='colleaguesSearchField']")
	WebElement SearchButton ;

	@FindBy(xpath="//div[@class='filterIcon']")
	WebElement FilterIcon;

	@FindBy(xpath="(//td[@class='dayCell leaveType21 approved fullLeave'])[1]")
	WebElement MouseOver2;

	@FindBy(xpath="//a[@class='next']")
	WebElement Nextpage;

	@FindBy(xpath="//td[@class='middle-left-cell contents']")
	WebElement AllUserdrp;

	@FindBy(xpath="(//img[@class='x-form-radio'])[2]")
	WebElement SelectedUser;

	@FindBy(xpath="(//img[@class='x-form-radio'])[1]")
	WebElement AllUser;

	@FindBy(xpath="//span[text()='Top Management']")
	WebElement Scroll;

	@FindBy(xpath="//span[@title='Quality Control']")
	WebElement SelectedUserCb;

	@FindBy(xpath="//td[@class='x-table-layout-cell footer']")
	WebElement ApplyBtnfooter;

	@FindBy(xpath="//span[text()='Apply']")
	WebElement ApplyBtn;

	@FindBy(xpath="//span[text()='Requests']")
	WebElement Request;

	@FindBy(xpath="//span[text()='Stay Home']")
	WebElement Stayhome;
	
	@FindBy(xpath="//textarea[@class='leaveRequestUserComment']")
	WebElement StayhomeComt;
	
	@FindBy(xpath="//div[text()='Save Changes']")
	WebElement Save;

	@FindBy(xpath="//span[contains(text(),'Jun 26 – Jun 30, 2023')]")
	WebElement Stayhomedate;

	@FindBy(xpath="//input[@id='leaveTimeRequestDialog_firstDayDuration']")
	WebElement hour1;

	@FindBy(xpath="//input[@id='leaveTimeRequestDialog_middleDayDuration']")
	WebElement hour2;

	@FindBy(xpath="//input[@id='leaveTimeRequestDialog_lastDayDuration']")
	WebElement hour3;

	@FindBy(xpath="//div[@class='greyButton saveButton noIcon']")
	WebElement SaveChanges;

	@FindBy(xpath="//input[@id='filterPastRequestsCheckbox']")
	WebElement CheckBox;

	@FindBy(xpath="(//span[text()='Vacation'])[3]")
	WebElement ScrollRequest;

	@FindBy(xpath="(//div[@title='Delete'])[3]")
	WebElement Delete;

	public void IntegrationTab() throws InterruptedException {

		Integration.click();
		Thread.sleep(2000);
		Switchtoplan.click();
		Thread.sleep(2000);

		try {
			Adds.click();
			Thread.sleep(1000);
			PreviousButton.click();
			Thread.sleep(1000);
		}
		catch(Exception e) {

			PreviousButton.click();
			Thread.sleep(1000);
		}
		PreviousButton.click();
		Thread.sleep(1000);
		PreviousButton.click();
		Thread.sleep(1000);
		NextButton.click();
		Thread.sleep(2000);
	}

	public void Search(String name) throws InterruptedException {

		//		JavascriptExecutor js = (JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].scrollIntoView();",Nextpage);
		WebElement d = SearchButton;
		d.sendKeys(name);
		Thread.sleep(2000);
		d.clear();
		Thread.sleep(2000);
		FilterIcon.click();
		Thread.sleep(2000);
		//		Nextpage.click();
		//		Thread.sleep(2000);
	}

	public void selectUser() throws InterruptedException {

		AllUserdrp.click();
		Thread.sleep(2000);
		SelectedUser.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Scroll);
		Thread.sleep(2000);
		SelectedUserCb.click();
		Thread.sleep(2000);
		ApplyBtn.click();
		Thread.sleep(2000);
	}

	public void Alluser() throws InterruptedException {

		AllUserdrp.click();
		Thread.sleep(2000);
		AllUser.click();
		Thread.sleep(2000);
		ApplyBtn.click();
		Thread.sleep(2000);
	}

	public void ClickRequest() throws InterruptedException {

		Request.click();
		Thread.sleep(2000);
		Stayhome.click();
		Thread.sleep(2000);
		StayhomeComt.sendKeys("Work from Home");
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
		Stayhome.click();
		Thread.sleep(2000);
		StayhomeComt.clear();
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
		Stayhomedate.click();
		Thread.sleep(2000);
		hour1.sendKeys("10");
		Thread.sleep(2000);
		hour2.sendKeys("20");
		Thread.sleep(2000);
		hour3.sendKeys("10");
		Thread.sleep(2000);
		SaveChanges.click();
		Thread.sleep(2000);
		CheckBox.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",ScrollRequest);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",Request);
		Thread.sleep(2000);
		CheckBox.click();
		Thread.sleep(2000);
		Delete.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	}


}
