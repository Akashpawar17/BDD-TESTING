package com.pagefactoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {
	WebDriver driver;

	public RegisterPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//label[contains(text(),'Male')]")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement cpassword;
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement register;
	
	public void gender() {
		gender.click();
		
	}
	public void firstName(String fname) {
		firstName.sendKeys(fname);
		
	}
	public void lastName(String lname) {
		lastName.sendKeys(lname);
		
	}
	public void email(String mail) {
		email.sendKeys(mail);

	}

	public void password(String pwd) {
		password.sendKeys(pwd);

	}
	public void cpassword(String cpwd) {
		cpassword.sendKeys(cpwd);

	}


	public void register() {
		register.click();

	}
}
