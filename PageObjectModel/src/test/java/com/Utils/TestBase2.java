package com.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class TestBase2 implements Setup2 {
	WebDriver driver;
	
	@BeforeMethod
	public WebDriver invokeBrowser() {
		System.setProperty(CHROMEDRIVER_KEY,CHROMEDRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public void launchURL() {
		driver.get(BASE_URL);
		
	}
	@AfterClass
	public void finish() {
		driver.quit();
	}
		
}
