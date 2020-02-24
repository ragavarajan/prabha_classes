package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefenitiontest {

	WebDriver driver;
	
	
	@Before(order=1)
	public void beforescene() {
		System.out.println("I will run before all");
	}
	
	@After(order=2)
	public void afterscene() {
		System.out.println("I will run after all");
	}
	
	@Before(order=2)
	public void beforescene2() {
		System.out.println("Secone before");
	}
	@After(order=1)
	public void afterscene2() {
		System.out.println("Secone after");
	}
	
	@Before("@three")
	public void beforethree()
	{
		System.out.println("To run before scenarios three");
	}
	
	@After("@three")
	public void afterthree()
	{
		System.out.println("To run after scenarios three");
	}
	@Given("^Browser opened$")
	public void open_browser() throws Exception 
	{
		System.out.println("one");
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innoppl.INNO0252-PC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://trail.targetbay.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();*/
	}
	
	@When("^title is targetbay$")
	public void title_is_targetbay() throws Throwable {
		System.out.println("two");
	}

	@Then("^enter userid and pw$")
	public void enter_userid_and_pw() throws Throwable {
		System.out.println("three");
	}

	@Given("^verify home page title$")
	public void verify_home_page_title() throws Throwable {
		System.out.println("four");
	}

	@When("^execute option (\\d+)$")
	public void execute_option(int arg1) throws Throwable {
		System.out.println("five");
	}

	@Then("^executer option (\\d+)$")
	public void executer_option(int arg1) throws Throwable {
		System.out.println("six");
	}

	@Given("^verify cart page title$")
	public void verify_cart_page_title() throws Throwable {
		System.out.println("seven");
	}

	@When("^proceed to checkout$")
	public void proceed_to_checkout() throws Throwable {
		System.out.println("eight");
	}

	
	
	
	
}
