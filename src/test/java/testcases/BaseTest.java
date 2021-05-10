package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.LoginPageZerodha;

public class BaseTest {

	//Prior Mandatory Methods or Operations
	 
	
	static WebDriver driver;
	public LoginPage lp;
	
	public LoginPageZerodha lpz;
	
	@BeforeSuite
	public void initDriver() throws IOException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\New Chrome Driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();//to get webdriver from dependencies
		ChromeOptions options = new ChromeOptions();//Object of ChromeOptions 
		options.addArguments("--start-maximized");//to maximize window at the start
//		options.addArguments("--headless");
//		options.addArguments("--incognito");
		driver = new ChromeDriver(options);//Object of ChromeDriver

		
		Properties prop = new Properties();//Object of Properties i.e configProperties
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\configProperties");
		prop.load(fis);
		
		driver.get(prop.getProperty("urlz"));
	}
	
	
	
	@BeforeClass
	public void objectCreation() throws IOException{
		lp = new LoginPage(driver);
	    lpz = new LoginPageZerodha(driver);
		}
	
	
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
