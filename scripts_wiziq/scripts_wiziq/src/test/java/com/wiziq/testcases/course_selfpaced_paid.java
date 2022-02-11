package com.wiziq.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class course_selfpaced_paid extends Testbase{
//	@Test(priority=1)
	public void selfpaced_paid() throws InterruptedException, AWTException
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
		   	  // clicking on add activity
		   	  driver.findElement(By.xpath(OR.getProperty("add_activity"))).click();
		   	  // select file in the course
		   	 driver.findElement(By.xpath(OR.getProperty("file_click"))).click();
              Thread.sleep(10000);
            
             // (driver.findElement(By.xpath(OR.getProperty("browse"))).click();
             // Thread.sleep(10000);
             // WebElement elm1 = driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div[4]/div[2]/iframe"));
             // driver.switchTo().frame(elm1);
             // WebElement elm2 = driver.findElement(By.xpath("/html/body/iframe[1]"));
             // driver.switchTo().frame(elm2);
             // WebElement elm3 = driver.findElement(By.xpath("/html/body/iframe[2]"));
             // driver.switchTo().frame(elm3);
             // WebElement elm4 = driver.findElement(By.xpath("/html/body/div[4]/iframe"));
             // driver.switchTo().frame(elm4);
  			 // System.out.println("hello");
            // driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/form/div[1]")).click();
            //  System.out.println("by"));
              //driver.switchTo().parentFrame();
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
              driver.findElement(By.xpath(OR.getProperty("add_activity"))).click();
             // Thread.sleep(20000);
              driver.findElement(By.xpath(OR.getProperty("recorded_class"))).click();
              Thread.sleep(20000);
              WebElement elm2 = driver.findElement(By.id("ifrmCourse"));
            driver.switchTo().frame(elm2);
              driver.findElement(By.id("chkboxRepeater_249475")).click();
              driver.findElement(By.xpath(OR.getProperty("add_to_course"))).click();
              Thread.sleep(10000);
              driver.switchTo().parentFrame();
              driver.findElement(By.xpath(OR.getProperty("back_course"))).click();
              driver.findElement(By.id("txtTitle")).sendKeys("course paid selfpaced automated");
    		  driver.findElement(By.id("lbtnNextProfile")).click();
    		  Thread.sleep(10000);
    		  driver.findElement(By.id("txtSubTitle")).sendKeys("11");
    			driver.findElement(By.id("txtHighlight1")).sendKeys("1");
    			driver.findElement(By.id("txtHighlight2")).sendKeys("11");
    			driver.findElement(By.id("txtHighlight3")).sendKeys("11");
    			WebElement elm3 = driver.findElement(By.id("txtAbtCourse_ifr"));
    			driver.switchTo().frame(elm3);
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
}
	}

