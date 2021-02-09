package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCases extends Methods {
	@Test
	public void tc_1()throws Exception{
		
		
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		System.out.println("TC1");
		
	}
	@Test
	public void tc_2()throws Exception{
		
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("testNg",Keys.ENTER);
		System.out.println("TC2");
		
	}
}
