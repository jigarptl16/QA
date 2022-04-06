package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Let Them do it 
public class AttributeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		String placeHolder = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(placeHolder);
		
		
		// For Class 6
		driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
		String s = driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(s);

	}

}
