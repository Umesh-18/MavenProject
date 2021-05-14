package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageZerodha extends BaseClass {

	WebDriver driver;
	WebDriverWait wait;
	
	//1]WebElements
	//login
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
	
	
	//logout
	@FindBy (xpath = "//div[@class='avatar']")
	private WebElement profilebutton;
	
	@FindBy (xpath = "//a[text()=' Logout']")
	private WebElement logoutbutton;
	
	
	//2]constructor
	public LoginPageZerodha(WebDriver driver) throws IOException {        
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		wait = new WebDriverWait(driver, 60);
	}
	
	
	//3]methods
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
	
	public void logoutfromzerodha() {
		wait.until(ExpectedConditions.elementToBeClickable(profilebutton));
		profilebutton.click();
		wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));
		logoutbutton.click();
	}
}
