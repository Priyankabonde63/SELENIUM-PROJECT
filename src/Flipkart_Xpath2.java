
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Xpath2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		 Thread.sleep(2000);
		 
		 List<WebElement>Loco = driver.findElements(By.xpath("//div[starts-with(@class,'_1kidPb')]"));
		 
		 for (WebElement b : Loco)
		 {
			 System.out.println(b.getText());
		}
	}

}