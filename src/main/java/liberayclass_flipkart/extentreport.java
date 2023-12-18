package liberayclass_flipkart;

import java.text.SimpleDateFormat;
import java.util.Set;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class extentreport implements ITestResult
{
	{
		 ExtentSparkReporter htmlrepoter;
		 ExtentReports reports;
		 ExtentTest test;
		
		
		
		
		public void ConfigureReport()
		{
			//Framework devloper crete thi class 
			String timestamp=new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
			String reportName="AmazonTestReport-" +timestamp +".html";
			//htmlrepoter= new  ExtentSparkReporter("ExtenReportDemok.html");
			
			
			htmlrepoter= new  ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//"+ reportName);
			reports= new ExtentReports();
			reports.attachReporter(htmlrepoter);

			
			//add enviouremnet details
			
			reports.setSystemInfo("Machine", "testpc1");
			reports.setSystemInfo("OS", "window11");
			reports.setSystemInfo("user ", "Prasad");
			reports.setSystemInfo("Browser", "Chrome");
			
			//add configuration lok
			htmlrepoter.config().setDocumentTitle("Extent Demo");
			htmlrepoter.config().setDocumentTitle("Extent demo");
			htmlrepoter.config().setTheme(Theme.DARK);
			htmlrepoter.config().setTimeStampFormat("EEEE	,MMMM DD,YYYY,hh:mm a '('zzz')'");

		}
		
		public void onStart(ITestContext Result)
		{
			ConfigureReport();
			System.out.println("On The Start Method Invoke");
			((TakesScreenshot)driver).getScreenshotAs(OutputType<X>)
		}
		
		public void onFinish(ITestContext Result)
		{
			System.out.println("On The Finish Method Invoke");
			reports.flush(); //mandatory ahai this method 
		}
		
		//for Failure Test Case Ke Liye
		
		
		public void onTestFailure(ITestResult Result)
		{
			System.out.println("Name Of Test Method Fail :" + Result.getName());
			test=reports.createTest(Result.getName());
			test.log(Status.FAIL,MarkupHelper.createLabel("Name of the Fail Test Case Is : "+Result.getName(),ExtentColor.RED ));
			
			String ScreenshotPath=System.getProperty("user.dir")+"\\Screenshot\\" + Result.getName()+"png";
			File Screenshotfile= new File(ScreenshotPath);
			if(Screenshotfile.exists())
			{
				test.fail("Capture ScreenShot Is Below:"+test.addScreenCaptureFromPath(ScreenshotPath));
			}
			
			//test.addScreenCaptureFromPath(null)
		}
		
		public void onTestSkipp(ITestResult Result)
		{
			System.out.println("Name Of Test Method Skiped :" + Result.getName());
			test=reports.createTest(Result.getName());
			test.log(Status.SKIP,MarkupHelper.createLabel("Name of the Skip Test Case Is : "+Result.getName(),ExtentColor.YELLOW ));
			
		}
		
		public void onTestStart(ITestResult Result)
		{
			System.out.println("Name Of Test Method Started :" + Result.getName());

		}
		
		public void onTestSucess(ITestResult Result)
		{
			System.out.println("Name Of Test Method Sucessfully :" + Result.getName());
			test=reports.createTest(Result.getName());
			test.log(Status.PASS,MarkupHelper.createLabel("Name of the Pass Test Case Is : "+Result.getName(),ExtentColor.GREEN ));
			
		}

		
		

	}

	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	private void ConfigureReport() {
		// TODO Auto-generated method stub
		
	}

	public void setAttribute(String name, Object value) {
		// TODO Auto-generated method stub
		
	}

	public Set<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object removeAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public int compareTo(ITestResult o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setStatus(int status) {
		// TODO Auto-generated method stub
		
	}

	public ITestNGMethod getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setParameters(Object[] parameters) {
		// TODO Auto-generated method stub
		
	}

	public IClass getTestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public Throwable getThrowable() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setThrowable(Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

	public long getStartMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getEndMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setEndMillis(long millis) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getFactoryParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTestName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getInstanceName() {
		// TODO Auto-generated method stub
		return null;
	}

	public ITestContext getTestContext() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTestName(String name) {
		// TODO Auto-generated method stub
		
	}

	public boolean wasRetried() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setWasRetried(boolean wasRetried) {
		// TODO Auto-generated method stub
		
	}

	public String id() {
		// TODO Auto-generated method stub
		return null;
	}


}
