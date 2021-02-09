import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder_Xpath_Contain {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		System.out.println(sale.getText());
		
		//span[contains(.,'Sale')]
		
//		driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("sofa",Keys.ENTER);
//		driver.findElement(By.xpath("//img[@alt='Weston Half Leather Sofa (Camel Italian Leather)']")).click();
	
		

	}

}