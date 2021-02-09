import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
	public static void main(String[] args) throws InterruptedException { 
    System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///E:/HTMLFile/sam1.html");
	driver.findElement(By.name("textA")).sendKeys("Name");
	driver.findElement(By.name("textB")).sendKeys("PRIYANKA");
	driver.findElement(By.name("textC")).sendKeys("Name");
	driver.findElement(By.name("textD")).sendKeys("NUPUR");
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
