package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait_until_element_visible_at_webpage 
{

	public static void main(String[] args)
	{

		
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://gmail.com");
	     driver.manage().window().maximize();
	
	     
	     driver.findElement(By.id("identifierId")).clear();
	     driver.findElement(By.id("identifierId")).sendKeys("qadarshan");
	     
	     
	     new WebDriverWait(driver,30 ).until
	     (ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	     System.out.println("timeout released password visible at webpage");
	     
	     
	     driver.findElement(By.name("password"));
		
	     
	     
	     
	     
	     
		
	}

}
