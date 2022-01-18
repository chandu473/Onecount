package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features",
		glue = {"stepdefinitions"},
		snippets = SnippetType.CAMELCASE,
		plugin = {"html:target/reports/cucumber-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		//dryRun = true,
		tags = "@Azeem"
		
		)


public class TestRunner {

}
