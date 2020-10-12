package com.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDemo {
	static WebDriver driver;
	@Before

	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		System.out.println("open application");
	}
@Given("^User has navigated to login page$")
public void user_has_navigated_to_login_page() throws Throwable {
	driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
  
}

@When("^user prvides user name and password$")
public void user_prvides_user_name_and_password() throws Throwable {
	driver.findElement(By.id("Email")).sendKeys("akash11.abd@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("aA@12345");
	  
}

@Then("^user signin successfully$")
public void user_signin_successfully() throws Throwable {
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
	assertTrue(view);
	
	driver.findElement(By.linkText("Log out")).click();
System.out.println("Signed in successfully");
}

@After
public void teardown() {
	driver.close();
	System.out.println("close browser");
}

}
