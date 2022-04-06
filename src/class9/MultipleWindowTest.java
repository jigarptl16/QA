package class9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/browser-windows");

		driver.findElement(By.id("tabButton")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());

		Iterator<String> itr = windows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();

		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());

	}

}
