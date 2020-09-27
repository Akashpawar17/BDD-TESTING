package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/user/Downloads/Capgemini%20BDD-20200921T061257Z-001/Capgemini%20BDD/BDD%20Material/hotelBooking/login.html");

		driver.manage().window().maximize();

	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^user goes to hotel booking form$")
	public void user_goes_to_hotel_booking_form() throws Throwable {
		driver.navigate().to(
				"file:///C:/Users/user/Downloads/Capgemini%20BDD-20200921T061257Z-001/Capgemini%20BDD/BDD%20Material/hotelBooking/hotelbooking.html");

		System.out.println("Login is successfull");
		driver.close();
	}

}
