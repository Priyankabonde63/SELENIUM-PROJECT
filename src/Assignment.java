import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Assignment {

	

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.rolls-roycemotorcars.com/");
			Thread.sleep(2000);
			
			WebElement shadow = driver.findElement(By.tagName("epaas-consent-drawer-shell"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement shadoDom1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadow);
			WebElement body = shadoDom1.findElement(By.tagName("body"));
			body.findElement(By.cssSelector("div > div > section > div:nth-child(1) > span")).click();
			driver.findElement(By.xpath("//span[@class='rrmc-primary-nav-icon js-rrmc-primary-nav-icon']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[text()='Models'])[1]")).click();
			List<WebElement> dash = driver.findElements(By.xpath("((//div[@class='rrmc-scrollhide'])[2]/div)[2]/div"));
			Actions a = new Actions(driver);
			for (WebElement d : dash) {
				Thread.sleep(3000);
				String CarName = d.getText();
				System.err.println(CarName);
				Thread.sleep(2000);
				d.click();
				a.moveToElement(d).build().perform();
				
				Thread.sleep(2000);
				takescreenshot(driver, CarName);
			}
		}
		
		public static void takescreenshot(WebDriver driver, String name) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			File screenshotsave = new File("./ScreenShot/" + name + ".png");
			Files.copy(screenshot, screenshotsave);
		}


}
