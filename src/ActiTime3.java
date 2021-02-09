import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//b[contains(.,'admin')]"));

		WebElement username = driver.findElement(By.xpath("//b[contains(.,'admin')]"));

		WebElement password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));

		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(username.getText());

		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(password.getText());

		driver.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login ')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(@class,\'addTasksLink\')]/descendant::span[@class=\'dashedLink\']"))
				.click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//div[contains(@class,\"customerSelector customerOrProjectSelector selectorWithPlaceholderContainer\")]/descendant::div[contains(@class,\"dropdownButton\")]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(@class,\'searchItemList\')]/div[contains(.,'- New Customer -')]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//tr[contains(@class,\'selectCustomerRow\')]//input[contains(@maxlength,\'255\')]"))
				.sendKeys("AA", Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@placeholder,\'Enter Project Name\')]")).sendKeys("BB",
				Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(@tabindex,'-1')]/div[contains(.,'Create Tasks')]")).click();

		Thread.sleep(2000);

		String error = driver
				.findElement(By
						.xpath("//div[contains(@class,'basicLightboxFooter')]/div[contains(@class,'errorMessageBox')]"))
				.getText();
		System.out.println(error);
	}
}