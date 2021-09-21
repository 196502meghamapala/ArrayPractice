package com.bit.support;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class9Part3 {
	
ChromeDriver dr;
	
	//while
	//do while
	//for
	//for each OR enhanced
	int a = 1;
	int b = 5;
	
	@Test
	public void whileLoop() {
		//while loop always check the condition then perform the action. 
		//as long as the condition is true, loop will continue 
		
		while(a < b) {
			System.out.println(a);
			a++;
		}
		
	}
	
	public void doWhileLoop() {
		//do while loop will do the action at least once then check the condition 
		//as long as the condition is true, loop will continue 
		
		do{
			System.out.println(a);
			a++;
		}
		while(a < b);
		
	}
	
	@Test
	public void forLoop() throws InterruptedException {
		//there are 4 steps in for loop 
		//initialization, condition, action, increment/decrement 
		
		int c = 3;
		int i;
		
		for(i=1; i<c; i++) {
			System.out.println(i);
			
		}
		System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-workspace/bittechproject/chromedriver");
		dr = new ChromeDriver();
		dr.get("https://www.target.com/");
		Thread.sleep(5000);
		List<WebElement> ele = dr.findElements(By.xpath("//div[@id='header']//ul[contains(@class,'ddcsEN')]/li"));
		
		int eleSize = ele.size();
		
		for(int j=1; j<=eleSize; j++) {
			dr.findElement(By.xpath("//div[@id='header']//ul[contains(@class,'ddcsEN')]/li["+j+"]/a")).click();
			System.out.println(dr.getTitle());
			dr.navigate().back();
			Thread.sleep(3000);
		}
	}
	
	//==============================================================================================
	//need rto verify 
	public void clickOnAnyListOfLinkAndGetTitle(By by, By dropdownBox) throws InterruptedException {
		
		List<WebElement> ele = dr.findElements(by);
		
		int eleSize = ele.size();
		
		for(int j=1; j<=eleSize; j++) {
			dr.findElement(by).click();
			elementDisplay(dropdownBox);
			System.out.println(dr.getTitle());
			dr.navigate().back();
			Thread.sleep(3000);
		}
	}

	@Test
	public void selectFomDropDown(By SignUpButton, By dropDown) { 
		System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-workspace/bittechproject/chromedriver");
		dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");

		dr.findElement(SignUpButton).click();
		
		Select s = new Select(dr.findElement(dropDown));
		int x = s.getOptions().size();
		s.selectByIndex(x-1);
		
		for(int i=0; i<x; i++) {
			s.selectByIndex(i);
		}
		
	}
	//====================================================================================================
	@Test
	public void getAllTheLinks() {
		System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-workspace/bittechproject/chromedriver");
		dr = new ChromeDriver();
		dr.get("https://www.target.com/");
		
		List<WebElement> e = dr.findElements(By.tagName("a"));
		
		System.out.println("Size of the list is: " + e.size());
		
		for(WebElement p:e)  {
			String w = p.getText();
			System.out.println(w);
		}
		
		
	}
	
	

}
