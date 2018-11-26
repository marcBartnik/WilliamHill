package TestRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 * Class which run all tests from scenario.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",       //Specifies where the features files with test scenarios are stored
		glue = {"Tests"}            //Specifies where the tests are stored
		)
public class VegasCasinoTestRunner {

}
