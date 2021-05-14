package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BaseClass {

	WebDriver driver;
	
	//WebElements
	@FindBy(xpath = "(//button[@class='button-blue'])[1]")
	private WebElement startinvestingbutton;
	
	@FindBy(xpath = "(//input[@id='search-input'])[2]")
	private WebElement searchfield;
	
	//constructor
	public  DashboardPage(WebDriver driver)throws IOException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void startinvestingandsearch() {

		startinvestingbutton.click();

		Actions act = new Actions(driver);
		act.sendKeys(searchfield, "SBIN").sendKeys(Keys.ENTER).build().perform();
	}
	
}