package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
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
	@Test
	public void tc_1()throws Exception{
		
		
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		System.out.println("TC1");
		
	}
	@Test
	public void tc_2()throws Exception{
		
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("testNg",Keys.ENTER);
		System.out.println("TC2");
		
	}
	
	@AfterMethod
	public void afterM()throws Exception {
		driver.close();
	}
	


}
