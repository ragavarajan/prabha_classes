package com.basics.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basics2 {


	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jscroll = (JavascriptExecutor) driver;



		driver.get("https://ugears.us/collections/frontpage/products/ugears-flower");

		Thread.sleep(12000);
		//driver.findElement(By.id("targetbay_email")).sendKeys("test+897iuju@gmail.com");
		//driver.findElement(By.xpath("//td[@class='targetbay_button tb-pop-sec-fullwidth']")).click();

		jscroll.executeScript("window.scrollBy(0,1700)");

		/*driver.findElement(By.xpath("//span[@class='targetbay-write-review']")).click();//click on write a review
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[@class='targetbay_full'])[1]")).click();//click on stars
		driver.findElement(By.id("targetbayReviewUsername")).sendKeys("test review");
		driver.findElement(By.id("targetbayReviewEmail")).sendKeys("test@test.com");
		Thread.sleep(5000);
		driver.findElement(By.id("targetbayReviewUpload")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		driver.findElement(By.id("targetbayReviewTitle")).sendKeys("test title");
		driver.findElement(By.id("targetbayReview")).sendKeys("review content");
		//driver.findElement(By.id("tbProductReviews-FormCancelButton")).click();
		 */		


		//---selectby-----
		/*Select drop = new Select(driver.findElement(By.id("tb-sort-reviews")));
		drop.selectByVisibleText("Highest to Lowest Rating");*/

		//--printing
		/*String drop = (driver.findElement(By.id("tb-sort-site-reviews")).getText());
		System.out.println(drop);*/


		/*String[] values = {"Oldest","Most Recent","Highest to Lowest Rating"};
		WebElement dropdown =driver.findElement(By.id("tb-sort-reviews"));
		
		
		Select dropd = new Select(dropdown);
		List <WebElement> total = dropd.getOptions();
		//outer:
		for(int i=0;i<4;i++)
		{
			String ddval= total.get(i).getText();

			for(int j=0; j<values.length; j++)
			{
				if(ddval.equals(values[j]))
				{
					System.out.println(ddval + " Matched");
					//break outer;
				}
				else {
					System.out.println("Unmatched");
				}

			}
*/
		WebElement dropdown =driver.findElement(By.id("tb-sort-reviews"));
			
		Actions action = new Actions(driver);
			 
		action.moveToElement(dropdown).contextClick().build().perform();//move cursor to reports option
		        
		       





		
	}





}
