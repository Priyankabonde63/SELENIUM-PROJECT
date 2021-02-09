import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_script_validation3 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("kumarrohitrk@gmail.com");
	driver.findElement(By.name("password")).sendKeys("123456");
	driver.findElement(By.xpath("//form/div[1]/div[3]")).click();
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Instagram"))
	{
		System.out.println("pass:home page is displayed");
	}
	else
	{
		System.out.println("fail:home page is not dispalyed");
	}
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
	}
}

