package com.wiziq.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Instructor_LiveClass extends Testbase {
	@Test(priority=1)
	public void instructor() throws InterruptedException, AWTException, IOException
	{
	
		File file = new File("src\\test\\resources\\images\\9.jpg");
		String localFilePath = file.getAbsolutePath();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//em[@id='menu-top-right']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Instructor']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Live Classes')]")).click();
		Thread.sleep(5000);
		
		//click on live classes symbol
				driver.findElement(By.xpath("//div[@class='floatingBtn']")).click();
				Thread.sleep(5000);
				//shift to frame
				WebElement frame1=driver.findElement(By.id("creationOverlay"));
				driver.switchTo().frame(frame1);
				Thread.sleep(5000);
				//fill the form
				driver.findElement(By.id("txtTitle")).sendKeys("LiveClass_01_At_instructor_end_create_via_automation");
				Thread.sleep(1000);
				driver.findElement(By.id("txtTagline")).sendKeys("LiveClass_Testing_Instrucor_end_via_automation");
				Thread.sleep(3000);
				//click on current date and time
				//Thread.sleep(1000);
				//driver.findElement(By.linkText("Set current date and time")).click();
						
				//select date
				driver.findElement(By.id("RecurringControl1_txtStartDate")).click();
				Thread.sleep(1500); 
				driver.findElement(By.xpath("//a[text()='30']")).click();
				//select time
				Select time = new Select(driver.findElement(By.id("RecurringControl1_drpHour")));
				time.selectByVisibleText("09");
				
				/*
				
				//about the class
				driver.findElement(By.id("txtDescription")).sendKeys("This testing done by automation");
				Thread.sleep(1000);
		
				//click on radio button
				driver.findElement(By.id("rdpublic")).click();
				Thread.sleep(1000);
				//click on "No" recording option
				driver.findElement(By.id("rdbDontRecord")).click();
				Thread.sleep(2000);
				
				//click on class logo
		        driver.findElement(By.id("SpanUploadImage")).click();
		        Thread.sleep(3000);
		        WebElement image=driver.findElement(By.id("TB_iframeContent"));
		        Thread.sleep(2000);
				driver.switchTo().frame(image);
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
				driver.findElement(By.id("txtMaxUsers")).sendKeys("100");
				Thread.sleep(1000);
				//click on instructor
				driver.findElement(By.id("anciconcoinstructor")).click();
				//select instructor from dropdown
				Thread.sleep(2000);
		  		Select instructor1 = new Select(driver.findElement(By.id("ddlcoinstructor1")));
		  		instructor1.selectByVisibleText("instructor09");
		  		Thread.sleep(1500);
		  		driver.findElement(By.id("imgUpDown")).click();
		  		Thread.sleep(1500);
				driver.findElement(By.id("btnSchedule")).click();
				driver.switchTo().parentFrame();
				Thread.sleep(3000);
				//click on "x" icon (which is created by you)
				driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
				//come out of frame
				Thread.sleep(2000);
				driver.switchTo().defaultContent();
				//refresh the page
				Thread.sleep(1500);
				driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
				//message in console
				System.out.println("Live class is created at instrucor end sucessfully");
				Thread.sleep(3500);
				driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
				Thread.sleep(3500);
				
				
				//Editing live class
				
				  // Go to edit the class option
				  driver.findElement(By.xpath(OR.getProperty("edit_class"))).click();
				  Thread.sleep(2000);
				  WebElement frame2=driver.findElement(By.id("creationOverlay"));
				  driver.switchTo().frame(frame2); 
				  // driver.switchTo().parentFrame(); 
				  //fill the form for editing
				  Thread.sleep(1000);
				  driver.findElement(By.id("txtTitle")).clear();
				  Thread.sleep(1000);
				  driver.findElement(By.id("txtTitle")).sendKeys("LiveClass_01_Instrucor_end_Edit_Done");
				  Thread.sleep(1000);
				  driver.findElement(By.id("txtTagline")).clear();
				  Thread.sleep(1000);
				  driver.findElement(By.id("txtTagline")).sendKeys("LiveClass_Edit_Testing_Instructor_end_via_automation"); 
				  Thread.sleep(1000);
				  driver.findElement(By.id("RecurringControl1_txtStartDate")).click();
				  Thread.sleep(1500); 
				  driver.findElement(By.xpath("//a[text()='30']")).click();
				  // mention time for edit class Thread.sleep(1500); 
				  Select time2 = new Select(driver.findElement(By.id("RecurringControl1_drpHour")));
				  time2.selectByVisibleText("11"); 
				  
				  // click on add more info
				  Thread.sleep(2000); driver.findElement(By.id("imgUpDown")).click(); 
				  //class duration 
				  Thread.sleep(3000);
				  driver.findElement(By.id("txtDuration")).clear();
				  Thread.sleep(1000);
				  driver.findElement(By.id("txtDuration")).sendKeys("32"); 
				  // Max attendees values enter 
				  Thread.sleep(2000);
				  driver.findElement(By.id("txtMaxUsers")).clear();
				  Thread.sleep(1000);
				  driver.findElement(By.id("txtMaxUsers")).sendKeys("120");
				  Thread.sleep(1000);
				  //click on update and continue Thread.sleep(1500);
				  driver.findElement(By.id("imgUpDown")).click();
				  Thread.sleep(1500); 
				  driver.findElement(By.id("btnSchedule")).click();
				  Thread.sleep(2500); 
				  //come out of frame 
				  driver.switchTo().parentFrame();
				  Thread.sleep(1500);
				  driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
				  Thread.sleep(1500);
				  driver.switchTo().defaultContent();
				  Thread.sleep(1500);
				  //refresh the class again
				  driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
				  Thread.sleep(3500);
				  driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
				  Thread.sleep(3500);
				  System.out.println("Live Class is edited successfully at instrucor end ");
				  Thread.sleep(3000);
				  
				  
			    
				  //enrollment via email process
				
				  //Go to view class for enrollment
				  driver.findElement(By.cssSelector("i.material-icons")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//span[contains(text(),'Live Classes')]")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//div[@class='mdl-grid maxGridSize dateRange']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//ul[1]//li[3]//div[1]//button[1]//span[2]")).click();
				 // driver.findElement(By.xpath(OR.getProperty("view_class"))).click();
				  Thread.sleep(1500); 
				  //click on people tab
				  driver.findElement(By.xpath(OR.getProperty("people_class"))).click();
				  Thread.sleep(1500); 
				  //click on enroll_new
				  driver.findElement(By.xpath(OR.getProperty("enrol_new_class"))).click();
				  Thread.sleep(3500); 
				  //enter user name
				  driver.findElement(By.id("byName")).sendKeys("learner02");
				  Thread.sleep(3500);
				  //enter email id
				  driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys("learner02@yopmail.com");
				  Thread.sleep(1500);
				  driver.findElement(By.id("submit")).click();
				  Thread.sleep(1500);
				  driver.findElement(By.xpath(OR.getProperty("enroll_ok"))).click();
				  Thread.sleep(500);
				  System.out.println("User enroll through email is done");
				 // Thread.sleep(4000);
				  //click on refresh
				  //driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/a[1]")).click();
				  //Thread.sleep(4000);
				  //driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/a[1]")).click();
					
				  
				  //enrollment via list process
				  
				  
				//enroll from list option 
				  Thread.sleep(2500);
				  //click on enroll new
				  driver.findElement(By.xpath(OR.getProperty("enroll_new"))).click();
				  Thread.sleep(2000);
				  //click on from list
				  driver.findElement(By.xpath(OR.getProperty("by_list"))).click();
				  Thread.sleep(2500); 
				  //pickup user1 from list
				  driver.findElement(By.xpath(OR.getProperty("user1"))).click();
				  Thread.sleep(2500); 
				  //pickup user2 from list
				  driver.findElement(By.xpath(OR.getProperty("user2"))).click();
				  Thread.sleep(2500);
				  driver.findElement(By.id("fromListSubmit")).click();
				  Thread.sleep(2000); 
				  //click on enroll
				  driver.findElement(By.xpath(OR.getProperty("enroll_ok"))).click();
				  Thread.sleep(500); 
				  System.out.println("User  enroll from list done");
				 Thread.sleep(4000);
				 // click on refresh
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/a[1]")).click();
				  Thread.sleep(4000);
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/a[1]")).click();
				  
				  
				  //enrollment via csv file process
				  
				  
				//enroll from csv file 
				  Thread.sleep(8000);
				 // driver.findElement(By.xpath(OR.getProperty("add_enrol"))).click();
			   		//Thread.sleep(5000);
				    driver.findElement(By.xpath("//span[@class='mdl-button__ripple-container']")).click();
				    Thread.sleep(5000); 
				    driver.findElement(By.xpath("//a[normalize-space()='account_circle']")).click();
				    Thread.sleep(5000); 
				    driver.findElement(By.xpath(OR.getProperty("upload_list"))).click();
			 		Thread.sleep(5000);
					driver.findElement(By.xpath(OR.getProperty("upload_popup"))).click();
				  Thread.sleep(3000);
				  Robot robot= new Robot();
				  StringSelection str= new StringSelection("C:\\Users\\admin\\Desktop\\invitation_course_class.csv");
				  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
				  robot.setAutoDelay(3000);
				  robot.keyPress(KeyEvent.VK_CONTROL);
				  robot.keyPress(KeyEvent.VK_V);

				  robot.keyRelease(KeyEvent.VK_CONTROL);
				  robot.keyRelease(KeyEvent.VK_V);

				  robot.setAutoDelay(3000);
				  robot.keyPress(KeyEvent.VK_ENTER);
				  robot.keyRelease(KeyEvent.VK_ENTER);
				  Thread.sleep(2500);
				  driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/section/div/div/div/div/div[3]/div[2]/div/ul/li/button[2]/span[2]")).click();
				  Thread.sleep(2500);
				  driver.findElement(By.xpath(OR.getProperty("enroll_ok"))).click();
				  
				  Thread.sleep(4000);
				 // click on refresh
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/a[1]")).click();
				  Thread.sleep(4000);
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/a[1]")).click();
				  Thread.sleep(500);
				  System.out.println("User enroll  is  done by csv");
				  Thread.sleep(2500);
				  //driver.findElement(By.xpath(OR.getProperty("refresh_clash_enrol"))).click();
				  //driver.findElement(By.xpath(OR.getProperty("back_course"))).click();
				  
				  
				  //download csv file
				  
				  
				//click on export csv file download
				   driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/div/section[2]/div[1]/div[1]/a/span")).click();
			        Thread.sleep(4000);
					 // click on refresh
					  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/a[1]")).click();
					  Thread.sleep(4000);
					  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/a[1]")).click();
					  Thread.sleep(500);
			        Thread.sleep(3000);
					driver.findElement(By.xpath(OR.getProperty("class_overview"))).click();
					Thread.sleep(4000);
					driver.findElement(By.cssSelector("i.material-icons")).click();
					Thread.sleep(5000);
					// click o live classes module
					//driver.findElement(By.xpath("//span[text()='Live Classes']")).click();
					driver.findElement(By.xpath(OR.getProperty("live_class"))).click();
					Thread.sleep(3500);
					driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
					
					//System.out.println("============================================");
					System.out.println("Live class automation done    ");
					//System.out.println("============================================");
			
					
					driver.close();
		
		
	}
}

