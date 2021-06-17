package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	@Before()
	public void setup() {
		System.out.println("Launchign browser");
	}
	@After()
	public void tearDown() {
		System.out.println("driver.quit()");
	}
	
	@Before("@prod")
	public void setupProd() {
		System.out.println("Launchign browser for production");
	}
	@After("@prod")
	public void tearDownProd() {
		System.out.println("driver.quit() for production");
	}
	
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
		System.out.println("@Given---user navigates to Facebook.com");
	   
	}
	
	
	
	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
		System.out.println("@Wehn----user validated the home page title");
	}

	@Then("^user entered the username$")
	public void user_entered_the_username() throws Throwable {
	   System.out.println("@Then---User entered the username");
	}

	@And("^user entered the password$")
	public void user_entered_the_password() throws Throwable {
		System.out.println("@And---User entered the password"); 
	}

	@Then("^user should be successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
		
		System.out.println("@Then---User should be successfully Logged in");
	    
	}
}
