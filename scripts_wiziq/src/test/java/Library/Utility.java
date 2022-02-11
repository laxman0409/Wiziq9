package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public  static void capturescreenshot(WebDriver driver,String screenshotName) throws IOException
	{
	    try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File Source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("src\\test\\resources\\Executables\\Screenshots/"+screenshotName+".jpg"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}


	    
			
		}

	}

