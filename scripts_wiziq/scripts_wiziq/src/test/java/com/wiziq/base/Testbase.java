package com.wiziq.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;


public class Testbase {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	
	
	
	@BeforeSuite
	public void setup() throws InterruptedException
	{
		
		if(driver==null)
		{ //Loading Config File
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			try {
				config.load(fis);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			try {//Loading OR File
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
		
		if (config.getProperty("browser").equals("Firefox")) {

			// System.setProperty("webdriver.gecko.driver", "gecko.exe");
			driver = new FirefoxDriver();

		} 
		else if (config.getProperty("browser").equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} 
	//	else if (config.getProperty("browser").equals("ie")) {

			//System.setProperty("webdriver.ie.driver",
					//System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
			//driver = new InternetExplorerDriver();

		//}
			
        driver.get(config.getProperty("URL"));
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	}




