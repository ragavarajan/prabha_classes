package Runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "Feature2",
			glue= {"stepdefdata"},
			format = {"pretty","html:test-output","json:json_output/cucumber.json"},
			dryRun = false,
			monochrome = true,
			strict = false
			//tags = {"~@one","@three,@two"}
			// excludin(and, or)
			//And
			//or
			)
	
	
	public class Testrunner{
		
	}
	
	
	
	
	
	
	
	
	
	
	


