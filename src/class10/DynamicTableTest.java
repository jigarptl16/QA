package class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tr[1]/th"));
		System.out.println(cols.size());

		for (int i = 1; i < rows.size(); i++) {

			for (int j = 0; j < cols.size(); j++) {

				System.out.print(rows.get(i).findElements(By.tagName("td")).get(j).getText() + " | ");

				// System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["
				// + i + "]/td[" + j + "]"))
				// .getText());
			}
			System.out.println();
		}

	}

}
