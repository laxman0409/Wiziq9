package com.wiziq.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Course_scheduled_free extends Testbase{
	@Test(priority=1)
	public void schedule_free() throws InterruptedException, AWTException
	{
		   WebDriverWait wait = new WebDriverWait(driver, 100);
	   		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("add_course"))));
	   		Category_Body.click();
	   		driver.findElement(By.xpath("//a[contains(@class,'material')]")).click();
			WebElement elm = driver.findElement(By.id("creationOverlay"));
			driver.switchTo().frame(elm);
			// add coinstructor
	   		WebDriverWait wait1 = new WebDriverWait(driver, 210);
	   		WebElement Category_Body1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("anciconcoinstructor")));
	   		Category_Body1.click();
	   		
	   		//select instructor from dropdown
	   		Select inst = new Select(driver.findElement(By.id("ddlcoinstructor1")));
	   		inst.selectByVisibleText("Abhijeet Instructor");
	   		// to enable discussion
	   	    driver.findElement(By.id("chkEnableDiscussion")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@id='lbtnSaveSettings']")).click();
			driver.findElement(By.id("datepicker")).click();
			driver.findElement(By.xpath("//a[text()='30']")).click();
			driver.findElement(By.id("datepickerEnd")).click();
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//a[text()='28']")).click();
		    driver.findElement(By.id("txtTitle")).sendKeys("free schedule automated");
		    driver.findElement(By.id("btnPublishCourse")).click();
		    Thread.sleep(10000);
			driver.findElement(By.id("btnPublishCourse")).click();
			Thread.sleep(30000);
			 // clicking on add activity
		     driver.findElement(By.xpath(OR.getProperty("add_activity1"))).click();
		     // select file in the course
		    driver.findElement(By.xpath(OR.getProperty("file_click1"))).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"aAddExisting\"]")).click();
            WebElement elm1 = driver.findElement(By.id("frameExisting"));
             driver.switchTo().frame(elm1);
             driver.findElement(By.xpath("//*[@id=\"chkboxRepeater_30158\"]")).click();
             Thread.sleep(10000);
             driver.findElement(By.xpath("//*[@id=\"lnkbtnAdd\"]/span")).click();
             Thread.sleep(20000);
             driver.switchTo().parentFrame();
             driver.findElement(By.xpath("//*[@id=\"dvexbuttons\"]/div/span")).click();
             Thread.sleep(20000);
             System.out.println("Files added to course");
