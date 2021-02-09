import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_SelectClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		 WebElement day=driver.findElement(By.id("day"));
		 WebElement month=driver.findElement(By.id("month"));
		 WebElement year=driver.findElement(By.id("year"));
		 
		 Select s=new Select(day);
		 s.selectByValue("22"); 
		 
		 Select s1=new Select(month);
		 s1.selectByVisibleText("Mar");
		 
		 Select s2=new Select(year);
		 s2.selectByVisibleText("1997");
		System.out.println(s.getFirstSelectedOption().getText());
		
		}
	}	 
