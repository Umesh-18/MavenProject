package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellPage extends BaseClass {
	
	WebDriver driver;
	
	//Webelements
	@FindBy(xpath = "//button[@class='button-outline button-orange']")
	WebElement sellbutton;
	
	@FindBy (xpath = "//button[@class='submit']")
	WebElement sellsubmitbutton;
	
	//Constructor
	public SellPage(WebDriver driver)throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void sell() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sellbutton.click();
		sellsubmitbutton.click();
	}
	
}
