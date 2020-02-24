package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_testng {
	
	WebDriver driver;
	String baseurl = "https://www.google.com";
	
	@BeforeTest
	public void openbrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		Thread.sleep(3000);
		System.out.println("one");
	}
	
	@Test
	public void enterdata()
	{
		System.out.println("two");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		System.out.println("three");
	}
	
	
	
	/*@AfterTest
	public void quitbrowser()
	{
		driver.quit();
	}*/
	
	
	
	
	
	
	
	

}
