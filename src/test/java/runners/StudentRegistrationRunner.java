package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	
@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/java/features/" }, 
glue = {"com.Jotform.Registration.stepFunctions" }, 
monochrome = true, tags = {"@test"}) 
	
public class StudentRegistrationRunner extends AbstractTestNGCucumberTests {

}


