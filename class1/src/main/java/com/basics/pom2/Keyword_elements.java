package com.basics.pom2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.basics.pom1.Keyword_base;

public class Keyword_elements {
	
	WebDriver driver;
	
	public void elements() throws Exception
	{
	
		
		File source = new File("D://J//test.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Key1");
		
		//int rownum = sheet.getLastRowNum()-sheet.getFirstRowNum();
		//System.out.println(sheet.getLastRowNum());
		for(int i=1; i<=sheet.getLastRowNum(); i++)
		{
			String action = sheet.getRow(i).getCell(3).getStringCellValue().trim().toString();
			String locator = sheet.getRow(i).getCell(1).getStringCellValue().trim().toString();
			String locator_value = sheet.getRow(i).getCell(2).getStringCellValue().trim().toString();
			String data = sheet.getRow(i).getCell(4).getStringCellValue().trim().toString();
			System.out.println(data);
			
			switch(action)
			{
			case "Open-browser":
				Keyword_base browser = new Keyword_base();
				driver = browser.initiate(data);
				break;				
				
			case "Enter-url":
				Thread.sleep(3000);
				driver.get(data);
				break;				
				
			case "Quit":
				driver.quit();
				break;
				
			case "long_sleep":
				Thread.sleep(4000);
				System.out.println("check1");
				break;
						
			default:
				break;			
			
			}
			
			switch(locator)
			{
			
			case "id":
				if(action.equalsIgnoreCase("Write"))
				{
					driver.findElement(By.id(locator_value)).sendKeys(data);
					
				}
				else if(action.equalsIgnoreCase("clear"))
				{
					driver.findElement(By.id(locator_value)).clear();
				
				}
		
				break;
				
			case "name":
				if(action.equalsIgnoreCase("Write"))
				{
					driver.findElement(By.name(locator_value)).sendKeys(data);
				}
				else if(action.equalsIgnoreCase("clear"))
				{
					driver.findElement(By.name(locator_value)).clear();
				}
				break;
				
			case "xpath":
				if(action.equalsIgnoreCase("Click"))
				{
					System.out.println("check2");
					driver.findElement(By.xpath(locator_value)).click();
				}
				break;
				
			default:
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
}
