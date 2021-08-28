package selenium_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateback
{
		static WebDriver driver;
		
		public static void main(String[] args) throws Exception  
		
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			 
		    driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get("https://www.google.com");
			Thread.sleep(3000);
			driver.navigate().to("https://www.amazon.com");
			driver.navigate().back();
			driver.navigate().forward();
			
			
			Thread.sleep(3000);
			driver.quit();
			

	}

	}
	
	
