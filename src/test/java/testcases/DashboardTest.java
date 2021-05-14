package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class DashboardTest extends BaseTest {

	@Test(priority = 3)
	public void StartInvestingAndSearch() {
		Reporter.log("Start Investing And Search", true);
		db.startinvestingandsearch();
//		Assert.assertEquals(true, false);
	}
}
