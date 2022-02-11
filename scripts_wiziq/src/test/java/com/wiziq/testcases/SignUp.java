package com.wiziq.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class SignUp extends Testbase {
	
	@Test
	
	public void SignUP_To_Application() throws IOException, InterruptedException
	{
		
	   		
	   		driver.findElement(By.xpath("//a[@id='mainNavLink']//span[contains(text(),'Sign Up')]")).click();
	   		Thread.sleep(2000);
	   		
	   		
	   		
	   		driver.findElement(By.xpath("//a[contains(@class,'colorInherit')]//span[contains(text(),'Login')]")).click();
	   		
	   	
	   	
	   		driver.findElement(By.xpath("//a[@class=' colorInherit']//span[contains(text(),'Sign Up')]")).click();
	   		
	   		
	   		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("learner01");
	   		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("learner_01@yopmail.com");
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		
		
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("9876543210");
		
		//select country
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("")).click();
		
		//Thread.sleep(500);
		
   		//Select country = new Select(driver.findElement(By.xpath("//div[@placeholder='Select Country']//span[@class='rw-i rw-i-caret-down']")));
		
		Thread.sleep(500);
		
		//select date
		
		
		driver.findElement(By.className("react-date-field__input")).sendKeys("01-01-1900");
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.className("react-date-field__calendar-icon-inner")).click();
		
		Thread.sleep(1000);
		
		//reCaptcha
		
		
		WebElement iframeSwitch = driver.findElement(By.xpath("//*[@id=\"liSignupCaptcha\"]/div/div/div/iframe"));
		driver.switchTo().frame(iframeSwitch);
		driver.findElement(By.cssSelector("#recaptcha-anchor-label")).click();
		
		
		
		
		
	
		
		
		
		
		
		////
		driver.findElement(By.xpath("//*[@id=\"liPrivacy\"]/label/span[4]")).click();
		
		
		
		driver.findElement(By.xpath("//span[@class='mdl-button__ripple-container']")).click();
		
		
	
		
		
		
		
		
		
		
		
		
		
	   		
}
}