import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_isSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		 WebElement crtNewsAcc=driver.findElement(By.xpath("//a[@id=\'u_0_2\']"));
		 System.out.println(crtNewsAcc.isEnabled());
		 if(crtNewsAcc.isEnabled())
			 crtNewsAcc.click();
		 
		 Thread.sleep(2000);
		 
		 WebElement male =driver.findElement(By.xpath("//label[text()='Male']"));
		 
		 if(male.isSelected())
			 male.click();
		  
		 System.out.println(male.isSelected());
		 
		 
		
	
		
	}

}