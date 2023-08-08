package com.actiTime.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actiTime.base.Baseclass;

public class Homepage extends Baseclass{

	@FindBy(xpath="(//div[text()='Nasa negotiation'])[1]")
	WebElement NasaNegotiation;
	
	@FindBy(xpath="//*[@id='addTaskButtonId']")
	WebElement NewTask;

	@FindBy(xpath="(//div[@class='dropdownButton'])[5]")
	WebElement Customerdrp ;

	@FindBy(xpath="//div[@class='comboboxButton focused']//input[@type='text']")
	WebElement CustomerTextBox;
	
	@FindBy(xpath="//div[normalize-space()='Big Bang Company']")
	WebElement Customer;

	@FindBy(xpath="(//div[@class='dropdownButton'])[6]")
	WebElement Projectdrp;

	@FindBy(xpath="//div[normalize-space()='Flight operations']")
	WebElement Project ;

	@FindBy(xpath="(//*[@class='inputFieldWithPlaceholder'])[1]")
	WebElement TaskName;

	@FindBy(xpath="//*[text()='Create Tasks']")
	WebElement TaskBtn;

	public Homepage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public Detailpage clickonNasa() throws InterruptedException, IOException {
	
		Thread.sleep(1000);
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		jsc.executeScript("window.scrollTo(0, 300)");
		Thread.sleep(2000);
		
		try {
		NasaNegotiation.click();
		Thread.sleep(2000);
		}
		catch(Exception e) {
			
		NewTask.click();
		Thread.sleep(2000);

		Customerdrp.click();
		Thread.sleep(2000);
		
		WebElement comt = CustomerTextBox;
		Actions act = new Actions(driver);
		act.moveToElement(comt).click().
		keyUp(comt,Keys.SHIFT).sendKeys(comt,"Big Bang Company").
		build().perform();
		Thread.sleep(2000);

		Customer.click();
		Thread.sleep(2000);

		Projectdrp.click();
		Thread.sleep(2000);		
		
		Project.click();
		Thread.sleep(3000);

		TaskName.sendKeys("Nasa negotiation");
		Thread.sleep(2000);

		TaskBtn.click();
		Thread.sleep(2000);
		
		NasaNegotiation.click();
		Thread.sleep(2000);
		
		}
		return new Detailpage();

	}




}
