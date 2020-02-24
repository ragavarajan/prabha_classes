package com.basics.one2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Database_test {

	@Test
	public void dbtest() throws Exception
	{
		final String user ="root";
		final String pass = null;
		System.out.println("good1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("good");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2",user,pass);
		System.out.println("good2");
	
	}
	
}
