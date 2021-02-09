package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Methods {
	WebDriver driver;
	@BeforeMethod
	public void beforeM() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void afterM()throws Exception {
		driver.close();
	}

}
