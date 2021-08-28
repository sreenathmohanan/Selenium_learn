package selenium_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");	
		
		driver.switchTo().frame(0);
		
		Actions drag= new Actions(driver);
		drag.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
        Thread.sleep(3000);
		driver.quit();
		
		
	}

}
