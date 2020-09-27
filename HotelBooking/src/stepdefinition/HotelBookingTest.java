package stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelBookingTest {
	WebDriver driver;

	@Given("^user is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/user/Downloads/Capgemini%20BDD-20200921T061257Z-001/Capgemini%20BDD/BDD%20Material/hotelBooking/hotelbooking.html");

		driver.manage().window().maximize();
		String expectedTitle = "Hotel Booking";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);

	}

	@When("^user enters firstname and lastname$")
	public void user_enters_firstname_and_lastname() throws Throwable {
		driver.findElement(By.id("txtFirstName")).sendKeys("Akash");
		driver.findElement(By.id("txtLastName")).sendKeys("pawar");

	}

	@When("^user enters Email and MobileNo and address$")
	public void user_enters_Email_and_MobileNo_and_address() throws Throwable {
		driver.findElement(By.name("Email")).sendKeys("akash11.abd@gmail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("8309321716");
	//	driver.findElement(By.name("nomText1Line1")).sendKeys("6/2/246/1,Secunderabad,Hyderabad");
	}

	@When("^user enters City and Sate and Number of guest$")
	public void user_enters_City_and_Sate_and_Number_of_guest() throws Throwable {
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select sel1 = new Select(city);
		sel1.selectByIndex(4);
		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select sel2 = new Select(state);
		sel2.selectByIndex(4);
		WebElement guests = driver.findElement(By.xpath("//select[@name='persons']"));
		Select sel3 = new Select(guests);
		sel3.selectByIndex(0);

	}

	@When("^user enters Card Holder Name and Debit Card Number and cvv$")
	public void user_enters_Card_Holder_Name_and_Debit_Card_Number_and_cvv() throws Throwable {
		driver.findElement(By.id("txtCardholderName")).sendKeys("akashpawar");
		driver.findElement(By.id("txtDebit")).sendKeys("140025821201");
		driver.findElement(By.id("txtCvv")).sendKeys("536");

	}

	@When("^user enters Expiration month and Expiration Year$")
	public void user_enters_Expiration_month_and_Expiration_Year() throws Throwable {
		driver.findElement(By.id("txtMonth")).sendKeys("08");
		driver.findElement(By.id("txtYear")).sendKeys("2024");

	}

	@When("^user clicks on confirm booking button$")
	public void user_clicks_on_confirm_booking_button() throws Throwable {
		boolean view = driver.findElement(By.xpath("//input[@id='btnPayment']")).isDisplayed();
		assertTrue(view);
		driver.findElement(By.xpath("//input[@id='btnPayment']")).click();
		driver.close();
	}

	@Then("^user will gets message booking completed$")
	public void user_will_gets_message_booking_completed() throws Throwable {
		System.out.println("Booking completed");
	}

}
