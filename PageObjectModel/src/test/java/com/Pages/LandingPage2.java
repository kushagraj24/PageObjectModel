package com.Pages;

import org.openqa.selenium.WebDriver;

import com.ObjectRepository.LandingPageProperties2;
import com.Utils.WebDriverUtils2;

public class LandingPage2 extends WebDriverUtils2 implements LandingPageProperties2 {
	WebDriver driver;
	
	public LandingPage2(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public CustomerServicePage2 clickContactUs() {
		clickElement(ContactUs_Locator);
		return new CustomerServicePage2(driver);
		
	}

	
	
}
