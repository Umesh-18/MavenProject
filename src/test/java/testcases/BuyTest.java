package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BuyTest extends BaseTest {

	@Test(priority = 4)
	public void buyshare() {
		Reporter.log("Buy Share", true);
		b.buy();
		Assert.assertEquals(true, false);
	}
}
