package com.testyantra.BDDDemo.Trigger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//import com.spicejet.utilities.BaseClass;
import com.testyantra.BDDDemo.Utilities.BaseStep;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



 @CucumberOptions(features = "src/main/java/com.testyantra.BDDDemo.features",
			glue = {"com.testyantra.BDDDemo.StepDefinition","com.testyantra.BDDDemo.Trigger"}, monochrome = true, plugin = {
					"pretty", "html:target/Report/cucumber",
					"json:target/cucumber/report.json",
					"usage:target/cucumber/cucumber-usage.json",
					"com.cucumber.listener.ExtentCucumberFormatter:"},
			tags= "@NHSCostChecker")
public class Runner extends AbstractTestNGCucumberTests {

BaseStep base =new BaseStep();
	 public static String reportFilePath;
  
  
    @BeforeTest
  public void setup() throws Exception
    {
	/*reportFilePath = "./ExtentReport.xml" + File.separator + "output"
			+ File.separator + this.getClass().getSimpleName();
	File path = new File(reportFilePath);
	if (path.exists()) 
	{
		FileUtils.deleteDirectory(new File(reportFilePath));
	}
	base.reportSetup(reportFilePath + File.separator + "report.html");	*/
	
	base.OpenApp();
   	} 
    
    @AfterTest
       public void closeApplication()
      {
	     base.driver.close();
		//Reporter.loadXMLConfig(new File("./ExtentReport.xml"));
		//Reporter.setSystemInfo("user", System.getProperty("user.name"));
		//Reporter.setSystemInfo("os", System.getProperty("MAC OSX"));
		
       }
                                                                         }
	
	

