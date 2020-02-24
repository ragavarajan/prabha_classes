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

public class Readwrite_excel_for {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Read from a excel
		File location = new File("D:\\Book1.xlsx");
		FileInputStream finput =new FileInputStream(location);

		XSSFWorkbook workb = new XSSFWorkbook(finput);
		XSSFSheet sheet = workb.getSheet("Sheet1");
		int count = sheet.getLastRowNum()-sheet.getFirstRowNum();
		int j =0;
		/*for(int i=1; i<count;i++)
		
		{
			String user = sheet.getRow(i).getCell(j).getStringCellValue().trim().toString();
			String pass = sheet.getRow(i).getCell(j+1).getStringCellValue().trim().toString();
			System.out.println(user);
			System.out.println(pass);
		}*/
		
		
		for(int i=1; i<count;i++)
			
		{
			sheet.getRow(i).createCell(j+2).setCellValue("Pass");
			FileOutputStream fout = new FileOutputStream(location);
			workb.write(fout);
			
		}
		
		

		




	}

}
