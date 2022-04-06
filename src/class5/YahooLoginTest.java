package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://login.yahoo.com/?.intl=ca");

		driver.findElement(By.id("login-username")).sendKeys("jigar12@yahoo.com");

		driver.findElement(By.id("login-signin")).click();
		
		Thread.sleep(15000);
		
		driver.findElement(By.id("login-passwd")).sendKeys("jigar12@yahoo.com");
		
		driver.findElement(By.id("login-signin")).click();
	}

}
