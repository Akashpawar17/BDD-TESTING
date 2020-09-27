package com.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OutlineDemo {

	WebDriver driver;

@Given("^Application is opened$")
public void application_is_opened() throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");

	driver.manage().window().maximize();
  
}

@When("^I provide valid ([^\\\"]*) and ([^\\\"]*)$")
public void i_provide_valid_akash_abd_gmail_com_and_aA(String Email, String pwd) throws Throwable {

	driver.findElement(By.id("Email")).sendKeys(Email);
	driver.findElement(By.id("Password")).sendKeys(pwd);
	
}

@Then("^I should see logout button$")
public void i_should_see_logout_button() throws Throwable {
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
	assertTrue(view);
	
	driver.findElement(By.linkText("Log out")).click();
	driver.close();


}



}
