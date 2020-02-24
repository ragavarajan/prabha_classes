package com.basics.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrioritiesGrouping {

	
	WebDriver driver;
	
	@BeforeTest(groups = {"regression"})
	public void open_browser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com");
	}
	
	@Test(priority = 1, groups = {"smoke","regression"})
	public void bverify_pagetitle()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("verification pass");
		}
		else
		{
			System.out.println("verification failed");
		}
		
	}
	
	@Test(priority = 1, groups = {"regression"})
	public void ifbuttonpresent()
	{
		if(driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).isDisplayed())
		{
			System.out.println("search button 1 is present");
		}
	}
	
	@Test(priority = 2, groups = {"smoke","regression"})
	public void ifinidapresent()
	{
		if(driver.findElement(By.xpath("//span[text()='India']")).isDisplayed())
		{
			System.out.println("country locator is present");
		}
	}
	
	@Test(priority = 3,groups = {"regression"})
	public void entertext() throws Exception
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		driver.findElement(By.id("hplogo")).click();//click on google image
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();//click on search
		
	}
	
	
	@Test(priority =4, dependsOnMethods = {"entertext"})
	public void successmessage()
	{
		System.out.println("All success");
	}
	
	
	
	
	
	
	
	
	
	
	
}
