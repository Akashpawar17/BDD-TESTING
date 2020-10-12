package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelBookingForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/Capgemini%20BDD-20200921T061257Z-001/Capgemini%20BDD/BDD%20Material/hotelBooking/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
driver.close();
	}

}
