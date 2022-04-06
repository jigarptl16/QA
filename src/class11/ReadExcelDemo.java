package class11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadExcelDemo {

	public static void main(String[] args) throws IOException {

		ExcelReader reader = new ExcelReader();
		System.out.println(reader.getNoOfRows());
		System.out.println(reader.readCell(1, 2));

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(reader.readCell(1, 1));
		driver.findElement(By.id("pass")).sendKeys(reader.readCell(1, 2));

	}

}
