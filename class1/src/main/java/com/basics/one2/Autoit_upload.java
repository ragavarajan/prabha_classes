package com.basics.one2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autoit_upload {

	@Test
	public void autoittest() throws Exception
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='file']")).click();
	Thread.sleep(3000);
	
	Runtime.getRuntime().exec("D:\\J\\Selenium\\Auto_IT_script\\script3.exe");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
}
