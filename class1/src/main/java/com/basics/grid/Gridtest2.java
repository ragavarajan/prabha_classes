package com.basics.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridtest2 {

	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities desc = new DesiredCapabilities();
		desc.setBrowserName("chrome");
		desc.setPlatform(Platform.VISTA);
		
		ChromeOptions crom = new ChromeOptions();
		crom.merge(desc);
		
		
		String hub = "http://192.168.0.102:4444/wd/hub";
		
		
		
		WebDriver driver = new RemoteWebDriver(new URL(hub),crom);
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		

	}

}
