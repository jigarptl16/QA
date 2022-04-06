package class7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");

		List<WebElement> list = driver.findElements(By.name("group1"));
		System.out.println(list.size());

		for (WebElement rd : list) {
			System.out.println(rd.getAttribute("value") + " ::::::: " + rd.isSelected());
		}

		// driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		list.get(2).click();
		
		for (WebElement rd : list) {
			System.out.println(rd.getAttribute("value") + " ::::::: " + rd.isSelected());
		}

	}

}
