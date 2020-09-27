package com.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterDemo {
	WebDriver driver;
	
	@Given("^user is on the register page$")
	public void user_is_on_the_register_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");

		driver.manage().window().maximize();
		String expectedTitle="Demo Web Shop. Register";
	String actualTitle=	driver.getTitle();
	System.out.println(actualTitle);
	assertEquals(expectedTitle, actualTitle);
		
	    }

	@When("^user selects gender$")
	public void user_selects_gender() throws Throwable {
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		 
	   }

	@When("^user enters First name, Last name$")
	public void user_enters_First_name_Last_name() throws Throwable {
		driver.findElement(By.id("FirstName")).sendKeys("Akash");
		driver.findElement(By.id("LastName")).sendKeys("aA@12345");
		
		
	  }

	@When("^user enters Email, Password$")
	public void user_enters_Email_Password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("akash9@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("akash123");
		
	   }

	@When("^user enters Confirm password$")
	public void user_enters_Confirm_password() throws Throwable {
		driver.findElement(By.id("ConfirmPassword")).sendKeys("akash123");
		
	   }

	@When("^user clicks Register button$")
	public void user_clicks_Register_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
	  }

	@Then("^message displayed registration successfully$")
	public void message_displayed_registration_successfully() throws Throwable {
		Boolean expectedView=	driver.findElement(By.xpath("//div[@class='result']")).isDisplayed();
		assertTrue(expectedView);
		System.out.println(expectedView);

	 }



}
