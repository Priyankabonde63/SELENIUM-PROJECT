import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_XPAth2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
		
		
		boolean aa=driver.findElement(By.xpath("(//span[contains(text(),'Next')])[2]")).isDisplayed();
		while (aa) 
		{
			driver.findElement(By.xpath("(//span[contains(text(),'Next')])//parent::a")).click();
			aa=driver.findElement(By.xpath("(//span[contains(text(),'Next')])//parent::a")).isDisplayed();
		}
		
		
	}

}