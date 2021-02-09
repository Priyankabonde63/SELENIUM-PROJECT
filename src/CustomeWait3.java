
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomeWait3 {
	public static void main(String[] args) throws InterruptedException { 
    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///E:/HTMLFile/ButtonClick.html");
	driver.findElement(By.id("pqr")).sendKeys("PRIYANKA");
	driver.findElement(By.id("abc")).sendKeys("NAME");
	driver.findElement(By.id("xyz")).sendKeys("PRIYANKA");
	WebDriverWait ww = new WebDriverWait(driver,10);
	ww.until (new ExpectedCondition<Boolean>() {
		
		@Override
		public Boolean apply(WebDriver driver)
		{
			return driver.findElement(By.name("textA")).getAttribute("value").equalsIgnoreCase("");
		}
		});
	//driver.findElement(By.name("textB")).sendKeys("Ankur");
		
	}
	
}