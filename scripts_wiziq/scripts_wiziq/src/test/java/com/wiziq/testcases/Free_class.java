package com.wiziq.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Free_class extends Testbase{
	@Test(priority=1)
	public void class1() throws InterruptedException, AWTException
	{
		String localFilePath="C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg";
		
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("div.mdl-layout__drawer-button")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text()='Live Classes']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@class='floatingBtn']")).click();
		WebElement elm=driver.findElement(By.id("creationOverlay"));
		driver.switchTo().frame(elm);
		Thread.sleep(10000);
		driver.findElement(By.id("txtTitle")).sendKeys("Free class");
		
		//driver.findElement(By.linkText("Set current date and time")).click();
		Select inst = new Select(driver.findElement(By.id("RecurringControl1_drpHour")));
   		inst.selectByVisibleText("05");
		
		driver.findElement(By.id("rdpublic")).click();
		driver.findElement(By.id("rdbRecordClass")).click();
		// To click on class logo
		driver.findElement(By.id("SpanUploadImage")).click();
		WebElement elm1=driver.findElement(By.id("TB_iframeContent"));
		driver.switchTo().frame(elm1);
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(localFilePath);
		driver.findElement(By.xpath("//span[contains(@class,'bluebtn fright mr10 ') and contains(text(), 'Crop & Save')]")).click();
		System.out.println("succesFully Uploaded....");
		
		
		
		//driver.findElement(By.linkText("Add more information about your class")).click();
		//driver.findElement(By.id("btnSchedule")).click();
		//Thread.sleep(20000);
		//driver.findElement(By.xpath("//button[contains(@class,'noShadow')]")).click();
		//driver.switchTo().defaultContent();

}
}
