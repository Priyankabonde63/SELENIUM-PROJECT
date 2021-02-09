import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cogmento {

	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();   //maximize the browser   method chaining
	
	driver.get("https://freecrm.co.in/"); //enter Url
	
//	driver.navigate().back();
//	Thread.sleep(3000);
//	
//	driver.navigate().forward();  //forward
//	Thread.sleep(3000);
//	
//	driver.navigate().refresh();  //refresh
//	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Log In']")).click();
	
	
	
	
	
	
	
	
	
	
	
	}

}
