package find_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker_active_dates {

	public static void main(String[] args) throws Exception 
	{
		
		 System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.cleartrip.com/trains");
	     driver.manage().window().maximize();
	
	     WebElement date_picker=driver.findElement(By.xpath("//input[@id='dpt_date']"));
	     date_picker.click();
		
		
		for (int i = 0; i <=3; i++);
		
		WebElement active_month;
		active_month=driver.findElement(By.xpath("//input[@id='dpt_date']"));
		
		List<WebElement> active_dates;
		active_dates=(List<WebElement>) active_month.findElement(By.xpath("javascript: void(0);"));
		
	    
		
	}

}
