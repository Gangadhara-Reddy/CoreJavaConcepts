package stepDefinations;

import org.openqa.selenium.WebDriver;

import Base.TestBase;
import Helpers.Browsers;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase{

	@Before
	public void beforeMethod() {
		init(Browsers.chrome,"https://www.google.com");
	}
	
	@After
	public void afterMEthod() {
		driver.quit();
	}
}
