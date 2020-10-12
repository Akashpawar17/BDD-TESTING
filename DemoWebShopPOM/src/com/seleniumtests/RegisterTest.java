package com.seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactoryPOM.LoginPageFactoryPOM;
import com.pagefactoryPOM.RegisterPOM;

public class RegisterTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=	new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
			
		driver.manage().window().maximize();

		//LoginPageFactoryPOM pf=PageFactory.initElements(driver, LoginPageFactoryPOM.class);
		RegisterPOM register=new RegisterPOM(driver);
		register.gender();
		register.firstName("Akash");
		register.lastName("Pawar");
		register.email("akash17@gmail.com");
		register.password("123456");
		register.cpassword("123456");
		register.register();
		

	}

}
