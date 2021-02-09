package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario__5 {

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
		a.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'10 gram')])[1]"))).build()
					.perform();
			driver.findElement(By.xpath("(//span[contains(text(),'10 gram')])[1]")).click();
			break;
		}
		a.moveToElement(d).build().perform();
	}
	String title = driver.getTitle();
	if (title.equals("10 gram 24 KT Lakshmi Gold Coin | BlueStone.com")) {
		System.out.println("PASS:10 Gram Laxmi Gold coin displayed");
	} else {
		System.out.println("FAIL:10 Gram Laxmi Gold coin displayed");
	}
	driver.close();
}
}
