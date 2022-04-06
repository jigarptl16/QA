package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");// opens the URL in the browser

		// Email
		// by ClassName
		// When we have space in class name we can not use By.className (Compound
		// classes not permitted)
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("mytestEmail@test.com");

		// by CssSelector we need to learn CSS syntax
		driver.findElement(By.cssSelector("#email")).sendKeys("mytestEmail@test.com");

		// Will work
		driver.findElement(By.id("email")).sendKeys("mytestEmail@test.com");

		// Only for Links
		driver.findElement(By.linkText(""));

		// Will work
		driver.findElement(By.name("email")).sendKeys("mytestEmail@test.com");

		// Only for Links
		driver.findElement(By.partialLinkText(null));

		// not working
		driver.findElement(By.tagName("input")).sendKeys("mytestEmail@test.com");

		// need to lean this
		driver.findElement(By.xpath(""));

		driver.findElement(By.id("pass")).sendKeys("DummyPassword");
		driver.findElement(By.name("login")).click();

	}

}
