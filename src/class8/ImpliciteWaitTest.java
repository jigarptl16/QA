package class8;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImpliciteWaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://app.vwo.com/#/login");

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// new WebDriverWait(driver, Duration.ofSeconds(10));

		// driver.findElement(By.id("style1-cta")).click();
		driver.findElement(By.linkText("READ MORE")).click();

	}

}
