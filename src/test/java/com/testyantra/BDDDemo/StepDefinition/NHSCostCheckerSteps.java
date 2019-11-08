package com.testyantra.BDDDemo.StepDefinition;

import org.apache.log4j.Logger;

import com.testyantra.BDDDemo.StepLibrary.NHSCostCheckerLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NHSCostCheckerSteps extends NHSCostCheckerLibrary {
	
	Logger log=Logger.getLogger(this.getClass().getName());
	@Given("^I am a person from \"([^\"]*)\"$")
	public void user_County(String arg1) throws Throwable
	{
		log.info("Person belongs from "+arg1);
		getCountyName(arg1);
	}
	
	@When("^I put my circumstances into the checker tool$")
     public void checkerTool() throws Throwable
     {
		openSurveyLink();
		sUrveyInputsPages();
     }
	
	@Then("^I should get a result of whether i will get Help or Not$")
	 public void checkUserTreatment() throws Throwable
	 {
		nhsSurveyOutput();
	 }
}
