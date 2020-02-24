package com.basics.one;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		Thread.sleep(3000);
		String parenthandle = driver.getWindowHandle();
		System.out.println("parent window is " +parenthandle);
		
		
		driver.findElement(By.xpath("//a[@target='_blank']//*[text()='    click   ']")).click();
		Thread.sleep(2000);
		Set<String> sessions =driver.getWindowHandles();
		
		int count = sessions.size();
		System.out.println("count now is " + count);
		
		for(String handles:sessions)
		{
			System.out.println(handles);
			String title = driver.switchTo().window(handles).getTitle();
			System.out.println(title+"\n");
		}
		
		String current_handle = driver.getWindowHandle();
		System.out.println(current_handle);
		/*driver.close();*/
		driver.switchTo().window(parenthandle);
		
		driver.findElement(By.xpath("//*[text()='Open New Seperate Windows']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> sessions2 =driver.getWindowHandles();
		
		int count2 = sessions2.size();
		System.out.println("count now is " + count2);
		
		for(String handles2:sessions2)
		{
			System.out.println(handles2);
			String title2 = driver.switchTo().window(handles2).getTitle();
			System.out.println(title2+"\n");
		}
		
		
		
	}

}
