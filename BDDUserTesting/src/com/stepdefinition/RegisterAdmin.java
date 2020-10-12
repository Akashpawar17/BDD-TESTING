package com.stepdefinition;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterAdmin {
	WebDriver driver;


@Given("^admin is on register page$")
public void admin_is_on_register_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://localhost:4200");
System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[contains(text(),'ADMIN REGISTER')]")).click();

   }

@When("^admin enters personal details$")
public void admin_enters_personal_details() throws Throwable {
	driver.findElement(By.id("userName")).sendKeys("YakashVirat");
	driver.findElement(By.id("userPassword")).sendKeys("aA@12345");
	driver.findElement(By.id("contactNumber")).sendKeys("8309391416");
	driver.findElement(By.id("userEmail")).sendKeys("akas8@gmail.com");
	driver.findElement(By.id("age")).sendKeys("23");
	driver.findElement(By.xpath("//input[@name='gender' and @ value='male']")).click();
	driver.findElement(By.id("passKey")).sendKeys("1223344");
 
   }

@When("^admin clicks on register button$")
public void admin_clicks_on_register_button() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Alert alert=driver.switchTo().alert();
	String alertMessage=driver.switchTo().alert().getText();
	System.out.println(alertMessage);
	//Thread.sleep(3000);
	alert.accept();
	//driver.close();
  
    }

@Then("^Message  Displayed \"([^\"]*)\"$")
public void message_Displayed(String arg1) throws Throwable {
	System.out.println("Successful register");
	driver.close();

 }

}
