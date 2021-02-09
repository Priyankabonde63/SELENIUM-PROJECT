import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_BookSort {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("c# book",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[(text()='Price -- Low to High')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> listTotal = driver.findElements(By.xpath("//div[@class='E2-pcE _1q8tSL']/descendant::div[contains(text(),'4.6')]/ancestor::div/preceding-sibling::a[@class='s1Q9rs']"));
		for (WebElement name : listTotal) 
		{
			System.out.println(name.getText());
			String s=name.getText();
			name.click();
			Set<String> wins = driver.getWindowHandles();
			for (String win : driver.getWindowHandles())  
			{
				driver.switchTo().window(win);
			}
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			
		}
	}
}