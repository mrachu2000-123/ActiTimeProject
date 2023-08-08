package com.actiTime.pages;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.base.Baseclass;

public class Actionpage extends Baseclass {

	public Actionpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='action']")
	WebElement Actions;
	
	@FindBy(xpath="//div[text()='Copy to']")
	WebElement CopyTo;
	
	@FindBy(xpath="//div[text()='- Select Customer -']")
	WebElement CopyCustomerdrp;
	
	@FindBy(xpath="//div[text()='Big Bang Company']")
	WebElement CopyCustomer;
	
	@FindBy(xpath="//div[text()='- Select Project -']")
	WebElement CopyProjectdrp;
	
	@FindBy(xpath="//div[text()='Flight operations']")
	WebElement CopyProject;
	
	@FindBy(xpath="(//div[@class='ok button'])[2]")
	WebElement CopyBtn;
	
	@FindBy(xpath="//div[text()='Move to']")
	WebElement MoveTo;
	
	@FindBy(xpath="//div[text()='- Select Customer -']")
	WebElement MoveCustomerdrp;
	
	@FindBy(xpath="(//div[text()='Big Bang Company'])")
	WebElement MoveCustomer;
	
	@FindBy(xpath="//div[text()='- Select Project -']")
	WebElement MoveProjectdrp;
	
	@FindBy(xpath="//div[text()='Flight operations']")
	WebElement MoveProject;
	
	@FindBy(xpath="(//div[text()='Move'])[1]")
	WebElement MoveBtn;
	
	@FindBy(xpath="//div[text()='Delete']")
	WebElement Delete;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	WebElement DeleteBtn;
	
	public void CopyTask() throws InterruptedException {
		
		Actions.click();
		Thread.sleep(2000);
		CopyTo.click();
		Thread.sleep(2000);
		CopyCustomerdrp.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",CopyCustomer);
		CopyCustomer.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",CopyCustomer);
		Thread.sleep(2000);
		CopyProjectdrp.click();
		Thread.sleep(2000);
		CopyProject.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",CopyBtn);
		Thread.sleep(2000);
		CopyBtn.click();
		Thread.sleep(2000);

	}
	
	public void MoveTask() throws InterruptedException {
		
		Actions.click();
		Thread.sleep(2000);
		MoveTo.click();
		Thread.sleep(2000);
		MoveCustomerdrp.click();
		Thread.sleep(2000);
		MoveCustomer.click();
		Thread.sleep(2000);
		MoveProjectdrp.click();
		Thread.sleep(2000);
		MoveProject.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",MoveBtn);
		Thread.sleep(2000);
		MoveBtn.click();
		Thread.sleep(2000);
        
	}
	
	public Integrationpage DeleteTask() throws InterruptedException, IOException {

		Actions.click();
		Thread.sleep(2000);
		Delete.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",DeleteBtn);
		Thread.sleep(2000);
		DeleteBtn.click();
		Thread.sleep(2000);
		return new Integrationpage();
	}
	
}
