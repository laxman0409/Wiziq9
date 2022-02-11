package com.wiziq.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_code {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jacksparow.wiziqxt.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jack@yopmail.com");
		  driver.findElement(By.id("password")).sendKeys("123456");
		  driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/ul[1]/li[4]/button[1]/span[2]")).click();
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  //sample code
		  
		   /*
	        
	        //creating folder
	        
	        
	        //click on +
	        driver.findElement(By.xpath(OR.getProperty("lib_icon1"))).click();
	        Thread.sleep(3000);
	        //add folder
	        driver.findElement(By.xpath(OR.getProperty("add_folder"))).click();
	        Thread.sleep(1500);
	        //clear the folder name
	        driver.findElement(By.xpath(OR.getProperty("folder_name"))).clear();
	        Thread.sleep(1000);
	        //enter folder name here
	        driver.findElement(By.xpath(OR.getProperty("folder_name"))).sendKeys("Floder_Created_Automation");
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
	        driver.findElement(By.xpath(OR.getProperty("folder_name"))).sendKeys("Folder_Edit_done_By_Automation");
	        Thread.sleep(3000);
	        //click on ok for rename folder
	        driver.findElement(By.xpath(OR.getProperty("create_folder"))).click();
	        Thread.sleep(3000);
	        //click on confirmation ok for folder rename
	        driver.findElement(By.xpath(OR.getProperty("folder_ok"))).click();
	        Thread.sleep(2000);
	        System.out.println("Folder renamed successfully");
	        
	        
	        //upload xlxs file here
	       
	        
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
	        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
	        Thread.sleep(5000);
	        
	        //Filter for pdf
	        driver.findElement(By.xpath(OR.getProperty("pdf"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for document
	        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
	        driver.findElement(By.xpath(OR.getProperty("doc"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for ppt
	        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("ppt"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for xls file
	        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("xls"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for Audio file
	        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(OR.getProperty("audio"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
	        Thread.sleep(15000);
	        
	        //Filter for Video file
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
	        System.out.println("Excel file is downloaded sccessfully");
	        //select one  file for delete
	        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[3]/div/div/div/div/div/div/div/ul[1]/li[1]/div/label/span[3]")).click();
	        // click delete the file
	        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[1]/button/span")).click();
	        Thread.sleep(2000);
	        //click on conform or ok for delete file
	        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div/div/div/ul/li[2]/button/span")).click();
	        System.out.println("file deleted sucessfully");
	        Thread.sleep(6000);
	        
	        
	       // System.out.println("======================================================");
	        System.out.println("   Library_module Automation Done    ");
	        //System.out.println("======================================================");
	        
			driver.findElement(By.cssSelector("i.material-icons")).click();
			Thread.sleep(3000);
			//click on library module
			driver.findElement(By.xpath(OR.getProperty("library_icon"))).click();
			Thread.sleep(5000);
			driver.close();
			
			
			
			
			
			
			///////////
			 
			 
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
		 
		 
		
		
		
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-top-right\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[2]/div/ul/li[5]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("i.material-icons")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/nav/div[1]/div/div/ul/li[1]/a/span/span/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(10000);
        System.out.println("xls file uploaded successfully");
        
        Thread.sleep(30000);
		driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("add_folder"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("folder_name"))).clear();
        driver.findElement(By.xpath(OR.getProperty("folder_name"))).sendKeys("Automation_folder");
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("create_folder"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("folder_ok"))).click();
        Thread.sleep(8000);
        System.out.println("Folder created successfully");
        driver.findElement(By.xpath(OR.getProperty("rename_folder"))).click();
        driver.findElement(By.xpath(OR.getProperty("rename_click"))).click();
        driver.findElement(By.xpath(OR.getProperty("folder_name"))).clear();
        driver.findElement(By.xpath(OR.getProperty("folder_name"))).sendKeys("Automation_folder_rename");
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("create_folder"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("folder_ok"))).click();
        Thread.sleep(4000);
        System.out.println("Folder renamed successfully");
        // to upload xls file in folder
        driver.findElement(By.xpath(OR.getProperty("folder_click"))).click();
        Thread.sleep(10000);
		driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(5000);
        System.out.println("xls file uploaded in folder successfully");
        // to upload pptx file in folder
        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath1);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(5000);
        System.out.println("pptx file uploaded in folder successfully");
        // to upload doc file in folder
        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath2);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(10000);
        System.out.println("doc file uploaded in folder successfully");
        // to upload pdf file in folder
        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath3);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(5000);
        System.out.println("pdf file uploaded in folder successfully");
        // to upload audio file in folder
        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath4);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(30000);
        System.out.println("Audio file uploaded in folder successfully");
        // to upload video file in folder
        driver.findElement(By.xpath(OR.getProperty("lib_icon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("upload_icon"))).click();
		Thread.sleep(10000);
		driver.findElement(By.id("fsp-fileUpload")).sendKeys(localFilePath5);
        Thread.sleep(10000);
        driver.findElement(By.xpath(OR.getProperty("click_on_upload"))).click();
        Thread.sleep(30000);
        System.out.println("Video file uploaded in folder successfully");
        // back to library
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[1]/div[1]/ul/li[1]/a")).click();
        Thread.sleep(10000);
        // Click on filters 
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("pdf"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(30000);
       // Utility.capturescreenshot(driver, "max");
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        driver.findElement(By.xpath(OR.getProperty("doc"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(30000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("ppt"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(30000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("xls"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(30000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("audio"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(30000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("video"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(30000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[2]/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR.getProperty("xls"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(OR.getProperty("apply"))).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div/div/div/section[3]/div/div/div/div/div/div/div/ul[1]/li[4]/button/i")).click();
        // download file
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[3]/div/div/div/div/div/div/div/ul[1]/li[4]/div/ul/li[2]/a/em")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[3]/div/div/div/div/div/div/div/ul[1]/li[1]/div/label/span[3]")).click();
        // delete the file
        driver.findElement(By.xpath("//*[@id=\"wrapperContainer\"]/div/div/div/section[2]/div[1]/button/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div/div/div/ul/li[2]/button/span")).click();
        Thread.sleep(30000);
			 
			 
			
			
			*/
			
		  
	}
	

}
