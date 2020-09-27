package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");		
WebDriver driver=	new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/login");
	
driver.manage().window().maximize();
driver.findElement(By.id("Email")).sendKeys("akash11.abd@gmail.com");
driver.findElement(By.id("Password")).sendKeys("aA@12345");
driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();

String expectedTitle="Demo Web Shop";
String actualTitle=driver.getTitle();
System.out.println(actualTitle);
if(actualTitle.equals(expectedTitle)) {
	System.out.println("you are on the right page");
	driver.close();
}
else
	System.out.println("you are on the wrong page");
	driver.findElement(By.linkText("Log out")).click();
	driver.close();
	}

}
