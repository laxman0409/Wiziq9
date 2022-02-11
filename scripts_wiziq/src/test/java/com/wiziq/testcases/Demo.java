package com.wiziq.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver98.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		
		  driver.manage().window().maximize();
		
		  Thread.sleep(500);
		 driver.findElement(By.xpath("//li[@data-cy='roundTrip']//span[@class='tabsCircle appendRight5']")).click();
		  Thread.sleep(500);
		  driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys("Hyd");
		  
		  Thread.sleep(500);
		  
		  driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//p[@class='font14 appendBottom5 blackText'][normalize-space()='Hyderabad, India']")).click();
		  Thread.sleep(500);
		  
		  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mumbai");
		  Thread.sleep(500);
		  
		  driver.findElement(By.xpath("//p[normalize-space()='Mumbai, India']")).click();
		 
		  
		  driver.findElement(By.xpath("//div[@aria-label='Sun Feb 20 2022']//p[contains(text(),'20')]")).click();
		
		  Thread.sleep(500);
		driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn')]")).click();
		  
		Thread.sleep(2000);
		  
		  
		  
		  
		  
		 

	}

}
