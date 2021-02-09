import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		
		 WebElement username=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		 System.out.println(username.getText());
		
		WebElement password=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println(password.getText());
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(username.getText());
		
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(password.getText());
		
		driver.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login ')]")).click();
		
		

	}

}