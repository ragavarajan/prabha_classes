package com.basics.pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basics.pom1.Base2;
import com.basics.pom1.Loginpage2;

public class Testexecution2 {

	WebDriver driver;
	@Test
	public void execute()
	{
		
		driver = Base2.openBrowser("https://trail.targetbay.com");
		
		Loginpage2 object = PageFactory.initElements(driver, Loginpage2.class);
		object.method1();
		
	}
	
	
	
	
	
}
