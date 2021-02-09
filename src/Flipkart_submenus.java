import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_submenus {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2doB4z\']")).click();
		
		List<WebElement> menu =driver.findElements(By.xpath("//div[contains(@class,'_3Il5oO dwRsDN')]/div/span"));
		
		Actions a = new Actions(driver);
		for (WebElement subMenu : menu) 
		{
			String menuName=subMenu.getText();
			System.err.println(menuName);
			
			a.moveToElement(subMenu).perform();		
			Thread.sleep(4000);
			List<WebElement>subMenus =driver.findElements(By.xpath("//span[contains(.,'"+menuName+"')]/ancestor::div[@class=\"_1kidPb\"]/descendant::div[@class=\"_1QrT3s\"]/div"));
			for (WebElement subMenuName : subMenus) {
				System.out.println(subMenuName.getText());
			}
			Thread.sleep(4000);
		}
		
	}

}




