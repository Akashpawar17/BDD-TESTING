package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="Features/registerScenarioOutline.feature",glue = {"com.stepdefinition"},plugin = {"pretty","html:target-output","json:json_destination/cucumber-report","junit:junit_xml/cucumber.xml"},monochrome = true)
public class RunnerTest {
	
	
	

}
