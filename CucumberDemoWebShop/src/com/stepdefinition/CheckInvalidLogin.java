package com.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckInvalidLogin {
	WebDriver driver;
	
	@Given("^user is on logindemo page$")
	public void user_is_on_logindemo_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");

		driver.manage().window().maximize();
		
	  }

	@When("^user enters valid username and invalid password$")
	public void user_enters_valid_username_and_invalid_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("akash11.abd@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("aA@1234567");
		
	  }

	@When("^user clicks on logindemo button$")
	public void user_clicks_on_logindemo_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();


	  	}

	@Then("^user should be able to display login was unsuccessful$")
	public void user_should_be_able_to_display_login_was_unsuccessful() throws Throwable {
	Boolean view=	driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors')]")).isDisplayed();
assertTrue(view);
	   }

	
	}


