package seleniumDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\seleniumcucumbersoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		int length = driver.getTitle().length();
		System.out.println(title);
		System.out.println(length);
		String url1 = "http://demowebshop.tricentis.com";
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		if(url2.equals(url1)) {
			System.out.println("you are in the right page");
			
		}
		String source = driver.getPageSource();
		int sourceLength = driver.getPageSource().length();
		System.out.println(source);
		System.out.println(sourceLength);
		driver.close();
	}
}
