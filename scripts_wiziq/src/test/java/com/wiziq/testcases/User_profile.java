package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class User_profile extends Testbase {
	@Test(priority=1)
	public void profile() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu-top-right\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[2]/div/ul/li[1]/a/span")).click();
		Thread.sleep(15000);
//		driver.findElement(By.xpath(OR.getProperty("first_name"))).clear();
//		driver.findElement(By.xpath(OR.getProperty("first_name"))).sendKeys("admin12");
		
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/div/section/div[2]/div/div/div[2]/div/div[2]/div/span/text()")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/div/section/div[2]/div/div/div[2]/div/div[2]/div/span")).sendKeys("jack12");

		driver.findElement(By.className("makeItRelative withCount")).sendKeys("12");

		//driver.findElement(By.xpath("//*[@id=\"userProfileSection\"]/div[2]/div/div/div[2]/div/div[2]/div/div/input")).sendKeys("admin12");
	//	WebElement input2 = driver.findElement(By.xpath("//*[@id=\"userProfileSection\"]/div[2]/div/div/div[2]/div/div[4]/div/span"));
        
//		
	}	
}        

