package class8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/java/java_files_create.asp");

		File file = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(file.getAbsolutePath());
		FileUtils.copyFile(file, new File("C:/testing/screenshot.png"));

	}

}
