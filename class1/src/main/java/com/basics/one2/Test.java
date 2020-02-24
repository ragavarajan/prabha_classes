package com.basics.one2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Test {

	public static void main(String[] args) throws Exception {

		
		Screen scr = new Screen();
		Pattern usernameimage = new Pattern("D:\\J\\Selenium\\Sikuli_images\\username.PNG");
		Pattern passimage = new Pattern("D:\\J\\Selenium\\Sikuli_images\\passimage.PNG");
		Pattern submitimage = new Pattern("D:\\J\\Selenium\\Sikuli_images\\submitimage.PNG");
		
		System.setProperty("webdriver.gecko.driver", "D:\\J\\Selenium\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.manage().window().maximize();

		driver.get("https://trail.targetbay.com/");



		scr.wait(submitimage, 5000);

		scr.type(usernameimage, "contactus@targetbay.com");
		scr.type(passimage, "t@rgEdb@y");
		scr.click(submitimage);

	}

}
