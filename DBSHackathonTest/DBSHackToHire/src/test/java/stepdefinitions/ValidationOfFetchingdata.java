package stepdefinitions;

import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidationOfFetchingdata {

@When("^we Select Stock from the dropdown$")
public void we_Select_Stock_from_the_dropdown() throws Throwable {
	System.out.println("Selected equity from dropdown");
	
}

@When("^we Select date from the dropdown$")
public void we_Select_date_from_the_dropdown() throws Throwable {
	System.out.println("Selected date from dropdown");
}

@When("^click on review$")
public void click_on_review() throws Throwable {
   
}

@Then("^stock name in the report should be the name we selected from application$")
public void stock_name_in_the_report_should_be_the_name_we_selected_from_application() throws Throwable {
    
}


}
