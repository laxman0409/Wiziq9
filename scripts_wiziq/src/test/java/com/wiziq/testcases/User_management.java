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

public class User_management extends Testbase {
	@Test(priority=0)
	public void userManagement() throws InterruptedException, AWTException, IOException
	{ 
		
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[5]/a/span/span/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/section[2]/div/div/div[2]/div/div/figure/a/span/em")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(OR.getProperty("admin_users"))).click();
        Thread.sleep(7000);
        System.out.println("Enter successfully into Admin ");
        driver.findElement(By.xpath(OR.getProperty("instructor_users"))).click();
        Thread.sleep(7000);
        System.out.println("Enter successfully into Instructor ");
        driver.findElement(By.xpath(OR.getProperty("learners_users"))).click();
        System.out.println("Enter successfully into Learners ");
        Thread.sleep(7000);
        
        driver.findElement(By.xpath("//span[@class='mdl-button__ripple-container']")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("name")).sendKeys("a2");
        driver.findElement(By.id("email")).sendKeys("a2@yopmail.com");
        driver.findElement(By.xpath(OR.getProperty("register"))).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(OR.getProperty("register_ok"))).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[@class='mdl-button__ripple-container']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(OR.getProperty("csv_usermgmt"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/section/div/div/div/div/div[2]/div[1]/div[2]/div/ul/li/div/span")).click();
        Thread.sleep(5000);
        Robot robot= new Robot();
        StringSelection str= new StringSelection("C:\\Users\\Admin\\Desktop\\invitation_course_class.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		driver.findElement(By.xpath(OR.getProperty("register_csv"))).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(OR.getProperty("register_ok"))).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath(OR.getProperty("z_alphabet"))).click();
	    Thread.sleep(5000);
	    System.out.println("Page refressed");
        driver.close();
		
		
		
		/*
		
		
		
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[5]/a/span/span/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/section[2]/div/div/div[2]/div/div/figure/a/span/em")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(OR.getProperty("admin_users"))).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath(OR.getProperty("instructor_users"))).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath(OR.getProperty("learners_users"))).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath(OR.getProperty("register_user"))).click();
        Thread.sleep(4000);
        driver.findElement(By.id("name")).sendKeys("a");
        driver.findElement(By.id("email")).sendKeys("a@yopmail.com");
        driver.findElement(By.xpath(OR.getProperty("register"))).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(OR.getProperty("register_ok"))).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath(OR.getProperty("register_user"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(OR.getProperty("csv_usermgmt"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/section/div/div/div/div/div[2]/div[1]/div[2]/div/ul/li/div/span")).click();
        Thread.sleep(20000);
        Robot robot= new Robot();
        StringSelection str= new StringSelection("C:\\Users\\sai\\Downloads\\invitation_learner (1).csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		driver.findElement(By.xpath(OR.getProperty("register_csv"))).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(OR.getProperty("register_ok"))).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath(OR.getProperty("z_alphabet"))).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(OR.getProperty("user_checkbox"))).click();
	    driver.findElement(By.xpath(OR.getProperty("unregister"))).click();
	    driver.findElement(By.xpath(OR.getProperty("confirm_unregister"))).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(OR.getProperty("confirm_ok"))).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@id=\"menu-529276\"]/em")).click();
	    Thread.sleep(6000);
	    // click on edit roles
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/section/div[3]/div/div[2]/div/div/div/ul[3]/li[5]/div/ul/li[1]/a/span")).click();
	    Thread.sleep(4000); 
	    driver.findElement(By.xpath("//*[@id=\"updateRoleDialog\"]/div/div/div[2]/div/ul[1]/li[1]/div/label/span[3]")).click();
	    // to save setting
	    driver.findElement(By.xpath("//*[@id=\"updateRoleDialog\"]/div/div/ul/li[1]/button/span[2]")).click();
	    Thread.sleep(4000);
//	    driver.findElement(By.xpath("//*[@id=\"menu-529276\"]/em")).click();
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/section/div[3]/div/div[2]/div/div/div/ul[3]/li[5]/div/ul/li[1]/a/span")).click();
//	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/span/text()")).sendKeys("12");
	    */
}
}