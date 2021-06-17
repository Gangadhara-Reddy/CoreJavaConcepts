package myRunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FunctionalTests",
					glue={"stepDefinations"},
					format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
					tags ={"@smoke"}, monochrome=true)
public class TestRunner {

}


/*// Test runner setup for testng
@CucumberOptions(features="src/test/resources/FunctionalTests",glue={"stepdefinations"})
@Test
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
*/
