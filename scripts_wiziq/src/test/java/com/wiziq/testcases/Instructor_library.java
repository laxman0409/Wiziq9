package com.wiziq.testcases;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;

public class Instructor_library extends Testbase {
	@Test(priority=1)
	public void instructor() throws InterruptedException, AWTException, IOException
	{
		File file = new File("src\\test\\resources\\images\\add.xls");
		String localFilePath = file.getAbsolutePath();
		File file1 = new File("src\\test\\resources\\images\\Sample_ppt_internet.pptx");
		String localFilePath1 = file1.getAbsolutePath();
		File file2 = new File("src\\test\\resources\\images\\Doc_Sample.doc");
		String localFilePath2 = file2.getAbsolutePath();
		File file3 = new File("src\\test\\resources\\images\\PDF_sample.pdf");
		String localFilePath3 = file3.getAbsolutePath();
		File file4 = new File("src\\test\\resources\\images\\Audio_sample.mp3");
		String localFilePath4 = file4.getAbsolutePath();
		File file5 = new File("src\\test\\resources\\images\\Video_sample.mp4");
		String localFilePath5 = file5.getAbsolutePath();
		
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//em[@id='menu-top-right']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Instructor']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='listCol']//span[contains(text(),'Library')]")).click();
		Thread.sleep(3000);
		
		
		//click on "+" in library
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("lib_icon1"))).click();
		Thread.sleep(3000);
		
		
		
		//click on upload file
		driver.findElement(By.xpath(OR.getProperty("upload_icon1"))).click();
		Thread.sleep(4000);
		//upload file
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath);
        Thread.sleep(5000);
        //click on upload
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(1000);
        System.out.println("xls file uploaded successfully at instructor end");
        Thread.sleep(3000);
        
        
        Thread.sleep(3000);
        //click on + icon
		driver.findElement(By.xpath(OR.getProperty("lib_icon1"))).click();
        Thread.sleep(3000);
        //click on create folder
        driver.findElement(By.xpath(OR.getProperty("add_folder"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("folder_name"))).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("folder_name"))).sendKeys("Instructor end library folder by automation");
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("create_folder"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("folder_ok"))).click();
        Thread.sleep(1000);
        System.out.println("Folder created successfully at instructor end");
        
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("rename_folder"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("rename_click"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("folder_name"))).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("folder_name"))).sendKeys("Rename Instructor end library folder renamed   by automation");
        Thread.sleep(3000);
        driver.findElement(By.xpath(OR.getProperty("create_folder"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(OR.getProperty("folder_ok"))).click();
        
        System.out.println("Folder renamed successfully at instructor end ");
       
        
        // to upload xls file in folder
        
        Thread.sleep(4000);
        driver.findElement(By.xpath(OR.getProperty("folder_click"))).click();
        Thread.sleep(4000);
		driver.findElement(By.xpath(OR.getProperty("lib_icon1"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
       
        System.out.println("xls file uploaded in folder successfully at instructor end");
       
        
        // to upload pptx file in folder
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("lib_icon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath1);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
       
        System.out.println("pptx file uploaded in folder successfully at instructor end");
        
        
        // to upload doc file in folder
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("lib_icon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath2);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
       
        System.out.println("doc file uploaded in folder successfully at instructor end");
       
        
        // to upload pdf file in folder
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("lib_icon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon1"))).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath3);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(5000);
        System.out.println("pdf file uploaded in folder successfully at instructor end");
       
        
        // to upload audio file in folder
        driver.findElement(By.xpath(OR.getProperty("lib_icon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath4);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        
        System.out.println("Audio file uploaded in folder successfully at instructor end");
       
        
        // to upload video file in folder
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("lib_icon1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon1"))).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath5);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(10000);
        System.out.println("Video file uploaded in folder successfully at instructor end");
       
        
        // back to library
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[1]/div[1]/ul/li[1]/a")).click();
        Thread.sleep(10000);
        // Click on filters 
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(5000);
        //pdf
        driver.findElement(By.xpath(OR.getProperty("pdf"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(10000);
       // Utility.capturescreenshot(driver, "max");
        
        //doc
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        driver.findElement(By.xpath(OR.getProperty("doc"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(10000);
        
        //ppt
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("ppt"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(10000);
        
        //xls
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("xls"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(10000);
        
        //audio
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("audio"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(10000);
        
        //video
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("video"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(15000);
        
        
        
        //de_select all filters here 
        
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("pdf"))).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(OR.getProperty("doc"))).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(OR.getProperty("ppt"))).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(OR.getProperty("xls"))).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(OR.getProperty("audio"))).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(OR.getProperty("video"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        
        
        
        //download sample file eg.  excel file
        Thread.sleep(5000);
        //click on filter icon
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        //select xls file
        driver.findElement(By.xpath(OR.getProperty("xls"))).click();
        Thread.sleep(1000);
        //click on apply on filter
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(10000);
        //select one excel file for download
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/div/section[3]/div/div/div/div/div/div/div/ul[1]/li[4]/button/i")).click();
        // click on download file
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[3]/div/div/div/div/div/div/div/ul[1]/li[4]/div/ul/li[2]/a/em")).click();
        Thread.sleep(5000);
        System.out.println("Excel file is downloaded sccessfully at instructor end");
        //select one  file for delete
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[3]/div/div/div/div/div/div/div/ul[1]/li[1]/div/label/span[3]")).click();
        // click delete the file
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[1]/button/span")).click();
        Thread.sleep(2000);
        //click on conform or ok for delete file
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div/div/div/ul/li[2]/button/span")).click();
        System.out.println("file deleted sucessfully at instructor end");
        Thread.sleep(6000);
        
        
       // System.out.println("======================================================");
        System.out.println("  Instructor end  Library_module Automation Done    ");
        //System.out.println("======================================================");
        Thread.sleep(2000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		//click on library module
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='listCol']//span[contains(text(),'Library')]")).click();
		Thread.sleep(5000);
		
		driver.close();

        
        
}
}
