package com.basics.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {

	static WebDriver driver;
	
	
	
	
	public static WebDriver openBrowser(String url)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
	
	
	
	
	
	
}
