package com.actiTime.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.base.Baseclass;

public class LeaveMangementpage extends Baseclass {

	public LeaveMangementpage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='content corporate_schedule']")
	WebElement LeaveManagement;
	
	@FindBy(xpath="//input[@id='employeesSearchField']")
	WebElement SearchName;
	
	@FindBy(xpath="//div[@class='filterIcon']")
	WebElement CancelBtn;
	
	@FindBy(xpath="(//td[@class='dayCell weekStartDay leaveType21 approved fullLeave'])[3]")
	WebElement MouseOver;
	
	@FindBy(xpath="//span[contains(text(),'Leave Time Requests')]")
	WebElement leaveRequest;
	
	@FindBy(xpath="(//label[@class='applicableLabel'])[1]")
	WebElement SelectCb;
	
	@FindBy(xpath="//span[@class='acctionButton greyButton reject enabled']")
	WebElement Reject;
	
	@FindBy(xpath="//textarea[@placeholder='Please enter reason here']")
	WebElement Textbox;
	
	@FindBy(xpath="(//div[@class='greyButton'])[1]")
	WebElement cancelBtn;
	
	@FindBy(xpath="//span[@class='acctionButton greyButton delete enabled']")
	WebElement Delete;
	
	@FindBy(xpath="(//div[@class='greyButton'])[2]")
	WebElement cancelBtn1;
	
	@FindBy(xpath="//a[@class='productSwitcher']")
	WebElement SwitchActiTime;
	
	@FindBy(xpath="//a[@class='logout']")
	WebElement logout;
	
	public void leavemanage() throws InterruptedException {
		
		LeaveManagement.click();
		Thread.sleep(2000);
		SearchName.sendKeys("Maria");
		Thread.sleep(2000);
		CancelBtn.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(MouseOver).build().perform();
		Thread.sleep(2000);
		leaveRequest.click();
		Thread.sleep(2000);
		SelectCb.click();
		Thread.sleep(2000);
		Reject.click();
		Thread.sleep(2000);
		Textbox.sendKeys("Invalid");
		Thread.sleep(2000);
		cancelBtn.click();
		Thread.sleep(2000);
		Delete.click();
		Thread.sleep(2000);
		cancelBtn1.click();
		Thread.sleep(2000);
		SelectCb.click();
		Thread.sleep(2000);
		SwitchActiTime.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(1000);
		driver.quit();
	}

}
