package selenium_tutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropboxlist {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");	
		
		//Select day= new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		
		Select day= new Select(driver.findElement(By.id("select-demo")));
		
		//day.selectByValue("Wednesday");
		day.selectByVisibleText("Tuesday");
		List <WebElement> List=day.getOptions();
			
		System.out.println(List.size()-1);
		Thread.sleep(5000);
		driver.quit();
	
		

	}

}
