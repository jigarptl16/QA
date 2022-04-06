package class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		// Web element can not be used
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.ca/");

		driver.navigate().to("https://www.google.ca/");

	}

}
