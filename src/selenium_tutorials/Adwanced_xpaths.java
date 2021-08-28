package selenium_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Adwanced_xpaths {
	static WebDriver driver;
	public static void main(String[] args) throws Exception
	
	
	{

		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");	
		//driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]")).click();
		
		//simlarly starts-with 
		//ends-with
		driver.findElement(By.xpath("//a[contains(text(),'Input Forms')]")).click();
		Thread.sleep(3000);
				
		driver.quit();
		

	}

}
