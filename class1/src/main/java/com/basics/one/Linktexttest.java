package com.basics.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktexttest {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.bigcommerce.com/login");
		Thread.sleep(2000);
		//link text and partial link text
		//driver.findElement(By.linkText("Log in with SSO")).click();
		driver.findElement(By.partialLinkText("gmail")).click();
		
		
		
	}

}
