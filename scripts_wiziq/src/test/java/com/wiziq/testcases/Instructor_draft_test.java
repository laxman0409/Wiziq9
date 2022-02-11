package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Instructor_draft_test extends Testbase {
	@Test(priority=1)
	public void instructor() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//em[@id='menu-top-right']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Instructor']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/instructor/my-tests/PUBLISHED']")).click();
		Thread.sleep(5000);
		
		
		
		
		
		/*
		driver.findElement(By.xpath("//*[@id=\"menu-top-right\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[2]/div/ul/li[5]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[3]/a")).click(); 
		Thread.sleep(5000);
		
		*/
		
		
		
		driver.findElement(By.xpath("//div[@class='floatingBtn']")).click();
		Thread.sleep(9000);
		WebElement elm=driver.findElement(By.id("creationOverlay"));
		driver.switchTo().frame(elm);
		
		driver.findElement(By.id("input")).sendKeys("Instructor_end_Draft_test_via_automation");
		
		Thread.sleep(2000);
	// clicking on next button
		driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
		Thread.sleep(15000);
//		// click on add question button
		driver.findElement(By.xpath("//*[@id=\"addQuestion\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("multiple_choice_ques"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("choice1"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(OR.getProperty("create_question"))).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"Label46\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Label11\"]")).click();
		
		
		driver.switchTo().parentFrame();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		System.out.println("Draft_Test is saved at instructor end successfully    ");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mainMdlContainer\"]/header/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/div/div/div[2]/a/span")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
