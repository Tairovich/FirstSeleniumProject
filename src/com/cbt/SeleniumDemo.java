package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		//set system properties
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\selenium dependencies\\drivers\\geckodriver.exe");
		
		//create driver object
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
	}
	
	
}
