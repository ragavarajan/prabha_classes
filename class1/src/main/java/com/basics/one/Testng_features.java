package com.basics.one;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;


public class Testng_features {
	
	WebDriver driver;
	//(expectedExceptions= {ArithmeticException.class})
	//enabled = true
	@Test
	public void method1()
	{
		//int i =1/0;
		System.out.println("one");
	}
	
	@Test
	public void method2() throws Exception
	{
		//Thread.sleep(4000);
		System.out.println("two");
	}
	@Test
	public void method3()
	{
		Assert.assertEquals("Test", "Test1");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
