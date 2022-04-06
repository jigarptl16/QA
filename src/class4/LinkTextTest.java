package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");

		driver.findElement(By.linkText("About")).click();
		// driver.findElement(By.partialLinkText("Abo")).click();

		Thread.sleep(3000);

		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		String expectedUrl = "https://about.google/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);

		if (expectedTitle.equals(actualTitle) && actualUrl.contains(expectedUrl)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
