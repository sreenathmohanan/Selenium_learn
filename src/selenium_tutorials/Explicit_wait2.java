package selenium_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait2 
{

	static WebDriver driver;
	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		
		WebElement firstname= driver.findElement(By.id("email1"));
		WebDriverWait wait= new  WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(firstname)).sendKeys("sreenath");;
			
		
	     boolean status=firstname.isDisplayed();
	     
	    System.out.println(status);
	
		
	}

}
