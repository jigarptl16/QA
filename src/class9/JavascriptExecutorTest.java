package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecutorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		WebElement link = driver.findElement(By.linkText("Careers"));

		// driver.findElement(By.xpath("//button[@data-auto-id='glass-cookie-consent-close-button']")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// option 1
		System.out.println(link.getLocation());
		jse.executeScript("window.scrollBy(0,6000)");

		// option 2
		// jse.executeScript("arguments[0].scrollIntoView(true);", link);

		// option 3
		//jse.executeScript("arguments[0].click();", link);

		link.click();

		// span[contains(text(),'Canada Budget Travel Guide (Updated 2022)')]

	}

}
