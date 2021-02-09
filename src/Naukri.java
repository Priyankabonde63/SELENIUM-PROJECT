import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {


		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			String parent =driver.getWindowHandle();
			System.out.println("parent"+parent);
			
			Set<String> winshandle = driver.getWindowHandles();
			//winshandle.remove(parent);
			ArrayList<String> al= new ArrayList<>(winshandle);
			
			for (int i = al.size()-1; i >= 0; i--) 
			{
				driver.switchTo().window(al.get(i));
				driver.close();
				Thread.sleep(2000);
			}
				
			}
			
		}


