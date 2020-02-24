package com.basics.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_test {

	
	WebDriver driver;
	
	@Test(threadPoolSize =3, invocationCount = 2, timeOut=7000)
	public void openbrowser1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		System.out.println(Thread.currentThread().getId());		
		
	}
		
	@Test
	public void openbrowser2() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.howstuffworks.com/");
		System.out.println(Thread.currentThread().getId());		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
