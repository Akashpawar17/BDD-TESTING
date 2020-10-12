package seleniumDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");		
WebDriver driver=	new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
	
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='radiooptions' and  @value='Male']")).click();
WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
Select sel1 =new Select(year);
sel1.selectByValue("1998");
WebElement month =driver.findElement(By.xpath("//select[@placeholder='Month']"));
Select sel2 =new Select(month);

List<WebElement> month1=sel2.getOptions();
	System.out.println(month1.size());
	
	for (WebElement count : month1) {
		System.out.println(count.getText());
	}
	sel2.selectByIndex(7);
	driver.close();
	}

}
