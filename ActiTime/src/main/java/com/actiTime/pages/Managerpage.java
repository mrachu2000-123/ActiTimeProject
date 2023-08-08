package com.actiTime.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.base.Baseclass;

public class Managerpage extends Baseclass{

	public Managerpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='managers']")
	WebElement Managers;
	
	@FindBy(xpath="//div[text()='Add Managers']")
	WebElement AddManagers;
	
	@FindBy(xpath="(//span[@title='Nowak, Peter'])[2]")
	WebElement CheckboxSelect;
		
	@FindBy(xpath="(//span[text()='Close'])[2]")
	WebElement CloseButton;
	
	public Actionpage clickaddmanagers() throws InterruptedException, IOException {
		Managers.click();
		Thread.sleep(2000);
		AddManagers.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).sendKeys("Peter").build().perform();
		Thread.sleep(2000);
		CheckboxSelect.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",CloseButton);
		Thread.sleep(2000);
		CloseButton.click();
		Thread.sleep(2000);
		return new Actionpage();

	}

}
