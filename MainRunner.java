package CucumberFramework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	features= {"src/test/java/CucumberFramework/features"},
	glue = {"CucumberFramework.steps"},
	monochrome = true,
	plugin = {"pretty", "html:target/cucumber", 
			"json:target/cucumber.json", 
			"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"
			}

	)

public class MainRunner {

}
