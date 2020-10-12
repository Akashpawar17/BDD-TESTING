package com.seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demowebshop.LoginPOM;

public class CheckLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=	new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
			
		driver.manage().window().maximize();

		LoginPOM login=new LoginPOM(driver);
		login.enterMail("akash11.abd@gmail.com");
		login.enterPassword("aA@12345");
		login.login();
	}

}
