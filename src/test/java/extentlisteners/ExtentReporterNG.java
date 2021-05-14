package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {

	static ExtentReports extent;

	public static ExtentReports extentReporterGenerator() {
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		
	//ExtentSparkReporter is like Soft Assert Class object
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
	
	reporter.config().setReportName("Zerodha Test Report");
	reporter.config().setDocumentTitle("Regression Test Case");
	reporter.config().setTheme(Theme.DARK);
	
	//ExtentReports is like asser.all() in soft assert
	extent = new ExtentReports();
	
	extent.attachReporter(reporter);
	extent.setSystemInfo("OS", "Windows");
	extent.setSystemInfo("Organization", "Zerodha Application");
	
	return extent;
	
	}
}
