package com.basics.one2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookie_handling {
	
	@Test
	public void handlecookie()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//test1
	driver.get("https://www.flipkart.com/");
	Set<Cookie> site_cookies = driver.manage().getCookies();
	System.out.println("cookies count is " + site_cookies.size());
	
	//test 2: add cookie from last test
	//adding a cookie
	
	Cookie add =new Cookie("cookie_user_name", "Password_value_ID2345432");
	driver.manage().addCookie(add);
	
	site_cookies = driver.manage().getCookies();
	System.out.println("cookies count is " + site_cookies.size());
	
	driver.manage().deleteAllCookies();
	
	site_cookies = driver.manage().getCookies();
	System.out.println("cookies count is " + site_cookies.size());
	
	
	driver.manage().getCookieNamed("AMCVS_17EB401053DAF4840A490D4C%40AdobeOrg");
	driver.manage().deleteCookieNamed("AMCVS_17EB401053DAF4840A490D4C%40AdobeOrg");
	driver.manage().deleteCookie(add);
	}
	
	
	

}



/*
driver.manage().getCookies();
driver.manage(). addCookie();
driver.manage().deleteAllCookies();
driver.manage().getCookieNamed();
driver.manage().deleteCookie();
driver.manage()deleteCookieNamed();
*/

/*for(Cookie cook: site_cookies)
{
	System.out.println(cook.getName() + "\n" + cook.getValue());
}*/