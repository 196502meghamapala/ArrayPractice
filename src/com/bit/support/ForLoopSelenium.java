package com.bit.support;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForLoopSelenium {
	
	WebDriver  dr;
	
	@Before
	public void openBrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-workspace/bittechproject/chromedriver");
	dr = new ChromeDriver();
	dr.manage().window().maximize();
    dr.get("https://www.target.com/");
	}
	
	@Test
	public void menuOpen() throws Exception {
	List<WebElement> ele = dr.findElements(By.xpath("//div[@id='header']//ul[contains(@class,'ddcsEN')]/li"));
	
	int eleSize = ele.size();
	
	for(int j=1; j<=eleSize; j++) {
		dr.findElement(By.xpath("//div[@id='header']//ul[contains(@class,'ddcsEN')]/li["+j+"]/a")).click();
		Thread.sleep(3000);

		System.out.println(dr.getTitle());
		dr.navigate().back();
		
	}
	}
	
	
	
	
	
		@After
		public void tearDown() {
		dr.quit();
	}
}


