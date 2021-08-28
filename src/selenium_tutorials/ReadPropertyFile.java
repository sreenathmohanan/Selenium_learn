package selenium_tutorials;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile 
{

	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException
	
	{
	
		Properties prop=new Properties();
		
		FileInputStream fil= new FileInputStream("C:\\Users\\232985\\eclipse-workspace\\Selenium_Learn\\src\\selenium_tutorials\\configuration.properties");
		prop.load(fil);
		String Name=prop.getProperty("name");
		
		System.out.println("name read is "+ Name);
		
		String Browser=prop.getProperty("browser");
		
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			
			
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			 
		    driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		else
		{
			
			System.out.println("Do not open any browse");
			
			
		}
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		
	
		    
		
		
		
		driver.findElement(By.xpath(prop.getProperty("Text_message"))).sendKeys("sreenath");
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		Thread.sleep(15000);
		
		driver.quit();
		

		
		
		
		
}
}