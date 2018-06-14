package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		//create driver object
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://etsy.com");
		
	}
}
