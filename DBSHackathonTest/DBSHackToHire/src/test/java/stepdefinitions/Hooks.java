package stepdefinitions;

import Helpers.Browsers;
import base.TestBase;
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
