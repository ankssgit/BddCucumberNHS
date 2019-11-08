package com.testyantra.BDDDemo.Utilities;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseStep {
	
	public static WebDriver driver;
	
	public void log4jint()
	{
	PropertyConfigurator.configure("log4j.properties");
	}
	public void OpenApp()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\BddCucumberNHS\\chromedriver.exe");	
	driver=new ChromeDriver();
	//driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	}

}
