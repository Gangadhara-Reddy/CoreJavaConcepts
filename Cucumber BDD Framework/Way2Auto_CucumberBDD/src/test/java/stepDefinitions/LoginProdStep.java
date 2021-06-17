package stepDefinitions;

import cucumber.api.java.en.Then;

public class LoginProdStep {
	@Then("^user validates the captcha image$")
	public void user_validates_the_captcha_image() throws Throwable {
	    System.out.println("@And---user validates the captcha image");
	}
}
