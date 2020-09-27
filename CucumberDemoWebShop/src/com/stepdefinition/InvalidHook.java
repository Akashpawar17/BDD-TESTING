package com.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidHook {
	WebDriver driver = HooksDemo.driver;

	@Given("^application is opened$")
	public void application_is_opened() throws Throwable {

		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

	}

	@When("^i provide valid username and invalid password$")
	public void i_provide_valid_username_and_invalid_password() throws Throwable {

		driver.findElement(By.id("Email")).sendKeys("akash11.abd@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("aA@1234576");

	}

	@Then("^i should view a error message$")
	public void i_should_view_a_error_message() throws Throwable {

		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Boolean view = driver
				.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors')]"))
				.isDisplayed();
		assertTrue(view);

	}

}
