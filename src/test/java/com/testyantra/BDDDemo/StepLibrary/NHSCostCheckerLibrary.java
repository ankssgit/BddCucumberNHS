package com.testyantra.BDDDemo.StepLibrary;

import org.apache.log4j.Logger;

import com.testyantra.BDDDemo.Pages.PageRepository;
import com.testyantra.BDDDemo.Utilities.BaseStep;
import com.testyantra.BDDDemo.Utilities.CommonUtility;

import bsh.This;
import gherkin.lexer.Pa;

public class NHSCostCheckerLibrary extends BaseStep {
	CommonUtility utils=new CommonUtility();
	Logger log=Logger.getLogger(this.getClass().getName());
	String country;
	
	public String getCountyName(String arg1) throws Exception
	{
		log.info("The person belongs from "+arg1);
		country=arg1;
		return country;
	}
	
	public void openSurveyLink() throws Exception
	{
		//utils.Click(PageRepository.feedback_btn);
		//utils.ClickFE(PageRepository.feedback_btn,driver);
		utils.scrollToElement();
		utils.verifyIsElementVisible(PageRepository.StartButton);
		utils.Click(PageRepository.StartButton);
	}

	
	public void sUrveyInputsPages() throws Exception
	{
		if(getCountyName(country).equalsIgnoreCase("Wales"))
		//utils.scrollToElement(PageRepository.WalesCountry);
		utils.Click(PageRepository.WalesCountry);
		utils.Click(PageRepository.NextBtn);
		utils.enterText(PageRepository.dobDay_field, "13");
		utils.enterText(PageRepository.dobMonth_field, "09");
		utils.enterText(PageRepository.dobYear_field, "1992");
		utils.Click(PageRepository.NextBtn);
		utils.Click(PageRepository.radio_btn);
		utils.Click(PageRepository.NextBtn);
		utils.Click(PageRepository.radio_btn);
		utils.Click(PageRepository.NextBtn);
		utils.Click(PageRepository.uc_YesBtn);
		utils.Click(PageRepository.NextBtn);
		utils.Click(PageRepository.radio_btn);
		utils.Click(PageRepository.NextBtn);
		utils.Click(PageRepository.radio_btn);
		utils.Click(PageRepository.NextBtn);
		
		/*utils.Click(PageRepository.taxCredit_Btn);
		utils.Click(PageRepository.NextBtn);
		utils.Click(PageRepository.radio_btn);
		utils.Click(PageRepository.NextBtn);
		utils.Click(PageRepository.radio_btn);
		utils.Click(PageRepository.NextBtn);*/
	}
	
	
	public void nhsSurveyOutput() throws Exception
	{
		utils.scrollToElement();
		String op=utils.getPageElement(PageRepository.done_panel).getText();
		log.info("Based on Survey the Output is ");
		log.info(op);
	}
}
