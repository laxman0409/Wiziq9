package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Roles extends Testbase {
	@Test(priority=1)
	public void Role_transaction_sub_module() throws InterruptedException, AWTException, IOException
	{ 
		
		Thread.sleep(9000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[5]/a/span/span/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR.getProperty("roles"))).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/section/div/ul/li[1]/a/span")).click();
        Thread.sleep(3000);
        // to click on transaction
        driver.findElement(By.xpath(OR.getProperty("transaction"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(OR.getProperty("transaction1"))).click();
        driver.findElement(By.xpath(OR.getProperty("transaction2"))).click();
        driver.findElement(By.xpath(OR.getProperty("apply_transaction"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(OR.getProperty("export_transcsv"))).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[1]/div/ul/li[1]/a/span")).click();
        System.out.println("Page refressed");
        driver.close();

}
}
