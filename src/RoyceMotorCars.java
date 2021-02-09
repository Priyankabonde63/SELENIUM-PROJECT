import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoyceMotorCars {
	public static void main(String[] args) throws InterruptedException, IOException { 
	    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		Thread.sleep(10000);
		driver.findElement(By.tagName("epaas-consent-drawer-shell")).click();
        Thread.sleep(2000);
		
	/*	List<WebElement> menus = driver.findElements(By.xpath("//ul[contains(@class,'topnav bodytext')]/li"));
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuName : menus) 
		{
			String mName = menuName.getText();
			System.err.println(mName);
			a.moveToElement(menuName).perform();
			Thread.sleep(2000);
			DemoScreenShot1.ScreenShot( driver , mName);
			List<WebElement> subMenu= driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::li//descendant::ul[@class=\"taxonslist\"]/li"));
			for (WebElement subMenuName : subMenu) {
				System.out.println(subMenuName.getText());
				
			}
			Thread.sleep(2000);  
		
	}  */
}

}
