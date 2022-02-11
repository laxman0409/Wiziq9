package com.wiziq.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wiziq.base.Testbase;



public class Login extends Testbase {
	String uname,path;
	@Test
	public void LoginToApplication() throws IOException, InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
   		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("login"))));
   		Category_Body.click();
   		
		FileInputStream fs=new FileInputStream("src\\test\\resources\\Executables\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("sheet1");
		//XSSFRow row=sheet.getRow(1);
		//XSSFCell cell=row.getCell(0);
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row1=sheet.getRow(i);
			uname=row1.getCell(0).toString();
			path=row1.getCell(1).toString().trim();
			
			System.out.println("userName "+uname);
			System.out.println("password "+path);
			Thread.sleep(10000);
			driver.findElement(By.id("email")).sendKeys(uname);
			driver.findElement(By.id("password")).sendKeys(path);
			driver.findElement(By.xpath(OR.getProperty("login_button"))).click();
			
		}
		    

		}
		

}
