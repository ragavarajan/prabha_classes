package com.basics.one2;

public class Exception_handling {
	
	public static void main(String[] args) throws Exception {
		
		try
		{
			System.out.println("starting of the code");
			Thread.sleep(3000);
			int i = 4/0;
			System.out.println("Ending of the code");
		}

		
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		
			
		}
		

		
	}
	
	
	
	
	
	

}
