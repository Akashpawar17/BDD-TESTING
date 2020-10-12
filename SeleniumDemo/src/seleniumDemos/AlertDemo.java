package seleniumDemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");		
WebDriver driver=	new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
	
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
Alert alert=driver.switchTo().alert();
String alertMessage=driver.switchTo().alert().getText();
System.out.println(alertMessage);
Thread.sleep(3000);
alert.accept();
driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Alert alert1=driver.switchTo().alert();
String message=driver.switchTo().alert().getText();
System.out.println(message);
Thread.sleep(3000);
alert1.dismiss();

driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
Alert  alert2=driver.switchTo().alert();
String message1=driver.switchTo().alert().getText();
System.out.println(message1);
Thread.sleep(3000);
alert2.sendKeys("automating user testing");
alert2.accept();
driver.close();

	

	}

}
