package com.bit.support;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	
	WebDriver driver;
	
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-workspace/bittechproject/chromedriver");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	@Test
    public void clickOnAnyListOfLinkAndGetTitle(By by, By dropdownBox) throws InterruptedException {
		
		List<WebElement> ele = driver.findElements(By.xpath("//*[@id=\"searchDropdownBox\"]/option[1]"));
		
		int eleSize = ele.size();
		
		for(int j=1; j<=eleSize; j++) {
			driver.findElement(by).click();
			elementDisplay(dropdownBox);
			System.out.println(driver.getTitle());
			driver.navigate().back();
			Thread.sleep(3000);
		}
	}
    @Test
    public boolean elementDisplay(By by) {
	
	WebElement e = driver.findElement(by);
	
	if(e.isDisplayed()) {
		return true;
	}else {
		System.out.println("Element is not displayed");
		return false;
	}
    }

  /*  @Test

    public void clickOnEle(By by) {
	
	if(elementDisplay(by)) {
		driver.findElement(by).click();
	}
	else {
		System.out.println("Element could not be clicked " + by);
	}
	
} */

    @After
    public void tearDown() {
	driver.quit();
    }

    }
