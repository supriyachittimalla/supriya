package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait_elementtobe_clickable {

	public static void main(String[] args) {
		
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://v1.hdfcbank.com/branch-atm-locator");
	     driver.manage().window().maximize();
	
	     
	     WebDriverWait wait=new WebDriverWait(driver, 50);
	     
	     
	     By city_loc=By.xpath("//select[@id='customCity']");
	     wait.until(ExpectedConditions.elementToBeClickable(city_loc)).click();
	     
	     

	}

}
