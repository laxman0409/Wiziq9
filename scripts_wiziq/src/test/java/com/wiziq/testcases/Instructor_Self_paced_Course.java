package com.wiziq.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Instructor_Self_paced_Course extends Testbase {

	@Test(priority=1)
	public void instructor_selfpaced() throws InterruptedException, AWTException, IOException
	{
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//em[@id='menu-top-right']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Instructor']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=' colorInherit active']")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]")).click();
		Thread.sleep(5000);
   		driver.findElement(By.xpath("//a[normalize-space()='school']")).click();
   		Thread.sleep(6000);
   		
   		
   		WebElement elm = driver.findElement(By.id("creationOverlay"));
		driver.switchTo().frame(elm);
		// add coinstructor
   		WebDriverWait wait1 = new WebDriverWait(driver, 210);
   		WebElement Category_Body1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("anciconcoinstructor")));
   		Category_Body1.click();
   		
   		//select instructor from dropdown
   		Select inst = new Select(driver.findElement(By.id("ddlcoinstructor1")));
   		inst.selectByVisibleText("instructor01");
   		// to enable discussion
   	    driver.findElement(By.id("chkEnableDiscussion")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@id='lbtnSaveSettings']")).click();
		Thread.sleep(10000);
		
		//2nd page
		
		
		// add the course name
	   	  driver.findElement(By.id("txtTitle")).sendKeys("Selfpaced_course_via_automated_done at instructor end");
		  //driver.findElement(By.id("lbtnNextProfile")).click();
		  Thread.sleep(2500);
		  
		  
		// clicking on add activity
	   	  driver.findElement(By.xpath(OR.getProperty("add_activity"))).click();
	   	  //click on assignment file
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("//li[@id='ucCourseSection_rptCourseSections_ucAddObjectsInRep_0_liAddAsgn_0']")).click();
	   	Thread.sleep(2000);
	   	//enter the assignment name or title
	   	driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys("Assignment demo");
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("//input[@id='chkTrackCourse']")).click();
	   	Thread.sleep(1000);
	   	//click o choose library file
	   	driver.findElement(By.xpath("//a[@id='lnkcontentlibrary']")).click();
	   	Thread.sleep(5000);
	   	WebElement elm5 = driver.findElement(By.className("cboxIframe"));
		driver.switchTo().frame(elm5);
	   	//search for pdf file
	  // 	driver.findElement(By.xpath("//input[@id='txtKeyword']")).sendKeys("Pdf");
	   	Thread.sleep(1000);
	   	//click on search icon
	   	//driver.findElement(By.xpath("//span[@class='cntsrchbtn']")).click();
	   //	Thread.sleep(2000);
	   	//click on check box
	   	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/input[1]")).click();

	   	Thread.sleep(1000);
	   	//click on add assignment button
	   	driver.findElement(By.xpath("//span[contains(text(),'Add to assignment')]")).click();
	   	Thread.sleep(1000);
	   	driver.switchTo().parentFrame();
	   	Thread.sleep(2000);
	   	//click on create assignment 
	   	
	   	driver.findElement(By.xpath("//a[@id='btnCreate']")).click();
	   	Thread.sleep(3000);
	   	// again give name 
	   	driver.findElement(By.id("txtTitle")).sendKeys("Selfpaced_course_via_automated_done at instructor end");
		Thread.sleep(1500);
		  driver.findElement(By.id("lbtnNextProfile")).click();
		  Thread.sleep(3000);
		  
		  
		  
		  //skipping due to course name is removed by automatically 
		  
	/*	
		  // clicking on add activity
	   	  driver.findElement(By.xpath(OR.getProperty("add_activity"))).click();
	   	  // select file in the course
	   	  driver.findElement(By.xpath(OR.getProperty("file_click"))).click();
	   	//choose library
	   	  driver.findElement(By.xpath(OR.getProperty("add_from_lib"))).click();
	   //choose one file
	   	Thread.sleep(3000);
	   	  driver.findElement(By.xpath("//div[@class='testuploaddv']//div//div[1]//div[1]//div[1]//input[1]")).click();
	  	
	   	  //click on continue
	   	  Thread.sleep(3000);
	   	  driver.findElement(By.xpath("//span[contains(text(),'Add to Course')]")).click();
	  	Thread.sleep(3000);
	  	//click on back
	   	  driver.findElement(By.xpath("//a[normalize-space()='Back']")).click();
	 Thread.sleep(10000);

	*/   	  
	   	  

		
		
		
/*				  driver.findElement(By.id("txtTitle")).sendKeys("self paced_course_via_automation");
		 Thread.sleep(3000);
		  // clicking on add activity
	   	  driver.findElement(By.xpath(OR.getProperty("add_activity"))).click();
	   	Thread.sleep(3000);
	   	driver.findElement(By.xpath("//a[normalize-space()='Test']")).click();
	  Thread.sleep(5000);
			driver.findElement(By.xpath(OR.getProperty("test_title"))).sendKeys("test");
			Thread.sleep(3000);
			driver.findElement(By.xpath(OR.getProperty("pass_score"))).sendKeys("1");
			// clicking on next button
			driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
			Thread.sleep(15000);
			// click on add question button
			driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath(OR.getProperty("multiple_choice_ques"))).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath(OR.getProperty("choice1"))).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
			Thread.sleep(5000);
			// click on next button
			driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
			// click to publish question
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id=\"test-publish\"]")).click();
			System.out.println("test added to course");
	   	  
			Thread.sleep(3000);
	
	   
			 driver.findElement(By.id("txtTitle")).clear();
			driver.findElement(By.id("txtTitle")).sendKeys("self paced_course_via_automation");
		
         Thread.sleep(5000);
		    driver.findElement(By.id("lbtnNextProfile")).click();
			
	*/
		
		
			 //3rd page 
          
           
           Thread.sleep(5000);
		 	driver.findElement(By.id("txtSubTitle")).sendKeys("This_testing_done_By_automation at instructor end");
			driver.findElement(By.id("txtHighlight1")).sendKeys("Testing1_via_automation at instructor end");
			driver.findElement(By.id("txtHighlight2")).sendKeys("Testing2_via_automation at instructor end");
			driver.findElement(By.id("txtHighlight3")).sendKeys("Testing3_via_automation at instructor end");
			WebElement elm4 = driver.findElement(By.id("txtAbtCourse_ifr"));
			driver.switchTo().frame(elm4);
			driver.findElement(By.id("tinymce")).sendKeys("This self paced course  is created via automation testing at instructor end");
			driver.switchTo().parentFrame();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@id='lbtnNextInvite']")).click();
			driver.switchTo().parentFrame();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
			Thread.sleep(6000);
			System.out.println(" Self paced_course created successfully via automation at instructor end ");

 		 
			
		//enrollment process for course

			Thread.sleep(2000);
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
			  System.out.println("User enroll through email is done at instructor end");
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
			  System.out.println("User  enroll from list done at instructor end");
			 Thread.sleep(5000);
			 // click on refresh
			  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
			  Thread.sleep(4000);
			  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
			  
			  
			  //enrollment via csv file process
			  
			  
				//enroll from csv file 
				  Thread.sleep(6000);
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
				  Thread.sleep(4000);
				  driver.findElement(By.xpath("//span[normalize-space()='Refresh Page']")).click();
				  Thread.sleep(2500);
				  System.out.println("User enroll  is  done by csv at Instructor end at instructor end");
				  Thread.sleep(2500);
				  
				  
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
					System.out.println("Self paced course automation done at instructor end");
					//System.out.println("============================================");
			
	  			    driver.close();
		
		
	}
	
}

