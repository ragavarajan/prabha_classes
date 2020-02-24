package com.basics.one2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandleSSL_chrome {
	
	@Test
	public void ssltest()
	{
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
		
		ChromeOptions opt = new ChromeOptions();
		opt.merge(cap);
		*/
		
		
		/*ChromeOptions opt = new ChromeOptions();
		opt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://devloper:heymagento@demo-magento.enterpriseapplicationdevelopers.com:1065");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		//driver.get("https://revoked.grc.com/");
	}
	
	
	

}

/*
https://demo-magento.enterpriseapplicationdevelopers.com:1065
https://revoked.grc.com/
https://untrusted-root.badssl.com/
https://expired.badssl.com/
https://wrong.host.badssl.com/
https://cacert.org
*/