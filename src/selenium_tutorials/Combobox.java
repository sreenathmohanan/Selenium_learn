package selenium_tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Combobox {

	public static void main(String[] args) 
	
	{
		
      WebDriver driver= new ChromeDriver();
      driver.get("https://community.ebay.com/");
      driver.manage().window().maximize();
      
      String actual_title=driver.getTitle();
      
      System.out.println(actual_title);
      
   if(actual_title.equals("Home - The eBay Community"))
    	  
      {
	      System.out.println("title is verified");
      }
      
      else
      {
    	  
    	  System.out.println("title is incorrect");
    	  
    	  
      }
     
      
  
      
      
      
      
      
      
      
      
      
      driver.quit();
      
	}

}
