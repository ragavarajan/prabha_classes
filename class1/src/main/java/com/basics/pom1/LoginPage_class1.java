package com.basics.pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_class1 {
	
	WebDriver driver;
	// constructor
	public LoginPage_class1(WebDriver driver)
	{
		this.driver = driver;
				
	}
	
		
	//find elements
	
	By user_id = By.id("email");
	By password = By.id("password");
	By submit = By.xpath("//button[@type='submit']");
	
	
	
	//methods
	
	
	public void enterValues(String user, String pass)
	{
		driver.findElement(user_id).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submit).click();
		
		
		
	}
	
	
	

}
