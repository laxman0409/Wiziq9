package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Instructor_clone_test extends Testbase {
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/instructor/my-tests/PUBLISHED']")).click();
		Thread.sleep(4000);
		
		
		/*
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-top-right\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[2]/div/ul/li[5]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[3]/a")).click(); 
		Thread.sleep(15000);
		*/
		
		
		
		//click on create test icon
		driver.findElement(By.xpath("//div[@class='floatingBtn']")).click();
		Thread.sleep(10000);
		//enter to test frame
		WebElement elm=driver.findElement(By.id("creationOverlay"));
		driver.switchTo().frame(elm);
		Thread.sleep(2000);
		//click o clone button
		driver.findElement(By.xpath(OR.getProperty("clone_test_click"))).click();
		Thread.sleep(5000);
		WebElement elm1=driver.findElement(By.className("cboxIframe"));
		driver.switchTo().frame(elm1);
		// To select test from list
		Thread.sleep(5000);
		driver.findElement(By.id("txtTestSearch")).sendKeys("Clone_test_Instructor_end_Via_automation");
		Thread.sleep(5000);
		//click on GO button
		driver.findElement(By.xpath("//*[@id=\"ctl00\"]/div[4]/div[1]/div[2]/div[1]/a")).click();
		Thread.sleep(5000);
		//select below clone test
		driver.findElement(By.xpath("//*[@id=\"testRow1\"]/div[1]/div/ins")).click();
		Thread.sleep(5000);
		// To click on ok
		driver.findElement(By.xpath("//*[@id=\"copybtn\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(15000);
		
		// clicking on next button
		driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
			
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id=\"Label31\"]")).click();
			Thread.sleep(5000);
			 WebDriverWait wait = new WebDriverWait(driver, 220);
			 //click o publish button
		    	WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"test-publish\"]")));
		   		Category_Body.click();
		   		
			System.out.println("Clone Test created successfully ");
			
			
			driver.switchTo().parentFrame();
			Thread.sleep(4000);
			//click on close icon
			driver.findElement(By.xpath("//button[contains(@class,'fluidModalClose')]")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.findElement(By.xpath(OR.getProperty("refresh_test"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(OR.getProperty("refresh_test"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/ul[2]/li/a[2]/button/span")).click();
			System.out.println("Clone Test deleted successfully at instructor end ");
			Thread.sleep(5000);
			driver.findElement(By.xpath(OR.getProperty("refresh_test"))).click();
			Thread.sleep(4000);
			driver.close();

}
}