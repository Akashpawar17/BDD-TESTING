package com.seleniumpagefactorytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pagefactoryPOM.LoginPageFactoryPOM;

public class VerifyLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=	new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
			
		driver.manage().window().maximize();

		//LoginPageFactoryPOM pf=PageFactory.initElements(driver, LoginPageFactoryPOM.class);
		LoginPageFactoryPOM lpf=new LoginPageFactoryPOM(driver);
		
		lpf.email("akash11.abd@gmail.com");
		lpf.password("aA@12345");
		lpf.inputLogin();
		driver.close();
		

	}

}
