package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");

			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

			driver.findElement(By.xpath("//a[@id='welcome']")).click();
			//WebDriverWait wait=new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
			

			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

			driver.close();
		} else {
			System.out.println("Titles are different");
			driver.close();

		}
	}

}
