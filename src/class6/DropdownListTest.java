package class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		List<WebElement> categories = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));

		System.out.println(categories.size());

		for (int i = 0; i < categories.size(); i++) {
			System.out.println(categories.get(i).getText() + " : " + categories.get(i).isSelected());
		}

		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("Baby");
		Thread.sleep(3000);
		s.selectByValue("293");

		for (int i = 0; i < categories.size(); i++) {
			System.out.println(categories.get(i).getText() + " : " + categories.get(i).isSelected());
		}

	}

}
