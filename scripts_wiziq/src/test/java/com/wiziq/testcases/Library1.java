
	
	package com.wiziq.testcases;

	import java.awt.AWTException;
	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.testng.annotations.Test;

	import com.wiziq.base.Testbase;

	//import Library.Utility;

	public class Library1 extends Testbase {
		@Test(priority=1)
		public void library() throws InterruptedException, AWTException, IOException
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
			
		
			//Thread.sleep(10000);
		Thread.sleep(6000);
			driver.findElement(By.cssSelector("i.material-icons")).click();
			Thread.sleep(3000);
			//click on library module
			driver.findElement(By.xpath(OR.getProperty("library_icon"))).click();
			
			
			Thread.sleep(3000);
			//click on "+" in library
			Thread.sleep(4000);
			driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
			Thread.sleep(3000);
			
			
			
			//click on upload file
			driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
			Thread.sleep(4000);
			//upload file
			driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath);
	        Thread.sleep(5000);
	        //click on upload
	        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
	        Thread.sleep(1000);
	        System.out.println("xls file uploaded successfully");
	        Thread.sleep(5000);
	        
	        
	        //creating folder
	        
	        
	        //click on +
	        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
	        Thread.sleep(3000);
	        //add folder
	        driver.findElement(By.xpath(OR.getProperty("add_folder"))).click();
	        Thread.sleep(1500);
	        //clear the folder name
	        driver.findElement(By.xpath(OR.getProperty("folder_name"))).clear();
	        Thread.sleep(1000);
	        //enter folder name here
	        driver.findElement(By.xpath(OR.getProperty("folder_name"))).sendKeys("Automation_folder1");
	        Thread.sleep(3000);
	        //click on create folder button
	        driver.findElement(By.xpath(OR.getProperty("create_folder"))).click();
	        Thread.sleep(3000);
	        //click on "okay" button
	        driver.findElement(By.xpath(OR.getProperty("folder_ok"))).click();
	        Thread.sleep(2000);
	        System.out.println("Folder created successfully");
	        Thread.sleep(2000);
	       
	        
	        //editing folder
	        
	        
	        //click edit i.e 3 dots icon
	        driver.findElement(By.xpath(OR.getProperty("rename_folder"))).click();
	        Thread.sleep(1000);
	        //click on rename for folder
	        driver.findElement(By.xpath(OR.getProperty("rename_click"))).click();
	        Thread.sleep(1000);
	        //clear the previous folder name
	        driver.findElement(By.xpath(OR.getProperty("folder_name"))).clear();
	        Thread.sleep(1000);
	        //re enter the folder name again for editing 
	        driver.findElement(By.xpath(OR.getProperty("folder_name"))).sendKeys("Automation_edited_folder1");
	        Thread.sleep(3000);
	        //click on ok for rename folder
	        driver.findElement(By.xpath(OR.getProperty("create_folder"))).click();
	        Thread.sleep(3000);
	        //click on confirmation ok for folder rename
	        driver.findElement(By.xpath(OR.getProperty("folder_ok"))).click();
	        Thread.sleep(2000);
	        System.out.println("Folder renamed successfully");
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[@class='mdl-button normalFont']")).click();
	        
	        //upload xlxs file here
	        
	        Thread.sleep(3000);
	       
	        
	        //click on folder for upload xlxs file
	        driver.findElement(By.xpath(OR.getProperty("folder_click"))).click();
	        Thread.sleep(3000);
	        //click on + icon
			driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
			Thread.sleep(5000);
			//click on file upload icon
			driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
			Thread.sleep(5000);
			//choose file here
			driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath);
	        Thread.sleep(5000);
	        //click on upload
	        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
	        Thread.sleep(5000);
	        System.out.println("xls file uploaded in folder successfully");
	        
	        
	        //upload pptx file here
	        
	        
	        //click on folder for upload pptx file
	        //click on + icon
	        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
			Thread.sleep(5000);
			//click on upload file icon
			driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
			Thread.sleep(5000);
			//choose file
			driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath1);
	        Thread.sleep(6000);
	        //click on upload button
	        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
	        
	        System.out.println("pptx file uploaded in folder successfully");
	        Thread.sleep(5000);
	        
	        //upload Document file here
	        
	        
	        // to upload doc file in folder
	        //click on + icon
	        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
			Thread.sleep(5000);
			//click on upload file icon
			driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
			Thread.sleep(5000);
			//choose file
			driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath2);
	        Thread.sleep(5000);
	        //click on upload button
	        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
	        
	        System.out.println("doc file uploaded in folder successfully");
	        
	        Thread.sleep(5000);
	        
	        
	        //upload PDF file here
	       
	        
	         // to upload pdf file in folder
	        //click on + icon
	        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
			Thread.sleep(5000);
			//click on upload file icon
			driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
			Thread.sleep(5000);
			//choose file
			driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath3);
	        Thread.sleep(8000);
	        //click on upload button
	        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
	        Thread.sleep(5000);
	        System.out.println("pdf file uploaded in folder successfully");
	        
	        
	        //upload Audio file here
	       
	        
	        // to upload audio file in folder
	        //click on + icon
	        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
			Thread.sleep(5000);
			//click on upload file icon
			driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
			Thread.sleep(6000);
			//choose file
			driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath4);
	        Thread.sleep(8000);
	        //click on upload button
	        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
	        Thread.sleep(15000);
	        System.out.println("Audio file uploaded in folder successfully");
	        
	        
	        //upload Video file here
	        
	        
	        
	        // to upload video file in folder
	        //click on + icon
	        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
			Thread.sleep(5000);
			//click on upload file icon
			driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
			Thread.sleep(5000);
			//choose file
			driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath5);
	        Thread.sleep(6000);
	      //click on upload button
	        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
	        Thread.sleep(20000);
	        System.out.println("Video file uploaded in folder successfully");
	        
	        
	        // back to library
	        //click on library
	        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[1]/div[1]/ul/li[1]/a")).click();
	        Thread.sleep(10000);
	        
	       
			
			
	        // Click on filters 
	        
	        //click on 3 lines
	        driver.findElement(By.xpath("//a[@class='mdl-badge']")).click();
	        Thread.sleep(5000);
	        
	        //Filter for pdf
	        driver.findElement(By.xpath(OR.getProperty("pdf"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for document
	        driver.findElement(By.xpath("//a[@class='mdl-badge']")).click();
	        driver.findElement(By.xpath(OR.getProperty("doc"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for ppt
	        driver.findElement(By.xpath("//a[@class='mdl-badge']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("ppt"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for xls file
	        driver.findElement(By.xpath("//a[@class='mdl-badge']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("xls"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for Audio file
	        driver.findElement(By.xpath("//a[@class='mdl-badge']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("audio"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for Video file
	        driver.findElement(By.xpath("//a[@class='mdl-badge']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("video"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //de_select all filters here 
	        
	        driver.findElement(By.xpath("//a[@class='mdl-badge']")).click();
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
	        driver.findElement(By.xpath("//a[@class='mdl-badge']")).click();
	        Thread.sleep(1000);
	        //select xls file
	        driver.findElement(By.xpath(OR.getProperty("xls"))).click();
	        Thread.sleep(1000);
	        //click on apply on filter
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(3000);
	        // click on 3 dots 
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/button[1]/i[1]")).click();
	     // click on download file
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click();
	     
	        Thread.sleep(4000);
	        System.out.println("Excel file is downloaded sccessfully");
	        
	        //select one  file for delete
	        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/label[1]/span[3]")).click();
	        // click delete the file
	        driver.findElement(By.xpath("//em[normalize-space()='trash']")).click();
	        Thread.sleep(2000);
	        //click on conform or ok for delete file
	        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div/div/div/ul/li[2]/button/span")).click();
	        System.out.println("file deleted sucessfully");
	        Thread.sleep(6000);
	        
	        // verify the search functionality
	        driver.findElement(By.xpath("//input[@id='searchCourse']")).sendKeys("add");
	        Thread.sleep(3000);
	       // driver.navigate().refresh();
	        //Thread.sleep(6000);
	        
	      
	        
	       // System.out.println("======================================================");
	        System.out.println("   Library_module Automation Done    ");
	        //System.out.println("======================================================");
	        
			driver.findElement(By.cssSelector("i.material-icons")).click();
			Thread.sleep(3000);
			//click on library module
			driver.findElement(By.xpath(OR.getProperty("library_icon"))).click();
			Thread.sleep(5000);
			driver.close();
			
			
			
			
			
			/*
			
			File file = new File("src\\test\\resources\\images\\add.xls");
			String localFilePath = file.getAbsolutePath();
			File file1 = new File("src\\test\\resources\\images\\bullet.pptx");
			String localFilePath1 = file1.getAbsolutePath();
			File file2 = new File("src\\test\\resources\\images\\Resume_Sahil_Thakur.doc");
			String localFilePath2 = file2.getAbsolutePath();
			File file3 = new File("src\\test\\resources\\images\\World War 1(1914).pdf");
			String localFilePath3 = file3.getAbsolutePath();
			File file4 = new File("src\\test\\resources\\images\\output (2).mp3");
			String localFilePath4 = file4.getAbsolutePath();
			File file5 = new File("src\\test\\resources\\images\\output-480 (15).mp4");
			String localFilePath5 = file5.getAbsolutePath();
			 
			 */


}
	}
	
