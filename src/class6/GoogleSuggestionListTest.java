package class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");

		driver.findElement(By.name("q")).sendKeys("Canada");

		Thread.sleep(2000);

		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(suggestions.size());

		for (WebElement webElement : suggestions) {
			System.out.println(webElement.getText());

		}

	}

}
