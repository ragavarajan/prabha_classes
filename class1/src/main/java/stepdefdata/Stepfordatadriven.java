package stepdefdata;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepfordatadriven {
	
	WebDriver driver;
	
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^Enter url$")
	public void enter_url() throws Throwable {
		driver.get("https://trail.targetbay.com/");
		Thread.sleep(4000);
	}

	/*Tables
	  @Then("^Enter username and password$")
	public void enter_username_and_password(DataTable data){
		List<List<String>>creds = data.raw();
	    driver.findElement(By.id("email")).sendKeys(creds.get(0).get(0));
	    driver.findElement(By.id("password")).sendKeys(creds.get(0).get(1));
	  */
	
	@Then("^Enter username and password$")
	public void enter_username_and_password(DataTable data){
		for(Map<String,String>cred:data.asMaps(String.class, String.class))
		{
	    driver.findElement(By.id("email")).sendKeys(cred.get("username"));
	    driver.findElement(By.id("password")).sendKeys(cred.get("password"));
		}
	  
	}

	@Then("^click submit$")
	public void click_submit() throws Throwable {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	}

}
