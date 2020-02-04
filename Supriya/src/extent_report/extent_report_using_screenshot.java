package extent_report;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class extent_report_using_screenshot {

	private Object outputType;

	public static void main(String[] args) throws Exception
	
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		String filepath="Reports\\Report.html";
		ExtentReports logger=new ExtentReports(filepath, true);
		System.out.println("repoter file created");
		 
	
		ExtentTest test1=logger.startTest("tc001_loginvalid");
		
		String screen1_path="screens\\screen1.png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(src, new File(screen1_path));
		
		test1.log(LogStatus.PASS, "home page is diplayed"+
		test1.addScreenCapture(screen1_path));
		 logger.endTest(test1);
		 logger.flush();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
