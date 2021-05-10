package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

	WebDriver driver;
	//WebElements
	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginbutton;
	
	
	//constructor
	public LoginPage(WebDriver driver) throws IOException {        
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	//methods
	public void loginwithCorrectCred() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click();
	}
}
