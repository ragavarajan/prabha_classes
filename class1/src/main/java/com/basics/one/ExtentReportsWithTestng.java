package com.basics.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsWithTestng {

	WebDriver driver;

	ExtentHtmlReporter obj1;
	ExtentReports obj2 ;

	@BeforeSuite
	public void startreport()
	{
		obj1 = new ExtentHtmlReporter("reports2.html");
		obj2 = new ExtentReports();
		obj2.attachReporter(obj1);

	}

	@BeforeTest()
	public void openbrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}


	@Test
	public void testone()
	{
		ExtentTest obj3 = obj2.createTest("First test");
		
		obj3.log(Status.INFO, "opening website");// first info
		driver.get("https://trail.targetbay.com/");
		obj3.pass("Website opened");// first pass
		obj3.log(Status.INFO, "Request to enter credentials");// first info
		driver.findElement(By.id("email")).sendKeys("contactus@targetbay.com");
		driver.findElement(By.id("password")).sendKeys("t@rgEdb@y");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		obj3.pass("Test case passed");
	}




	@AfterSuite
	public void endreport()
	{
		obj2.flush();

	}



}
