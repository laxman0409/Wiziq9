package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Instructor_Privacy_policy_module extends Testbase {
	@Test(priority=1)
	public void instructor_privacy() throws InterruptedException, AWTException, IOException
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
		driver.findElement(By.xpath("//span[contains(text(),'Privacy Policy')]")).click();
		Thread.sleep(4000);
		System.out.println("Privacy_policy_module is open successfully by automation at instructor end");
		driver.close();
		
		
		
		
}

}