//             driver.findElement(By.xpath(OR.getProperty("add_activity1"))).click();
//              Thread.sleep(30000);
//             driver.findElement(By.xpath(OR.getProperty("recorded_class1"))).click();
//             Thread.sleep(30000);
//             WebElement elm2 = driver.findElement(By.id("ifrmCourse"));
//             driver.switchTo().frame(elm2);
//             driver.findElement(By.id("chkboxRepeater_249476")).click();
//             driver.findElement(By.xpath(OR.getProperty("add_to_course"))).click();
//             Thread.sleep(10000);
//             driver.switchTo().parentFrame();
//             driver.findElement(By.xpath(OR.getProperty("back_course"))).click();
//             Thread.sleep(20000);
//             System.out.println("Recorded class added to course");
//              driver.findElement(By.xpath(OR.getProperty("add_activity1"))).click();
//              Thread.sleep(20000);
//              driver.findElement(By.xpath(OR.getProperty("assignment"))).click();
//              Thread.sleep(20000);
//              driver.findElement(By.id("txtTitle")).sendKeys("Assignment");
//              driver.findElement(By.xpath(OR.getProperty("choose_from_lib"))).click();
//              Thread.sleep(30000);
//              WebElement elm3= driver.findElement(By.xpath("//*[@id=\"cboxLoadedContent\"]/iframe"));
//              driver.switchTo().frame(elm3);
//              driver.findElement(By.xpath("//*[@id=\"38700\"]")).click();
//              driver.findElement(By.id("btnAddAssignment")).click();
//              Thread.sleep(10000);
//              driver.switchTo().parentFrame();
//              driver.findElement(By.xpath("//*[@id=\"spnBtnName\"]")).click();
//              System.out.println("Assignement added to course");
//              Thread.sleep(10000);
//              driver.findElement(By.xpath(OR.getProperty("add_activity1"))).click();
//  			Thread.sleep(20000);
//  			driver.findElement(By.xpath(OR.getProperty("test_click"))).click();
//  		
//  			driver.findElement(By.xpath(OR.getProperty("test_title"))).sendKeys("test");
//  			driver.findElement(By.xpath(OR.getProperty("pass_score"))).sendKeys("1");
//  			// clicking on next button
//  			driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
//  			Thread.sleep(30000);
//  			// click on add question button
//  			driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
//  			Thread.sleep(10000);
//  			driver.findElement(By.xpath(OR.getProperty("multiple_choice_ques"))).click();
//  			Thread.sleep(10000);
//  			driver.findElement(By.xpath(OR.getProperty("choice1"))).click();
//  			driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
//  			Thread.sleep(10000);
//  			// click on next button
//  			driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
//  			// click to publish question
//  			Thread.sleep(10000);
//  			driver.findElement(By.xpath("//*[@id=\"test-publish\"]")).click();
//  			System.out.println("test added to course");
//  			Thread.sleep(20000);
//  			driver.findElement(By.xpath(OR.getProperty("expand_week"))).click();
//  			Thread.sleep(10000);
//  		    driver.findElement(By.xpath(OR.getProperty("add_activity2"))).click();
//  		    driver.findElement(By.xpath(OR.getProperty("class_click"))).click();
//  		     Thread.sleep(10000);
//  		    driver.findElement(By.xpath(OR.getProperty("class_title"))).sendKeys("live");
//  		    driver.findElement(By.id("rdbRecordClass")).click();
//  		    driver.findElement(By.id("btnSchedule")).click();
//  			 Thread.sleep(20000);
//  		    driver.findElement(By.id("lbtnNextProfile")).click();
//  			 System.out.println("classes added to course");
//              Thread.sleep(10000);
              driver.findElement(By.id("lbtnNextProfile")).click();
    		  Thread.sleep(10000);
    		  driver.findElement(By.id("txtSubTitle")).sendKeys("11");
    			driver.findElement(By.id("txtHighlight1")).sendKeys("1");
    			driver.findElement(By.id("txtHighlight2")).sendKeys("11");
    			driver.findElement(By.id("txtHighlight3")).sendKeys("11");
    			WebElement elm4 = driver.findElement(By.id("txtAbtCourse_ifr"));
    			driver.switchTo().frame(elm4);
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
    			System.out.println("Free scheduled course created successfully");
    			driver.findElement(By.xpath(OR.getProperty("view_course"))).click();
    			Thread.sleep(10000);
    			driver.findElement(By.xpath(OR.getProperty("overview_course"))).click();
    			driver.findElement(By.xpath(OR.getProperty("edit_course"))).click();
    			WebElement elm3 = driver.findElement(By.id("creationOverlay"));
    			driver.switchTo().frame(elm3);
    			Thread.sleep(20000);
    			// editing the coinstructor
    			Select inst1 = new Select(driver.findElement(By.id("ddlcoinstructor1"))); 
    	   		inst1.selectByVisibleText("admin1 20161");
    	   		Thread.sleep(10000);
    			driver.findElement(By.xpath("//a[@id='lbtnSaveSettings']")).click();
    			Thread.sleep(10000);
    			driver.findElement(By.id("datepickerEnd")).click();
    			driver.findElement(By.xpath("//span[text()='Next']")).click();
    			driver.findElement(By.xpath("//a[text()='29']")).click();
    		    driver.findElement(By.id("lnkBtnEditDate")).click();
    			Thread.sleep(10000);
    		   // driver.findElement(By.id("btnPublishCourse")).click();
    		   // Thread.sleep(30000);
    		   driver.findElement(By.xpath(OR.getProperty("add_activity1"))).click();
               Thread.sleep(30000);
              driver.findElement(By.xpath(OR.getProperty("recorded_class1"))).click();
              Thread.sleep(30000);
              WebElement elm2 = driver.findElement(By.id("ifrmCourse"));
              driver.switchTo().frame(elm2);
              driver.findElement(By.id("chkboxRepeater_249476")).click();
              driver.findElement(By.xpath(OR.getProperty("add_to_course"))).click();
              Thread.sleep(10000);
              driver.switchTo().parentFrame();
              driver.findElement(By.xpath(OR.getProperty("back_course"))).click();
              Thread.sleep(20000);
              System.out.println("Recorded class added to course");
              Thread.sleep(20000);
              driver.findElement(By.id("lbtnNextProfile")).click();
            //  driver.findElement(By.xpath("//a[@id='lbtnNextInvite']")).click();
  			driver.switchTo().parentFrame();
              System.out.println("course is edited");
  			Thread.sleep(20000);
  			driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
  			driver.switchTo().defaultContent();
