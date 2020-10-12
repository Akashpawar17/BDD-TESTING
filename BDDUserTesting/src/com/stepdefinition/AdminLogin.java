package com.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminLogin {
	WebDriver driver;


@Given("^admin is on login page$")
public void admin_is_on_login_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://localhost:4200");
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[contains(text(),'LOGIN')]")).click();

	
   }

@Given("^admin enters userId, userPassword$")
public void admin_enters_userId_userPassword() throws Throwable {
	driver.findElement(By.id("userId")).sendKeys("325");
	driver.findElement(By.id("userPassword")).sendKeys("aA@12345");
	
    }

@Given("^admin clicks on login button$")
public void admin_clicks_on_login_button() throws Throwable {
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	Alert alert=driver.switchTo().alert();
	String alertMessage=driver.switchTo().alert().getText();
	System.out.println(alertMessage);
	alert.accept();
	System.out.println("login succesfull");
	//driver.close();
 
  }

@Then("^admin should be able to see logout button$")
public void admin_should_be_able_to_see_logout_button() throws Throwable {
	driver.findElement(By.xpath("//a[contains(text(),'LOGOUT')]")).click();
	driver.close();
  
 }



}
