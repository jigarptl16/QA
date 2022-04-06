package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver  = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mytestEmail@test.com");
		driver.findElement(By.id("pass")).sendKeys("DummyPassword");
		driver.findElement(By.name("login")).click();
		
		//not for Class 1
		String errorExpected = "The email you entered isn’t connected to an account. Find your account and log in.";
		String errorActual = driver.findElement(By.className("_9ay7")).getText();
		System.out.println(errorExpected.equals(errorActual));
	}

}
