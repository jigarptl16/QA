package class7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");

		driver.findElement(By.name("B2")).click();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		//alert.accept();
		alert.dismiss();

	}

}
