package com.testyantra.BDDDemo.Utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonUtility extends BaseStep {
	
	WebDriverWait wait;
	Logger log=Logger.getLogger(this.getClass().getName());
	
	
	public WebElement getPageElement(String Object)
	{
		WebElement  ele = null;
		//WebDriverWait wait = null;
		String locatorvalue = null,locatorname = null;
	/*	char ch[]=Object.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if( ch[i]!='~')
			{
				locatorvalue=locatorvalue+ch[i];
			}
			else
			{
				break;
			}
		}
			 for(int i=0;i<=ch.length-1;i++)
			 {
		     if(ch[i]=='~')		
			   {
				for(int j=i+1;j<=ch.length-1;j++)
				{
				locatorname=locatorname+ch[j];
				}
			   }
		     }  */
		
		String[] s1 = Object.split("~");
		for(int i=0;i<=s1.length-1;i++)
		{
			locatorvalue=locatorvalue+s1[0];
			locatorname=locatorname+s1[s1.length-1];  //s1[1]
		}
		locatorname.toUpperCase();
		try {
		switch(locatorname.toUpperCase())
		{
		
		
		case "CSS":
			ele = wait.until(ExpectedConditions
					.presenceOfElementLocated(By
							.cssSelector(locatorvalue)));
			break;
		case "XPATH":
			ele = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(locatorvalue)));
			break;
		case "ID":
			
				ele = wait.until(ExpectedConditions
						.presenceOfElementLocated(By.id(locatorvalue)));
			
			break;
		case "NAME":
			ele = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.name(locatorvalue)));
			break;
		case "LINKTEXT":
			ele = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.linkText(locatorvalue)));
			break;
		default:
			ele = wait
					.until(ExpectedConditions.presenceOfElementLocated(By
							.className(locatorvalue)));
			break;
		}
		
		
	} catch (Exception e) {
                e.printStackTrace();
	       }
	return ele;
		}
		
	
  
     public void Click(String PageObject) 
         {
	
	   getPageElement(PageObject).click();
	   
	     }   

 
     public void scrollToElement(String PageObject)
     
         {
    	 WebElement scrollableElement=getPageElement(PageObject);
    	 try {
    		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollableElement);
			Thread.sleep(500);
		     }
    	 catch (InterruptedException e) 
    	     {
			e.printStackTrace()	;					
             }
         }

   
     
     public void verifyIsElementVisible(String PageObject)
     {
    	 try
    	 {
    	 wait.until(ExpectedConditions.visibilityOf(getPageElement(PageObject)));
    	 log.info("The Element is Present");
    	 String ele=getPageElement(PageObject).getText();
    	 log.info("The Element is"+ele);
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     
     
     public void enterText(String PageObject,String text)
     {
    	 try
    	 {
    		 getPageElement(PageObject).sendKeys("text");
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     
     
     
     

}


