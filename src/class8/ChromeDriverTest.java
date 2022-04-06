package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mytestEmail@test.com");
		driver.findElement(By.id("pass")).sendKeys("DummyPassword");
		driver.findElement(By.name("login")).click();

	}

}
