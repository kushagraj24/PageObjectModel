package com.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils2 {
	WebDriver driver;
	
	public WebDriverUtils2(WebDriver driver) {
		this.driver = driver;
	}

	public void clickElement(By locator) {
		new WebDriverWait(driver , 30);
		driver.findElement(locator).click();
		
	}
	
	public void enterText(By locator , String TestData) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(TestData);
	}
	
	public void selectItemFromDropdown(By locator , String visibleText) {
		WebElement dropdownElement =driver.findElement(locator);
		Select s = new Select(dropdownElement);
		s.selectByVisibleText(visibleText);
	}
	
	public void selectItemFromDropdown(By locator , int index) {
		WebElement dropdownElement =driver.findElement(locator);
		Select s = new Select(dropdownElement);
		s.selectByIndex(index);
	}
}
