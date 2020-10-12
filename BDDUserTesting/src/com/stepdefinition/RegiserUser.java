package com.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegiserUser {
	WebDriver driver;
	
	@Given("^user is on register page$")
	public void user_is_on_register_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		
		String expectedTitle="HealthCareSystem";
String actualTitle=driver.getTitle();
assertEquals(expectedTitle, actualTitle);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),'CUSTOMER REGISTRER')]")).click();
		}

	@When("^user enters personal details$")
	public void user_enters_personal_details() throws Throwable {
		driver.findElement(By.id("userName")).sendKeys("Gkpawar");
		driver.findElement(By.id("userPassword")).sendKeys("aA@12345");
		driver.findElement(By.id("contactNumber")).sendKeys("9392435760");
		driver.findElement(By.id("userEmail")).sendKeys("gk8@gmail.com");
		driver.findElement(By.id("age")).sendKeys("23");
		driver.findElement(By.xpath("//input[@name='gender' and @ value='male']")).click();
	   }

	@When("^user clicks on register button$")
	public void user_clicks_on_register_button() throws Throwable {
		driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
		Alert alert=driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		//Thread.sleep(3000);
		alert.accept();
		//driver.close();
		
		
	   	}

	@Then("^message displayed \"([^\"]*)\"$")
	public void message_displayed(String arg1) throws Throwable {
		System.out.println("Successful register");
		driver.close();
		
	
	    }

}
