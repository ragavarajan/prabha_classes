package com.basics.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent_reports_wo {

	public static void main(String[] args) throws Exception {
	
		ExtentHtmlReporter obj1 = new ExtentHtmlReporter("D:\\J\\reports1.html");
		
		ExtentReports obj2 = new ExtentReports();
		obj2.attachReporter(obj1);
		
		ExtentTest obj3 = obj2.createTest("First test");
		
		obj3.log(Status.INFO, "opening browser");// first info
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		obj3.pass("Browser opened");// first pass
		
		obj3.log(Status.INFO, "opening website");// first info
		
		driver.get("http://trail.targetbay.com/");
		
		obj3.pass("Website opened");// first pass
		
		obj3.log(Status.INFO, "Request to enter credentials");// first info
		driver.findElement(By.id("email")).sendKeys("contactus@targetbay.com");
		
		
		
		driver.findElement(By.id("password")).sendKeys("t@rgEdb@y");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		obj3.fail("Test case passed");
		
		obj2.flush();
		
		
		

	}

}
