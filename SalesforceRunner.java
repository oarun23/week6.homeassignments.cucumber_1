package home_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features = {"src/test/java/home_feature"},
	glue= {"home_steps"},
	publish = true,
	monochrome= true)
	public class SalesforceRunner extends AbstractTestNGCucumberTests {
	
	}
