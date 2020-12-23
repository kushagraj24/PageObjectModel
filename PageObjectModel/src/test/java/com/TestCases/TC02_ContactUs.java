package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FetchData.BeanFactory2;
import com.FetchData.CreateUserBean2;
import com.Pages.CustomerServicePage2;
import com.Pages.LandingPage2;
import com.Utils.TestBase2;

public class TC02_ContactUs extends TestBase2 {
	WebDriver driver;
	LandingPage2 landingPage;
	
	@BeforeMethod
	public void setUp() {
		driver = invokeBrowser();
		launchURL();
		landingPage = new LandingPage2(driver);
		
		
	}
	
	@Test
	public void contactUs() {
		CustomerServicePage2 cs2 = landingPage.clickContactUs();
		CreateUserBean2 bean =new CreateUserBean2();
		BeanFactory2 factory = new BeanFactory2();
		factory.setDataForNewUser(bean);
		cs2.createNewUser(bean);
		
	}

}
