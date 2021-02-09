import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_XPAth {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("java");
		WebElement Gsearch=driver.findElement(By.name("btnK"));
		Gsearch.click();
		
	}

}