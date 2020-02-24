package com.basics.one;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Basics1 {

	

	public static void main(String[] args) throws InterruptedException
	{
		/*System.setProperty("webdriver.gecko.driver", "D:\\J\\Selenium\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*System.setProperty("webdriver.ie.driver", "D:\\J\\Selenium\\Jars\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, 500);

		driver.get("https://ugears.us/");
		
		/*wait.until(ExpectedConditions.presenceOfElementLocated(By.id("targetbay_email"))).sendKeys("good");

		driver.findElement(By.xpath("//a[@onclick='tbMessages.tbSubmit()']")).click();
		 */


















		/*driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[text()='Alert with OK ']")).click();

		//simple alert
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();

		//confirmation aler
		driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.accept();

		WebElement message = driver.findElement(By.xpath("//p[@id=\"demo\"]"));
		System.out.println(message.getText());

		//prompt alert
		driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		Alert alt3 = driver.switchTo().alert();
		System.out.println(alt3.getText());
		alt3.sendKeys("ragavarajan");
		Thread.sleep(3000);
		alt3.accept();
		WebElement message1 = driver.findElement(By.xpath("//p[@id=\"demo1\"]"));
		System.out.println(message1.getText());*/

	}
}
/*Absolute XPath
Relative XPath

Basic XPath-----//tagname[@attribute='value']
multiple xpaths----//*[@class='analystic'][@aria-expanded='false']

Contains()----//*[contains(@class,'btn btn-danger')]
Using OR & AND-----//*[contains(@class,'btn btn-danger') and contains(text(),'click')]
Starts-with function-------//button[starts-with(@class,'btn')]
ends-with function
Text()----//*[contains(text(),'click')]----//*[text()='Alert with OK ']----------------//li[@class='active']//*[text()='Alert with OK ']


XPath axes methods
Following-----------
Ancestor
Child
Preceding--------------
preceding-sibling-----
Following-sibling-------
Parent
Self
Descendant*/
