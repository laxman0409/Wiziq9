package com.wiziq.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class General_settings extends Testbase {
	@Test(priority=1)
	public void general() throws InterruptedException, AWTException, IOException
	{ 
		
		File file = new File("src\\test\\resources\\images\\academy_logo_prod.png");
		String localFilePath = file.getAbsolutePath();
		File file1 = new File("src\\test\\resources\\images\\fav_prod.ico");
		String localFilePath1 = file1.getAbsolutePath();
		File file2 = new File("src\\test\\resources\\images\\academy_banner_prod.jpg");
		String localFilePath2 = file2.getAbsolutePath();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[5]/a/span/span/span")).click();
        Thread.sleep(2000);
        //click on general setting
        driver.findElement(By.xpath("//span[normalize-space()='General Settings']")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath(OR.getProperty("primary_color"))).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(OR.getProperty("color_select"))).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(OR.getProperty("secondary_color"))).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(OR.getProperty("color_select2"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("confirm_color"))).click();
        Thread.sleep(5000);
        System.out.println("color changed successfully");
        
        driver.findElement(By.id("logo")).sendKeys(localFilePath);
        System.out.println("logo changed successfully");
        Thread.sleep(4000);
        
        driver.findElement(By.id("favicon")).sendKeys(localFilePath1);
        System.out.println("Fav icon changed successfully");
        Thread.sleep(5000);
       
        
        //click on upload image
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/section/div[2]/div/div/ul/li[6]/div[1]/div/label/span/span")).click();
        Thread.sleep(2000);
        //click on my device
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[1]/div/div[2]/span[1]")).click();
        Thread.sleep(2000); 
        //click on + icon for upload 
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[1]/div/div[2]/span[2]")).click();
        Thread.sleep(2000);
        //select image
        driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath2);
        Thread.sleep(3000);
        //click on save
        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[2]/div[2]/div/div[3]/div/span[3]/div/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[2]/div[2]/div/div[3]/div/span[3]/div/span")).click();
        Thread.sleep(9000);
        System.out.println("Academy banner changed successfully");
        
        
        driver.findElement(By.id("academyHeading")).clear();
        driver.findElement(By.id("academyHeading")).sendKeys("heading2");
        Thread.sleep(2000);
        
        driver.findElement(By.id("academyTagline")).clear();
        driver.findElement(By.id("academyTagline")).sendKeys("tagline2");
        Thread.sleep(2000);
        
        driver.findElement(By.id("aboutAcademy")).clear();
        driver.findElement(By.id("aboutAcademy")).sendKeys("Hi This is testing");
        
        //click on select country
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/section/div[2]/div/div/ul/li[11]/div/div/div[1]")).click();
        driver.findElement(By.xpath("//div[@class='rw-input']")).click();
        System.out.println("Country changed successfully");
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/section/div/ul/li[1]/a/span")).click();
        Thread.sleep(4000);
        
        
        System.out.println("Page refressed");
        driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
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
        driver.findElement(By.xpath(OR.getProperty("general_setting"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(OR.getProperty("primary_color"))).click();
        driver.findElement(By.xpath(OR.getProperty("color_select"))).click();
        driver.findElement(By.xpath(OR.getProperty("secondary_color"))).click();
        driver.findElement(By.xpath(OR.getProperty("color_select2"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("confirm_color"))).click();
        Thread.sleep(5000);
        System.out.println("color changed successfully");
        driver.findElement(By.id("logo")).sendKeys(localFilePath);
        System.out.println("logo changed successfully");
        Thread.sleep(4000);
        driver.findElement(By.id("favicon")).sendKeys(localFilePath1);
        System.out.println("Fav icon changed successfully");
        Thread.sleep(6000);
       
        
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/section/div[2]/div/div/ul/li[6]/div[1]/div/label/span/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[1]/div/div[2]/span[1]")).click();
        Thread.sleep(2000); 
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[1]/div/div[2]/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath2);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[2]/div[2]/div/div[3]/div/span[3]/div/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[2]/div[2]/div/div[3]/div/span[3]/div/span")).click();
        Thread.sleep(15000);
        System.out.println("Academy banner changed successfully");
        driver.findElement(By.id("academyHeading")).clear();
        driver.findElement(By.id("academyHeading")).sendKeys("heading2");
        Thread.sleep(4000);
        driver.findElement(By.id("academyTagline")).clear();
        driver.findElement(By.id("academyTagline")).sendKeys("tagline2");
        Thread.sleep(4000);
        driver.findElement(By.id("aboutAcademy")).clear();
        driver.findElement(By.id("aboutAcademy")).sendKeys("Hi This is testing");
        
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/section/div[2]/div/div/ul/li[11]/div/div/div[1]")).click();
        driver.findElement(By.xpath("//li[normalize-space()='Indian Rupee (INR)']")).click();
        System.out.println("Country changed successfully");
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/section/div/ul/li[1]/a/span")).click();
        Thread.sleep(4000);
        System.out.println("Page refressed");
        
        driver.close();
        */
        
}
}
