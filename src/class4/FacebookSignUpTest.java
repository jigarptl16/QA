package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignUpTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		driver.findElement(By.name("firstname")).sendKeys("FirstName");
		driver.findElement(By.name("lastname")).sendKeys("LastName");

		driver.findElement(By.name("reg_email__")).sendKeys("0123456789");

		driver.findElement(By.name("websubmit")).click();

	}

}
