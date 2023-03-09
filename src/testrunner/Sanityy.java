package testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/feature",
		glue= {"stepdefinition"},
		plugin= {"html:reporting/cucumberHTMLReports/Sanityy",}
	)
public class Sanityy{
		
	}


