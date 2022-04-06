package class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		// Web element can not be used
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");

		if (driver.findElement(By.linkText("About")).isDisplayed()) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}

		List<WebElement> element = driver.findElements(By.linkText("About1"));
		System.out.println(element.size());
		if (element.size() > 0) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}

	}

}
