import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Actions2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement search= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("java");
		
		Thread.sleep(2000);
		
		List<WebElement> menu =driver.findElements(By.xpath("//span[text()='java']"));
		
		for (WebElement subMenu : menu) 
			{
			System.out.println(subMenu.getText());
			}
		
		menu.get(2).click();
		

	}

}
