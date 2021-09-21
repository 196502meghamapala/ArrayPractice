package com.bit.support;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionWithSelenium {
	

	WebDriver  dr;
	
	@Before
	public void openBrowser() throws InterruptedException {
	       System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-workspace/bittechproject/chromedriver");
	       dr = new ChromeDriver();
	       dr.manage().window().maximize();
           dr.get("https://www.target.com/");
	   }
	
	@Test
	//single statement: when we want to check any condition then perform action
      public void xp(By by, String expectedText) {
		
		String actualText = dr.findElement(by).getText().toLowerCase();
		
		if(actualText == expectedText.toLowerCase()) {
			dr.findElement(by).click();
		}
		
		else {
			System.out.println("Element could not be clisked " + by);
		}
	}
	
	@After
	   public void tearDown() {
		   dr.quit();
	   }
		

}
