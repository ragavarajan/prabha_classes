package com.basics.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Keyword_base {


	WebDriver driver;

	public WebDriver initiate(String browser1)
	{
		if(browser1.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}

		else if(browser1.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\J\\Selenium\\Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}

		else if(browser1.contains("explorer"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\J\\Selenium\\Jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			
		}
		return driver;



	}








}
