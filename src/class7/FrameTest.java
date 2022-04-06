package class7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> list = driver.findElements(By.linkText("Sortable"));
		if (list.size() > 0) {
			System.out.println("Exsist");
		} else {
			{
				System.out.println("not Exsist");
			}
		}

		List<WebElement> div = driver.findElements(By.id("draggable"));
		if (div.size() > 0) {
			System.out.println("Exsist");
		} else {
			{
				System.out.println("not Exsist");
			}
		}

		// driver.switchTo().frame(0);
		// driver.switchTo().frame("name/Id"); // need to have a name or Id present in
		// iframe
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		div = driver.findElements(By.id("draggable"));
		if (div.size() > 0) {
			System.out.println("Exsist");
		} else {
			System.out.println("not Exsist");
		}

		driver.switchTo().defaultContent();

		div = driver.findElements(By.id("draggable"));
		if (div.size() > 0) {
			System.out.println("Exsist");
		} else {
			System.out.println("not Exsist");
		}
		
		
	}

}
