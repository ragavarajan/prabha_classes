package com.basics.grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Desired_capabilitiestest {

	
	public static void main(String[] args) throws InterruptedException   {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
	
	
	
	ChromeOptions chrop = new ChromeOptions();
	chrop.addArguments("--disable-infobars");
	
	WebDriver driver = new ChromeDriver(chrop);
	driver.manage().window().maximize();
	
	driver.get("http://www.google.com");
	
	
	
	
	
	
	
	
	}
}
