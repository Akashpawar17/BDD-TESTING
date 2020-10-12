package com.pagefactoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactoryPOM {

	WebDriver driver;

	public LoginPageFactoryPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(name = "Password")
	WebElement password;

	@FindBy(xpath = " //input[@class='button-1 login-button']")
	WebElement login;

	public void email(String mail) {
		email.sendKeys(mail);

	}

	public void password(String pwd) {
		password.sendKeys(pwd);

	}

	public void inputLogin() {
		login.click();

	}

}
