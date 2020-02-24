package com.basics.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics3 {
	
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://m23.targetbay.net/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='tbSiteReviews-openButton tbSiteDefaultButton tbSiteDefaultButtonColor']")).click();
		*/
		
		/*driver.get("https://mail.google.com");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("ragavarajan");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//span[@class='CwaK9']//*[text()='Next']")).click();*/
		
		
		driver.get("https://www.howstuffworks.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='nav nav-full-width']//a[text()='Money'][@data-track-gtm='Channel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='list-inline-item'])[2]//preceding-sibling::li//a[@class='random-icon']")).click();
		
	}
	
	
	
	
	
	
	
	
	
	

}
