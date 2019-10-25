package com.testyantra.BDDDemo.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseStep {
	
	public WebDriver driver;
	
	
	public void OpenApp()
	{
	System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");	
	//driver=new ChromeDriver();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	}

}
