package com.basics.one;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltest {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://scrollmagic.io/examples/basic/going_horizontal.html");
		Thread.sleep(2000);
		JavascriptExecutor jscroll = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[text()='Widen the horizon.']"));
		jscroll.executeScript("arguments[0].scrollIntoView();",element);
		jscroll.executeScript("window.scrollBy(1000,0)");
		
		
		
		
		
		
		
		
		
		
		
		
		/*//scrolling by pixels
		//jscroll.executeScript("window.scrollBy(0,1000)");
		
		//scrolling into view
		WebElement element = driver.findElement(By.xpath("//*[text()='Sticky Situations']"));
		jscroll.executeScript("arguments[0].scrollIntoView();",element);
		
		//scroll to the bottom
		jscroll.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		jscroll.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		*/
		
		
		
		
		
	}

}
