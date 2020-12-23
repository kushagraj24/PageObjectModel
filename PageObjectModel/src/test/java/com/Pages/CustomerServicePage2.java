package com.Pages;

import org.openqa.selenium.WebDriver;

import com.FetchData.CreateUserBean2;
import com.ObjectRepository.CustomerServicePageProperties2;
import com.Utils.WebDriverUtils2;

public class CustomerServicePage2 extends WebDriverUtils2 implements CustomerServicePageProperties2{
	WebDriver driver;

	public CustomerServicePage2(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public void chooseHeadLine(CreateUserBean2 bean) {
		selectItemFromDropdown(HEADLINE_LOCATOR, bean.getHeadLine());
	}
	public void enterEmailAddress(CreateUserBean2 bean) {
		enterText(EMAIL_LOCATOR, bean.getEmailAddress());
	}
	public void enterorderReference(CreateUserBean2 bean) {
		enterText(ORDER_REFERENCE_LOCATOR, bean.getOrderReference());
	}
	public void enterMessage(CreateUserBean2 bean) {
		enterText(MESSAGE_LOCATOR, bean.getMessage());
	}
	
	public void clickSend() {
		clickElement(SUBMIT_LOCATOR);
	}
	
	public void createNewUser(CreateUserBean2 bean) {
		chooseHeadLine(bean);
		enterEmailAddress(bean);
		enterorderReference(bean);
		enterMessage(bean);
		clickSend();
	}
}
