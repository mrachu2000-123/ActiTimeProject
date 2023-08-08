package com.actiTime.pages;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actiTime.base.Baseclass;

public class Detailpage extends Baseclass {

	public Detailpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="//*[@class='workflowStatus statusType_open statusColor_yellow statusTypeIcon_yellow withPrefix showArrow']")
	WebElement Status;

	@FindBy(xpath="//div[contains(@class,'cellButton')]//div[contains(@class,'name')][normalize-space()='In Progress']")
	WebElement Statusselect;

	@FindBy(xpath="//div[@class='workflowStatus statusType_open statusColor_darkGreen statusTypeIcon_darkGreen withPrefix showArrow']")
	WebElement StatusRedrp;

	@FindBy(xpath="//div[contains(@class,'cellButton')]//div[contains(@class,'workflowStatus statusType_open statusColor_yellow statusTypeIcon_yellow')]")
	WebElement StatusReselect;

	@FindBy(xpath="//div[@class='deadlineEditor noDeadline editable']")
	WebElement Deadline;

	@FindBy(xpath="//button[text()='today']")
	WebElement today;
	
	@FindBy(xpath="//td[@class='x-date-active']//span[contains(text(),'30')]")
	WebElement Deadlinedate;

	@FindBy(xpath="//*[@id='ext-gen111']/span[3]")
	WebElement Deadlinedateclear;


	@FindBy(xpath="//div[@class='value ellipsis']")
	WebElement TypeWork;

	@FindBy(xpath="//div[@class='typeLabel ellipsis' and text()='non-billable']")
	WebElement typeworkselect;

	@FindBy(xpath="//div[@class='estimatedTimeWrapper']")
	WebElement EstimateHours;

	@FindBy(xpath="//div[@class='timeEditor editable']//div[@class='clearButton']")
	WebElement ClearHours;

	@FindBy(xpath="//textarea[@placeholder='Enter task description...']")
	WebElement Description;

	@FindBy(xpath="//div[@class='sendCommentLine']")
	WebElement Comments;

	@FindBy(xpath="//div[@class='sendIcon']")
	WebElement CommentBtn;

	@FindBy(xpath="(//div[@class='text'])[8]")
	WebElement CommentDel;

	@FindBy(xpath="(//div[@class='deleteButton'])[1]")
	WebElement DelBtn;

	@FindBy(xpath="//div[text()='Yes, delete']")
	WebElement YesDel;

	public void clickstatus() throws InterruptedException {
		
		Status.click();
		Thread.sleep(2000);
		Statusselect.click();
		Thread.sleep(2000);
		StatusRedrp.click();
		Thread.sleep(2000);
		StatusReselect.click();
		Thread.sleep(2000);
	}

	public void clickdeadline() throws InterruptedException {
		Deadline.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(today).build().perform();
		Deadlinedate.click();
		Thread.sleep(2000);
		Deadlinedateclear.click();
	}

	public void clickworktype() throws InterruptedException {
		TypeWork.click();
		Thread.sleep(2000);
		typeworkselect.click();
		Thread.sleep(2000);
	}

	public void clickestimate() throws InterruptedException {

		js.executeScript("arguments[0].scrollIntoView();",TypeWork);
		Actions act = new Actions(driver);
		WebElement a = EstimateHours;
		act.moveToElement(a).click().
		keyUp(a,Keys.SHIFT).sendKeys(a,"500").
		build().perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		ClearHours.click();
		Thread.sleep(2000);
	}

	public void typedescription() throws InterruptedException {

		js.executeScript("arguments[0].scrollIntoView();",EstimateHours);
		WebElement des = Description;
		Actions act = new Actions(driver);
		act.moveToElement(des).click().
		keyUp(des,Keys.SHIFT).sendKeys(des," Big Bang is a software development and training company located in Milwaukee, US.").
		build().perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		des.clear();
		Thread.sleep(2000);

	}

	public void typecomment() throws InterruptedException {
		WebElement comt = Comments;
		Actions act = new Actions(driver);
		act.moveToElement(comt).click().
		keyUp(comt,Keys.SHIFT).sendKeys(comt,"Gabriel Tupula, CEO of Big Bang, has valuable, "
				+ "cumulative experience in information systems, software development ").
		build().perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);

		CommentBtn.click();
		Thread.sleep(3000);
	}

	public ReportedTimepage mouseoverdel() throws InterruptedException, IOException {

		js.executeScript("arguments[0].scrollIntoView();",Description);
		Thread.sleep(2000);
		WebElement del = CommentDel;
		Actions act = new Actions(driver);
		act.moveToElement(del).build().perform();
		Thread.sleep(2000);
		DelBtn.click();
		Thread.sleep(3000);
		YesDel.click();
		return new ReportedTimepage();
	}


}
