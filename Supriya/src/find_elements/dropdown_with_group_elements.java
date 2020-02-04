package find_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_with_group_elements {

	public static void main(String[] args) throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	     driver.get("https://v1.hdfcbank.com/branch-atm-locator");
	     driver.manage().window().maximize();
	     
	     
	     String cities[]= 
	    	 {
	    			 "please select state first",
	    			 "andhrapradesh",
	    			 "kerala",
	    			 "delhi",
	    			 "goa",
	    			 "jarkhand",
	    			 "manipur",
	    			 "nagaland",
	    			 "punjab",
	    			 
	    			 
	    	 };
	     WebElement state_dropdown=driver.findElement(By.id("customstate"));
	     List<WebElement> all_states=state_dropdown.findElements(By.tagName("option"));
	     
	     for (int i=0; i <= 8; i++);
	     
	     {
	    	 
	    
		
			WebElement Eachstate=all_states.get('i');
			Eachstate.click();
	    	 Thread.sleep(3000);
	    	 
	    	 
	    	WebElement city_location=driver.findElement(By.id("customcity")) ;
	    	
	    	 String cityoptions=city_location.getText();
	    	 
	    	 
	    	 if(cityoptions.contains(cities['i']));
	    	 
	    	 {
	    		 System.out.println("for state"+Eachstate.getText()+"\t"+"\t"+"city displayed ==>"+cities['i']);
	    		 
	    	 }
	    	 
	    	
	    		 
	    	 {
	    	 
	    	 System.out.println("for state"+Eachstate.getText()+"\t"+"\t"+" city not displayed");
	    	 
	    	 
	    	 } 
	    	 
	    	 
	    	 
	    	 
	    	 
	     }
	     
	    			
	    	 
	    	 
}
	     
	     
	     
	}
