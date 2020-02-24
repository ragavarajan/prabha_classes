package com.basics.one;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngtest {
	
	
	
	@Test
	
	public void screentest()throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		
		TakesScreenshot scr =((TakesScreenshot)driver);
		
		File Sourcefile = scr.getScreenshotAs(OutputType.FILE);
		File Destination = new File("D://J//testscreen.png");
		
		FileUtils.copyFile(Sourcefile,Destination);

	}


}
