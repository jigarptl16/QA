package class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// Can be used to check if element exist or not
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}

		//links.get(0).click();

		List<WebElement> links1 = driver.findElements(By.tagName("aaaaaaaaaaaa"));
		System.out.println(links1.size());

		// KxwPGc SSwjIe
		WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		List<WebElement> links2 = footer.findElements(By.tagName("a"));
		System.out.println(links2.size());
		for (int i = 0; i < links2.size(); i++) {
			System.out.println(links2.get(i).getText());
		}
	}

}
