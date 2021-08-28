package selenium_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollView 
{
static WebDriver driver;


	public static void main(String[] args) throws Throwable 
	
	
	{
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/");
		
	    WebElement wl=	driver.findElement(By.xpath("//strong[text()='New classes option']"));
		
		Thread.sleep(3000);
		
		JavascriptExecutor JS= (JavascriptExecutor)driver;
		
		JS.executeScript("arguments[0].scrollIntoView(true)", wl);
		Thread.sleep(3000);
		driver.quit();

}
}