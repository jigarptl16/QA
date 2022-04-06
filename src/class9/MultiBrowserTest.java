package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

	public static void main(String[] args) {

		String browser = "Chrome";
		WebDriver driver = null;
		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mytestEmail@test.com");
		driver.findElement(By.id("pass")).sendKeys("DummyPassword");
		driver.findElement(By.name("login")).click();

	}

}
