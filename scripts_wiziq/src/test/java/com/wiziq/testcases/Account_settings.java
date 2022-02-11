package com.wiziq.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Account_settings extends Testbase {
	@Test(priority=1)
	public void account() throws InterruptedException, AWTException, IOException
	{ 
		
		
		File file = new File("src\\test\\resources\\images\\academy_logo_prod.png");
		String localFilePath = file.getAbsolutePath();
		File file1 = new File("src\\test\\resources\\images\\fav_prod.ico");
		String localFilePath1 = file1.getAbsolutePath();
		File file2 = new File("src\\test\\resources\\images\\academy_banner_prod.jpg");
		String localFilePath2 = file2.getAbsolutePath();
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[5]/a/span/span/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[10]//div[1]//div[1]//figure[1]//figcaption[1]//a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Check Details')]")).click();
        Thread.sleep(2000);
        System.out.println("successflly verified storage information");
        driver.findElement(By.xpath("//em[normalize-space()='clear']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='wiredStylePri mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect']//span[contains(text(),'View Profile')]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/button[1]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='makeItRelative']//li//a")).click();
        Thread.sleep(2000);
        System.out.println("successflly verified Api & plugins  information");
        
        System.out.println("Page refressed");
        driver.close();
}
	
}
