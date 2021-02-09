package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");

			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//a[@title='Jewellery'] "))).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Gold Coins")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@class=\'filter 50gms\']")).click();
			
			driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Gold Coin']")).click();  
			
			for (String win : driver.getWindowHandles()) {
				driver.switchTo().window(win);
			}
			String title = driver.getTitle();
			
			if(title.equals("50 gram 24 KT Gold Coin | BlueStone.com"))
			{
				System.out.println("PASS:50 Gram coin displayed");
			}
			else
			{
				System.err.println("FAIL:50 Gram coin displayed");
			}
		}
	}

