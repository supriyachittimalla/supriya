package extent_report;

import com.relevantcodes.extentreports.ExtentReports;

public class create_extentreports {

	public static void main(String[] args) {
		
		String filepath="Reports\\Reports1.html";
		ExtentReports logger=new ExtentReports(filepath, true);
		System.out.println("repoter file created");
		 
	    logger.flush();
	}

}

