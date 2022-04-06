package class7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameMutipleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Documents/QA/FrameDemo/index.html");

		driver.switchTo().frame(0);
		btnClick(driver);
		driver.switchTo().frame(0);
		btnClick(driver);
		driver.switchTo().parentFrame();
		btnClick(driver);

	}

	public static void btnClick(FirefoxDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}
