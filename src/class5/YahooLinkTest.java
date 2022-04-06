package class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://ca.yahoo.com/");

		WebElement header = driver.findElement(By.id("ybar-navigation"));
		List<WebElement> links = header.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}

	}

}
