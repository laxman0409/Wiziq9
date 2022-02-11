package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Learner_course extends Testbase {
	@Test(priority=1)
	public void learner() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(15000);
		// to click on course
		driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/div[3]/div/div/div/div/div/div[2]/div/ul/li[1]/button/span[2]")).click();
		Thread.sleep(8000);
		// to click on file
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/ul/li[1]/div/a")).click();
		Thread.sleep(5000);
		// to click on test
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/ul/li[2]/div/a")).click();
		// to attempt test
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/ul/li[2]/em")).click();
		Thread.sleep(20000);
		// to start test
		driver.findElement(By.xpath("//*[@id=\"contentType\"]/h2/div/button")).click();
		//Thread.sleep(20000);
		WebElement elm = driver.findElement(By.id("creationOverlay"));
		driver.switchTo().frame(elm);
		Thread.sleep(35000);
		// to select first option
		driver.findElement(By.xpath(OR.getProperty("learner_question1"))).click();
	    // to click on next question
		driver.findElement(By.id("GoToNextQueston")).click();
		driver.findElement(By.xpath(OR.getProperty("learner_question2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id("GoToNextQueston")).click();
		// to select matrix
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/div/table/tbody/tr[1]/td[1]/div/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/div/table/tbody/tr[2]/td[1]/div/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/div/table/tbody/tr[3]/td[1]/div/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div[3]/div/div/div/div/div/div[2]/div/div[3]/div/table/tbody/tr[4]/td[1]/div/div/input")).click();
		driver.findElement(By.id("GoToNextQueston")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("learner_question4"))).sendKeys("This is just to test");
		driver.findElement(By.id("GoToNextQueston")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("learner_question5"))).sendKeys("test");
		driver.findElement(By.id("GoToNextQueston")).click();
		Thread.sleep(5000);
		Select inst = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div[6]/div/div/div/div/div/div[2]/div/div[3]/div/div/div/div/span/span/select")));  
   		inst.selectByVisibleText("test1");
   		driver.findElement(By.id("GoToNextQueston")).click();
   		WebElement source= driver.findElement(By.xpath(OR.getProperty("learner_question7_drag")));
	    WebElement target= driver.findElement(By.xpath(OR.getProperty("learner_question7_drop")));
	    Actions a = new Actions(driver);
	    Thread.sleep(5000);
	    a.dragAndDrop(source, target).build().perform();
	    Thread.sleep(5000);
	    driver.findElement(By.id("GoToNextQueston")).click();
	    WebElement source1= driver.findElement(By.xpath(OR.getProperty("learner_question8_drag")));
	    WebElement target1= driver.findElement(By.xpath(OR.getProperty("learner_question8_drop")));
	    Actions a1 = new Actions(driver);
	    Thread.sleep(5000);
	    a.dragAndDrop(source1, target1).build().perform();
	    Thread.sleep(5000);
	    driver.findElement(By.id("GoToNextQueston")).click();
	    Select inst1 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div[9]/div/div/div/div/div/div[2]/div/div[3]/div/div/div/div/span/select")));  
   		inst1.selectByVisibleText("test");
   	    driver.findElement(By.id("GoToNextQueston")).click();
   	    driver.findElement(By.xpath(OR.getProperty("learner_question10"))).sendKeys("test");
   	    driver.findElement(By.id("submitExam")).click();
   	    Thread.sleep(10000);
   	    driver.findElement(By.id("ExamSubmittingPromptok")).click();
   	    driver.switchTo().parentFrame();
   	    Thread.sleep(35000);
   	    driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("close_test_learner"))).click();
		
   	    // to click on recording class
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/div[1]/div/div/ul/li/div[2]/ul/li[3]/div/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(OR.getProperty("back_course_learner"))).click();
   	    Thread.sleep(5000);
   	    driver.findElement(By.xpath(OR.getProperty("view_certificate"))).click();
}
}
