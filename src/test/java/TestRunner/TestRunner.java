package TestRunner;







import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import io.cucumber.testng.*;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature/06_LinkedlistPage.feature",
	
		glue ={"StepDefinition","linkedlistpagesteps.java","hooks"},
			//tags="@tag2",	
		//tags="@tag1",
		monochrome = true,
		plugin = {"pretty","html:target/Results.html",}
				//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				//"json:target/cucumber report/cucumber.json"}
					
		)


public class TestRunner{
//extends AbstractTestNGCucumberTests{

}
