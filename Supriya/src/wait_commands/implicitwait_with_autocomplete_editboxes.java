package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait_with_autocomplete_editboxes {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("roundtrip"));
		
		driver.findElement(By.id("fromtag")).clear();
		driver.findElement(By.id("fromtag")).sendKeys("jai");
		driver.findElement(By.linkText("hyderabad,in-rajivgandhi international(HYD)")).click();
		
		
		driver.findElement(By.id("to tag")).clear();
		driver.findElement(By.id("to tag")).sendKeys("dell");
		driver.findElement(By.linkText("new delhi,in-indira gandhi airport(del)")).click();
		
		
		
		driver.manage().timeouts();
		implicitlywait(30,TimeUnit.SECONDS);
		pageloadtimeout(30,TimeUnit.SECONDS); 
		setscripttimeout(100,TimeUnit.SECONDS);
		
		
		
		
		
		
		
	
		
	}

	private static void setscripttimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

	private static void pageloadtimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

	private static void implicitlywait(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

}
