package com.harish.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		features= {"Feature"}, // folder name of feature file
		glue= {"com.harish.stepdefination"}, // package name of step def class
		plugin= {"pretty","html:target/cucumber-report.html"}, // report
		monochrome = true,
		tags = "@DataDriven"
		
		)

public class TestRunner {

}
