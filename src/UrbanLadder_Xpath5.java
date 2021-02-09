import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder_Xpath5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> dash = driver.findElements(By.xpath("//ul[contains(@class,'topnav bodytext')]/li"));
		
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		for (WebElement d : dash) 
		{
			System.out.println(d.getText());
			a.moveToElement(d).build().perform();
			Thread.sleep(1000);
		}
		
		driver.close();
	}
}