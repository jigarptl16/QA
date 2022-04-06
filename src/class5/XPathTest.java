package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		// Absolute Path
		/*
		 * WebElement email = driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"
		 * )); email.sendKeys("testEmail@test.com");
		 */

		// Relative path
		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dsfdsfsdfsd");

		// Relative with AND/OR
		// driver.findElement(By.xpath("//input[@id='email' and
		// @name='email']")).sendKeys("dsfdsfsdfsd");

		// driver.findElement(By.xpath("//input[@id='email' or
		// @name='email']")).sendKeys("dsfdsfsdfsd");

		
		//Mixed Path
		// WebElement email =
		// driver.findElement(By.xpath("//div[@class='_6lux'][1]/input"));
		// email.sendKeys("testEmail@test.com");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d_')]"));
		loginBtn.click();

	}

}
