package seleniumDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkDemo {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");		
WebDriver driver=	new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();

List<WebElement> link =driver.findElements(By.tagName("a"));


System.out.println(link.size());
for (WebElement webElement : link) {
	System.out.println(webElement.getText());
	
}
driver.close();


	}

}
