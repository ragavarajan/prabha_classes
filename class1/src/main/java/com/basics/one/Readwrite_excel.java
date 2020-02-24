package com.basics.one;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readwrite_excel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Read from a excel
		File location = new File("D:\\Book1.xlsx");
		FileInputStream finput =new FileInputStream(location);

		XSSFWorkbook workb = new XSSFWorkbook(finput);
		XSSFSheet sheet = workb.getSheet("Sheet1");

		String user = sheet.getRow(1).getCell(0).getStringCellValue().trim().toString();
		String pass = sheet.getRow(1).getCell(1).getStringCellValue().trim().toString();

		System.out.println(user);
		System.out.println(pass);

		driver.get("http://www.jackvault.com/wp-login.php");
		Thread.sleep(3000);
		driver.findElement(By.id("user_login")).sendKeys(user);
		driver.findElement(By.id("user_pass")).sendKeys(pass);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);
		
		
		int error_present = driver.findElements(By.id("login_error")).size();
		
		
		WebElement error =driver.findElement(By.id("login_error"));
		String error_message = error.getText();
		
		if(error_present!=0)
		{
			//write status in the excel

			System.out.println("Fail");
			System.out.println(error_message);
			
			sheet.getRow(1).createCell(2).setCellValue("Fail");
			sheet.getRow(1).createCell(3).setCellValue(error_message);
			
			
			FileOutputStream foutput = new FileOutputStream(location);
			workb.write(foutput);

		}
		








	}

}
