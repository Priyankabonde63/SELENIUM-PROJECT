import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_script_validation2 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.id("email")).sendKeys("khandarerohitrk@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.name("pass")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.id("u_0_b")).click();
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Log in to Facebook"))
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

