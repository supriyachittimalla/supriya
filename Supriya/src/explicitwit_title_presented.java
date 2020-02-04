import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwit_title_presented {

	public static void main(String[] args)
	{

		
		String path=("drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.titleIs("seleniumHQ browser automation"));
		System.out.println("timeout released selenium homepage title verified");
		
		
		WebElement downloads=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[2]"));
		downloads.click();
		
		
		
	     wait.until(ExpectedConditions.titleContains("downloads"));
	     System.out.println("downloads page title verified");
		

	}

}
