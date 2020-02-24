package com.basics.one;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasserttest {
	
	
	//soft assert
	// hard assert
	
	@Test
	public void test1()
	{
		System.out.println("test 1 starts");
		SoftAssert as = new SoftAssert();
		as.assertEquals("true", "false");
		System.out.println("test 1 ends");
		
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("test 2 starts");
		Assert.assertEquals(true, false);
		System.out.println("test 2 ends");
		
		
	}
	
	
	
	
	

}
