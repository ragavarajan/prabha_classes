package com.basics.one;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
	
	String id;
	
	@DataProvider
	public Object[][] datatable()
	{
		Object[][] data = new Object[2][2];
		//student1
		data[0][0] = "10th id";
		data[0][1] = "12th id";
		
		//student2
		data[1][0] = "10th id2";
		data[1][1] = "12th id2";
		
		return data;
	}
	
	
	@Test(dataProvider = "datatable")
	public void datatest(String variable1, String variable2)
	{
		System.out.println("student1 =" + variable1);
		
		
		System.out.println("student2 =" + variable2);
		
	}
	
	

}
