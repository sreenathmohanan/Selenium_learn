package selenium_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertdemo


{
	WebDriver driver;
	@Test
	public void Assert() throws InterruptedException
	
	{

	System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://members.webs.com/s/login/relogin");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@alt='Sign In']")).click();
		

	Thread.sleep(3000);
	
	String actual =driver.findElement(By.xpath("//div[@class='alert-subtitle']")).getText();
	String expected="Incorrect email (or username) and password combination";
	
	SoftAssert soft= new SoftAssert();
	
	soft.assertEquals(actual, expected);
	Thread.sleep(3000);
	
	System.out.println("test completed");
	
	driver.quit();
	
	}
}
