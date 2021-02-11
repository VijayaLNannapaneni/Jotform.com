package com.Jotform.Registration.stepFunctions;

import java.io.IOException;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Jotform.Registration.utils.DriverFactory;
import com.Jotform.Registration.utils.PageInitialization;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentRegistrationStepDef extends DriverFactory {
	
	@Given("The student navigates to registration page on chrome browser")
	public void student_navigates_to_registration_page()  {
	    pageInits.studentRegForm.loadStudentRegistrationPage();	   
	}
	@When("The student enters all the data")
	public void student_enters_the_data() {
	    pageInits.studentRegForm.enterStudentData();
	    System.out.println(" Finished entering student data ");
	}
	@And("The student submits the form ")
	public void student_submits_form() throws IOException, InterruptedException, IOException {
	    pageInits.studentRegForm.submitForm();
	    System.out.println(" Validated student'd first name, middle name and last name ");
	}
	@Then("Submission should be received")
	public void is_submission_received() {

	}

}
