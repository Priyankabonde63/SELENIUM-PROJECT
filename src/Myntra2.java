import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra2 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize the browser   method chaining
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(5000);
		
		List<WebElement> loco = driver.findElements(By.xpath("//div[contains(@class,\'desktop-navLinks\')]/div"));
		
		for (WebElement d : loco) 
		{
			System.out.println(d.getText());
		}
		
		
		driver.close();

}
}
