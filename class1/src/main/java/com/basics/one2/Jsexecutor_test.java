package com.basics.one2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutor_test {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//1 open a website
		jse.executeScript("window.location='https://trail.targetbay.com/';");
		
		// 2 Title of the page
		String pagetitle = jse.executeScript("return document.title").toString();
		System.out.println("Title of the page :" + pagetitle);
		
		//3 Get url of the page
		String pageurl = jse.executeScript("return document.URL").toString();
		System.out.println("URL of the page :" + pageurl);
		
		
		//4 Highlight element:
		WebElement username = driver.findElement(By.id("email"));
		jse.executeScript("arguments[0].setAttribute('style','background:yellow;')",username);
		
		//5 Hide an element:
		jse.executeScript("document.getElementById('email').style.display='none';");
		Thread.sleep(3000);
		
		//6 unhide an element:
		jse.executeScript("document.getElementById('email').style.display='block';");
		
		//7 Enter values:
		jse.executeScript("document.getElementById('email').value='contactus@targetbay.com';");
		jse.executeScript("document.getElementById('password').value='t@rgEdb@y';");
		
		//8 Click on element:
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		jse.executeScript("arguments[0].click();", submit);
		
		//9. open a new tab:
		jse.executeScript("window.open();");
		
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(1));
		
		jse.executeScript("window.location='https://www.google.com/';");
		jse.executeScript("document.getElementsByName('q')[0].value='randoms';");
		Thread.sleep(3000);
		
		//10. refresh the page
		jse.executeScript("history.go(0);");
		Thread.sleep(2000);
		
		//11.create alerts:
		jse.executeScript("alert('Successfully completed');");
		driver.switchTo().alert().accept();
		
		//12.scroll
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
