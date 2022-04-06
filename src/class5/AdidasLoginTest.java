package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest
{

	public static void main( String[] args ) throws InterruptedException
	{

		System.setProperty( "webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );

		FirefoxDriver driver = new FirefoxDriver();
		driver.get( "https://www.adidas.ca/en/account-login" );

		Thread.sleep( 3000 );

		driver.findElement( By.id( "login-email" ) ).sendKeys( "DummyUserName@test.com" );
		driver.findElement( By.id( "login-password" ) ).sendKeys( "DummyPassword" );
		driver.findElement( By.xpath( "//button[@data-auto-id='login-form-login']" ) ).click();

		Thread.sleep( 4000 );
		String errorExpected = "Incorrect email/password – please check and retry";
		String errorActual = driver.findElement( By.xpath( "//div[@data-auto-id='login-error-message']" ) ).getText();

		if ( errorExpected.equals( errorActual ) )
		{
			System.out.println( "True" );
		}
		else
		{
			System.out.println( "False" );
		}

	}

}
