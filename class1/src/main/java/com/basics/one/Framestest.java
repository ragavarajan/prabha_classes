package com.basics.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framestest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		int frame_count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame_count);
		/*driver.switchTo().frame("singleframe");
				
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("text");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[text()='Iframe with in an Iframe']")).click();
		
		//access the parentframe
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame1);
		
		//access the child frame
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("child frame accessed");
		
		driver.switchTo().parentFrame();
		*/
		
		
		

	}

}
