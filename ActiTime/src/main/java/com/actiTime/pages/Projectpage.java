package com.actiTime.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.base.Baseclass;


public class Projectpage extends Baseclass{

	public Projectpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='content tasks']")
	WebElement TaskTab;

	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	WebElement TaskSearch;

	@FindBy(xpath="//span[text()='Big']")
	WebElement Bigbang;

	@FindBy(xpath="//div[text()='view customer projects']")
	WebElement ViewDetails;

	@FindBy(xpath="//span[text()='Flight']")
	WebElement Flight;		

	@FindBy(xpath="//div[text()='Add New']")
	WebElement AddNew;

	@FindBy(xpath="//div[@class='item createNewProject']")
	WebElement AddProject;

	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	WebElement ProjectName;

	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	WebElement Customerbox;
	
	@FindBy(xpath="//div[@class='comboboxButton focused']//input[@type='text']")
	WebElement Customerdrp;
	

	@FindBy(xpath="//div[contains(@class,'itemRow cpItemRow')][normalize-space()='Big Bang Company']")
	WebElement CustomerSelect;

	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	WebElement Des;

	@FindBy(xpath="//div[text()='Create Project']")
	WebElement AddProjectBtn;

	@FindBy(xpath="//a[@class='content tt']")
	WebElement TimetrackTab;

	public Homepage VerifyTask() throws InterruptedException, IOException {

		TaskTab.click();
		Thread.sleep(2000);
		TaskSearch.sendKeys("Flight");
		Thread.sleep(2000);
//		ViewDetails.click();
//		Thread.sleep(3000);
		

		try {
		if(Flight.getText().equals("Flight")) {
			
			System.out.println(Flight.getText());
			TimetrackTab.click();
			Thread.sleep(2000);
		   }
		}
		catch(Exception e){
			AddNew.click();
			Thread.sleep(2000);
			AddProject.click();
			Thread.sleep(2000);
			ProjectName.sendKeys("Flight operations");
			Thread.sleep(2000);
			Customerbox.click();
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.moveToElement(Customerdrp).click().
			keyUp(Customerdrp,Keys.SHIFT).sendKeys(Customerdrp,"Big Bang Company").
			build().perform();
			Thread.sleep(2000);
			CustomerSelect.click();
			Thread.sleep(2000);
			Des.sendKeys("Flight operation process is a form of aircraft applications."
					+ " The optimization of flight process is the objective of flight operation.");
			Thread.sleep(2000);
			AddProjectBtn.click();
			Thread.sleep(2000);
			TimetrackTab.click();
			Thread.sleep(1000);
		}
		return new Homepage();
	}
}
