package apiTestsUsingBdd;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = {"features"},
		glue={"apiTestsUsingBdd"},
		//plugin = {"html:target/Report.html" }
		//dryRun = true,
		plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" },
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber", "json:target/cucumber.json" },
		
	    tags= "@test"

		)
public class TestRunner {

}