//    			driver.findElement(By.xpath(OR.getProperty("people"))).click();
//    			Thread.sleep(10000);
//    			driver.findElement(By.xpath(OR.getProperty("enroll_new"))).click();
//    			Thread.sleep(10000);
//    			driver.findElement(By.id("byName")).sendKeys("zoya");
//    			Thread.sleep(20000);
//    			driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys("zoya@yopmail.com");
//    			Thread.sleep(10000);
//    			driver.findElement(By.id("submit")).click();
//    			Thread.sleep(20000);
//    			driver.findElement(By.xpath(OR.getProperty("enroll_ok"))).click();
//    			Thread.sleep(10000);
//    			driver.findElement(By.xpath(OR.getProperty("enroll_new"))).click();
//    			Thread.sleep(10000);
//    			driver.findElement(By.xpath(OR.getProperty("by_list"))).click();
//    			Thread.sleep(10000);
//    			driver.findElement(By.xpath(OR.getProperty("user1"))).click();
//    			Thread.sleep(10000);
//    			driver.findElement(By.xpath(OR.getProperty("user2"))).click();
//    			Thread.sleep(10000);
//    			driver.findElement(By.id("fromListSubmit")).click();
//    			Thread.sleep(20000);
//    			driver.findElement(By.xpath(OR.getProperty("enroll_ok"))).click();
//    			Thread.sleep(10000);
//    			driver.findElement(By.xpath(OR.getProperty("add_enrol"))).click();
//    			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[4]/ul/li[2]/a")).click();
//    			Thread.sleep(20000);
//    			driver.findElement(By.xpath(OR.getProperty("upload_list"))).click();
//    			Thread.sleep(10000);
//    			driver.findElement(By.xpath(OR.getProperty("upload_popup"))).click();
//    			Robot robot= new Robot();
//    	        StringSelection str= new StringSelection("C:\\Users\\sai\\Downloads\\list.csv");
//    			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    			robot.setAutoDelay(3000);
//    			robot.keyPress(KeyEvent.VK_CONTROL);
//    		    robot.keyPress(KeyEvent.VK_V);
//    			
//    			robot.keyRelease(KeyEvent.VK_CONTROL);
//    			robot.keyRelease(KeyEvent.VK_V);
//    			
//    			robot.setAutoDelay(4000);
//    			robot.keyPress(KeyEvent.VK_ENTER);
//    			robot.keyRelease(KeyEvent.VK_ENTER);
//    			Thread.sleep(12000);
//    			driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/section/div/div/div/div/div[3]/div[2]/div/ul/li/button[2]/span[2]")).click();
//    			Thread.sleep(20000);
//    			driver.findElement(By.xpath(OR.getProperty("enroll_ok"))).click();
//    			Thread.sleep(10000);
//    			System.out.println("Learners added for enrollment");
    			//driver.findElement(By.xpath(OR.getProperty("refresh_enrol"))).click();
    			

    	}

 }
	

			 