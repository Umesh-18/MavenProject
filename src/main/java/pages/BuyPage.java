package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage extends BaseClass {
	WebDriver driver;
	
	//WebElements
	@FindBy(xpath = "(//button[@class='button-outline button-blue'])[2]")
	private WebElement buybutton;
	
	@FindBy (xpath = "//button[@class='submit']")
	private WebElement submitbuybutton;
	
	
	//Constructor
	public BuyPage(WebDriver driver)throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void buy() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		buybutton.click();
		submitbuybutton.click();
	}

}
