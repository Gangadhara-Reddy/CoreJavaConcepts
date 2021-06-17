package stepDefinations;

import Base.TestBase;
import POMPages.LoginPage;
import Utilities.browsers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginPageSteps extends TestBase{

	public LoginPage login=null;
	
	public loginPageSteps() {
//		// TODO Auto-generated constructor stub
//		init(browsers.chrome, "https://www.google.com");
//		login=new LoginPage(driver);
		System.out.println("loginsteps method");
	}

	@Given("^User navigated to the application$")
	public void user_navigated_to_the_application() throws Throwable {
//		loginpage lgin = new loginpage();
//		loginpage.login();
//		
//		init(browsers.chrome, "https://www.google.com");
//		login=new LoginPage(driver);
		System.out.println("method1");
	}

	@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\" in mentioned fields$")
	public void user_enters_and_in_mentioned_fields(String arg1, String arg2) throws Throwable {
//		login.enterCredeil(arg1, arg2);
		System.out.println("method2");
	}

	@When("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
//		login.cliskce();
		System.out.println("method3");
	}

	@Then("^User should be displayed with home page$")
	public void user_should_be_displayed_with_home_page() throws Throwable {
//		login.cliskce();
		System.out.println("method4");
	}


}
