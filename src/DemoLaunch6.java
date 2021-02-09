import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch6 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("asdfr@gmail.com");
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys("12456896");
		WebElement login=driver.findElement(By.id("u_0_a"));
		login.click();
		
	
		

	}

}