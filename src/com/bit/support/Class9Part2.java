package com.bit.support;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class9Part2 {
	
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
	//=============================================================================================
	
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
		System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
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
	//============================================
	
	@Test
	public void getAllTheLinks() {
		System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.get("https://www.target.com/");
		
		List<WebElement> e = dr.findElements(By.tagName("a"));
		
		System.out.println("Size of the list is: " + e.size());
		
		for(WebElement p:e) {
			String w = p.getText();
			System.out.println(w);
		}
		
		
	}
	
	
	
		//single statement: when we want to check any condition then perform action
		
		void xp(By by, String expectedText) {
			
			String actualText = dr.findElement(by).getText().toLowerCase();
			
			if(actualText == expectedText.toLowerCase()) {
				dr.findElement(by).click();
			}
			else {
				System.out.println("Element could not be clicked " + by);
			}
		}
		
		boolean elementDisplay(By by) {
			
			WebElement e = dr.findElement(by);
			
			if(e.isDisplayed()) {
				return true;
			}else {
				System.out.println("Element is not displayed");
				return false;
			}
		}
		
		void clickOnEle(By by) {
			
			if(elementDisplay(by)) {
				dr.findElement(by).click();
			}
			else {
				System.out.println("Element could not be clicked " + by);
			}
			
		}
		
		//===================================================================
		
		int a1 = 10;
		int b1 = 20;
		void addA1() {
			//easy way
			a1 = b1;
			System.out.println(a1);
		}
		
		
		@Test
		public void addA1Two() {
			int a1 = 10;
			int b1 = 20;
			//other way
			if(a1<b1) {
				while(a1 != b1) {
					a1++;
				}
				System.out.println("value of a1 1st while: " + a1);
			}
			else if(b1<a1) {
				while(a1!= b1) {
					a1--;
				}
				System.out.println("value of a1 2nd while : " + a1);
			}
			else {
				System.out.println("Both integer values are equal");
				System.out.println("else" + a1);
			}
			System.out.println("last sys " + a1);
		}
		
		//lets say we have a number from 1 to 100
		
		
		
		
	
	
	
	
	
	
	
	//--------------------------------

	public void targetSignIn() {

		boolean pageheader = dr.findElement(By.id("")).isDisplayed();
		String pagetitle = dr.getTitle();
		String pageUrl = dr.getCurrentUrl();
		String expectedUrl = "jhgjhglhgjy";

		if (pageheader) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		}

		if (pageheader) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		} else {
			System.out.println("Condition did not match");
		}

		if (pageheader || pagetitle.equals("srthertuert")) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		} else if (pagetitle.equals("srthertuert")) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		} else if (pageUrl == expectedUrl) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		} else {
			System.out.println("All conditions failed and Signed In manually");
			dr.get("https://www.target.com/login");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		}

	}

	public void targetSignIn2() {

		boolean pageheader = dr.findElement(By.id("")).isDisplayed();
		String pagetitle = dr.getTitle();
		String pageUrl = dr.getCurrentUrl();
		String expectedUrl = "jhgjhglhgjy";

		if (pageheader) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		}

		if (pageheader && pagetitle.equals("srthertuert")) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		}

		if (pageheader) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		}

		if (pageUrl == expectedUrl) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		}

		if (pagetitle.equals("srthertuert")) {
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).sendKeys("rwethw5th");
			dr.findElement(By.xpath("")).click();
		} else {
			System.out.println("Condition did not match");
		}

	}

	public void abs() {

		int a = 11;
		int b = 200;
		String s = "sup";

		if (1 > 2) {
			System.out.println("Janina");
		}

		if (1 < 2) {
			System.out.println("Janina");
		}

		if (true) {
			System.out.println("Janina");
		}

		if (false) {
			System.out.println("Janina");
		}

		if (1 == 2) {
			System.out.println("Janina");
		}

		if ("hi" == "Hi") {
			System.out.println("Janina");
		}

		if (a != b) {
			System.out.println("Janina");
		}
		if (a >= b) {
			System.out.println("Janina");
		}

		// Variables Definition and Initialization
		boolean bool1 = true, bool2 = false;

		// Logical AND
		System.out.println("bool1 && bool2 = " + (bool1 && bool2));

		// Logical OR
		System.out.println("bool1 || bool2 = " + (bool1 | bool2));

		// Logical Not
		System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));

		/*
		 * == equal to != not equal to > greater than >= greater than or equal to < less
		 * than <= less than or equal to
		 */
	}

	public void selectCurrentMonth() {

		int a = 5;
		String s = "hi";

		int month = 3;
		String monthString;
		
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			System.out.println("dfjhhjtu");
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		System.out.println(monthString);

	}

	public void selectMonth(String city) {
	
		switch (city.toLowerCase()) {
		case "bronx": {
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
			break;
		case "manhattan":
			System.out.println("");
			System.out.println("");
			System.out.println("");
			break;
		case "queens":
			System.out.println("");
			System.out.println("");
			System.out.println("");
			break;
		case "brooklyn":
			System.out.println("");
			System.out.println("");
			System.out.println("");
			break;
		case "staten island":
			System.out.println("");
			System.out.println("");
			System.out.println("");
			break;
		default:
			System.out.println("You are not from NYC");

		}

	}

	public void selectYourDOB(By xpath, By css, By id) {
		
		
		if(dr.findElement(xpath).isDisplayed()) {
			dr.findElement(By.xpath("rt")).click();
		}
		else if(dr.findElement(css).isDisplayed()) {
			dr.findElement(css).click();
		}
		else if(dr.findElement(id).isDisplayed()) {
			dr.findElement(id).click();
		}
		else {
			System.out.println("Failed : elemnt could not be clicked ");
		}
		
	}
	
	


}
