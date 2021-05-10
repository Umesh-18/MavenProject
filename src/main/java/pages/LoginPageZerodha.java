package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageZerodha extends BaseClass {

	WebDriver driver;
	//WebElements
	@FindBy(xpath = "//input[@id='userid']")
	private WebElement usernamez;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordz;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbuttonz;
	
	@FindBy (xpath = "//input[@id='pin']")
	private WebElement pinz;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continuebuttonz;
	
	
	//constructor
	public LoginPageZerodha(WebDriver driver) throws IOException {        
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	//methods
	public void loginwithCorrectCred() {
		
		usernamez.sendKeys(prop.getProperty("usernamez"));
		passwordz.sendKeys(prop.getProperty("passwordz"));
		loginbuttonz.click();
	}
	
	public void enterPin() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pinz.sendKeys(prop.getProperty("pinz"));
		continuebuttonz.click();
	}
}
