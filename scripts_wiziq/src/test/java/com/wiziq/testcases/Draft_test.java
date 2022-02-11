package com.wiziq.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Draft_test extends Testbase {
	@Test(priority=4)
	public void test() throws InterruptedException, AWTException
	{
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
		//click on test module
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[3]/a/span/em")).click();
		//driver.findElement(By.xpath("//div[@id='drawer']/nav/div/div/div/ul/li[3]/a/span/span/span")).click();
		Thread.sleep(4000);
		//click on create test
		driver.findElement(By.xpath("//div[@class='floatingBtn']")).click();
		Thread.sleep(6000);//enter to test frame
		WebElement elm=driver.findElement(By.id("creationOverlay"));
		driver.switchTo().frame(elm);
		Thread.sleep(4000);
		//enter draft test name
		driver.findElement(By.id("input")).sendKeys("Laxman_Draft_test_via_automation");
		
		Thread.sleep(3000);
	// clicking on next button
		driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
		Thread.sleep(10000);
//		// click on add question button
		driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
		Thread.sleep(8000);
		//click on MCQ
		driver.findElement(By.xpath(OR.getProperty("multiple_choice_ques"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("choice1"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
		Thread.sleep(5000);
		//click on save button
		//driver.findElement(By.xpath("//*[@id=\"Label46\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Label11\"]")).click();
		System.out.println("Test is saved successfully ");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(8000);
		//click on x icon
		driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"mainMdlContainer\"]/header/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/div/div/div[2]/a/span")).click();
		Thread.sleep(5000);
		driver.close();
		
		
}
}
