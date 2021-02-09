package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario__16 {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.xpath("//input[contains(@class,'form-text typeahead')]")).sendKeys("rings",Keys.ENTER);
	Thread.sleep(2000);
	
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//section[@id=\'Price-form\']"))).build().perform();
	
	driver.findElement(By.xpath("//span[@data-displayname=\'below rs 10000\']")).click();
	
    List<WebElement> dash = driver.findElements(By.xpath("//img[contains(@class,\'hc img-responsive center-block\')]"));
    System.out.println(dash.size());
    
    driver.close();
	}
}
