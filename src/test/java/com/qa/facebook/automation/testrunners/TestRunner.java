package com.qa.facebook.automation.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="./src/test/resources/AppFeatures",
		glue = {"com.qa.automation.stepdefinitions","com.qa.facebook.automation.apphooks"},
		tags = "@RegressionTest",
		monochrome = true,
		plugin = {"pretty","json:target/json-report/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	//testing git repooioriyory
		)

public class TestRunner {

}
