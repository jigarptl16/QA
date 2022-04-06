package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://auth.scotiaonline.scotiabank.com/online?oauth_key=SA1tAblC410&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiU0ExdEFibEM0MTAiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0NDYxMTA1MiwiaWF0IjoxNjQ0NjA5ODUyLCJqdGkiOiJjMDM4NzkzMy01ZDEzLTQ4MDItYTJkMS05MTcwMzFmNzkwMGIiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.KQglqr5GpLIRyIoHQ-lmkttevUCaV8hviOjDmH5Nb5fzvmqJ8YyCKwG2C_x6UZDIDFWuxRvGclBEkbVhCj7tI6UhQjOs37mc5QM0MrF91I5sCcnNdd_JM-UMHTIlyx8SP51iCxkixpiOE45zygIGiNpZhWCfv9yZMSl4qO-ACT2FgA2urXOEs2JEcIZWR00aRrKh3Gjb3tKip6WAQjJllopr2luwEzKHh4Hv9nQmYGXm6II3MX1R7bOdj2ZhQS8xjflyeXyCsU9LBZiwod9fbgcMegBuaUbrOdlmeBQ_z_IGTiC17Qu8XI33pv3CVlWkWLWXGAxem71lYjpxjnTS1A&preferred_environment=");

		driver.findElement(By.id("usernameInput-input")).sendKeys("DummyUserName");
		driver.findElement(By.id("password-input")).sendKeys("DummyPassword");
		driver.findElement(By.id("password-input")).sendKeys(Keys.ENTER);
		// driver.findElement(By.id("signIn")).click();

		Thread.sleep(4000);
		String errorExpected = "Please check your card number / username or password and try again.";
		String errorActual = driver.findElement(By.id("globalError")).getText();

		if (errorExpected.equals(errorActual)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
