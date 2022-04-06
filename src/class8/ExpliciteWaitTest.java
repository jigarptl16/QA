package class8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		//expliciteTestWithAlert();
		expliciteTestWithElement();

	}

	private static void expliciteTestWithAlert() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");

		driver.findElement(By.name("B2")).click();

		// Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		// alert.accept();
		alert.dismiss();

	}

	private static void expliciteTestWithElement() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://app.vwo.com/#/login");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("READ MORE")));
		driver.findElement(By.linkText("READ MORE")).click();

	}

}
