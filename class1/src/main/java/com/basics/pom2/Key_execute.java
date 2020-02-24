package com.basics.pom2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Key_execute {

	WebDriver driver;
	
	@Test
	public void execute_all() throws Exception
	{
		Keyword_elements object = new Keyword_elements();
		object.elements();
	}
	
	
	
	
}
