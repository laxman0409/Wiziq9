package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Instructor_test extends Testbase {
	@Test(priority=1)
	public void instructor() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//em[@id='menu-top-right']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Instructor']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='/instructor/my-tests/PUBLISHED']")).click();
		Thread.sleep(4000);
		
		
		
		Thread.sleep(4000);
		//click on create a text
		driver.findElement(By.xpath("//div[@class='floatingBtn']")).click();
		Thread.sleep(4000);
		//enter to frame
		WebElement elm=driver.findElement(By.id("creationOverlay"));
		driver.switchTo().frame(elm);
		//enter test name here
		Thread.sleep(2000);
		driver.findElement(By.id("input")).sendKeys("Test_creation_via_automation at Instructor end");
		Thread.sleep(2000);
	// clicking on next button
		driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
		Thread.sleep(25000);
		
		//2nd page
		
//		// click on add question button
		driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
		Thread.sleep(3000);
		//MCQ
		driver.findElement(By.xpath(OR.getProperty("multiple_choice_ques"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("choice1"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
		Thread.sleep(3000);
		
		//MCQ multiple response
		
		driver.findElement(By.xpath(OR.getProperty("mcq_2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("choice1"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
		Thread.sleep(3000);
		
		//MCQ matrix
		
		driver.findElement(By.xpath(OR.getProperty("matrix_ques"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("matrix_1"))).click();
		driver.findElement(By.xpath(OR.getProperty("matrix_2"))).click();
		driver.findElement(By.xpath(OR.getProperty("matrix_3"))).click();
		driver.findElement(By.xpath(OR.getProperty("matrix_4"))).click();
		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
	    Thread.sleep(3000);
	    
	    //Essay questions
	    
		driver.findElement(By.xpath(OR.getProperty("essay_ques"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("essay_text"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
	    Thread.sleep(3000);
	    
	    //cloze part
	    
	    driver.findElement(By.xpath(OR.getProperty("cloze_select"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("cloze_text"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("cloze_1"))).sendKeys("test");
	    driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
	    Thread.sleep(3000);
	    
	    
		driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("cloze_select"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("cloze_drop"))).click();
	    Thread.sleep(3000);
	   
	    driver.findElement(By.xpath(OR.getProperty("add_drop_response"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("response1"))).sendKeys("test");
		driver.findElement(By.xpath(OR.getProperty("add_drop_response1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("response2"))).sendKeys("test1");
		Thread.sleep(3000);
		Select inst = new Select(driver.findElement(By.xpath(OR.getProperty("drop_down"))));
		Thread.sleep(1000);
   		inst.selectByVisibleText("test");
   		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("cloze_select"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("cloze_dragdrop"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("add_dragdown_response"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("response_dragdown"))).sendKeys("test");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("add_dragdown_response1"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("response_dragdown1"))).sendKeys("test1");
	    Thread.sleep(3000);
	    WebElement source= driver.findElement(By.xpath(OR.getProperty("element_drag")));
	    Thread.sleep(1000);
	    WebElement target= driver.findElement(By.xpath(OR.getProperty("element_drop")));
	    Actions a = new Actions(driver);
	    Thread.sleep(4000);
	    a.dragAndDrop(source, target).build().perform();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
//		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath(OR.getProperty("cloze_select"))).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath(OR.getProperty("image_dragdrop"))).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath(OR.getProperty("image_text"))).sendKeys("https://images.all-free-download.com/images/graphicthumb/beautiful_scenery_04_hd_pictures_166258.jpg");
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath(OR.getProperty("add_image_answer"))).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath(OR.getProperty("add_image_response"))).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath(OR.getProperty("image_response"))).sendKeys("test");
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath(OR.getProperty("add_image_response1"))).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath(OR.getProperty("image_response1"))).sendKeys("test1");
//	    Thread.sleep(5000);
//	    WebElement source1= driver.findElement(By.xpath(OR.getProperty("image_drag")));
//        WebElement target1= driver.findElement(By.xpath(OR.getProperty("image_drop")));
//	    Actions a1 = new Actions(driver);
//        Thread.sleep(10000);
//	    a1.dragAndDrop(source1, target1).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("cloze_select"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("cloze_dropdown"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("image_text"))).sendKeys("https://images.all-free-download.com/images/graphicthumb/beautiful_scenery_04_hd_pictures_166258.jpg");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("add_image_answer"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("image_dropdown_res1"))).sendKeys("test");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("image_dropdown_res2"))).sendKeys("test1");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("image_dropdown_res3"))).sendKeys("test2");
	    Thread.sleep(3000);
	    //Thread.sleep(5000);
	   // driver.findElement(By.xpath(OR.getProperty("add_image_response1"))).click();
	    Select inst1 = new Select(driver.findElement(By.xpath(OR.getProperty("image_dropdwon"))));
	    Thread.sleep(1000);
		inst1.selectByVisibleText("test");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath(OR.getProperty("cloze_select"))).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath(OR.getProperty("cloze_image_text_select"))).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath(OR.getProperty("image_text"))).sendKeys("https://images.all-free-download.com/images/graphicthumb/beautiful_scenery_04_hd_pictures_166258.jpg");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath(OR.getProperty("add_image_response2"))).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath(OR.getProperty("cloze_image_text"))).sendKeys("test");
		Thread.sleep(3000);
		// click on next button
		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
//		
		
		// click to publish question
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
		//Thread.sleep(5000);
		Thread.sleep(1000);
		 WebDriverWait wait = new WebDriverWait(driver, 200);
	    	WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"test-publish\"]")));
	   		Category_Body.click();
	   		Thread.sleep(1000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		// click x icon 
		driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("refresh_test"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("refresh_test"))).click();
		Thread.sleep(5000);
		
		//System.out.println("========================================= ");
		System.out.println("Test created successfully at Instructor end  ");
		//System.out.println("========================================== ");
		
		
	
		
		//edit test 
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath(OR.getProperty("view_test"))).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(OR.getProperty("edit_test"))).click();
		driver.findElement(By.xpath("//button[@class='wiredStylePri mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect']//span[contains(text(),'Edit')]")).click();
		Thread.sleep(4000);
		WebElement elm1=driver.findElement(By.id("creationOverlay"));
		driver.switchTo().frame(elm1);
		Thread.sleep(500);
		driver.findElement(By.id("input")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("input")).sendKeys("Test_editing_done_by_automation at instructor end");
		Thread.sleep(3000);
		
		
		
		
		
		// clicking on next button
		driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
		Thread.sleep(15000);
		
	/*	// click on add question button
				driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
				Thread.sleep(5000);
				//MCQ
				driver.findElement(By.xpath(OR.getProperty("multiple_choice_ques"))).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath(OR.getProperty("choice1"))).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
				Thread.sleep(3000);
			*/	
		
		
				driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
				Thread.sleep(5000);
				
				//Essay questions
				Thread.sleep(5000);
				driver.findElement(By.xpath(OR.getProperty("essay_ques"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(OR.getProperty("essay_text"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
				Thread.sleep(3000);
				// driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
			   // Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
				//click on publish test
		Thread.sleep(3000);
		 WebDriverWait wait1 = new WebDriverWait(driver, 200);
	   	WebElement Category_Body1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"test-publish\"]")));
	   	Category_Body1.click();
	   	
		//driver.findElement(By.xpath("//*[@id=\"test-publish\"]")).click();
	   	//System.out.println("========================================= ");
	   	System.out.println("Test edited successfully at instructor end     ");
	   //	System.out.println("========================================= ");
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		//click on x icon
		driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
		//back to frame
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(OR.getProperty("back_test"))).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(OR.getProperty("refresh_test"))).click();
		//Thread.sleep(5000);
		driver.close();
	
		
		
	
		
		
	}
	
	
	
	}
