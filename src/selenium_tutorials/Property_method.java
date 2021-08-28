package selenium_tutorials;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_method 


{

	public static String Fileread() throws IOException
	{
		
		
		
	Properties prop=new Properties();
		
		FileInputStream fil= new FileInputStream("C:\\Users\\232985\\eclipse-workspace\\Selenium_Learn\\src\\selenium_tutorials\\configuration.properties");
		prop.load(fil);
		
		String details =prop.getProperty("name");
		return details;
		
	}
}
