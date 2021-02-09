package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario__14 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	List<WebElement> dash = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
	Actions a = new Actions(driver);
	for (WebElement d : dash) {
	  if (d.getText().equals("COINS")) {
		WebElement subMenus = driver.findElement(By.xpath("(//span[@class=\"caret hs\"])[7]"));
		Thread.sleep(2000);
		a.moveToElement(subMenus).build().perform();
		List<WebElement> menu =driver.findElements(By.xpath("((//span[contains(text(),'10 gram')]/ancestor::div)[4]/descendant::ul)[3]/li"));
		for (WebElement subMenu : menu) 
		{
			a.moveToElement(subMenu).perform();		
			Thread.sleep(2000);
			if (subMenu.getText().equals("5 gram")) {
				driver.findElement(By.xpath("(//span[contains(text(),'5 gram')])[2]")).click();
				break;
			}
		}
			break;
		}
		a.moveToElement(d).build().perform();
		Thread.sleep(2000);
	}
	String title = driver.getTitle();
	if (title.equals("5 gram 24 KT Lakshmi Gold Coin | BlueStone.com")) {
		System.out.println("PASS:5 Gram Laxmi Gold coin displayed");
	} else {
		System.out.println("FAIL:5 Gram Laxmi Gold coin displayed");
	}
	driver.close();
}
}
