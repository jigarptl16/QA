package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get(
				"https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.findElement(By.id("identifierId")).sendKeys("jigar12");

		driver.findElement(By.xpath("//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']/button[@type='button']")).click();

		

	}

}
