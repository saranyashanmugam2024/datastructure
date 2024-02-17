package StepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.HomePage;
import io.cucumber.java.en.*;

public class HomePageSteps{
	
	
	WebDriver driver;
	public static HomePage home;
	

	String URL = "https://dsportalapp.herokuapp.com/";
	
	

	@Given("I have opened the Web browser")
	public void i_have_opened_the_web_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 home = new HomePage(driver);
			driver.get(URL);
	}
	   
	

	@When("I give DS Algo  portal URL")
	public void i_give_ds_algo_portal_url() {
	   
	}

	@Then("I get navigated to the mainpage")
	public void i_get_navigated_to_the_mainpage() {
	    
	}

	@Then("I see the {string} button")
	public void i_see_the_button(String string) {
	    
	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {
		 home.getstartedbutton();
	}

	@Then("I should be navigated to the homepage of DS Algo")
	public void i_should_be_navigated_to_the_homepage_of_ds_algo() {
	   
	}

	@Given("I am on  Homepage")
	public void i_am_on_homepage() {
	    
	}

	@Given("I have not logged in")
	public void i_have_not_logged_in() {
	   
	}

	@When("I click on the {string} dropdown button")
	public void i_click_on_the_dropdown_button(String string) throws InterruptedException {
		 home.DataStructuredropdown();
	}

	@Then("I should see six different Data Structure entries")
	public void i_should_see_six_different_data_structure_entries() {
	   
	}

	@When("I click on each entry")
	public void i_click_on_each_entry() throws InterruptedException {
	 home.Ddownmenu();
	
	}

	@Then("I should get error message {string}")
	public void i_should_get_error_message(String string) throws InterruptedException { 
        home.getErrorMessage();
        Thread.sleep(3000);
	}

	@Given("I am on the Homepage")
	public void i_am_on_the_homepage() {
	    
	}

	@When("I click on the {string} button under {string} description")
	public void i_click_on_the_button_under_description(String string, String string2) throws InterruptedException {
		 home.Datastructuregetstrated();
	    
	}

	@Then("I should see error message {string}")
	public void i_should_see_error_message(String string) {
		
		home.getErrorMessage();
	    	}

	@Then("I click the {string} button under {string},{string},{string},{string},{string} and {string}")
	public void i_click_the_button_under_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
	    home.Datastructuregetstrated();
	    Thread.sleep(3000);
	}

	@Then("I should get the error message \"You are not logged in'")
	public void i_should_get_the_error_message_you_are_not_logged_in() throws InterruptedException {
		home.alertmessage();
		Thread.sleep(3000);
	   	}

	@Given("I am on the DsAlgo homepage")
	public void i_am_on_the_ds_algo_homepage() {
	    
	}

	@When("I click on the {string} link on the home")
	public void i_click_on_the_link_on_the_home(String string) {
		
		home.RegistrationPage();
	    	}

	@Then("I should be taken to the Registration page")
	public void i_should_be_taken_to_the_registration_page() {
	    
	}

	@Given("I am on the Ds Algo mainhomepage")
	public void i_am_on_the_ds_algo_mainhomepage() {
	    
	}

	@Given("I click on the {string} link")
	public void i_click_on_the_link(String string) {
	  home.Signin(); 
	}

	@Then("I should be taken to the Sign-in page")
	public void i_should_be_taken_to_the_sign_in_page() {
	   
	}

}
