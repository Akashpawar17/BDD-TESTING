package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterOutline {
	WebDriver driver;
	

@Given("^Registartion page is opened$")
public void registartion_page_is_opened() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/register");

	driver.manage().window().maximize();
	
   }

@When("^I provide Male$")
public void i_provide_Male(String firstname,String lastname,String email,String pwd,String cpwd) throws Throwable {
	WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	Select sel1 = new Select(gender);
	sel1.selectByIndex(0);
	driver.findElement(By.id("FirstName")).sendKeys(firstname);
	driver.findElement(By.id("LastName")).sendKeys(lastname);
	driver.findElement(By.id("Password")).sendKeys(pwd);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
	

	
	
	
   }

@Then("^I should able to see \"([^\"]*)\"$")
public void i_should_able_to_see(String arg1) throws Throwable {
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	  
}


	
}
