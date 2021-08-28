package selenium_tutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDemo1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_11");
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg dropdown-toggle']")).click();
		Thread.sleep(3000);
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='dropdown-menu show']"));
		
		for(int i=0;i<li.size();i++)
		{
			
			
			System.out.println(li.get(i).getText());
		
			
			if(li.get(i).getText().contains("HTML"))
			{
				
				li.get(i).click();
		
				
				break;		
				
			}
			
		
			
		}
		


	}

}
