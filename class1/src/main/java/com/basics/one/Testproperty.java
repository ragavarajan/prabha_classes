package com.basics.one;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testproperty {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		File source = new File("./configuration/login.properties");
		FileInputStream finput = new FileInputStream(source);
		Properties prop = new Properties();
		
		prop.load(finput);
		
		String client_url = prop.getProperty("URL");
		System.out.println(client_url);
		
		
		driver.get(client_url);
		
		
		
		

	}

}
