package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_login {

	public static void main(String[] args) throws Exception {
		
		
		String path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://gmail.com");
	     driver.manage().window().maximize();
	
	     driver.findElement(By.id("identifier id")).clear();
	     driver.findElement(By.id("identifier id"))
	            .sendKeys("supriyachittimalla21@gmail.com"+Keys.ENTER);
	     
	     Thread.sleep(5000);
	     
	     
	     
	     driver.findElement(By.name("password")).clear();
	     driver.findElement(By.name("password")).sendKeys("sanjusanvi"+Keys.ENTER);
	     
	
	}

}
