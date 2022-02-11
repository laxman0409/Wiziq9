package com.wiziq.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Clone_test extends Testbase {
	@Test(priority=5)
	public void test() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(4000);
		//click on test module
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[3]/a/span/em")).click();
		//driver.findElement(By.xpath("//div[@id='drawer']/nav/div/div/div/ul/li[3]/a/span/span/span")).click();
		Thread.sleep(4000);
		//click on create test
		driver.findElement(By.xpath("//div[@class='floatingBtn']")).click();
		Thread.sleep(5000);
		//enter to frame
		WebElement elm=driver.findElement(By.id("creationOverlay"));
		driver.switchTo().frame(elm);
		Thread.sleep(4000);
		//click on clone existing test
		driver.findElement(By.xpath(OR.getProperty("clone_test_click"))).click();
		Thread.sleep(5000);
		//enter to search frame
		WebElement elm1=driver.findElement(By.className("cboxIframe"));
		driver.switchTo().frame(elm1);
		// To select test from list
		Thread.sleep(3000);
		driver.findElement(By.id("txtTestSearch")).sendKeys("Laxman_test_automation_via_clone_Existing_Test");
		Thread.sleep(4000);
		//click on go button
		driver.findElement(By.xpath("//*[@id=\"ctl00\"]/div[4]/div[1]/div[2]/div[1]/a")).click();
		Thread.sleep(5000);
		//click on select (.) button
		driver.findElement(By.xpath("//*[@id=\"testRow1\"]/div[1]/div/ins")).click();
		Thread.sleep(5000);
		// To click on ok
		driver.findElement(By.xpath("//*[@id=\"copybtn\"]")).click();
		Thread.sleep(8000);
		driver.switchTo().parentFrame();
		Thread.sleep(9000);
		// clicking on next button
		driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
			Thread.sleep(9000);
			
			
			
			driver.findElement(By.xpath("//span[@id='Label31']")).click();
			Thread.sleep(5000);
			 WebDriverWait wait = new WebDriverWait(driver, 220);
		    	WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"test-publish\"]")));
		   		Category_Body.click();
			
			Thread.sleep(2000);
			driver.switchTo().parentFrame();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(4000);
			driver.findElement(By.xpath(OR.getProperty("refresh_test"))).click();
			Thread.sleep(5000);
			
			
			System.out.println("Laxman_test_automation_via_clone_Existing_Test created successfully ");
			Thread.sleep(5000);
			
			
			
			driver.close();
			
			
			//driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/ul[2]/li/a[2]/button/span")).click();
			//System.out.println("Clone Test deleted successfully ");
}
}
