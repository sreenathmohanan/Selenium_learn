package selenium_tutorials;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoPopup 

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
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Twitter']")).click();
		
		Set<String>win=driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String Parent=it.next();
		String child=it.next();
		
		
		
	System.out.println("Parent window handle is "+	Parent);
	System.out.println(	"Child window handle is "+	child);
	
	driver.switchTo().window(child);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	System.out.println("Title of child windo is "+ driver.getTitle());
	Thread.sleep(5000);
	driver.close();
	
	driver.switchTo().window(Parent);
	
	
	Thread.sleep(3000);
	
	System.out.println("Title of parent window is "+ driver.getTitle());
	
	driver.quit();
	


		
		
		

	}

}
