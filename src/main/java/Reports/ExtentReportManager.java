package Reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		extent= new ExtentReports();
		spark= new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/MyExtReports.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Guru Test");
		spark.config().setTheme(Theme.STANDARD);
		
		extent.attachReporter(spark);
		
		extent.setSystemInfo("Tester Name", "sirisha");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("O/S", "Window");
		extent.setSystemInfo("Testing Type", "Regresion Testing");
		  }
	
	public void onTestSuccess(ITestResult result) {

		test=extent.createTest(result.getName() );
		test.log(Status.PASS, result.getName()+" is passed");
		
	}
	public void onTestFailure(ITestResult result) {

		test=extent.createTest(result.getName());
		test.log(Status.FAIL, result.getName()+" is failed");
	}
	public void onTestSkipped(ITestResult result) {

		test=extent.createTest(result.getName());
		test.log(Status.SKIP, result.getName()+" is skipped");
	}
	
	
	public void onFinish(ITestContext context) {

		extent.flush();
	}
	
}




