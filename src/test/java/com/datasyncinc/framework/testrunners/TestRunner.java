package com.datasyncinc.framework.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
			features = "src/test/resources/features",
			glue = "com.datasyncinc.framework.stepdefinations",
			plugin = {"pretty", "html:target/cucumber-reports.html"},
			tags = "@validloginTest"
		
		)

public class TestRunner {
	
	

}
