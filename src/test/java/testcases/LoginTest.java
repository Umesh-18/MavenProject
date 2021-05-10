package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	//Actual Test Cases
	@Test
	public void login() {
		Reporter.log("login test",true);
		lp.loginwithCorrectCred();
	}
}
