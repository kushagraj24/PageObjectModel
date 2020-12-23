package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleRun {
	@Test
	public void method1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
