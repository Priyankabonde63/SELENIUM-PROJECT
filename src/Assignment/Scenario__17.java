package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario__17 {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.xpath("//input[contains(@class,'form-text typeahead')]")).sendKeys("rings",Keys.ENTER);
	Thread.sleep(2000);
	
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//span[text()='Delivery Time']"))).build().perform();
	
	driver.findElement(By.xpath("//span[@data-displayname=\"next day delivery\"]")).click();
	boolean aa=driver.findElement(By.xpath("//li[starts-with(@class,'col-xs-4 three-column-browse with-discount rings-small')]")).isDisplayed();
	
	while (aa) 
	{
		if()
		a.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Next')])//parent::a"))).build().perform();
		aa=driver.findElement(By.xpath("(//span[contains(text(),'Next')])//parent::a")).isDisplayed();
	}
	
    
//    driver.close();
	}
}
//span[text()='Play Video']