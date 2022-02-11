package com.wiziq.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Course_scheduled_paid extends Testbase{
	@Test(priority=1)
	public void schedule_paid() throws InterruptedException, AWTException
	{
		   WebDriverWait wait = new WebDriverWait(driver, 100);
	   		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("add_course"))));
	   		Category_Body.click();
	   		driver.findElement(By.xpath("//a[contains(@class,'material')]")).click();
			WebElement elm = driver.findElement(By.id("creationOverlay"));
			driver.switchTo().frame(elm);
			Thread.sleep(10000);
			driver.findElement(By.id("rdoPaid")).click();
			driver.findElement(By.id("txtAmount")).sendKeys("1");
			// add coinstructor
	   		WebDriverWait wait1 = new WebDriverWait(driver, 210);
	   		WebElement Category_Body1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("anciconcoinstructor")));
	   		Category_Body1.click();
	   		
	   		//select instructor from dropdown
	   		Select inst = new Select(driver.findElement(By.id("ddlcoinstructor1")));  
	   		inst.selectByVisibleText("Abhijeet Instructor");
	   		// to enable discussion
	   	    driver.findElement(By.id("chkEnableDiscussion")).click();
	   	   // To click on next button
		   	driver.findElement(By.xpath("//a[@id='lbtnSaveSettings']")).click();
		   	driver.findElement(By.id("datepicker")).click();
			driver.findElement(By.xpath("//a[text()='30']")).click();
			driver.findElement(By.id("datepickerEnd")).click();
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//a[text()='28']")).click();
		    driver.findElement(By.id("txtTitle")).sendKeys("paid schedule automated");
		    driver.findElement(By.id("btnPublishCourse")).click();
		    Thread.sleep(10000);
			driver.findElement(By.id("btnPublishCourse")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath(OR.getProperty("add_activity1"))).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(OR.getProperty("test_click"))).click();
		
			driver.findElement(By.xpath(OR.getProperty("test_title"))).sendKeys("test");
			driver.findElement(By.xpath(OR.getProperty("pass_score"))).sendKeys("1");
			// clicking on next button
			driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
			Thread.sleep(30000);
			// click on add question button
			driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(OR.getProperty("multiple_choice_ques"))).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(OR.getProperty("choice1"))).click();
			driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
			Thread.sleep(10000);
			// click on next button
			driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
			// click to publish question
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"test-publish\"]")).click();
			System.out.println("test added to course");
			Thread.sleep(10000);
			driver.findElement(By.xpath(OR.getProperty("expand_week"))).click();
		    driver.findElement(By.xpath(OR.getProperty("add_activity2"))).click();
		    driver.findElement(By.xpath(OR.getProperty("class_click"))).click();
		     Thread.sleep(10000);
		    driver.findElement(By.xpath(OR.getProperty("class_title"))).sendKeys("live");
		    driver.findElement(By.id("rdbRecordClass")).click();
		    driver.findElement(By.id("btnSchedule")).click();
			 Thread.sleep(20000);
		    driver.findElement(By.id("lbtnNextProfile")).click();
			 System.out.println("classes added to course");
			  Thread.sleep(10000);
		 	driver.findElement(By.id("txtSubTitle")).sendKeys("11");
			driver.findElement(By.id("txtHighlight1")).sendKeys("1");
			driver.findElement(By.id("txtHighlight2")).sendKeys("11");
			driver.findElement(By.id("txtHighlight3")).sendKeys("11");
			WebElement elm2 = driver.findElement(By.id("txtAbtCourse_ifr"));
			driver.switchTo().frame(elm2);
			driver.findElement(By.id("tinymce")).sendKeys("1111");
			driver.switchTo().parentFrame();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//a[@id='lbtnNextInvite']")).click();
			driver.switchTo().parentFrame();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
			Thread.sleep(20000);
			System.out.println("Course created");

}
}
