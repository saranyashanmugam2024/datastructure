package PageObject;



import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage{

	public WebDriver driver;
	 WebDriverWait wait;

		private By GetStartedButton = (By.xpath("//button[@class='btn']"));
         								
        private By errorMessage = (By.xpath("//div[@class='alert alert-primary' ]" ));
        private By Dropdown=(By.xpath ("//a[@class='nav-link dropdown-toggle']"));
       private By Ddownmenu=(By.xpath("//div[@class='dropdown-menu show']"));
       
        
    private By DdownArray=(By.xpath("//a[@href='/array']"));
    private By DdownLinkedlist=(By.xpath("//a[@href='/linked-list']")); 
   private  By Ddownstack =(By.xpath("//a[@href='/stack']"));
    private By DdownQueue =(By.xpath("////a[@href='/queue']"));
     private By Ddowntree  =(By.xpath("//a[@href='/tree']"));
    private  By Ddowngraph =(By.xpath("//a[@href='/graph']"));
     
     
       private  By DataStructuregetstart =(By.xpath("//a[@href='data-structures-introduction']"));
       private  By Arraygetstart =(By.xpath("//a[@href='array']"));
       private By LinkedListgetstart =(By.xpath("//a[@href='linked-list']"));
       private  By Stackgetstart =(By.xpath("//a[@href='stack']"));
       private By Queuegetstart =(By.xpath("//a[@href='queue']"));
       private By  Treegetstart =(By.xpath("//a[@href='tree']"));
       private By Graphgetstart =(By.xpath("//a[@href='graph']"));

        
        private By Register =(By.xpath ("//a[@href='/register']"));
	    private By Signin=(By.xpath("//a[@href='/login']"));
		

		
     
	public HomePage(WebDriver driver) {
     this.driver = driver; 
     
     
	}

	public void get(String URL) {
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	public void getstartedbutton (){
		driver.findElement(GetStartedButton).click();
		System.out.println("hello");
	}
	/*public void datastructuredropdown (){
		driver.findElement(Dropdown).isDisplayed();
		WebElement element = driver.findElement(Ddownmenu);
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
		List<WebElement>items =driver.findElements(DdownArray);
		for(WebElement myitem:items) {
			
			
			if(myitem.getAttribute(null).contains("Array"))
			{
				myitem.click();
				break;
			}
		System.out.println("welcome");		
		}
}*/
	
	public void getErrorMessage() {
	   driver.findElement(errorMessage).getText();
	   
	   System.out.println( driver.findElement(errorMessage).getText());
	}

	public void DataStructuredropdown() {
		driver.findElement(Dropdown).click();
	}
			
			public void Ddownmenu() 
			throws InterruptedException {
		
			driver.findElement(Ddownmenu).click();
		     Thread.sleep(2000);
		driver.findElement(errorMessage).getText();
		
		   System.out.println( driver.findElement(errorMessage).getText());
		   
		   
		driver.findElement(DdownArray).click();
		 driver.findElement(errorMessage).getText();
		
		   System.out.println( driver.findElement(errorMessage).getText());
		   Thread.sleep(2000);
		 
		 driver.findElement(DdownLinkedlist).click();
		 driver.findElement(errorMessage).getText();
		 
		   System.out.println( driver.findElement(errorMessage).getText());
		   Thread.sleep(2000);
		 
		 
		 driver.findElement(Ddownstack).click();
		 driver.findElement(errorMessage).getText();
		
		   System.out.println( driver.findElement(errorMessage).getText());
		   Thread.sleep(2000);
		 
		 
		 driver.findElement(DdownQueue).click();
		 driver.findElement(errorMessage).getText();
		
		 System.out.println("4 you are not logged in");
		 Thread.sleep(2000);
		 
		 driver.findElement(Ddowntree).click(); 
	
		 driver.findElement(errorMessage).getText();
		 System.out.println("5 you are not logged in");
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(Ddowngraph).click();
		 driver.findElement(errorMessage).getText();
	
		 System.out.println("5 you are not logged in");
		 Thread.sleep(2000);
		 	
	}
	
	public void Datastructuregetstrated() throws InterruptedException {
		driver.findElement(DataStructuregetstart).click();
		Thread.sleep(2000);
		
		driver.findElement(Arraygetstart).click();
		 driver.findElement(errorMessage).getText();
		Thread.sleep(2000);
		
		driver.findElement(LinkedListgetstart).click();
		 driver.findElement(errorMessage).getText();
		Thread.sleep(2000);
		
		driver.findElement(Queuegetstart).click();
		 driver.findElement(errorMessage).getText();
		Thread.sleep(2000);
		
		driver.findElement(Stackgetstart).click();
		 driver.findElement(errorMessage).getText();
		Thread.sleep(2000);
		
		driver.findElement(Treegetstart).click();
		 driver.findElement(errorMessage).getText();
		Thread.sleep(2000);
		
		driver.findElement(Graphgetstart).click();
		 driver.findElement(errorMessage).getText();
		Thread.sleep(2000);
	}
	
	public void RegistrationPage() {
		driver.findElement(Register).click();
	}

	public void Signin() {
		driver.findElement(Signin).click();
	}

	public void alertmessage() {
		 driver.findElement(errorMessage).getText();
		
	}

	
		



		
	


	}

	
	