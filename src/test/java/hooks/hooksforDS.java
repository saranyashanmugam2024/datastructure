package hooks;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class hooksforDS {
	


	
	WebDriver driver;
	
    @Before
    public void setUp() {
       BaseclassforDriver.initialiseBrowser("edge");
      
      driver=BaseclassforDriver.getdriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://dsportalapp.herokuapp.com/");
        
    }


	@After
    public void tearDown() {
        driver.quit(); // to  close the browser after each scenario
    }
}




	
	
	
	
	
	
	
	    
	   /* @Before
	    public void setUp() {
	        WebDriver driver = BaseclassforDriver.getDriver();
	       
	        driver.get("https://dsportalapp.herokuapp.com/");
	    }

	    @After
	    public void tearDown() {
	        BaseclassforDriver.closeDriver();
	    }
	}

	

	   /* private WebDriverManager webDriverManager;

	    public hooksforDS(WebDriverManager webDriverManager) {
	        this.webDriverManager = webDriverManager;
	    }
       
	    @Before
	    public void setUp() {
	        WebDriverManager.getDriver().get("https://dsportalapp.herokuapp.com/");
	        // your setup code
	    }

	    @After
	    public void tearDown() {
	        webDriverManager.quitDriver();
	    }
	}*/


	


