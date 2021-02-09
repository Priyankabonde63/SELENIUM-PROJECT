import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone_Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//input[contains(@class,'form-text typeahead')]")).sendKeys("diamond ring",Keys.ENTER);
		driver.findElement(By.xpath("//img[contains(@alt,\"The Karika statement Ring\")]")).click();
		
		for (String win : driver.getWindowHandles()) 
		{
			driver.switchTo().window(win);
		}
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@value,\"Buy Now\")]")).click();
		String error1= driver.findElement(By.xpath("//input[contains(@value,'Buy Now')]/ancestor::body/descendant::div[@class='formErrorContent']")).getText();
		System.out.println(error1);
		
	}

}