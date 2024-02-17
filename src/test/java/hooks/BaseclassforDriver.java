package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;




public class BaseclassforDriver {
	
	 static WebDriver driver=null;
	    

	    public static void initialiseBrowser(String browsername) {
	    	if(browsername.equals("chrome")){
	        
	            driver = new ChromeDriver();
	           }
	    	else if (browsername.equals("firefox")){

	            driver = new FirefoxDriver();
	    	}
	    	
	    	else if (browsername.equals("edge")){
	    		
	    	    driver = new EdgeDriver();
	    	}
	    	    else if (browsername.equals("safari")) {
	    	    	
	    	    	driver = new SafariDriver();	
	    	    }
	    }
	    	
	    	
	    	public static WebDriver getdriver() {
	    		
	    		{
	    		return driver;
	    	
	    	}
	    	}
	           
}    

	
