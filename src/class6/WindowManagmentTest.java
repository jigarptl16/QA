package class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowManagmentTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");

		driver.manage().window().fullscreen();
		Thread.sleep(3000);

		driver.manage().window().minimize();
		Thread.sleep(3000);

		driver.manage().window().maximize();

	}

}
