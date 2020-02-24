package com.basics.one2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Css_selectors {

	@Test
	public void autoittest() throws Exception
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://trail.targetbay.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("#email")).sendKeys("admin");
	driver.findElement(By.cssSelector("input.form-control.pwd")).sendKeys("admin");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	}
	
}

/*
 1. Id and class
 	ID:
 	#email or input#email
 	input[id='email']     ------//input[@id ='email']
 	input[id='email'][name='email']
 	
 	Class:
 	.form-control or input.form-control
 	input[class='form-control']
 	.class.class.class
 	
 	"#", ".", ","
 	
 
 2. contains: *
 	input[id*='em']
 
 3. Starts with: ^
 	input[id^='ema']
 
 4. Ends with $
 	input[id$='eil']
 
 5. Siblings: +
 	div.tb-login-logo+div.form-group
 
 6. not operator
 	input.form-control:not(.pwd)
 
 7. first of type
 	div.row.tb-box-report>div:first-of-type
 
 8. last of type
 	div.row.tb-box-report>div:last-of-type
 
 9. nth of type
	div.row.tb-box-report>div:nth-of-type(7)*/
