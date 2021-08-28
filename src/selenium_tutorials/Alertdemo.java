package selenium_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	
	{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			 
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
	
			driver.manage().deleteAllCookies();
	
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		
	    Alert alert= driver.switchTo().alert();
	    
	    
	    Thread.sleep(3000);
	    alert.accept();
	    
	    driver.quit();
		

	}

}
