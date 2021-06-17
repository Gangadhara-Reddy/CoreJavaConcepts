package stepdefinitions;

import org.openqa.selenium.WebDriver;

import POMPages.LoginPage;
import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	private WebDriver driver;
	private LoginPage login=null;
	
	public LoginTest() {
		this.driver = TestBase.getDriver();
		login=new LoginPage(driver);
	}

	
	@Given("^User navigated to the application$")
	public void user_navigated_to_the_application() throws Throwable {
		System.out.println("@Given---user navigaes to facebook.com");
		login.login();

	}

	@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\" in mentioned fields$")
	public void user_enters_and_in_mentioned_fields(String arg1, String arg2) throws Throwable {
		System.out.println("@When--user validates the homepage title");
		login.enterCredeil(arg1, arg2);
		

	}

	@When("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		System.out.println("@Then-User entered the username");
		login.cliskce();

	}

	@Then("^User should be displayed with home page$")
	public void user_should_be_displayed_with_home_page() throws Throwable {
		System.out.println("@And---user entered the password");
		login.cliskce();

	}


}
