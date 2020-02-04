package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class verifying_element_visibility_and_hidden_with_explicit_wait {

	public static void main(String[] args) {
		
		
		String path=("drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement roundtrip=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
		roundtrip.click();
		
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.
				elementSelectionStateToBe(roundtrip, true));
		System.out.println("timeout released roundtrip is selected");
		
		
		WebElement return_date_loc=driver.findElement(By.xpath("//input[@id='ReturnDate']"));
		
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(return_date_loc));
		System.out.println("tested verified return date visible on roundtrip selection");
		
		WebElement oneway_loc=driver.findElement(By.xpath("//input[contains(@id,'OneWay')]"));
		oneway_loc.click();
		
		new WebDriverWait(driver,10).until(ExpectedConditions.invisibilityOf(return_date_loc));
		System.out.println("return is hidden on oneway selection");
		
		
	}

}
