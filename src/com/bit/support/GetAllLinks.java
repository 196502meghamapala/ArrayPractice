package com.bit.support;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllLinks {
	
    WebDriver  dr;
	
	@Before
	public void openBrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-workspace/bittechproject/chromedriver");
	dr = new ChromeDriver();
	dr.manage().window().maximize();
    dr.get("https://www.target.com/");
	}
	
	@Test
	public void getAllTheLinks() {
		List<WebElement> e = dr.findElements(By.tagName("a"));
		
		System.out.println("Size of the list is: " + e.size());
		
		for(WebElement p:e) {
			String w = p.getText();
			System.out.println(w);
		}
		
		
	}
	
	
 /*  @Test
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
   @Test
		
	public 	boolean elementDisplay(By by) {
			
			WebElement e = dr.findElement(by);
			
			if(e.isDisplayed()) {
				return true;
			}else {
				System.out.println("Element is not displayed");
				return false;
			}
		}
   
   @Test
		
	public	void clickOnEle(By by) {
			
			if(elementDisplay(by)) {
				dr.findElement(by).click();
			}
			else {
				System.out.println("Element could not be clicked " + by);
			}
			
		}*/
   
   @After
   public void tearDown() {
	   dr.quit();
   }
		
		//===================================================================
				
}
