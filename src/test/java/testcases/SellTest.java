package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SellTest extends BaseTest {

	@Test(priority = 5)
	public void sellshare() {
		Reporter.log("Sell share",true);
		s.sell();
	}
}
