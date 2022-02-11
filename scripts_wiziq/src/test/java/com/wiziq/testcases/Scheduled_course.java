package com.wiziq.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Scheduled_course extends Testbase{
	@Test(priority=2)
	public void schedule_course() throws InterruptedException, AWTException
	{
		
		File file = new File("src\\test\\resources\\images\\10.jpg");
		String localFilePath = file.getAbsolutePath();
		
		   WebDriverWait wait = new WebDriverWait(driver, 100);
	   		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("add_course"))));
	   		Category_Body.click();
	   		Thread.sleep(5000);
	   		driver.findElement(By.xpath("//a[contains(@class,'material')]")).click();
	   		Thread.sleep(5000);
			WebElement elm = driver.findElement(By.id("creationOverlay"));
			driver.switchTo().frame(elm);
			// add coinstructor
	   		WebDriverWait wait1 = new WebDriverWait(driver, 210);
	   		WebElement Category_Body1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("anciconcoinstructor")));
	   		Category_Body1.click();
	   		
	   		//select instructor from dropdown
	   		Select inst = new Select(driver.findElement(By.id("ddlcoinstructor1")));
	   		inst.selectByVisibleText("instructor01");
	   		// to enable discussion
	   	    driver.findElement(By.id("chkEnableDiscussion")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[@id='lbtnSaveSettings']")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("datepicker")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='30']")).click();
			driver.findElement(By.id("datepickerEnd")).click();
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//a[text()='28']")).click();
		    driver.findElement(By.id("txtTitle")).sendKeys("Scheduled_course_via_automation_done");
		    driver.findElement(By.id("btnPublishCourse")).click();
		    Thread.sleep(10000);
			driver.findElement(By.id("btnPublishCourse")).click();
			Thread.sleep(30000);
			
				
			// clicking on add activity
		     driver.findElement(By.xpath(OR.getProperty("add_activity1"))).click();
		     // select file in the course
		     Thread.sleep(2000);
		    driver.findElement(By.xpath(OR.getProperty("file_click1"))).click();
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"aAddExisting\"]")).click();
            WebElement elm1 = driver.findElement(By.id("frameExisting"));
             driver.switchTo().frame(elm1);
             driver.findElement(By.xpath("//input[@id='chkboxRepeater_1024569']")).click();
             Thread.sleep(10000);
             driver.findElement(By.xpath("//*[@id=\"lnkbtnAdd\"]/span")).click();
             Thread.sleep(20000);
             driver.switchTo().parentFrame();
             driver.findElement(By.xpath("//*[@id=\"dvexbuttons\"]/div/span")).click();
             Thread.sleep(20000);
             System.out.println("File added to course");
             
             
             //skipping activities because of time taken
             /*  
             driver.findElement(By.xpath(OR.getProperty("add_activity1"))).click();
              Thread.sleep(5000);
             driver.findElement(By.xpath(OR.getProperty("recorded_class1"))).click();
             Thread.sleep(20000);
             WebElement elm2 = driver.findElement(By.id("ifrmCourse"));
             driver.switchTo().frame(elm2); 
             driver.findElement(By.id("ctl00_rptClass_divCheckbox_0")).click();
             Thread.sleep(2000);
             driver.findElement(By.xpath(OR.getProperty("add_to_course"))).click();
             Thread.sleep(25000);
             driver.switchTo().parentFrame();
             driver.findElement(By.xpath(OR.getProperty("back_course1"))).click();
             Thread.sleep(20000);
             System.out.println("Recorded class added to course");
             
             
             
              driver.findElement(By.xpath(OR.getProperty("add_activity1"))).click();
              Thread.sleep(20000);
              driver.findElement(By.xpath(OR.getProperty("assignment"))).click();
              Thread.sleep(20000);
              driver.findElement(By.id("txtTitle")).sendKeys("Assignment");
              driver.findElement(By.xpath(OR.getProperty("choose_from_lib"))).click();
              Thread.sleep(30000);
              WebElement elm3= driver.findElement(By.xpath("//*[@id=\"cboxLoadedContent\"]/iframe"));
              driver.switchTo().frame(elm3);
              //driver.findElement(By.xpath("//*[@id=\"38700\"]")).click();
              driver.findElement(By.id("CheckBox")).click();
              driver.findElement(By.id("btnAddAssignment")).click();
              Thread.sleep(10000);
              driver.switchTo().parentFrame();
              driver.findElement(By.xpath("//*[@id=\"spnBtnName\"]")).click();
              System.out.println("Assignement added to course");
              
              
              Thread.sleep(20000);
              driver.findElement(By.xpath(OR.getProperty("add_activity2"))).click();
  			Thread.sleep(20000);
  			driver.findElement(By.xpath(OR.getProperty("test_click"))).click();
  		    Thread.sleep(5000);
  			driver.findElement(By.xpath(OR.getProperty("test_title"))).sendKeys("test");
  			driver.findElement(By.xpath(OR.getProperty("pass_score"))).sendKeys("1");
  			// clicking on next button
  			driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
  			Thread.sleep(30000);
  			// click on add question button
  			driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
  			Thread.sleep(10000);
  			driver.findElement(By.xpath(OR.getProperty("multiple_choice_ques"))).click();
  			Thread.sleep(15000);
  			driver.findElement(By.xpath(OR.getProperty("choice1"))).click();
  			Thread.sleep(1000);
  			driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
  			Thread.sleep(10000);
  			// click on next button
  			driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
  			// click to publish question
  			Thread.sleep(10000);
  			driver.findElement(By.xpath("//*[@id=\"test-publish\"]")).click();
  			System.out.println("test added to course");
  			
  				//================
  			
  			Thread.sleep(20000);
  			driver.findElement(By.xpath(OR.getProperty("expand_week"))).click();
  			Thread.sleep(10000);
  		    driver.findElement(By.xpath(OR.getProperty("add_activity2"))).click();
  		    Thread.sleep(5000);
  		    driver.findElement(By.xpath(OR.getProperty("class_click"))).click();
  		     Thread.sleep(10000);
  		    driver.findElement(By.xpath(OR.getProperty("class_title"))).sendKeys("live");
  		    driver.findElement(By.id("rdbRecordClass")).click();
  		   driver.findElement(By.id("btnSchedule")).click();
  		 */	// Thread.sleep(10000);
  			
  			
  			
			Thread.sleep(5000);
  		    driver.findElement(By.id("lbtnNextProfile")).click();
  			// System.out.println("classes added to course");
  			 
  			 
             
              
              Thread.sleep(5000);
  		 	driver.findElement(By.id("txtSubTitle")).sendKeys("This_testing_done_By_automation");
  			driver.findElement(By.id("txtHighlight1")).sendKeys("Testing1_via_automation");
  			driver.findElement(By.id("txtHighlight2")).sendKeys("Testing2_via_automation");
  			driver.findElement(By.id("txtHighlight3")).sendKeys("Testing3_via_automation");
  			WebElement elm4 = driver.findElement(By.id("txtAbtCourse_ifr"));
  			driver.switchTo().frame(elm4);
  			driver.findElement(By.id("tinymce")).sendKeys("This scheduled course  is created via automation testing");
  			driver.switchTo().parentFrame();
  			Thread.sleep(5000);
  			driver.findElement(By.xpath("//a[@id='lbtnNextInvite']")).click();
  			driver.switchTo().parentFrame();
  			Thread.sleep(10000);
  			driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
  			driver.switchTo().defaultContent();
  			Thread.sleep(2000);
  			driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
  			Thread.sleep(10000);
  			System.out.println(" Scheduled course created successfully via automation");

    		 
  			
  		//enrollment process for course

  			Thread.sleep(4000);
  			driver.findElement(By.cssSelector("i.material-icons")).click();
  			Thread.sleep(5000);
  			// click course module
  			driver.findElement(By.xpath("//span[@class='listCol']//span[contains(text(),'Courses')]")).click();
  			Thread.sleep(5000);
  			//click on view course
  			driver.findElement(By.xpath("//body//div//div[@data-upgraded=',MaterialLayout']//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//ul[1]//li[2]//button[1]")).click();
  			Thread.sleep(5000);
  			driver.findElement(By.xpath("//span[normalize-space()='People']")).click();
  			Thread.sleep(5000);
  			driver.findElement(By.xpath("//button[@class='filledStylePri mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect']//span[@class='mdl-button__ripple-container']")).click();
  			Thread.sleep(5000);
  		
  			//click on enroll_new
  			 // driver.findElement(By.xpath(OR.getProperty("enrol_new_class"))).click();
  			 // Thread.sleep(3500); 
  			  //enter user name
  			  driver.findElement(By.id("byName")).sendKeys("learner01");
  			  Thread.sleep(3500);
  			  //enter email id
  			  driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys("learner01@yopmail.com");
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
  			  Thread.sleep(5000);
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
  			 Thread.sleep(5000);
  			 // click on refresh
  			  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
  			  Thread.sleep(4000);
  			  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
  			  
  			
  			  
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
			  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
			  Thread.sleep(5000);
			  System.out.println("User enroll  is  done by csv at Instructor end");
			  Thread.sleep(2500);
			  //driver.findElement(By.xpath(OR.getProperty("refresh_clash_enrol"))).click();
			  //driver.findElement(By.xpath(OR.getProperty("back_course"))).click();
			  
			  
			  //download csv file
			  
			  
			//click on export csv file download
			   driver.findElement(By.xpath("//span[contains(text(),'EXPORT CSV')]")).click();
		        Thread.sleep(4000);
				 // click on refresh
				  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
				  Thread.sleep(5000);
		        
		        
		      //back to course module
	  			  
	  			  Thread.sleep(4000);
	  				driver.findElement(By.cssSelector("i.material-icons")).click();
	  				Thread.sleep(5000);
	  				// click course module
	  				driver.findElement(By.xpath("//span[@class='listCol']//span[contains(text(),'Courses')]")).click();
	  				Thread.sleep(2500);
	  				driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
	  				Thread.sleep(5000);
	  				
					//System.out.println("============================================");
					System.out.println("Scheduled course automation done");
					//System.out.println("============================================");
		
	  			    driver.close();
				
	
  			  
  			  
  			/*//enroll from csv file 
  			  Thread.sleep(6000);
  			 // driver.findElement(By.xpath(OR.getProperty("add_enrol"))).click();
  		   		//Thread.sleep(5000);
  			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]/span[1]")).click();
  			    Thread.sleep(5000); 
  			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[2]/a[1]")).click();
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
  			  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
  			  Thread.sleep(4000);
  			  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
  			  Thread.sleep(2500);
  			  System.out.println("User enroll  is  done by csv");
  			  Thread.sleep(2500);
  			  
  			  
  			//back to course module
  			  
  			  Thread.sleep(4000);
  				driver.findElement(By.cssSelector("i.material-icons")).click();
  				Thread.sleep(5000);
  				// click course module
  				driver.findElement(By.xpath("//span[@class='listCol']//span[contains(text(),'Courses')]")).click();
  				Thread.sleep(5000);
  			
  			    driver.close();
  		*/
  			
  			
    	
    			
  			//skipping editing course
  			
  			
    		/*	driver.findElement(By.xpath(OR.getProperty("view_course"))).click();
    			Thread.sleep(10000);
    			driver.findElement(By.xpath(OR.getProperty("overview_course"))).click();
    			driver.findElement(By.xpath(OR.getProperty("edit_course"))).click();
    			WebElement elm5 = driver.findElement(By.id("creationOverlay"));
    			driver.switchTo().frame(elm5);
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
              WebElement elm6 = driver.findElement(By.id("ifrmCourse"));
              driver.switchTo().frame(elm6);
              //driver.findElement(By.id("chkboxRepeater_249476")).click();
              List<WebElement> props = driver.findElements(By.id("ctl00_rptClass_divCheckbox_0"));
              for (WebElement prop : props)
                  if (!prop.isSelected()) {
                      prop.click();
                      break;
                  }
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
              
              */
  			
  			
			

    	}

 }
	

			 