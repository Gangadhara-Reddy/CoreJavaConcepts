package POMPages;

import org.openqa.selenium.WebDriver;

import Base.TestBase;
import Locators.loginPageLocators;

public class LoginPage implements loginPageLocators{

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login() {
		driver.findElement(searchLoc).sendKeys("Jaqueline");
		driver.findElement(searchBUtton).click();
	}
	
	public void enterCredeil(String val1,String val2) {
		System.out.println(val1);
		System.out.println(val2);
	}
	
	public void cliskce() {
		System.out.println("performed this action");
	}

}
