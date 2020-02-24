package com.basics.one2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robot_class {
	
	
	@Test
	public void robottest() throws AWTException, Exception
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\J\\Selenium\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		Thread.sleep(3000);
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_CONTROL);//press control key
		robo.keyPress(KeyEvent.VK_A);// press A key
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		
		robo.mouseMove(968,678);
		Thread.sleep(1000);
		robo.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		Thread.sleep(1000);	
		
	
		
						
			
		/*	for(int i=1;i<12;i++)
			{
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			}
			
			driver.findElement(By.xpath("(//*[text()='Download sample DOC file'])[1]")).click();
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_DOWN);
			
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		*/
		
		
	}

}
