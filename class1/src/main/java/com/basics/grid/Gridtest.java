package com.basics.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridtest {

	
	public static void main (String[] args) throws MalformedURLException
	{
		
		DesiredCapabilities decap = new DesiredCapabilities();
		decap.setBrowserName("chrome");
		decap.setPlatform(Platform.VISTA);
		
		//https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
		//ignore protected
		//extensions
		//infobar
		//headless
		//accept insecure cert
		//https://peter.sh/experiments/chromium-command-line-switches/
		
		
		
		ChromeOptions chrop = new ChromeOptions();
		chrop.merge(decap);
		chrop.addArguments("--disable-infobars");
		String hublink = "http://192.168.0.102:4444/wd/hub";
		
	
		WebDriver driver = new RemoteWebDriver(new URL(hublink),chrop);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	//java -Dwebdriver.chrome.driver="D:\J\Selenium\Jars\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.0.103:4444/grid/register
		
		//java -jar sel....-role hub
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
