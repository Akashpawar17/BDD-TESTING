package com.demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.asm.Advice.This;

public class LoginPOM {

		WebDriver driver;
		public LoginPOM(WebDriver driver) {
		this.driver=driver;
		}
		
		By email=By.id("Email");
		By password=By.name("Password");
		By login=By.xpath(" //input[@class='button-1 login-button']");
	
		public void enterMail(String em) {
			driver.findElement(email).sendKeys(em);
			
		}
		public void enterPassword(String pwd) {
			driver.findElement(password).sendKeys(pwd);
			
		}

		
		public void login() {
			driver.findElement(login).click();
			
		}
}
