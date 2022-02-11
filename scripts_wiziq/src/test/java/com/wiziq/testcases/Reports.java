package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Reports extends Testbase {
	@Test(priority=1)
	public void all() throws InterruptedException, AWTException, IOException
	{ 
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(3000);
		// to click on reports
		driver.findElement(By.xpath(OR.getProperty("reports"))).click();
		Thread.sleep(4000);
		
		//courses filters
		
		//click on summary
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("date_all"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(OR.getProperty("date_20"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(OR.getProperty("date_10"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(OR.getProperty("date_30"))).click();
	    Thread.sleep(8000);
	    //click on filters
	    driver.findElement(By.xpath(OR.getProperty("filter_report"))).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(OR.getProperty("checkbox1_report"))).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath(OR.getProperty("checkbox_free"))).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath(OR.getProperty("checkbox_save"))).click();
	    Thread.sleep(8000);
	    //click on clear all filters
	    driver.findElement(By.xpath(OR.getProperty("clear_all_filters_classes"))).click();
	    Thread.sleep(10000);
	    //download reports
	    driver.findElement(By.xpath(OR.getProperty("download_csv_report"))).click();
	    System.out.println("CSV downloaded successfully for courses");
	    Thread.sleep(4000);
	    
	    //classes
	    
	    driver.findElement(By.xpath(OR.getProperty("report_classes"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("date_all_classes"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("date_20_classes"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(OR.getProperty("date_10_classes"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(OR.getProperty("date_30_classes"))).click();
	    Thread.sleep(8000);
	    //click on filters
	    driver.findElement(By.xpath(OR.getProperty("filter_report"))).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(OR.getProperty("checkbox1_report"))).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath(OR.getProperty("checkbox_free"))).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath(OR.getProperty("checkbox_save"))).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(OR.getProperty("clear_all_filters_classes"))).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath(OR.getProperty("download_csv_report"))).click();
	    System.out.println("CSV downloaded successfully for classes");
	    Thread.sleep(4000);
	    
	    //learner
	    
	    driver.findElement(By.xpath(OR.getProperty("reports_learners"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(OR.getProperty("date_all_learners"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(OR.getProperty("date_20_learners"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(OR.getProperty("date_10_learners"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("summary_by_date"))).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(OR.getProperty("date_30_learners"))).click();
	    Thread.sleep(8000);
	    //apply filters
	    driver.findElement(By.xpath(OR.getProperty("filter_report"))).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(OR.getProperty("checkbox1_report_learner"))).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath(OR.getProperty("checkbox2_report_learner"))).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath(OR.getProperty("apply_filter_learner"))).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(OR.getProperty("clear_all_filters_classes"))).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath(OR.getProperty("download_csv_report"))).click();
	    System.out.println("CSV downloaded successfully for learners");
	    Thread.sleep(4000);
	    System.out.println("Reports module execution successfully completed via Automation");
	    driver.close();
	    
	    
	    
        
}
}
