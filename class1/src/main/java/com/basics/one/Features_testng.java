package com.basics.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Features_testng {

	
	@Test 
	public void method1() throws Exception
	{
		
		System.out.println("one");
		
		Assert.assertEquals("text", "text1");
	
	}
	
	@Test
	public void method2()
	{
		//Assert.assertTrue(true);
		System.out.println("two");
	}
	
	@Test
	public void method3()
	{
		//Assert.assertTrue(false);
		System.out.println("three");
		

	}
	
	@Test
	public void method4()
	{
		Assert.assertTrue(true);
		System.out.println("four");
		

	}
	
	
}
