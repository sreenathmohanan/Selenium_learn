package selenium_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll_JS {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor JS= (JavascriptExecutor)driver;
		
		JS.executeScript("scroll(0,700)");
		
		Thread.sleep(3000);
		
		System.out.println("ended");
		
		driver.quit();
		

	}

}
