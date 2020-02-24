package com.basics.one2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Proxy_authentication {
	
	@Test
	public void proxyauth() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\J\\Selenium\\Auto_IT_script\\proxyscript.exe");
	}

}
