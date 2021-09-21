package com.bit.support;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9 {
	

		ChromeDriver dr;
		
		@Test

		public void targetSignIn() {
			
		
			    System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-"
			    		+ "workspace/bittechproject/chromedriver");
				dr=new ChromeDriver(); 
			    dr.manage().window().maximize();
			    dr.manage().deleteAllCookies();
			    dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			    dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			    dr.get("https://www.Target.com/");
			   
			    

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

		public void switchstatement() {

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

		public void switchstatement2(String city) {

			switch (city) {
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
		@After
		public void tearDown() {
			dr.quit();
		}

		}

	


