package selenium_tutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement 

{
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	
	{


		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		Thread.sleep(3000);
		
		List<WebElement> li=driver.findElements(By.id("male"));
		
	     int size = li.size();
	     
	     for(int i=0;i<size;i++)
	     {
	    	 
	    int value=li.get(i).getLocation().x;
	    
	    if(value!=0)
	    {
	    	li.get(i).click();
	    	
	    	break;
	    }
	    	 
	    	 
	     }
		
	 	Thread.sleep(3000);
	     driver.quit();
	}
	}


