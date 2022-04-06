package class7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		WebElement sports = driver.findElement(By.linkText("Motors"));
		Actions action = new Actions(driver);
		action.moveToElement(sports).build().perform();

		Thread.sleep(1000);

		List<WebElement> list = driver.findElements(By.xpath("//nav[@aria-label='Parts & Accessories']/ul/li"));
		System.out.println(list.size());

		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}

	}

}
