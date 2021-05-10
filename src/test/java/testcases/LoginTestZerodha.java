package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTestZerodha extends BaseTest {

	//Actual Test Cases
	@Test
	public void login() {
		Reporter.log("login test",true);
		lpz.loginwithCorrectCred();
		lpz.enterPin();
	}
}
