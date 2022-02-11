package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Privacy_Policy_Module extends Testbase{
	@Test(priority=1)
	
	public void privacy_policy() throws InterruptedException, AWTException, IOException
	{

		
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("i.material-icons")).click();
		driver.findElement(By.xpath("//i[@class='material-icons']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Privacy Policy')]")).click();
		Thread.sleep(5000);
		System.out.println("Privacy_policy_module is open successfully by automation");
		driver.close();
		
		
		
	}
}
