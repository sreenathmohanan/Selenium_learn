package selenium_tutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount 
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
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Thread.sleep(3000);
		for(int i=0;i<links.size();i++)
		{
		
		String Tagnames =links.get(i).getText();
		System.out.println(Tagnames);
		
		
			
		}
		

	}

}
