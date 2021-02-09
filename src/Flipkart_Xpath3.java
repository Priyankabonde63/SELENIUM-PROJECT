import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Xpath3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement search= driver.findElement(By.xpath("//input[@class=\'_3704LK\']"));
		search.sendKeys("i phone");
		Thread.sleep(2000);
		
		List<WebElement> dash = driver.findElements(By.xpath("//input[@class=\'_3704LK\']"));
		
		for (WebElement subMenu : dash) 
		{
		System.out.println(subMenu.getText());
		}
	
		dash.get(2).click();
		
		
		
		}

	}

