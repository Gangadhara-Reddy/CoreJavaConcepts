package stepDefinations;

import Base.TestBase;
import Pages.firstTimeRegistrationPage_Step1;
import Pages.firstTimeRegistrationPage_Step2;
import Pages.loginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps extends TestBase{
	
	@Before
	public void beforeMethod(){
		System.out.println("Executing before method");
	}

	@After
	public void afterMethod(){
		driver.close();
		
	}
	private loginPage lp;
	private firstTimeRegistrationPage_Step1 step1;
	private firstTimeRegistrationPage_Step2 step2;
	
	@Given("^Launch \"([^\"]*)\" on \"([^\"]*)\" browser$")
	public void launch_on_browser(String appURL, String browserType) throws Throwable {
		launchUrl(appURL,browserType);
		lp=new loginPage(getDriver());
	}

	@When("^I click on Register for Online Banking button on login page$")
	public void i_click_on_Register_for_Online_Banking_button_on_login_page() throws Throwable {
		System.out.println(TestBase.getDriver().getTitle());
		step1=lp.btnRegisterForOnlineBankingButton();
	}
	@When("^select Hong Leong Credit Card option$")
	public void select_Hong_Leong_Credit_Card_option() throws Throwable {
		step1.clickOnCreditCard();
	}

	@When("^I click on Register Now button from first step$")
	public void i_click_on_Register_Now_button_from_first_step() throws Throwable {
		step2=step1.clickOnregisterButton();
	}

	@When("^I select Verification ID on second step$")
	public void i_select_Verification_ID_on_second_step() throws Throwable {
		step2.selectVerificationID();
	}
	
	@When("^I enter any \"([^\"]*)\" in principal card number field$")
	public void i_enter_any_in_principal_card_number_field(String pcbNum) throws Throwable {
		step2.enterPCBNum(pcbNum);
		Thread.sleep(1000);
	}

	@When("^I enter any \"([^\"]*)\" in temporary id field$")
	public void i_enter_any_in_temporary_id_field(String tempIDNum) throws Throwable {
		step2.enterTempIDNum(tempIDNum);
		Thread.sleep(1000);
	}

	@When("^I select any \"([^\"]*)\"$")
	public void i_select_any(String idName) throws Throwable {
		step2.selectIdType(idName);
		Thread.sleep(1000);
	}

	@When("^I enter any \"([^\"]*)\" in ID number field$")
	public void i_enter_any_in_ID_number_field(String idNum) throws Throwable {
		Thread.sleep(1000);
		step2.enterIdNum(idNum);
	}

	@When("^I enter \"([^\"]*)\" and click on next button$")
	public void i_enter_and_click_on_next_button(String captcha) throws Throwable {
		step2.enterCaptchAndClickNxtBttn(captcha);
	}

	@Then("^validate the user friendly message on the current step$")
	public void validate_the_user_friendly_message_on_the_current_step() throws Throwable {
		step2.verfyCaptchErrMssg();
	}
		
	@Then("^I should be able to find the user friendly message$")
	public void i_should_be_able_to_find_the_user_friendly_message() throws Throwable {
		step2.verifyUsrFndlyMsgs();
	}
}
