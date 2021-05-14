package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTestZerodha extends BaseTest {

	//Actual Test Cases
	@Test(priority = 1)
	public void login() {
		Reporter.log("login successful",true);
		lpz.loginwithCorrectCred();
		lpz.enterPin();
	}
	
	@Test(priority =2, enabled=false)
	public void logout() {
		Reporter.log("logout successful",true);
		lpz.logoutfromzerodha();
	}
}
