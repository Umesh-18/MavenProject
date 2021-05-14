package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static WebDriver driver;
	
	public static String captureScreenShot(WebDriver driver) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File Source = ss.getScreenshotAs(OutputType.FILE);
		
		String destinationpath = System.getProperty("user.dir")+"\\screenshots\\filename.png";

		File Destination = new File(destinationpath);
		FileHandler.copy(Source,Destination);
		
		return destinationpath;
	
	}
}
