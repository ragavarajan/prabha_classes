package com.basics.one2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.Status;

public class Headless_test {


	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		

		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("window-size=1400,800");
		opt.addArguments("headless");

		WebDriver driver = new ChromeDriver(opt);

		driver.get("http://trail.targetbay.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("contactus@targetbay.com");
		driver.findElement(By.id("password")).sendKeys("t@rgEdb@y");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());



	}



}
