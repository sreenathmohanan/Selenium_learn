package selenium_tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args)
	
	{
		WebDriver driver=new HtmlUnitDriver();  //This is to run scripts in headless mode// disadvantage is will not support actions class
		
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());

	}

}
