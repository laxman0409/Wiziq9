package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Instructor_RecurringClass extends Testbase {
	@Test(priority=1)
	public void instructor_rec() throws InterruptedException, AWTException, IOException
	{
		
		File file = new File("src\\test\\resources\\images\\15.jpg");
		String localFilePath = file.getAbsolutePath();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//em[@id='menu-top-right']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Instructor']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Live Classes')]")).click();
		Thread.sleep(4000);
		
		//click on live classes symbol
				driver.findElement(By.xpath("//div[@class='floatingBtn']")).click();
				Thread.sleep(5000);
				//shift to frame
				WebElement elm=driver.findElement(By.id("creationOverlay"));
				driver.switchTo().frame(elm);
				Thread.sleep(5000);
				//fill the form
				driver.findElement(By.id("txtTitle")).sendKeys("Recurring_class9_created_via_automation_At_Instructor_End");
				Thread.sleep(1000);
				driver.findElement(By.id("txtTagline")).sendKeys("Testing_via_automation_At_Instructor end");
				Thread.sleep(3000);
				// click on recurring class option link
				driver.findElement(By.id("RecurringControl1_anchorRepeat")).click();
			    Thread.sleep(3000);
			  //select recurring class type from dropdown
				Select rec_type = new Select(driver.findElement(By.id("RecurringControl1_drpRepeatType")));
				rec_type.selectByVisibleText("5 Days(Mon-Fri)");
				 
				//click on current date and time
				Thread.sleep(1000);
				driver.findElement(By.linkText("Set current date and time")).click();
				 
				//select time
				//Select inst = new Select(driver.findElement(By.id("RecurringControl1_drpHour")));
				//inst.selectByVisibleText("10");
				
				Thread.sleep(1000);
				driver.findElement(By.id("RecurringControl1_txtOccurence")).sendKeys("3");
				Thread.sleep(1500);
				
				/*
				
				driver.findElement(By.id("txtDescription")).sendKeys("This testing done by automation at instructor end");
				Thread.sleep(1500);
				driver.findElement(By.id("rdpublic")).click();
				Thread.sleep(1500);
				driver.findElement(By.id("rdbDontRecord")).click();
				Thread.sleep(2000);
				//click on class logo
		        driver.findElement(By.id("SpanUploadImage")).click();
		        Thread.sleep(3000);
		        WebElement elm1=driver.findElement(By.id("TB_iframeContent"));
		        Thread.sleep(2000);
				driver.switchTo().frame(elm1);
				//click on browser
				//driver.findElement(By.xpath("//*[@id=\"file\"]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(localFilePath);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//span[contains(@class,'bluebtn fright mr10 ') and contains(text(), 'Crop & Save')]")).click();
				Thread.sleep(5000);
				driver.switchTo().parentFrame();
				Thread.sleep(2000);
				driver.findElement(By.id("rdbNoSignUpYes")).click();
				
				*/
				
				// click on add more info 
				Thread.sleep(2000);
				driver.findElement(By.id("imgUpDown")).click();
				//class duration
				Thread.sleep(3000);
				driver.findElement(By.id("txtDuration")).clear();
				Thread.sleep(1000);
				driver.findElement(By.id("txtDuration")).sendKeys("30");
				// Max attendees values enter
				Thread.sleep(2000);
				driver.findElement(By.id("txtMaxUsers")).clear();
				Thread.sleep(1000);
				driver.findElement(By.id("txtMaxUsers")).sendKeys("10");
				Thread.sleep(1000);
				//click on instructor
				driver.findElement(By.id("anciconcoinstructor")).click();
				//select instructor from dropdown
				Thread.sleep(2000);
		  		Select inst1 = new Select(driver.findElement(By.id("ddlcoinstructor1")));
		  		inst1.selectByVisibleText("instructor09");
		  		Thread.sleep(1500);
		  		driver.findElement(By.id("imgUpDown")).click();
		  		Thread.sleep(1500);
				driver.findElement(By.id("btnSchedule")).click();
				driver.switchTo().parentFrame();
				Thread.sleep(3000);
				//closing class(which is created by you)
				driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
				//come out of frame
				Thread.sleep(2000);
				driver.switchTo().defaultContent();
				//refresh the page
				Thread.sleep(3000);
				driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
				System.out.println("Recurring class is created successfully at Instructor end ");
				//click on search class filter
				Thread.sleep(3000);
				driver.findElement(By.xpath("//em[contains(text(),'search')]")).click();
				// search your recurring class in your classes list
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='searchClass']")).sendKeys("Recurring_class9");
				Thread.sleep(8000);
				System.out.print("RecurringClass_automation_done at instructor end");
				Thread.sleep(5000);
				driver.close();
				
		
		
		
}

}
