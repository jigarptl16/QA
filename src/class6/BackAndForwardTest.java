package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");

		driver.findElement(By.linkText("About")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());

	}

}
