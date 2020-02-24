package com.basics.one;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Listerners_test {

	
	
	@Test
	public void testone()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void testtwo()
	{
		Assert.assertTrue(false);
	}
	
	

	@Test(dependsOnMethods = "testtwo")
	public void testthree()
	{
		Assert.assertTrue(false);
	}
	
	
}
