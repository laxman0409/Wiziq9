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

public class courses_selfpaced extends Testbase{
	@Test(priority=1)
	public void selfpaced() throws InterruptedException, AWTException
	{
		   WebDriverWait wait = new WebDriverWait(driver, 100);
	   		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("add_course"))));
	   		Category_Body.click();
	   		
	   		// for selfpace course
	   		driver.findElement(By.xpath(OR.getProperty("add_selfpace"))).click();
	   		Thread.sleep(10000);
	   		WebElement elm = driver.findElement(By.id("creationOverlay"));
			driver.switchTo().frame(elm);
			Thread.sleep(10000);
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
	   	  // clicking on add activity
	   	  //driver.findElement(By.xpath(OR.getProperty("add_activity"))).click();
	   	  // select file in the course
	   	  //driver.findElement(By.xpath(OR.getProperty("file_click"))).click();
	   	
	   	//  driver.findElement(By.xpath(OR.getProperty("add_from_lib"))).click();
	   
	   	 // Thread.sleep(10000);
	  
	   	 // driver.findElement(By.xpath(OR.getProperty("add_content"))).click();
	
	      Thread.sleep(10000);
	
	   	  
	   	  // add the course name
	   	  driver.findElement(By.id("txtTitle")).sendKeys("course selfpaced automated");
		  driver.findElement(By.id("lbtnNextProfile")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.id("txtSubTitle")).sendKeys("11");
			driver.findElement(By.id("txtHighlight1")).sendKeys("1");
			driver.findElement(By.id("txtHighlight2")).sendKeys("11");
			driver.findElement(By.id("txtHighlight3")).sendKeys("11");
			WebElement elm2 = driver.findElement(By.id("txtAbtCourse_ifr"));
			driver.switchTo().frame(elm2);
			driver.findElement(By.id("tinymce")).sendKeys("1111");
			driver.switchTo().parentFrame();
			driver.findElement(By.id("SpanUploadImage")).click();
			Thread.sleep(10000);
			WebElement elm3 = driver.findElement(By.id("TB_iframeContent"));
			driver.switchTo().frame(elm3);
			driver.findElement(By.xpath(OR.getProperty("browse_course_logo"))).click();
			Thread.sleep(30000);
			Robot robot= new Robot();
	        StringSelection str= new StringSelection("C:\\Users\\sai\\Downloads\\Aeroplane.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			robot.setAutoDelay(3000);
			robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(4000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(15000);
			driver.findElement(By.xpath("//a[@id='lbtnNextInvite']")).click();
			driver.switchTo().parentFrame();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
			driver.switchTo().defaultContent();
			System.out.println("Free selfpaced course is created");
			driver.findElement(By.xpath(OR.getProperty("refresh_course"))).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath(OR.getProperty("view_course"))).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(OR.getProperty("people"))).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(OR.getProperty("enroll_new"))).click();
			Thread.sleep(10000);
			driver.findElement(By.id("byName")).sendKeys("zoya");
			Thread.sleep(20000);
			driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys("zoya@yopmail.com");
			Thread.sleep(10000);
			driver.findElement(By.id("submit")).click();
			Thread.sleep(30000);
			driver.findElement(By.xpath(OR.getProperty("enroll_ok"))).click();
			Thread.sleep(10000);
			System.out.println("User enrol through email");
			driver.findElement(By.xpath(OR.getProperty("enroll_new"))).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(OR.getProperty("by_list"))).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(OR.getProperty("user1"))).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(OR.getProperty("user2"))).click();
			Thread.sleep(10000);
			driver.findElement(By.id("fromListSubmit")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath(OR.getProperty("enroll_ok"))).click();
			Thread.sleep(10000);
			System.out.println("User  enrol from list");
//			driver.findElement(By.xpath(OR.getProperty("add_enrol"))).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[4]/ul/li[2]/a")).click();
//			Thread.sleep(20000);
//			driver.findElement(By.xpath(OR.getProperty("upload_list"))).click();
//			Thread.sleep(10000);
			/*driver.findElement(By.xpath(OR.getProperty("upload_popup"))).click();
			Robot robot= new Robot();
	        StringSelection str= new StringSelection("C:\\Users\\sai\\Downloads\\list.csv");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			robot.setAutoDelay(3000);
			robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(4000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(12000);
			driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/section/div/div/div/div/div[3]/div[2]/div/ul/li/button[2]/span[2]")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath(OR.getProperty("enroll_ok"))).click();
			Thread.sleep(10000);
			System.out.println("User entol via csv");*/
			driver.findElement(By.xpath(OR.getProperty("refresh_enrol"))).click();
			

	}

}
