package selenium_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterHighlighter {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit. SECONDS);
		driver.manage(). timeouts(). implicitlyWait(30, TimeUnit. SECONDS);
		driver.get("https://www.freecrm.com"); //enter URL
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("teste123");
		WebElement Login= driver.findElement(By.xpath("I/input[contains(@type, 'submit')]"));
		
		flash(Login, driver);
		
		
		
		}
	
	
		public static void flash(WebElement element, WebDriver driver)
		
		{
		
			JavascriptExecutor js = ((JavascriptExecutor) driver);
		
			String bgcolor = element.getCssValue("backgroundColor");
		
		for (int i = 0; i < 10; i++) {
		      changeColor("rgb(0,200,0)", element, driver);
		      changeColor(bgcolor, element, driver);
		      
		}
		}
		public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = "+color+"", element);
		try {
		Thread.sleep(20);
		} catch (InterruptedException e) {

	}

}
		
		
}
