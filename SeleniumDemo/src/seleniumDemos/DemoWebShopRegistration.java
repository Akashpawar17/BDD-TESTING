package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=	new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();

driver.findElement(By.xpath("//input[@name='Gender' and  @value='M']")).click();
driver.findElement(By.id("FirstName")).sendKeys("Akash");
driver.findElement(By.id("LastName")).sendKeys("pawar");
driver.findElement(By.id("Email")).sendKeys("akash11@gmail.com");
driver.findElement(By.id("Password")).sendKeys("aA@1234");
driver.findElement(By.id("ConfirmPassword")).sendKeys("aA@1234");
driver.findElement(By.xpath("//input[@id='register-button']")).click();
driver.navigate().to("");



	}

}
