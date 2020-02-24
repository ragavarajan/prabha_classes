package com.basics.pom2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.basics.pom1.Base_class;
import com.basics.pom1.LoginPage_class1;

public class Test_execution_class {

	
	WebDriver driver;
	LoginPage_class1 loginObject;
	
	@Test
	public void execute()
	{
		driver = Base_class.openBrowser("https://trail.targetbay.com");
		
		loginObject = new LoginPage_class1(driver);
		loginObject.enterValues("contactus@targetbay.com", "t@rgEdb@y");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
