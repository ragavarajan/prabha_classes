package com.basics.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage2 {

	WebDriver driver;
	//constructor
	public Loginpage2(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//locating elements // WebElement user = driver.findElement(By.id());
	
	@FindBy(id="email") WebElement user;
	@FindBy(how = How.ID, using="password") WebElement pass;
	@FindBy(xpath ="//button[@type='submit']") WebElement submit;
	
	
	// creating methods
	
	
	public void method1()
	{
		//driver.findElement(user).sendKeys("contactus@targetbay.com");
		
		
		user.sendKeys("contactus@targetbay.com");
		pass.sendKeys("t@rgEdb@y");
		submit.click();
		
		
	}
	
	
	
	
	
	
	
}
