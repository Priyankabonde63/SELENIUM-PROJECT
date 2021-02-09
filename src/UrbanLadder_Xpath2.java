import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder_Xpath2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'store')]")).click();
		
		String location1= driver.findElement(By.xpath("//div[contains(@class,\'_3oCTi\')]/descendant::h3[contains(.,'Hadapsar, Pune')]")).getText();
		String location2= driver.findElement(By.xpath("//div[contains(@class,\"_3oCTi\")]/descendant::h3[contains(.,'Bandra, Mumbai')]")).getText();
		String location3= driver.findElement(By.xpath("//div[contains(@class,\"_3oCTi\")]/descendant::h3[contains(.,'Kirti Nagar, New Delhi')]")).getText();
		String location4= driver.findElement(By.xpath("//div[contains(@class,\"_3oCTi\")]/descendant::h3[contains(.,'Domlur, Bangalore')]")).getText();
		String location5= driver.findElement(By.xpath("//div[contains(@class,\"_3oCTi\")]/descendant::h3[contains(.,'JP Nagar, Bangalore')]")).getText();
		String location6= driver.findElement(By.xpath("//div[contains(@class,\"_3oCTi\")]/descendant::h3[contains(.,'Sahakara Nagar, Bangalore')]")).getText();
		String location7= driver.findElement(By.xpath("//div[contains(@class,\"_3oCTi\")]/descendant::h3[contains(.,'Mall Of India, Noida')]")).getText();
		String location8= driver.findElement(By.xpath("//div[contains(@class,\"_3oCTi\")]/descendant::h3[contains(.,'Nungambakkam, Chennai')]")).getText();
		String location9= driver.findElement(By.xpath("//div[contains(@class,\"_3oCTi\")]/descendant::h3[contains(.,'Creaticity, Pune')]")).getText();
		String location10= driver.findElement(By.xpath("//div[contains(@class,\"_3oCTi\")]/descendant::h3[contains(.,'Kondapur, Hyderabad')]")).getText();
		
		ArrayList<String> a1 =new ArrayList<String>();
		a1.add(location1);
		a1.add(location2);
		a1.add(location3);
		a1.add(location4);
		a1.add(location5);
		a1.add(location6);
		a1.add(location7);
		a1.add(location8);
		a1.add(location9);
		a1.add(location10);
		
		for (String s1 : a1) 
		{
			System.out.println(s1);
		}
	}
}