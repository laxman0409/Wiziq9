package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Draft_course extends Testbase {
	
	@Test(priority=7)
	public void Draft_Course() throws InterruptedException, AWTException
	{
	
	
		File file = new File("src\\test\\resources\\images\\9.jpg");
		String localFilePath = file.getAbsolutePath();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
		// click course module
		driver.findElement(By.xpath("//span[@class='listCol']//span[contains(text(),'Courses')]")).click();
		
		//click on add course
		//WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("add_course"))));
	   		//Category_Body.click();
	   		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='primary mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect mdl-button--colored']//span[@class='mdl-button__ripple-container']")).click();
		Thread.sleep(5000);
	   		// for selfpace course click
	   		driver.findElement(By.xpath(OR.getProperty("add_selfpace"))).click();
	   		Thread.sleep(9000);
	   		
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
			Thread.sleep(10000);
			
			//2nd page
			
			
			// add the course name
		   	  driver.findElement(By.id("txtTitle")).sendKeys("Draft_Course_is_saved_by_automation");
			 // driver.findElement(By.id("lbtnNextProfile")).click();
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
		   	
		   	//again add title 
		   	
		    driver.findElement(By.id("txtTitle")).sendKeys("Draft_Course_is_saved_by_automation");
		    Thread.sleep(1000);
			  driver.findElement(By.id("lbtnNextProfile")).click();
			  Thread.sleep(4000);
			  
			  
			  //3rd page 
              
              
              Thread.sleep(1000);
  		 	driver.findElement(By.id("txtSubTitle")).sendKeys("This_testing_done_By_automation");
  			driver.findElement(By.id("txtHighlight1")).sendKeys("Testing1_via_automation");
  			driver.findElement(By.id("txtHighlight2")).sendKeys("Testing2_via_automation");
  			driver.findElement(By.id("txtHighlight3")).sendKeys("Testing3_via_automation");
  			WebElement elm4 = driver.findElement(By.id("txtAbtCourse_ifr"));
  			driver.switchTo().frame(elm4);
  			driver.findElement(By.id("tinymce")).sendKeys("This self paced course  is created via automation testing");
  			driver.switchTo().parentFrame();
  			Thread.sleep(5000);
  			//driver.findElement(By.xpath("//a[@id='lbtnNextInvite']")).click();
  			//click on save as draft
  			driver.findElement(By.xpath("//a[@id='aSaveAsDraftStep2']")).click();
  			driver.switchTo().parentFrame();
  			Thread.sleep(6000);
  			driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
  			driver.switchTo().defaultContent();
  			Thread.sleep(2000);
  			driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
  			Thread.sleep(2000);
  			//click on draft module
  			driver.findElement(By.xpath("//span[normalize-space()='Draft']")).click();
  			Thread.sleep(3000);
  			driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
  			Thread.sleep(5000);
  			System.out.println("Course saved in Draft module successfully via automation");
  			driver.close();

			
	
	
}

}
