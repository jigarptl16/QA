package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mytestEmail@test.com");
		driver.findElement(By.id("pass")).sendKeys("DummyPassword");
		driver.findElement(By.name("login")).click();
		
		//input[data-testid='royal_email']
		//input[data-testid*='oyal_ema'] // Contains
		//input[data-testid^='royal_em'] // Start with
		//input[data-testid$='al_email'] // Ends With
		
		// # for id
		// . for name

	}

}
